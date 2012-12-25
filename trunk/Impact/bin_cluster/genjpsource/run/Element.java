package run;
import run.elements.*;

import java.util.*;

import jp.lang.*;

public abstract class Element implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Element copy = (Element)_copy;
      if (po.writeDiff(this.deactivated, copy.deactivated)) copy.deactivated = this.deactivated;
      if (po.writeDiff(this.failed, copy.failed)) copy.failed = this.failed;
      if (po.writeDiff(this.cpu_number, copy.cpu_number)) copy.cpu_number = this.cpu_number;
      if (po.writeDiff(this.number, copy.number)) copy.number = this.number;
      if (po.writeDiff(this.processed, copy.processed)) copy.processed = this.processed;
      copy.middle_node = this.middle_node = (run.Node)po.writeDiff(this.middle_node, copy.middle_node);
      copy.node = this.node = (run.Node[])po.writeDiff(this.node, copy.node);
      copy.type = this.type = (java.lang.String)po.writeDiff(this.type, copy.type);
      copy.owner = this.owner = (java.lang.Object)po.writeDiff(this.owner, copy.owner);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Element copy = (Element)_copy;
      if (pi.hasDiff()) copy.deactivated = this.deactivated = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.failed = this.failed = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.cpu_number = this.cpu_number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number = this.number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.processed = this.processed = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.middle_node = this.middle_node = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.node = this.node = (run.Node[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.type = this.type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.owner = this.owner = (java.lang.Object)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.middle_node);
      c.descend(this.node);
      c.descend(this.type);
      c.descend(this.owner);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.middle_node = (run.Node)f.filter(this.middle_node);
      this.node = (run.Node[])f.filter(this.node);
      this.type = (java.lang.String)f.filter(this.type);
      this.owner = (java.lang.Object)f.filter(this.owner);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean;
   public Element(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Element._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.deactivated = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.failed = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.cpu_number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.processed = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(Element._SIZE);
      this.middle_node = (run.Node)_stream.readReference();
      this.node = (run.Node[])_stream.readReference();
      this.type = (java.lang.String)_stream.readReference();
      this.owner = (java.lang.Object)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Element._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.deactivated);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failed);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cpu_number);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.processed);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.middle_node);
      _stream.writeReference(this.node);
      _stream.writeReference(this.type);
      _stream.writeReference(this.owner);
   }
   public Element(Element _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.deactivated = _orig.deactivated;
      this.failed = _orig.failed;
      this.cpu_number = _orig.cpu_number;
      this.number = _orig.number;
      this.processed = _orig.processed;
   }
   public void deepCloneReferences(Element _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.middle_node = (run.Node)_helper.internalDeepClone(_orig.middle_node);
      this.node = (run.Node[])_helper.internalDeepClone(_orig.node);
      this.type = (java.lang.String)_helper.internalDeepClone(_orig.type);
      this.owner = (java.lang.Object)_helper.internalDeepClone(_orig.owner);
   }
   public static final int MESH = -2;
   public static final int RESULT_HEADER = -1;
   public static final int MESH_HEADER = -3;
   public static final int RESULT_SUB_HEADER = -4;
   public static final int RESULT_STRESS_GLOBAL = 0;
   public static final int RESULT_STRESS_LOCAL = 1;
   public static final int RESULT_STRAIN_GLOBAL = 2;
   public static final int RESULT_STRAIN_LOCAL = 3;
   public boolean processed;
   protected Object owner;
   protected int number;
   protected String type;
   protected Node[] node;
   protected Node middle_node;
   protected int cpu_number;
   protected boolean failed;
   protected boolean deactivated;
   public Element() {
      super();
      this.failed = false;
   }
   public abstract void assembleMassMatrix() throws IllegalArgumentException;
   public abstract void calculateContactForces();
   public abstract void calculateExternalForces(double currtime);
   public void calculateLocalBaseVectors(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, Jama.Matrix bvs) {
      bvs.set(0, 0, x2 - x1);
      bvs.set(0, 1, y2 - y1);
      bvs.set(0, 2, z2 - z1);
      bvs.set(1, 0, x3 - x1);
      bvs.set(1, 1, y3 - y1);
      bvs.set(1, 2, z3 - z1);
      bvs.set(2, 0, bvs.get(0, 1) * bvs.get(1, 2) - bvs.get(0, 2) * bvs.get(1, 1));
      bvs.set(2, 1, bvs.get(0, 2) * bvs.get(1, 0) - bvs.get(0, 0) * bvs.get(1, 2));
      bvs.set(2, 2, bvs.get(0, 0) * bvs.get(1, 1) - bvs.get(0, 1) * bvs.get(1, 0));
      bvs.set(1, 0, Math.sqrt(bvs.get(2, 0) * bvs.get(2, 0) + bvs.get(2, 1) * bvs.get(2, 1) + bvs.get(2, 2) * bvs.get(2, 2)));
      bvs.set(2, 0, bvs.get(2, 0) / bvs.get(1, 0));
      bvs.set(2, 1, bvs.get(2, 1) / bvs.get(1, 0));
      bvs.set(2, 2, bvs.get(2, 2) / bvs.get(1, 0));
      bvs.set(1, 0, Math.sqrt(bvs.get(0, 0) * bvs.get(0, 0) + bvs.get(0, 1) * bvs.get(0, 1) + bvs.get(0, 2) * bvs.get(0, 2)));
      bvs.set(0, 0, bvs.get(0, 0) / bvs.get(1, 0));
      bvs.set(0, 1, bvs.get(0, 1) / bvs.get(1, 0));
      bvs.set(0, 2, bvs.get(0, 2) / bvs.get(1, 0));
      bvs.set(1, 0, bvs.get(2, 1) * bvs.get(0, 2) - bvs.get(2, 2) * bvs.get(0, 1));
      bvs.set(1, 1, bvs.get(2, 2) * bvs.get(0, 0) - bvs.get(2, 0) * bvs.get(0, 2));
      bvs.set(1, 2, bvs.get(2, 0) * bvs.get(0, 1) - bvs.get(2, 1) * bvs.get(0, 0));
   }
   public abstract void calculateNodalForces(int j, double timestep);
   public abstract void calculateStrain(double timestep, int i);
   public abstract void calculateStress(int i, double timestep);
   public abstract double checkTimestep(double current_timestep);
   public Material findMaterial(String name, RplVector materiallist) throws java.lang.IllegalArgumentException {
      int i;
      Material tempmaterial;
      for (i = 0; i < materiallist.size(); i++) {
         tempmaterial = (Material)materiallist.elementAt(i);
         if (tempmaterial.getName().equals(name)) {
            return tempmaterial;
         }
      }
      throw new java.lang.IllegalArgumentException("No material with name" + name + "is defined");
   }
   public Node findNode(int nodenumber, Hashtable nodelist) throws java.lang.IllegalArgumentException {
      Node tempnode;
      tempnode = (Node)nodelist.get(new Integer(nodenumber));
      if (tempnode != null) return tempnode;
      throw new java.lang.IllegalArgumentException("No node with number" + nodenumber + "exists");
   }
   public static Element getElementOfType_Fembic(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("ROD_2")) {
         return new Rod_2();
      }
      if (type.toUpperCase().equals("BEAM_2")) {
         throw new IllegalArgumentException("The Beam element has not yet been implemented");
      }
      if (type.toUpperCase().equals("SHELL_BT_4")) {
         return new Shell_BT_4();
      }
      if (type.toUpperCase().equals("SOLID_ISO_6")) {
         return new Solid_Iso_6();
      }
      if (type.toUpperCase().equals("SOLID_ISO_4")) {
         return new Solid_Iso_4();
      }
      if (type.toUpperCase().equals("SHELL_C0_3")) {
         return new Shell_C0_3();
      }
      if (type.toUpperCase().equals("CONTACT_TRIANGLE")) {
         return new Contact_Triangle();
      }
      if (type.toUpperCase().equals("CONTACT_LINE")) {
         return new Contact_Line();
      }
      if (type.toUpperCase().equals("BEAM_SPRING_2")) {
         return new Beam_Spring_2();
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public static Element getElementOfType_Gmsh(int type, int subtype) throws java.lang.IllegalArgumentException {
      if (type == 1 && subtype == 0) {
         return new Rod_2();
      }
      if (type == 1 && subtype == 1) {
         return new Contact_Line();
      }
      if (type == 1 && subtype == 2) {
         return new Beam_Spring_2();
      }
      if (type == 2 && subtype == 0) {
         return new Shell_C0_3();
      }
      if (type == 2 && subtype == 1) {
         return new Contact_Triangle();
      }
      if (type == 3 && subtype == 0) {
         return new Shell_BT_4();
      }
      if (type == 5 && subtype == 0) {
         return new Solid_Iso_6();
      }
      if (type == 5 && subtype == 1) {
         return new Solid_Iso_4();
      }
      throw new IllegalArgumentException("Illegal Element Type");
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
      i = (int)Double.parseDouble(arg.substring(index + 1, nextindex).trim());
      return i;
   }
   public int getNumber() {
      return this.number;
   }
   public abstract int getNumberOfIntegrationPoints();
   public String getType() {
      return this.type;
   }
   public boolean isProcessed() {
      return this.processed;
   }
   public abstract void checkIfFailed();
   public boolean hasFailed() {
      return this.failed;
   }
   public abstract void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException, IllegalArgumentException;
   public abstract void checkIndata() throws IllegalArgumentException;
   public abstract String print_Gid(int ctrl, int gpn);
   public abstract String print_Fembic(int ctrl, int gpn);
   public abstract void setInitialConditions() throws IllegalArgumentException;
   public void setNumber(int newNumber) {
      this.number = newNumber;
   }
   public void setProcessed(boolean newProcessed) {
      this.processed = newProcessed;
   }
   public void setInternalNodePosition() {
   }
   public Node getInternalNode() {
      return null;
   }
   public abstract void updateLocalCoordinateSystem();
   public int determineCpu_number() {
      int index;
      int max;
      int[] vote = new int[this.node.length];
      int[] node_nr = new int[this.node.length];
      for (int i = 0; i < this.node.length; i++) node_nr[i] = this.node[i].getCpu_number();
      Arrays.fill(vote, 0);
      for (int i = 0; i < node_nr.length; i++) {
         index = 0;
         while (node_nr[index] != node_nr[i]) index++;
         vote[index]++;
      }
      index = 0;
      max = 0;
      for (int i = 0; i < vote.length; i++) if (vote[i] > max) {
         index = i;
         max = vote[i];
      }
      this.cpu_number = node_nr[index];
      return this.cpu_number;
   }
   public int getCpu_number() {
      return this.cpu_number;
   }
   public void setCpu_number(int cpu_number) {
      this.cpu_number = cpu_number;
   }
   public int getMachineID() {
      System.out.print("Element:" + this.number + " @:" + DistributedRuntime.getMachineID());
      for (int i = 0; i < this.node.length; i++) System.out.print(" N" + i + " @:" + this.node[i].getMachineID());
      System.out.println("");
      return DistributedRuntime.getMachineID();
   }
   public Node getMiddle_node() {
      return this.middle_node;
   }
   public Node[] getNodes() {
      return this.node;
   }
   public void deActivate() {
      this.deactivated = true;
      if (this.number > 0) System.out.println("CPU " + this.cpu_number + " deactivated element (" + this.type + ") nr: " + this.number);
   }
   public boolean isDeActivated() {
      return this.deactivated;
   }
}
