package run.trackers;
import run.*;

import run.elements.*;

import java.io.*;

import java.util.*;

public class ContactForceTracker extends Tracker implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      ContactForceTracker copy = (ContactForceTracker)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.File_is_set, copy.File_is_set)) copy.File_is_set = this.File_is_set;
      if (po.writeDiff(this.Elements_are_set, copy.Elements_are_set)) copy.Elements_are_set = this.Elements_are_set;
      copy.resultlist = this.resultlist = (double[])po.writeDiff(this.resultlist, copy.resultlist);
      copy.elementlist = this.elementlist = (java.util.Vector)po.writeDiff(this.elementlist, copy.elementlist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      ContactForceTracker copy = (ContactForceTracker)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.File_is_set = this.File_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Elements_are_set = this.Elements_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.resultlist = this.resultlist = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.elementlist = this.elementlist = (java.util.Vector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.resultlist);
      c.descend(this.elementlist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.resultlist = (double[])f.filter(this.resultlist);
      this.elementlist = (java.util.Vector)f.filter(this.elementlist);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new ContactForceTracker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((ContactForceTracker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ContactForceTracker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ContactForceTracker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new ContactForceTracker((ContactForceTracker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((ContactForceTracker)copy).deepCloneReferences((ContactForceTracker)orig, _helper);
         return false;
      }
      public Class getType() {
         return ContactForceTracker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public ContactForceTracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(ContactForceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.File_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Elements_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(ContactForceTracker._SIZE);
      this.resultlist = (double[])_stream.readReference();
      this.elementlist = (java.util.Vector)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(ContactForceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.File_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Elements_are_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.resultlist);
      _stream.writeReference(this.elementlist);
   }
   public ContactForceTracker(ContactForceTracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.File_is_set = _orig.File_is_set;
      this.Elements_are_set = _orig.Elements_are_set;
   }
   public void deepCloneReferences(ContactForceTracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.resultlist = (double[])_helper.internalDeepClone(_orig.resultlist);
      this.elementlist = (java.util.Vector)_helper.internalDeepClone(_orig.elementlist);
   }
   private static int TYPE = 2;
   private Vector elementlist;
   private double[] resultlist;
   private boolean Elements_are_set;
   private boolean File_is_set;
   public ContactForceTracker() {
      super();
      this.elementlist = new Vector();
      this.resultlist = new double[1];
   }
   public void collectData() throws IllegalArgumentException {
   }
   private void collectOwnData() throws IllegalArgumentException {
      int i;
      Contact_Triangle tempelement;
      for (i = 0; i < this.elementlist.size(); i++) {
         tempelement = (Contact_Triangle)this.elementlist.elementAt(i);
         this.resultlist[i] = tempelement.getContactForce();
      }
   }
   public void calculate() {
   }
   private void calculateOwn() {
      int i;
      this.result = 0;
      for (i = 0; i < this.resultlist.length; i++) {
         this.result += this.resultlist[i];
      }
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
      int number_of_elements;
      int j;
      Jama.Matrix dummy = new Jama.Matrix(3, 1);
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("ELEMENTS") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, element number definition should be [elementnr1,elementnr2,.....,elementnrN]", lineno);
            }
            try {
               number_of_elements = super.getNumberOfNodes(param[i + 2].getw().toUpperCase());
               if (number_of_elements < 1) {
                  throw new java.text.ParseException("Too few elements defined for this tracker. Minimum one required", lineno);
               }
               this.resultlist = new double[number_of_elements];
               for (j = 0; j < number_of_elements; j++) {
                  this.elementlist.add(super.findElement(super.getNodeNumber(j + 1, param[i + 2].getw().toUpperCase()), globalelementlist));
                  this.resultlist[i] = 0;
               }
            }  catch (IllegalArgumentException e) {
               System.out.println(e + "In line " + lineno);
            }
            i += 3;
            this.Elements_are_set = true;
         } else if (param[i].getw().toUpperCase().equals("FILENAME") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.filename = new String(param[i + 2].getw().trim());
            i += 3;
            this.File_is_set = true;
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
      if (!this.Elements_are_set) {
         throw new IllegalArgumentException("No element defined for this Contact force tracker: " + this.number);
      }
      if (!this.File_is_set) {
         throw new IllegalArgumentException("No Filename defined for this Contact force tracker: " + this.number);
      }
   }
   public void print_Gid(int ctrl, double currtime) throws IOException, IllegalArgumentException {
      collectOwnData();
      calculateOwn();
      String out;
      int i;
      switch (ctrl) {
      case run.Tracker.RESULT_HEADER: 
         try {
            this.bw = new BufferedWriter(new FileWriter(this.filename));
            out = new String("# Impact contact force tracker results from tracker number: " + this.number + "\n");
            out += "# The following elements are included in the section:\n";
            out += "# \n# ";
            for (i = 0; i < this.elementlist.size(); i++) {
               out += ((Contact_Triangle)this.elementlist.elementAt(i)).getNumber() + ": ";
            }
            out += "\n# \n";
            out += "# X: time \t Y: force in direction: ";
            out += "\n#\n";
            this.bw.write(out);
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in creating the ContactForceTracker file: " + this.filename);
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
            System.out.println("Error in writing results to the ContactForceTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      default: 
         throw new IllegalArgumentException("Unknown parameter for print_Gid in ContactForceTracker number: " + this.number);
      
      }
   }
   public void setInitialConditions() {
   }
   public int getType() {
      return run.trackers.ContactForceTracker.TYPE;
   }
}
