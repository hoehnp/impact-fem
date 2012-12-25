package run.writers;
import java.io.*;

import jp.sync.Barrier;

import run.Element;

import run.Node;

import run.RplVector;

import run.Writer;

public class GidWriter extends Writer implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      GidWriter copy = (GidWriter)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.counter, copy.counter)) copy.counter = this.counter;
      if (po.writeDiff(this.time, copy.time)) copy.time = this.time;
      copy.filename = this.filename = (java.lang.String)po.writeDiff(this.filename, copy.filename);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      GidWriter copy = (GidWriter)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.counter = this.counter = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.time = this.time = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.filename = this.filename = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.filename);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.filename = (java.lang.String)f.filter(this.filename);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new GidWriter(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((GidWriter)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((GidWriter)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((GidWriter)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new GidWriter((GidWriter)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((GidWriter)copy).deepCloneReferences((GidWriter)orig, _helper);
         return false;
      }
      public Class getType() {
         return GidWriter.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double;
   public GidWriter(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(GidWriter._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.counter = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.time = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(GidWriter._SIZE);
      this.filename = (java.lang.String)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(GidWriter._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.counter);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.time);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.filename);
   }
   public GidWriter(GidWriter _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.counter = _orig.counter;
      this.time = _orig.time;
   }
   public void deepCloneReferences(GidWriter _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.filename = (java.lang.String)_helper.internalDeepClone(_orig.filename);
   }
   private java.lang.String filename;
   private double time;
   private int counter;
   public GidWriter(RplVector nlist, RplVector elist) {
      super(nlist, elist);
      this.counter = 0;
   }
   private BufferedWriter open(boolean append) throws IOException {
      return new BufferedWriter(new FileWriter(this.filename + ".flavia.res", append));
   }
   public void initialize() {
   }
   public void write(String fname, double currtime) {
      this.filename = new String(fname);
      this.time = currtime;
      try {
         if (this.counter == 0) {
            writeMesh();
         }
         writeResult();
         this.counter++;
      }  catch (IOException ioe) {
         System.out.println(ioe);
         return;
      }
   }
   public void writeParallel(String fname, double currtime, int[] indicies, Barrier barrier, int client_nr, int nr_of_clients) throws InterruptedException {
      this.filename = new String(fname);
      this.time = currtime;
      try {
         if (this.counter == 0 && client_nr == 0) {
            this.writeMesh();
         }
         this.writeResultParallel(barrier, client_nr, nr_of_clients);
         this.counter++;
      }  catch (IOException ioe) {
         System.out.println(ioe);
         return;
      }
   }
   private void writeMesh() throws java.io.IOException {
      int i;
      int j;
      int k;
      String type;
      Element temp_element;
      BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename + ".flavia.msh"));
      bw.write("# Output file from impact, describing the model mesh \n");
      bw.write("# \n");
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed()) {
            type = temp_element.getType();
            bw.write(temp_element.print_Gid(Element.MESH_HEADER, 0));
            bw.write("\n");
            if (i == 0) {
               bw.write("COORDINATES \n");
               for (k = 0; k < this.nodelist.size(); k++) {
                  if (((Node)this.nodelist.elementAt(k)).getNumber() >= 0) {
                     bw.write(((Node)this.nodelist.elementAt(k)).getNumber() + " \t");
                     bw.write(((Node)this.nodelist.elementAt(k)).getX_pos_orig() + " \t");
                     bw.write(((Node)this.nodelist.elementAt(k)).getY_pos_orig() + " \t");
                     bw.write(((Node)this.nodelist.elementAt(k)).getZ_pos_orig() + "\n");
                  }
               }
               bw.write("END COORDINATES\n\n");
            }
            bw.write("ELEMENTS\n");
            for (j = i; j < this.elementlist.size(); j++) {
               temp_element = (Element)this.elementlist.elementAt(j);
               if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                  bw.write(temp_element.print_Gid(Element.MESH, 0));
                  temp_element.setProcessed(true);
               }
            }
            bw.write("END ELEMENTS\n");
         }
      }
      for (k = 0; k < this.elementlist.size(); k++) {
         ((Element)this.elementlist.elementAt(k)).setProcessed(false);
      }
      bw.flush();
      bw.close();
   }
   private void writeResult() throws java.io.IOException {
      int i;
      int j;
      String type;
      int gpn;
      Element temp_element;
      String temp_out;
      String temp_header;
      Node temp_node;
      BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename + ".flavia.res", this.counter != 0));
      if (this.counter == 0) {
         for (i = 0; i < this.elementlist.size(); i++) {
            temp_element = (Element)this.elementlist.elementAt(i);
            if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
               type = temp_element.getType();
               bw.write(temp_element.print_Gid(Element.RESULT_HEADER, 0));
               bw.write("\n");
               for (j = i; j < this.elementlist.size(); j++) {
                  temp_element = (Element)this.elementlist.elementAt(j);
                  if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                     temp_element.setProcessed(true);
                  }
               }
            }
         }
         for (i = 0; i < this.elementlist.size(); i++) {
            ((Element)this.elementlist.elementAt(i)).setProcessed(false);
         }
      }
      bw.write("  DISPLACEMENTS" + " 1 " + this.time + " 2 1 0\n");
      for (i = 0; i < this.nodelist.size(); i++) {
         temp_node = (Node)this.nodelist.elementAt(i);
         if (temp_node.getNumber() >= 0 && !temp_node.isDeActivated()) {
            bw.write(temp_node.getNumber() + " \t");
            bw.write(temp_node.getX_pos() - temp_node.getX_pos_orig() + " \t\t");
            bw.write(temp_node.getY_pos() - temp_node.getY_pos_orig() + " \t\t");
            bw.write(temp_node.getZ_pos() - temp_node.getZ_pos_orig() + "\n");
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("LOCAL_STRESSES_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            for (j = i; j < this.elementlist.size(); j++) {
               temp_element = (Element)this.elementlist.elementAt(j);
               if (temp_element.getType().equals(type) && !temp_element.isProcessed() && !temp_element.isDeActivated()) {
                  temp_element.setProcessed(true);
                  temp_out = new String("");
                  for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) {
                     temp_out = temp_out + temp_element.print_Gid(Element.RESULT_STRESS_LOCAL, gpn);
                  }
                  if (i == j && !temp_out.equals("")) {
                     bw.write(temp_header + temp_out);
                  } else {
                     bw.write(temp_out);
                  }
               }
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("GLOBAL_STRESSES 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            for (j = i; j < this.elementlist.size(); j++) {
               temp_element = (Element)this.elementlist.elementAt(j);
               if (temp_element.getType().equals(type) && !temp_element.isProcessed() && !temp_element.isDeActivated()) {
                  temp_element.setProcessed(true);
                  temp_out = new String("");
                  for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) {
                     temp_out = temp_out + temp_element.print_Gid(Element.RESULT_STRESS_GLOBAL, gpn);
                  }
                  if (i == j && !temp_out.equals("")) {
                     bw.write(temp_header + temp_out);
                  } else {
                     bw.write(temp_out);
                  }
               }
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("LOCAL_STRAINS__ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            for (j = i; j < this.elementlist.size(); j++) {
               temp_element = (Element)this.elementlist.elementAt(j);
               if (temp_element.getType().equals(type) && !temp_element.isProcessed() && !temp_element.isDeActivated()) {
                  temp_element.setProcessed(true);
                  temp_out = new String("");
                  for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) {
                     temp_out = temp_out + temp_element.print_Gid(Element.RESULT_STRAIN_LOCAL, gpn);
                  }
                  if (i == j && !temp_out.equals("")) {
                     bw.write(temp_header + temp_out);
                  } else {
                     bw.write(temp_out);
                  }
               }
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("GLOBAL_STRAINS_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            for (j = i; j < this.elementlist.size(); j++) {
               temp_element = (Element)this.elementlist.elementAt(j);
               if (temp_element.getType().equals(type) && !temp_element.isProcessed() && !temp_element.isDeActivated()) {
                  temp_element.setProcessed(true);
                  temp_out = new String("");
                  for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) {
                     temp_out = temp_out + temp_element.print_Gid(Element.RESULT_STRAIN_GLOBAL, gpn);
                  }
                  if (i == j && !temp_out.equals("")) {
                     bw.write(temp_header + temp_out);
                  } else {
                     bw.write(temp_out);
                  }
               }
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      bw.flush();
      bw.close();
   }
   private void writeResultParallel(Barrier barrier, int client_nr, int nr_of_clients) throws java.io.IOException, InterruptedException {
      int i;
      int j;
      String type;
      int gpn;
      Element temp_element;
      String temp_out;
      String temp;
      String temp_header;
      BufferedWriter bw;
      Node temp_node;
      boolean something_to_print;
      if (this.counter == 0 && client_nr == 0) {
         bw = this.open(this.counter != 0 && client_nr != 0);
         for (i = 0; i < this.elementlist.size(); i++) {
            temp_element = (Element)this.elementlist.elementAt(i);
            if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
               type = temp_element.getType();
               bw.write(temp_element.print_Gid(Element.RESULT_HEADER, 0));
               bw.write("\n");
               for (j = i; j < this.elementlist.size(); j++) {
                  temp_element = (Element)this.elementlist.elementAt(j);
                  if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                     temp_element.setProcessed(true);
                  }
               }
            }
         }
         for (i = 0; i < this.elementlist.size(); i++) {
            ((Element)this.elementlist.elementAt(i)).setProcessed(false);
         }
         bw.flush();
         bw.close();
      }
      if (client_nr == 0) {
         bw = this.open(true);
         bw.write("  DISPLACEMENTS" + " 1 " + this.time + " 2 1 0\n");
         for (i = 0; i < this.nodelist.size(); i++) {
            temp_node = (Node)this.nodelist.elementAt(i);
            if (temp_node.getNumber() >= 0 && !temp_node.isDeActivated()) {
               bw.write(temp_node.getNumber() + " \t");
               bw.write(temp_node.getX_pos() - temp_node.getX_pos_orig() + " \t\t");
               bw.write(temp_node.getY_pos() - temp_node.getY_pos_orig() + " \t\t");
               bw.write(temp_node.getZ_pos() - temp_node.getZ_pos_orig() + "\n");
            }
         }
         bw.flush();
         bw.close();
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("LOCAL_STRESSES_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            something_to_print = false;
            for (int cn = 0; cn < nr_of_clients; cn++) {
               if (cn == client_nr) {
                  bw = this.open(true);
                  temp_out = new String("");
                  for (j = i; j < this.elementlist.size(); j++) {
                     temp_element = (Element)this.elementlist.elementAt(j);
                     if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                        temp_element.setProcessed(true);
                        temp = new String("");
                        for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) temp += temp_element.print_Gid(Element.RESULT_STRESS_LOCAL, gpn);
                        if (!temp.equals("")) something_to_print = true;
                        if (temp_element.getCpu_number() == client_nr && !temp_element.isDeActivated()) temp_out += temp;
                     }
                  }
                  if (something_to_print && client_nr == 0) bw.write(temp_header);
                  bw.write(temp_out);
                  bw.flush();
                  bw.close();
               }
               barrier.sync();
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("GLOBAL_STRESSES_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            something_to_print = false;
            for (int cn = 0; cn < nr_of_clients; cn++) {
               if (cn == client_nr) {
                  bw = this.open(true);
                  temp_out = new String("");
                  for (j = i; j < this.elementlist.size(); j++) {
                     temp_element = (Element)this.elementlist.elementAt(j);
                     if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                        temp_element.setProcessed(true);
                        temp = new String("");
                        for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) temp += temp_element.print_Gid(Element.RESULT_STRESS_GLOBAL, gpn);
                        if (!temp.equals("")) something_to_print = true;
                        if (temp_element.getCpu_number() == client_nr && !temp_element.isDeActivated()) temp_out += temp;
                     }
                  }
                  if (something_to_print && client_nr == 0) bw.write(temp_header);
                  bw.write(temp_out);
                  bw.flush();
                  bw.close();
               }
               barrier.sync();
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("LOCAL_STRAINS_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            something_to_print = false;
            for (int cn = 0; cn < nr_of_clients; cn++) {
               if (cn == client_nr) {
                  bw = this.open(true);
                  temp_out = new String("");
                  for (j = i; j < this.elementlist.size(); j++) {
                     temp_element = (Element)this.elementlist.elementAt(j);
                     if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                        temp_element.setProcessed(true);
                        temp = new String("");
                        for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) temp += temp_element.print_Gid(Element.RESULT_STRAIN_LOCAL, gpn);
                        if (!temp.equals("")) something_to_print = true;
                        if (temp_element.getCpu_number() == client_nr && !temp_element.isDeActivated()) temp_out += temp;
                     }
                  }
                  if (something_to_print && client_nr == 0) bw.write(temp_header);
                  bw.write(temp_out);
                  bw.flush();
                  bw.close();
               }
               barrier.sync();
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         if (!temp_element.isProcessed() && !temp_element.isDeActivated()) {
            type = temp_element.getType();
            temp_header = new String("GLOBAL_STRAINS_ 1 " + this.time + temp_element.print_Gid(Element.RESULT_SUB_HEADER, 0));
            something_to_print = false;
            for (int cn = 0; cn < nr_of_clients; cn++) {
               if (cn == client_nr) {
                  bw = this.open(true);
                  temp_out = new String("");
                  for (j = i; j < this.elementlist.size(); j++) {
                     temp_element = (Element)this.elementlist.elementAt(j);
                     if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                        temp_element.setProcessed(true);
                        temp = new String("");
                        for (gpn = 0; gpn < temp_element.getNumberOfIntegrationPoints(); gpn++) temp += temp_element.print_Gid(Element.RESULT_STRAIN_GLOBAL, gpn);
                        if (!temp.equals("")) something_to_print = true;
                        if (temp_element.getCpu_number() == client_nr && !temp_element.isDeActivated()) temp_out += temp;
                     }
                  }
                  if (something_to_print && client_nr == 0) bw.write(temp_header);
                  bw.write(temp_out);
                  bw.flush();
                  bw.close();
               }
               barrier.sync();
            }
         }
      }
      for (i = 0; i < this.elementlist.size(); i++) {
         ((Element)this.elementlist.elementAt(i)).setProcessed(false);
      }
   }
   public void checkIndata() throws IllegalArgumentException {
   }
}
