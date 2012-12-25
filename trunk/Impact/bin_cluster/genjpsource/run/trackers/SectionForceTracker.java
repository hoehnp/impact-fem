package run.trackers;
import run.*;

import java.io.*;

import java.util.*;

public class SectionForceTracker extends Tracker implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      SectionForceTracker copy = (SectionForceTracker)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Target_is_set, copy.Target_is_set)) copy.Target_is_set = this.Target_is_set;
      if (po.writeDiff(this.negative, copy.negative)) copy.negative = this.negative;
      if (po.writeDiff(this.File_is_set, copy.File_is_set)) copy.File_is_set = this.File_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      copy.yv = this.yv = (Jama.Matrix)po.writeDiff(this.yv, copy.yv);
      copy.xv = this.xv = (Jama.Matrix)po.writeDiff(this.xv, copy.xv);
      copy.nodelist = this.nodelist = (java.util.Vector)po.writeDiff(this.nodelist, copy.nodelist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      SectionForceTracker copy = (SectionForceTracker)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Target_is_set = this.Target_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.negative = this.negative = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.File_is_set = this.File_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.yv = this.yv = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.xv = this.xv = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodelist = this.nodelist = (java.util.Vector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.yv);
      c.descend(this.xv);
      c.descend(this.nodelist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.yv = (Jama.Matrix)f.filter(this.yv);
      this.xv = (Jama.Matrix)f.filter(this.xv);
      this.nodelist = (java.util.Vector)f.filter(this.nodelist);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new SectionForceTracker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((SectionForceTracker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SectionForceTracker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SectionForceTracker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new SectionForceTracker((SectionForceTracker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((SectionForceTracker)copy).deepCloneReferences((SectionForceTracker)orig, _helper);
         return false;
      }
      public Class getType() {
         return SectionForceTracker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public SectionForceTracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(SectionForceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Target_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.negative = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.File_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(SectionForceTracker._SIZE);
      this.yv = (Jama.Matrix)_stream.readReference();
      this.xv = (Jama.Matrix)_stream.readReference();
      this.nodelist = (java.util.Vector)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(SectionForceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Target_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.negative);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.File_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.yv);
      _stream.writeReference(this.xv);
      _stream.writeReference(this.nodelist);
   }
   public SectionForceTracker(SectionForceTracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Target_is_set = _orig.Target_is_set;
      this.negative = _orig.negative;
      this.File_is_set = _orig.File_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
   }
   public void deepCloneReferences(SectionForceTracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.yv = (Jama.Matrix)_helper.internalDeepClone(_orig.yv);
      this.xv = (Jama.Matrix)_helper.internalDeepClone(_orig.xv);
      this.nodelist = (java.util.Vector)_helper.internalDeepClone(_orig.nodelist);
   }
   private static int TYPE = 1;
   private Vector nodelist;
   private Jama.Matrix xv;
   private Jama.Matrix yv;
   private boolean Nodes_are_set;
   private boolean File_is_set;
   private boolean negative;
   private boolean Target_is_set;
   public SectionForceTracker() {
      super();
      this.xv = new Jama.Matrix(3, 1);
      this.yv = new Jama.Matrix(3, 1);
      this.nodelist = new Vector();
      this.negative = false;
   }
   public void collectData() throws IllegalArgumentException {
   }
   private void collectOwnData() throws IllegalArgumentException {
      int i;
      Node tempnode;
      Jama.Matrix normalvector;
      this.result = 0;
      this.xv.set(0, 0, ((Node)this.nodelist.elementAt(1)).getX_pos() - ((Node)this.nodelist.elementAt(0)).getX_pos());
      this.xv.set(1, 0, ((Node)this.nodelist.elementAt(1)).getY_pos() - ((Node)this.nodelist.elementAt(0)).getY_pos());
      this.xv.set(2, 0, ((Node)this.nodelist.elementAt(1)).getZ_pos() - ((Node)this.nodelist.elementAt(0)).getZ_pos());
      this.yv.set(0, 0, ((Node)this.nodelist.elementAt(2)).getX_pos() - ((Node)this.nodelist.elementAt(0)).getX_pos());
      this.yv.set(1, 0, ((Node)this.nodelist.elementAt(2)).getY_pos() - ((Node)this.nodelist.elementAt(0)).getY_pos());
      this.yv.set(2, 0, ((Node)this.nodelist.elementAt(2)).getZ_pos() - ((Node)this.nodelist.elementAt(0)).getZ_pos());
      normalvector = this.xv.vectorProduct(this.yv);
      normalvector.timesEquals(1.0 / normalvector.length());
      for (i = 0; i < this.nodelist.size(); i++) {
         tempnode = (Node)this.nodelist.elementAt(i);
         if (this.negative) {
            this.xv.set(0, 0, normalvector.get(0, 0) > 0 ? tempnode.getX_force_component(false) : tempnode.getX_force_component(true));
            this.xv.set(1, 0, normalvector.get(1, 0) > 0 ? tempnode.getY_force_component(false) : tempnode.getY_force_component(true));
            this.xv.set(2, 0, normalvector.get(2, 0) > 0 ? tempnode.getZ_force_component(false) : tempnode.getZ_force_component(true));
         } else {
            this.xv.set(0, 0, normalvector.get(0, 0) > 0 ? tempnode.getX_force_component(true) : tempnode.getX_force_component(false));
            this.xv.set(1, 0, normalvector.get(1, 0) > 0 ? tempnode.getY_force_component(true) : tempnode.getY_force_component(false));
            this.xv.set(2, 0, normalvector.get(2, 0) > 0 ? tempnode.getZ_force_component(true) : tempnode.getZ_force_component(false));
         }
         this.result += this.xv.transpose().times(normalvector).get(0, 0);
      }
   }
   public void calculate() {
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
      int number_of_nodes;
      int j;
      Jama.Matrix dummy = new Jama.Matrix(3, 1);
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,.....,nodenrN]", lineno);
            }
            try {
               number_of_nodes = super.getNumberOfNodes(param[i + 2].getw().toUpperCase());
               if (number_of_nodes < 3) {
                  throw new java.text.ParseException("Too few nodes defined for this tracker. Minimum three required", lineno);
               }
               for (j = 0; j < number_of_nodes; j++) {
                  this.nodelist.add(super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw().toUpperCase()), globalnodelist));
               }
            }  catch (IllegalArgumentException e) {
               System.out.println(e + "In line " + lineno);
            }
            i += 3;
            this.Nodes_are_set = true;
         } else if (param[i].getw().toUpperCase().equals("TARGET") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].is_a_number()) {
               throw new java.text.ParseException("Illegal argument, Target should be defined as [time,timetolerance,targetvalue,targetvaluetolerance]", lineno);
            }
            try {
               this.targettime = super.getNumber(1, param[i + 2].getw().toUpperCase());
               this.timetolerance = super.getNumber(2, param[i + 2].getw().toUpperCase());
               this.target = super.getNumber(3, param[i + 2].getw().toUpperCase());
               this.tolerance = super.getNumber(4, param[i + 2].getw().toUpperCase());
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException("Illegal argument or value missing; Target should be defined as [time,timetolerance,targetvalue,targetvaluetolerance]", lineno);
            }
            i += 3;
            this.Target_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("FILENAME") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.filename = new String(param[i + 2].getw().trim());
            i += 3;
            this.File_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("DIRECTION") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().equals("NEGATIVE")) {
            this.negative = true;
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown Tracker parameter ", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
   }
   public void parse_Gmsh(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for this section force tracker: " + this.number);
      }
      if (!this.File_is_set) {
         throw new IllegalArgumentException("No Filename defined for this section force tracker: " + this.number);
      }
   }
   public void print_Gid(int ctrl, double currtime) throws IOException, IllegalArgumentException {
      collectOwnData();
      if (this.Target_is_set) {
         if (super.checkTarget(currtime)) {
            try {
               this.bw = new BufferedWriter(new FileWriter(this.filename + ".target", true));
               this.bw.write("Target was reached at time: " + currtime + " with result: " + this.result + "\n");
               this.bw.flush();
               this.bw.close();
            }  catch (IOException ioe) {
               System.out.println("Error in writing target result file: " + this.filename + ".target");
               throw ioe;
            }
         }
      }
      String out;
      int i;
      switch (ctrl) {
      case run.Tracker.RESULT_HEADER: 
         try {
            this.bw = new BufferedWriter(new FileWriter(this.filename));
            out = new String("# Impact section force tracker results from tracker number: " + this.number + "\n");
            out += "# The following nodes are included in the section:\n";
            out += "# \n# ";
            for (i = 0; i < this.nodelist.size(); i++) {
               out += ((Node)this.nodelist.elementAt(i)).getNumber() + ": ";
            }
            out += "\n# \n";
            out += "# X: time \t Y: force \n";
            out += "#\n";
            this.bw.write(out);
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in creating the SectionForceTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      case run.Tracker.RESULT: 
         try {
            this.bw = new BufferedWriter(new FileWriter(this.filename, true));
            this.bw.write(currtime + "\t" + this.result + "\n");
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in writing results to the SectionForceTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      default: 
         throw new IllegalArgumentException("Unknown parameter for print_Gid in SectionForceTracker number: " + this.number);
      
      }
   }
   public void setInitialConditions() {
   }
   public int getType() {
      return run.trackers.SectionForceTracker.TYPE;
   }
}
