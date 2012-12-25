package run.trackers;
import run.*;

import java.io.*;

public class NodeDistanceTracker extends Tracker implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      NodeDistanceTracker copy = (NodeDistanceTracker)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Target_is_set, copy.Target_is_set)) copy.Target_is_set = this.Target_is_set;
      if (po.writeDiff(this.File_is_set, copy.File_is_set)) copy.File_is_set = this.File_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      copy.node2 = this.node2 = (run.Node)po.writeDiff(this.node2, copy.node2);
      copy.node1 = this.node1 = (run.Node)po.writeDiff(this.node1, copy.node1);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      NodeDistanceTracker copy = (NodeDistanceTracker)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Target_is_set = this.Target_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.File_is_set = this.File_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.node2 = this.node2 = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.node1 = this.node1 = (run.Node)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.node2);
      c.descend(this.node1);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.node2 = (run.Node)f.filter(this.node2);
      this.node1 = (run.Node)f.filter(this.node1);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new NodeDistanceTracker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((NodeDistanceTracker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeDistanceTracker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeDistanceTracker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new NodeDistanceTracker((NodeDistanceTracker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((NodeDistanceTracker)copy).deepCloneReferences((NodeDistanceTracker)orig, _helper);
         return false;
      }
      public Class getType() {
         return NodeDistanceTracker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public NodeDistanceTracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(NodeDistanceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Target_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.File_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(NodeDistanceTracker._SIZE);
      this.node2 = (run.Node)_stream.readReference();
      this.node1 = (run.Node)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(NodeDistanceTracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Target_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.File_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.node2);
      _stream.writeReference(this.node1);
   }
   public NodeDistanceTracker(NodeDistanceTracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Target_is_set = _orig.Target_is_set;
      this.File_is_set = _orig.File_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
   }
   public void deepCloneReferences(NodeDistanceTracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.node2 = (run.Node)_helper.internalDeepClone(_orig.node2);
      this.node1 = (run.Node)_helper.internalDeepClone(_orig.node1);
   }
   private static int TYPE = 8;
   private Node node1;
   private Node node2;
   private boolean Nodes_are_set;
   private boolean File_is_set;
   private boolean Target_is_set;
   public NodeDistanceTracker() {
      super();
   }
   public void collectData() throws IllegalArgumentException {
   }
   private void collectOwnData() throws IllegalArgumentException {
      this.result = Math.sqrt((this.node1.getX_pos() - this.node2.getX_pos()) * (this.node1.getX_pos() - this.node2.getX_pos()) + (this.node1.getY_pos() - this.node2.getY_pos()) * (this.node1.getY_pos() - this.node2.getY_pos()) + (this.node1.getZ_pos() - this.node2.getZ_pos()) * (this.node1.getZ_pos() - this.node2.getZ_pos()));
   }
   public void calculate() {
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector globalnodelist, RplVector globalelementlist) throws java.text.ParseException {
      int number_of_nodes;
      Jama.Matrix dummy = new Jama.Matrix(3, 1);
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,.....,nodenrN]", lineno);
            }
            try {
               number_of_nodes = super.getNumberOfNodes(param[i + 2].getw().toUpperCase());
               if (number_of_nodes != 2) {
                  throw new java.text.ParseException("Too few nodes defined for this tracker. Two required", lineno);
               }
               this.node1 = super.findNode(super.getNodeNumber(1, param[i + 2].getw().toUpperCase()), globalnodelist);
               this.node2 = super.findNode(super.getNodeNumber(2, param[i + 2].getw().toUpperCase()), globalnodelist);
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
         throw new IllegalArgumentException("No nodes defined for this node distance tracker: " + this.number);
      }
      if (!this.File_is_set) {
         throw new IllegalArgumentException("No Filename defined for this node distance tracker: " + this.number);
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
      switch (ctrl) {
      case run.Tracker.RESULT_HEADER: 
         try {
            this.bw = new BufferedWriter(new FileWriter(this.filename));
            out = new String("# Impact node distance tracker results from tracker number: " + this.number + "\n");
            out += "# The following nodes are included in the section:\n";
            out += "# \n# ";
            out += this.node1.getNumber() + ": ";
            out += this.node2.getNumber() + ": ";
            out += "\n# \n";
            out += "# X: time \t Y: nodal distance: ";
            out += "\n#\n";
            this.bw.write(out);
            this.bw.flush();
            this.bw.close();
         }  catch (IOException ioe) {
            System.out.println("Error in creating the NodeDistanceTracker file: " + this.filename);
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
            System.out.println("Error in writing results to the NodeDistanceTracker file: " + this.filename);
            throw ioe;
         }
         return;
      
      default: 
         throw new IllegalArgumentException("Unknown parameter for print_Gid in NodeDistanceTracker number: " + this.number);
      
      }
   }
   public void setInitialConditions() {
   }
   public int getType() {
      return run.trackers.NodeDistanceTracker.TYPE;
   }
}
