package run.trackers;
import run.*;

import java.io.*;

public class NodeVelocityTracker extends Tracker implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      NodeVelocityTracker copy = (NodeVelocityTracker)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Target_is_set, copy.Target_is_set)) copy.Target_is_set = this.Target_is_set;
      if (po.writeDiff(this.File_is_set, copy.File_is_set)) copy.File_is_set = this.File_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.print_z, copy.print_z)) copy.print_z = this.print_z;
      if (po.writeDiff(this.print_y, copy.print_y)) copy.print_y = this.print_y;
      if (po.writeDiff(this.print_x, copy.print_x)) copy.print_x = this.print_x;
      copy.node = this.node = (run.Node)po.writeDiff(this.node, copy.node);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      NodeVelocityTracker copy = (NodeVelocityTracker)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Target_is_set = this.Target_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.File_is_set = this.File_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_z = this.print_z = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_y = this.print_y = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.print_x = this.print_x = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.node = this.node = (run.Node)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.node);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.node = (run.Node)f.filter(this.node);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new NodeVelocityTracker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((NodeVelocityTracker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeVelocityTracker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeVelocityTracker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new NodeVelocityTracker((NodeVelocityTracker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((NodeVelocityTracker)copy).deepCloneReferences((NodeVelocityTracker)orig, _helper);
         return false;
      }
      public Class getType() {
         return NodeVelocityTracker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public NodeVelocityTracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(NodeVelocityTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Target_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.File_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_z = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_y = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.print_x = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(NodeVelocityTracker._SIZE);
      this.node = (run.Node)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(NodeVelocityTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Target_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.File_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_z);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_y);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.print_x);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.node);
   }
   public NodeVelocityTracker(NodeVelocityTracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Target_is_set = _orig.Target_is_set;
      this.File_is_set = _orig.File_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.print_z = _orig.print_z;
      this.print_y = _orig.print_y;
      this.print_x = _orig.print_x;
   }
   public void deepCloneReferences(NodeVelocityTracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.node = (run.Node)_helper.internalDeepClone(_orig.node);
   }
   private static int TYPE = 6;
   private Node node;
   private boolean print_x;
   private boolean print_y;
   private boolean print_z;
   private boolean Nodes_are_set;
   private boolean File_is_set;
   private boolean Target_is_set;
   public NodeVelocityTracker() {
      super();
      this.node = new Node();
   }
   public void collectData() throws IllegalArgumentException {
   }
   private void collectOwnData() throws IllegalArgumentException {
      int i;
      if (this.print_x) {
         this.result = this.node.getX_vel();
      } else if (this.print_y) {
         this.result = this.node.getY_vel();
      } else {
         this.result = this.node.getZ_vel();
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
         if (param[i].getw().toUpperCase().equals("NODE") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].is_a_number()) {
               throw new java.text.ParseException("Illegal argument, Node should be defined as [nr]", lineno);
            }
            try {
               this.node = super.findNode(super.getNodeNumber(1, param[i + 2].getw().toUpperCase()), globalnodelist);
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException("Illegal argument or node missing; Node should be defined as [nr]", lineno);
            }
            i += 3;
            this.Nodes_are_set = true;
         } else if (param[i].getw().toUpperCase().equals("DIRECTION") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().toUpperCase().equals("X")) {
            this.print_x = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("DIRECTION") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().toUpperCase().equals("Y")) {
            this.print_y = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("DIRECTION") && param[i + 1].getw().toUpperCase().equals("=") && param[i + 2].getw().toUpperCase().toUpperCase().equals("Z")) {
            this.print_z = true;
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
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for this node velocity tracker: " + this.number);
      }
      if (!this.print_x && !this.print_y && !this.print_z) {
         throw new IllegalArgumentException("No directions defined for this node velocity tracker: " + this.number);
      }
      if (!this.File_is_set) {
         throw new IllegalArgumentException("No Filename defined for this node velocity tracker: " + this.number);
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
            out = new String("# Impact node velocity tracker results from tracker number: " + this.number + "\n");
            out += "# The results are from node: " + this.node.getNumber() + "\n";
            out += "# \n";
            out += "# X: time \t Y: velocity in direction: ";
            if (this.print_x) {
               out += "X";
            }
            if (this.print_y) {
               out += "Y";
            }
            if (this.print_z) {
               out += "Z";
            }
            out += "\n#\n";
            this.bw.write(out);
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in creating the NodeVelocityTracker file: " + this.filename);
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
            System.out.println("Error in writing results to the NodeVelocityTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      default: 
         throw new IllegalArgumentException("Unknown parameter for print_Gid in NodeVelocityTracker number: " + this.number);
      
      }
   }
   public void setInitialConditions() {
   }
   public int getType() {
      return run.trackers.NodeVelocityTracker.TYPE;
   }
}
