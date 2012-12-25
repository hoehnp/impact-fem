package run.trackers;
import run.*;

import java.io.*;

public class EnergyTracker extends Tracker implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      EnergyTracker copy = (EnergyTracker)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Target_is_set, copy.Target_is_set)) copy.Target_is_set = this.Target_is_set;
      if (po.writeDiff(this.File_is_set, copy.File_is_set)) copy.File_is_set = this.File_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.print_hourglass, copy.print_hourglass)) copy.print_hourglass = this.print_hourglass;
      if (po.writeDiff(this.print_contact, copy.print_contact)) copy.print_contact = this.print_contact;
      if (po.writeDiff(this.print_external, copy.print_external)) copy.print_external = this.print_external;
      if (po.writeDiff(this.print_internal, copy.print_internal)) copy.print_internal = this.print_internal;
      copy.nodelist = this.nodelist = (run.RplVector)po.writeDiff(this.nodelist, copy.nodelist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      EnergyTracker copy = (EnergyTracker)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Target_is_set = this.Target_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.File_is_set = this.File_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_hourglass = this.print_hourglass = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_contact = this.print_contact = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_external = this.print_external = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_internal = this.print_internal = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.nodelist = this.nodelist = (run.RplVector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.nodelist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.nodelist = (run.RplVector)f.filter(this.nodelist);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new EnergyTracker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((EnergyTracker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((EnergyTracker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((EnergyTracker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new EnergyTracker((EnergyTracker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((EnergyTracker)copy).deepCloneReferences((EnergyTracker)orig, _helper);
         return false;
      }
      public Class getType() {
         return EnergyTracker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public EnergyTracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(EnergyTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Target_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.File_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_hourglass = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_contact = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_external = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_internal = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(EnergyTracker._SIZE);
      this.nodelist = (run.RplVector)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(EnergyTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Target_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.File_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_hourglass);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_contact);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_external);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_internal);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.nodelist);
   }
   public EnergyTracker(EnergyTracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Target_is_set = _orig.Target_is_set;
      this.File_is_set = _orig.File_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.print_hourglass = _orig.print_hourglass;
      this.print_contact = _orig.print_contact;
      this.print_external = _orig.print_external;
      this.print_internal = _orig.print_internal;
   }
   public void deepCloneReferences(EnergyTracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.nodelist = (run.RplVector)_helper.internalDeepClone(_orig.nodelist);
   }
   private static int TYPE = 7;
   private RplVector nodelist;
   private boolean print_internal;
   private boolean print_external;
   private boolean print_contact;
   private boolean print_hourglass;
   private boolean Nodes_are_set;
   private boolean File_is_set;
   private boolean Target_is_set;
   public EnergyTracker() {
      super();
   }
   public void collectData() throws IllegalArgumentException {
   }
   private void collectOwnData() throws IllegalArgumentException {
      int i;
      Node tempnode;
      for (i = 0; i < this.nodelist.size(); i++) {
         tempnode = (Node)this.nodelist.elementAt(i);
         if (this.print_contact) {
            this.result += tempnode.getContactEnergy();
         } else if (this.print_external) {
            this.result += tempnode.getExternalEnergy();
         } else if (this.print_hourglass) {
            this.result += tempnode.getHourglassEnergy();
         } else if (this.print_internal) {
            this.result += tempnode.getInternalEnergy();
         }
      }
   }
   public void calculate() {
   }
   private void calculateOwn() {
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
      int i = 0;
      this.nodelist = globalnodelist;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("TYPE") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().equals("INTERNAL")) {
            this.print_internal = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("TYPE") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().equals("EXTERNAL")) {
            this.print_external = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("TYPE") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().equals("CONTACT")) {
            this.print_contact = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("TYPE") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().equals("HOURGLASS")) {
            this.print_hourglass = true;
            i += 3;
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
      if (!this.print_internal && !this.print_external && !this.print_contact && !this.print_hourglass) {
         throw new IllegalArgumentException("No energy type to plot defined for this energy tracker: " + this.number);
      }
      if (!this.File_is_set) {
         throw new IllegalArgumentException("No Filename defined for this energy tracker: " + this.number);
      }
   }
   public void print_Gid(int ctrl, double currtime) throws IOException, IllegalArgumentException {
      collectOwnData();
      calculateOwn();
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
            out = new String("# Impact energy tracker results from tracker number: " + this.number + "\n");
            out += "# \n";
            out += "# X: time \t Y: energy: ";
            if (this.print_internal) {
               out += "INTERNAL";
            }
            if (this.print_external) {
               out += "EXTERNAL";
            }
            if (this.print_contact) {
               out += "CONTACT";
            }
            if (this.print_hourglass) {
               out += "HOURGLASS";
            }
            out += "\n#\n";
            this.bw.write(out);
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in creating the EnergyTracker file: " + this.filename);
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
            System.out.println("Error in writing results to the EnergyTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      default: 
         throw new IllegalArgumentException("Unknown parameter for print_Gid in EnergyTracker number: " + this.number);
      
      }
   }
   public void setInitialConditions() {
   }
   public int getType() {
      return run.trackers.EnergyTracker.TYPE;
   }
}
