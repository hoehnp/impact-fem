package run;
import run.constraints.*;

public abstract class Constraint implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Constraint copy = (Constraint)_copy;
      if (po.writeDiff(this.processed, copy.processed)) copy.processed = this.processed;
      if (po.writeDiff(this.number, copy.number)) copy.number = this.number;
      copy.type = this.type = (java.lang.String)po.writeDiff(this.type, copy.type);
      copy.name = this.name = (java.lang.String)po.writeDiff(this.name, copy.name);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Constraint copy = (Constraint)_copy;
      if (pi.hasDiff()) copy.processed = this.processed = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.number = this.number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.type = this.type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.name = this.name = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.type);
      c.descend(this.name);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.type = (java.lang.String)f.filter(this.type);
      this.name = (java.lang.String)f.filter(this.name);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int;
   public Constraint(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Constraint._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.processed = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(Constraint._SIZE);
      this.type = (java.lang.String)_stream.readReference();
      this.name = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Constraint._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.processed);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.type);
      _stream.writeReference(this.name);
   }
   public Constraint(Constraint _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.processed = _orig.processed;
      this.number = _orig.number;
   }
   public void deepCloneReferences(Constraint _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.type = (java.lang.String)_helper.internalDeepClone(_orig.type);
      this.name = (java.lang.String)_helper.internalDeepClone(_orig.name);
   }
   protected int number;
   protected java.lang.String name;
   protected String type;
   protected boolean processed;
   public Constraint() {
      super();
   }
   public static Constraint getConstraintOfType_Fembic(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("BOUNDARY_CONDITION")) {
         return new BoundaryCondition();
      }
      if (type.toUpperCase().equals("RIGID_BODY")) {
         return new RigidBody();
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public static Constraint getConstraintOfType_Nastran(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("SPC1")) {
         return new BoundaryCondition();
      }
      if (type.toUpperCase().equals("RBE2")) {
         return new RigidBody();
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public static Constraint getConstraintOfType_Gmsh(int type) throws java.lang.IllegalArgumentException {
      return new BoundaryCondition();
   }
   public int getNumberOfNodes(String arg) throws java.text.ParseException, IllegalArgumentException {
      int index;
      int indexcount;
      int lastindex;
      index = 0;
      indexcount = 0;
      lastindex = arg.lastIndexOf(',');
      if (lastindex == -1) {
         throw new IllegalArgumentException("No \',\' separator in the node definition");
      }
      while (index < lastindex) {
         index = arg.indexOf(',', index + 1);
         indexcount++;
      }
      return indexcount + 1;
   }
   public int getNodeNumber(int nr, String arg) throws IllegalArgumentException {
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
   public Node findNode(int nodenumber, RplVector nodelist) throws java.lang.IllegalArgumentException {
      int i;
      Node tempnode;
      for (i = 0; i < nodelist.size(); i++) {
         tempnode = (Node)nodelist.elementAt(i);
         if (tempnode.getNumber() == nodenumber) {
            return tempnode;
         }
      }
      throw new java.lang.IllegalArgumentException("No node with number" + nodenumber + "exists");
   }
   public int getNumber() {
      return this.number;
   }
   public String getName() {
      return this.name;
   }
   public void setName(String nam) {
      this.name = new String(nam);
   }
   public String getType() {
      return this.type;
   }
   public abstract void parse_Fembic(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException;
   public abstract void parse_Nastran(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException;
   public abstract void parse_Gmsh(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException;
   public abstract void checkIndata() throws IllegalArgumentException;
   public abstract void setInitialConditions();
   public abstract void applyAccelerationConditions(Node nod, double currtime);
   public abstract void applyVelocityConditions(Node nod, double currtime);
   public abstract void registerNode(Node nod);
   public abstract void update();
   public abstract void determineMassMatrix(RplVector nodelist);
   public void setNumber(int newNumber) {
      this.number = newNumber;
   }
   public abstract String print_Fembic(int ctrl);
   public Jama.Matrix calculateLocalBaseVectors(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3) {
      Jama.Matrix base_vector_system = new Jama.Matrix(3, 3);
      Jama.Matrix local_x_axis = new Jama.Matrix(3, 1);
      Jama.Matrix local_y_axis = new Jama.Matrix(3, 1);
      Jama.Matrix local_z_axis = new Jama.Matrix(3, 1);
      local_x_axis.set(0, 0, x2 - x1);
      local_x_axis.set(1, 0, y2 - y1);
      local_x_axis.set(2, 0, z2 - z1);
      local_y_axis.set(0, 0, x3 - x1);
      local_y_axis.set(1, 0, y3 - y1);
      local_y_axis.set(2, 0, z3 - z1);
      local_z_axis = local_x_axis.vectorProduct(local_y_axis);
      local_y_axis = local_x_axis.vectorProduct(local_z_axis);
      local_x_axis.timesEquals(1.0 / local_x_axis.length());
      local_y_axis.timesEquals(1.0 / local_y_axis.length());
      local_z_axis.timesEquals(1.0 / local_z_axis.length());
      base_vector_system.setMatrix(0, 2, 0, 0, local_x_axis);
      base_vector_system.setMatrix(0, 2, 1, 1, local_y_axis);
      base_vector_system.setMatrix(0, 2, 2, 2, local_z_axis);
      return base_vector_system;
   }
   public boolean isProcessed() {
      return this.processed;
   }
   public void setProcessed(boolean processed) {
      this.processed = processed;
   }
}
