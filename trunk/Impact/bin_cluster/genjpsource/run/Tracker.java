package run;
import run.trackers.*;

import java.io.*;

public abstract class Tracker implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Tracker copy = (Tracker)_copy;
      if (po.writeDiff(this.timetolerance, copy.timetolerance)) copy.timetolerance = this.timetolerance;
      if (po.writeDiff(this.targettime, copy.targettime)) copy.targettime = this.targettime;
      if (po.writeDiff(this.tolerance, copy.tolerance)) copy.tolerance = this.tolerance;
      if (po.writeDiff(this.target, copy.target)) copy.target = this.target;
      if (po.writeDiff(this.result, copy.result)) copy.result = this.result;
      if (po.writeDiff(this.number, copy.number)) copy.number = this.number;
      copy.bw = this.bw = (java.io.BufferedWriter)po.writeDiff(this.bw, copy.bw);
      copy.filename = this.filename = (java.lang.String)po.writeDiff(this.filename, copy.filename);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Tracker copy = (Tracker)_copy;
      if (pi.hasDiff()) copy.timetolerance = this.timetolerance = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.targettime = this.targettime = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.tolerance = this.tolerance = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.target = this.target = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.result = this.result = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.number = this.number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.bw = this.bw = (java.io.BufferedWriter)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.filename = this.filename = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.bw);
      c.descend(this.filename);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.bw = (java.io.BufferedWriter)f.filter(this.bw);
      this.filename = (java.lang.String)f.filter(this.filename);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int;
   public Tracker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Tracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.timetolerance = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.targettime = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.tolerance = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.target = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.result = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(Tracker._SIZE);
      this.bw = (java.io.BufferedWriter)_stream.readReference();
      this.filename = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Tracker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.timetolerance);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.targettime);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.tolerance);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.target);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.result);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.bw);
      _stream.writeReference(this.filename);
   }
   public Tracker(Tracker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.timetolerance = _orig.timetolerance;
      this.targettime = _orig.targettime;
      this.tolerance = _orig.tolerance;
      this.target = _orig.target;
      this.result = _orig.result;
      this.number = _orig.number;
   }
   public void deepCloneReferences(Tracker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.bw = (java.io.BufferedWriter)_helper.internalDeepClone(_orig.bw);
      this.filename = (java.lang.String)_helper.internalDeepClone(_orig.filename);
   }
   public static final int RESULT = -2;
   public static final int RESULT_HEADER = -1;
   protected String filename;
   protected int number;
   protected double result;
   protected double target;
   protected double tolerance;
   protected double targettime;
   protected double timetolerance;
   protected BufferedWriter bw;
   public Tracker() {
      super();
   }
   public abstract void collectData() throws IllegalArgumentException;
   public abstract void calculate();
   public static Tracker getTrackerOfType_Fembic(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("SECTIONFORCE")) {
         return new SectionForceTracker();
      }
      if (type.toUpperCase().equals("CONTACTFORCE")) {
         return new ContactForceTracker();
      }
      if (type.toUpperCase().equals("NODEFORCE")) {
         return new NodeForceTracker();
      }
      if (type.toUpperCase().equals("NODEDISPLACEMENT")) {
         return new NodeDisplacementTracker();
      }
      if (type.toUpperCase().equals("NODEACCELERATION")) {
         return new NodeAccelerationTracker();
      }
      if (type.toUpperCase().equals("NODEVELOCITY")) {
         return new NodeVelocityTracker();
      }
      if (type.toUpperCase().equals("ENERGY")) {
         return new EnergyTracker();
      }
      if (type.toUpperCase().equals("NODEDISTANCE")) {
         return new NodeDistanceTracker();
      }
      if (type.toUpperCase().equals("RODFORCE")) {
         return new RodForceTracker();
      }
      if (type.toUpperCase().equals("BEAMSPRING")) {
         return new BeamSpringTracker();
      }
      if (type.toUpperCase().equals("NODEMOMENT")) {
         return new NodeMomentTracker();
      }
      throw new IllegalArgumentException("Illegal Tracker type detected");
   }
   public static Tracker getTrackerOfType_Nastran(String type) throws java.lang.IllegalArgumentException {
      return new NodeForceTracker();
   }
   public static Tracker getTrackerOfType_Gmsh(int type) throws java.lang.IllegalArgumentException {
      return new NodeForceTracker();
   }
   public int getNumberOfNodes(String arg) throws java.text.ParseException, IllegalArgumentException {
      int index;
      int indexcount;
      int lastindex;
      index = 0;
      indexcount = 0;
      lastindex = arg.lastIndexOf(',');
      while (index < lastindex) {
         index = arg.indexOf(',', index + 1);
         indexcount++;
      }
      return indexcount + 1;
   }
   public int getNodeNumber(int nr, String arg) throws java.text.ParseException, IllegalArgumentException {
      int i;
      int index;
      int nextindex;
      index = 0;
      for (i = 0; i < nr - 1; i++) {
         index = arg.indexOf(',', index + 1);
      }
      nextindex = arg.indexOf(',', index + 1);
      if (nextindex == -1) {
         nextindex = arg.length() - 1;
      }
      if (index == -1) {
         throw new IllegalArgumentException("Incorrect number of element nodes defined");
      }
      i = Integer.parseInt(arg.substring(index + 1, nextindex).trim());
      return i;
   }
   public double getNumber(int nr, String arg) throws java.text.ParseException, IllegalArgumentException {
      int i;
      int index;
      int nextindex;
      index = 0;
      for (i = 0; i < nr - 1; i++) {
         index = arg.indexOf(',', index + 1);
      }
      nextindex = arg.indexOf(',', index + 1);
      if (nextindex == -1) {
         nextindex = arg.length() - 1;
      }
      if (index == -1) {
         throw new IllegalArgumentException("Incorrect number of element nodes defined");
      }
      return Double.parseDouble(arg.substring(index + 1, nextindex).trim());
   }
   public Node findNode(int nodenumber, RplVector nodelist) throws java.lang.IllegalArgumentException {
      int i;
      Node tempnode;
      for (i = 0; i < nodelist.size(); i++) {
         tempnode = (Node)nodelist.elementAt(i);
         if (tempnode.getNumber() == nodenumber) {
            return tempnode;
         }
      }
      throw new java.lang.IllegalArgumentException("No node with number" + i + "exists");
   }
   public Element findElement(int elementnumber, RplVector elementlist) throws java.lang.IllegalArgumentException {
      int i;
      Element tempelement;
      for (i = 0; i < elementlist.size(); i++) {
         tempelement = (Element)elementlist.elementAt(i);
         if (tempelement.getNumber() == elementnumber) {
            return tempelement;
         }
      }
      throw new java.lang.IllegalArgumentException("No element with number" + i + "exists");
   }
   public int getNumber() {
      return this.number;
   }
   public abstract int getType();
   public abstract void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector elementlist) throws java.text.ParseException;
   public abstract void parse_Nastran(Token[] param, int lineno, RplVector nodelist, RplVector elementlist) throws java.text.ParseException;
   public abstract void parse_Gmsh(Token[] param, int lineno, RplVector nodelist, RplVector elementlist) throws java.text.ParseException;
   public abstract void checkIndata() throws IllegalArgumentException;
   public abstract void print_Gid(int ctrl, double currtime) throws IOException, IllegalArgumentException;
   public abstract void setInitialConditions();
   public void setNumber(int newNumber) {
      this.number = newNumber;
   }
   public double getResult() {
      return this.result;
   }
   protected boolean checkTarget(double currtime) {
      if (Math.abs(this.result - this.target) < this.tolerance && Math.abs(currtime - this.targettime) < this.timetolerance) {
         return true;
      } else {
         return false;
      }
   }
}
