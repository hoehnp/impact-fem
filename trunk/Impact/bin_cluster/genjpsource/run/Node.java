package run;
import Jama.*;

import run.elements.*;

import jp.lang.*;

public class Node implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Node copy = (Node)_copy;
      if (po.writeDiff(this.deactivated, copy.deactivated)) copy.deactivated = this.deactivated;
      if (po.writeDiff(this.type, copy.type)) copy.type = this.type;
      if (po.writeDiff(this.cpu_number, copy.cpu_number)) copy.cpu_number = this.cpu_number;
      if (po.writeDiff(this.z_is_set, copy.z_is_set)) copy.z_is_set = this.z_is_set;
      if (po.writeDiff(this.y_is_set, copy.y_is_set)) copy.y_is_set = this.y_is_set;
      if (po.writeDiff(this.x_is_set, copy.x_is_set)) copy.x_is_set = this.x_is_set;
      if (po.writeDiff(this.number, copy.number)) copy.number = this.number;
      if (po.writeDiff(this.oldstep, copy.oldstep)) copy.oldstep = this.oldstep;
      if (po.writeDiff(this.halfstep, copy.halfstep)) copy.halfstep = this.halfstep;
      if (po.writeDiff(this.hourglass_energy, copy.hourglass_energy)) copy.hourglass_energy = this.hourglass_energy;
      if (po.writeDiff(this.contact_energy, copy.contact_energy)) copy.contact_energy = this.contact_energy;
      if (po.writeDiff(this.external_energy, copy.external_energy)) copy.external_energy = this.external_energy;
      if (po.writeDiff(this.internal_energy, copy.internal_energy)) copy.internal_energy = this.internal_energy;
      if (po.writeDiff(this.mass, copy.mass)) copy.mass = this.mass;
      copy.linelist = this.linelist = (run.elements.Contact_Line[])po.writeDiff(this.linelist, copy.linelist);
      copy.dpl_old = this.dpl_old = (Jama.Matrix)po.writeDiff(this.dpl_old, copy.dpl_old);
      copy.right_neighbour = this.right_neighbour = (run.Node)po.writeDiff(this.right_neighbour, copy.right_neighbour);
      copy.left_neighbour = this.left_neighbour = (run.Node)po.writeDiff(this.left_neighbour, copy.left_neighbour);
      copy.load = this.load = (run.Load)po.writeDiff(this.load, copy.load);
      copy.constraint = this.constraint = (run.Constraint)po.writeDiff(this.constraint, copy.constraint);
      copy.pos_orig = this.pos_orig = (Jama.Matrix)po.writeDiff(this.pos_orig, copy.pos_orig);
      copy.pos = this.pos = (Jama.Matrix)po.writeDiff(this.pos, copy.pos);
      copy.dpl = this.dpl = (Jama.Matrix)po.writeDiff(this.dpl, copy.dpl);
      copy.contact_force_old = this.contact_force_old = (Jama.Matrix)po.writeDiff(this.contact_force_old, copy.contact_force_old);
      copy.hourglass_force_old = this.hourglass_force_old = (Jama.Matrix)po.writeDiff(this.hourglass_force_old, copy.hourglass_force_old);
      copy.internal_force_old = this.internal_force_old = (Jama.Matrix)po.writeDiff(this.internal_force_old, copy.internal_force_old);
      copy.external_force_old = this.external_force_old = (Jama.Matrix)po.writeDiff(this.external_force_old, copy.external_force_old);
      copy.vel = this.vel = (Jama.Matrix)po.writeDiff(this.vel, copy.vel);
      copy.acc = this.acc = (Jama.Matrix)po.writeDiff(this.acc, copy.acc);
      copy.inv_inertia = this.inv_inertia = (Jama.Matrix)po.writeDiff(this.inv_inertia, copy.inv_inertia);
      copy.inertia = this.inertia = (Jama.Matrix)po.writeDiff(this.inertia, copy.inertia);
      copy.lastload = this.lastload = (Jama.Matrix)po.writeDiff(this.lastload, copy.lastload);
      copy.force_positive = this.force_positive = (Jama.Matrix)po.writeDiff(this.force_positive, copy.force_positive);
      copy.contact_force = this.contact_force = (Jama.Matrix)po.writeDiff(this.contact_force, copy.contact_force);
      copy.hourglass_force = this.hourglass_force = (Jama.Matrix)po.writeDiff(this.hourglass_force, copy.hourglass_force);
      copy.internal_force = this.internal_force = (Jama.Matrix)po.writeDiff(this.internal_force, copy.internal_force);
      copy.external_force = this.external_force = (Jama.Matrix)po.writeDiff(this.external_force, copy.external_force);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.owner = this.owner = (java.lang.Object)po.writeDiff(this.owner, copy.owner);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Node copy = (Node)_copy;
      if (pi.hasDiff()) copy.deactivated = this.deactivated = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.type = this.type = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.cpu_number = this.cpu_number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.z_is_set = this.z_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_is_set = this.y_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_is_set = this.x_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.number = this.number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.oldstep = this.oldstep = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.halfstep = this.halfstep = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.hourglass_energy = this.hourglass_energy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.contact_energy = this.contact_energy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.external_energy = this.external_energy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.internal_energy = this.internal_energy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.mass = this.mass = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.linelist = this.linelist = (run.elements.Contact_Line[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dpl_old = this.dpl_old = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.right_neighbour = this.right_neighbour = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.left_neighbour = this.left_neighbour = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.load = this.load = (run.Load)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.constraint = this.constraint = (run.Constraint)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.pos_orig = this.pos_orig = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.pos = this.pos = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dpl = this.dpl = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.contact_force_old = this.contact_force_old = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_force_old = this.hourglass_force_old = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_force_old = this.internal_force_old = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.external_force_old = this.external_force_old = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vel = this.vel = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.acc = this.acc = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.inv_inertia = this.inv_inertia = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.inertia = this.inertia = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.lastload = this.lastload = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force_positive = this.force_positive = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.contact_force = this.contact_force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_force = this.hourglass_force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_force = this.internal_force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.external_force = this.external_force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.owner = this.owner = (java.lang.Object)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.linelist);
      c.descend(this.dpl_old);
      c.descend(this.right_neighbour);
      c.descend(this.left_neighbour);
      c.descend(this.load);
      c.descend(this.constraint);
      c.descend(this.pos_orig);
      c.descend(this.pos);
      c.descend(this.dpl);
      c.descend(this.contact_force_old);
      c.descend(this.hourglass_force_old);
      c.descend(this.internal_force_old);
      c.descend(this.external_force_old);
      c.descend(this.vel);
      c.descend(this.acc);
      c.descend(this.inv_inertia);
      c.descend(this.inertia);
      c.descend(this.lastload);
      c.descend(this.force_positive);
      c.descend(this.contact_force);
      c.descend(this.hourglass_force);
      c.descend(this.internal_force);
      c.descend(this.external_force);
      c.descend(this.force);
      c.descend(this.owner);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.linelist = (run.elements.Contact_Line[])f.filter(this.linelist);
      this.dpl_old = (Jama.Matrix)f.filter(this.dpl_old);
      this.right_neighbour = (run.Node)f.filter(this.right_neighbour);
      this.left_neighbour = (run.Node)f.filter(this.left_neighbour);
      this.load = (run.Load)f.filter(this.load);
      this.constraint = (run.Constraint)f.filter(this.constraint);
      this.pos_orig = (Jama.Matrix)f.filter(this.pos_orig);
      this.pos = (Jama.Matrix)f.filter(this.pos);
      this.dpl = (Jama.Matrix)f.filter(this.dpl);
      this.contact_force_old = (Jama.Matrix)f.filter(this.contact_force_old);
      this.hourglass_force_old = (Jama.Matrix)f.filter(this.hourglass_force_old);
      this.internal_force_old = (Jama.Matrix)f.filter(this.internal_force_old);
      this.external_force_old = (Jama.Matrix)f.filter(this.external_force_old);
      this.vel = (Jama.Matrix)f.filter(this.vel);
      this.acc = (Jama.Matrix)f.filter(this.acc);
      this.inv_inertia = (Jama.Matrix)f.filter(this.inv_inertia);
      this.inertia = (Jama.Matrix)f.filter(this.inertia);
      this.lastload = (Jama.Matrix)f.filter(this.lastload);
      this.force_positive = (Jama.Matrix)f.filter(this.force_positive);
      this.contact_force = (Jama.Matrix)f.filter(this.contact_force);
      this.hourglass_force = (Jama.Matrix)f.filter(this.hourglass_force);
      this.internal_force = (Jama.Matrix)f.filter(this.internal_force);
      this.external_force = (Jama.Matrix)f.filter(this.external_force);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.owner = (java.lang.Object)f.filter(this.owner);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Node(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Node)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Node)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Node)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Node((Node)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Node)copy).deepCloneReferences((Node)orig, _helper);
         return false;
      }
      public Class getType() {
         return Node.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Node(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Node._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.deactivated = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.type = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.cpu_number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.z_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.oldstep = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.halfstep = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.hourglass_energy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.contact_energy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.external_energy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.internal_energy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.mass = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Node._SIZE);
      this.linelist = (run.elements.Contact_Line[])_stream.readReference();
      this.dpl_old = (Jama.Matrix)_stream.readReference();
      this.right_neighbour = (run.Node)_stream.readReference();
      this.left_neighbour = (run.Node)_stream.readReference();
      this.load = (run.Load)_stream.readReference();
      this.constraint = (run.Constraint)_stream.readReference();
      this.pos_orig = (Jama.Matrix)_stream.readReference();
      this.pos = (Jama.Matrix)_stream.readReference();
      this.dpl = (Jama.Matrix)_stream.readReference();
      this.contact_force_old = (Jama.Matrix)_stream.readReference();
      this.hourglass_force_old = (Jama.Matrix)_stream.readReference();
      this.internal_force_old = (Jama.Matrix)_stream.readReference();
      this.external_force_old = (Jama.Matrix)_stream.readReference();
      this.vel = (Jama.Matrix)_stream.readReference();
      this.acc = (Jama.Matrix)_stream.readReference();
      this.inv_inertia = (Jama.Matrix)_stream.readReference();
      this.inertia = (Jama.Matrix)_stream.readReference();
      this.lastload = (Jama.Matrix)_stream.readReference();
      this.force_positive = (Jama.Matrix)_stream.readReference();
      this.contact_force = (Jama.Matrix)_stream.readReference();
      this.hourglass_force = (Jama.Matrix)_stream.readReference();
      this.internal_force = (Jama.Matrix)_stream.readReference();
      this.external_force = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.owner = (java.lang.Object)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Node._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.deactivated);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.type);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cpu_number);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.oldstep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.halfstep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.hourglass_energy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.contact_energy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.external_energy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.internal_energy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.mass);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.linelist);
      _stream.writeReference(this.dpl_old);
      _stream.writeReference(this.right_neighbour);
      _stream.writeReference(this.left_neighbour);
      _stream.writeReference(this.load);
      _stream.writeReference(this.constraint);
      _stream.writeReference(this.pos_orig);
      _stream.writeReference(this.pos);
      _stream.writeReference(this.dpl);
      _stream.writeReference(this.contact_force_old);
      _stream.writeReference(this.hourglass_force_old);
      _stream.writeReference(this.internal_force_old);
      _stream.writeReference(this.external_force_old);
      _stream.writeReference(this.vel);
      _stream.writeReference(this.acc);
      _stream.writeReference(this.inv_inertia);
      _stream.writeReference(this.inertia);
      _stream.writeReference(this.lastload);
      _stream.writeReference(this.force_positive);
      _stream.writeReference(this.contact_force);
      _stream.writeReference(this.hourglass_force);
      _stream.writeReference(this.internal_force);
      _stream.writeReference(this.external_force);
      _stream.writeReference(this.force);
      _stream.writeReference(this.owner);
   }
   public Node(Node _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.deactivated = _orig.deactivated;
      this.type = _orig.type;
      this.cpu_number = _orig.cpu_number;
      this.z_is_set = _orig.z_is_set;
      this.y_is_set = _orig.y_is_set;
      this.x_is_set = _orig.x_is_set;
      this.number = _orig.number;
      this.oldstep = _orig.oldstep;
      this.halfstep = _orig.halfstep;
      this.hourglass_energy = _orig.hourglass_energy;
      this.contact_energy = _orig.contact_energy;
      this.external_energy = _orig.external_energy;
      this.internal_energy = _orig.internal_energy;
      this.mass = _orig.mass;
   }
   public void deepCloneReferences(Node _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.linelist = (run.elements.Contact_Line[])_helper.internalDeepClone(_orig.linelist);
      this.dpl_old = (Jama.Matrix)_helper.internalDeepClone(_orig.dpl_old);
      this.right_neighbour = (run.Node)_helper.internalDeepClone(_orig.right_neighbour);
      this.left_neighbour = (run.Node)_helper.internalDeepClone(_orig.left_neighbour);
      this.load = (run.Load)_helper.internalDeepClone(_orig.load);
      this.constraint = (run.Constraint)_helper.internalDeepClone(_orig.constraint);
      this.pos_orig = (Jama.Matrix)_helper.internalDeepClone(_orig.pos_orig);
      this.pos = (Jama.Matrix)_helper.internalDeepClone(_orig.pos);
      this.dpl = (Jama.Matrix)_helper.internalDeepClone(_orig.dpl);
      this.contact_force_old = (Jama.Matrix)_helper.internalDeepClone(_orig.contact_force_old);
      this.hourglass_force_old = (Jama.Matrix)_helper.internalDeepClone(_orig.hourglass_force_old);
      this.internal_force_old = (Jama.Matrix)_helper.internalDeepClone(_orig.internal_force_old);
      this.external_force_old = (Jama.Matrix)_helper.internalDeepClone(_orig.external_force_old);
      this.vel = (Jama.Matrix)_helper.internalDeepClone(_orig.vel);
      this.acc = (Jama.Matrix)_helper.internalDeepClone(_orig.acc);
      this.inv_inertia = (Jama.Matrix)_helper.internalDeepClone(_orig.inv_inertia);
      this.inertia = (Jama.Matrix)_helper.internalDeepClone(_orig.inertia);
      this.lastload = (Jama.Matrix)_helper.internalDeepClone(_orig.lastload);
      this.force_positive = (Jama.Matrix)_helper.internalDeepClone(_orig.force_positive);
      this.contact_force = (Jama.Matrix)_helper.internalDeepClone(_orig.contact_force);
      this.hourglass_force = (Jama.Matrix)_helper.internalDeepClone(_orig.hourglass_force);
      this.internal_force = (Jama.Matrix)_helper.internalDeepClone(_orig.internal_force);
      this.external_force = (Jama.Matrix)_helper.internalDeepClone(_orig.external_force);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.owner = (java.lang.Object)_helper.internalDeepClone(_orig.owner);
   }
   private Object owner;
   private double mass;
   private double internal_energy;
   private double external_energy;
   private double contact_energy;
   private double hourglass_energy;
   private double halfstep;
   private double oldstep;
   private Matrix force;
   private Matrix external_force;
   private Matrix internal_force;
   private Matrix hourglass_force;
   private Matrix contact_force;
   private Matrix force_positive;
   private Matrix lastload;
   private Matrix inertia;
   private Matrix inv_inertia;
   private Matrix acc;
   private Matrix vel;
   private Matrix external_force_old;
   private Matrix internal_force_old;
   private Matrix hourglass_force_old;
   private Matrix contact_force_old;
   private Matrix dpl;
   private Matrix pos;
   private Matrix pos_orig;
   private Constraint constraint;
   private Load load;
   private int number;
   private Node left_neighbour;
   private Node right_neighbour;
   private Jama.Matrix dpl_old;
   private boolean x_is_set;
   private boolean y_is_set;
   private boolean z_is_set;
   private Contact_Line[] linelist;
   private int cpu_number;
   public static int NODE = 1;
   public static int INTERNAL_NODE = 2;
   protected int type;
   protected boolean deactivated;
   public Node() {
      super();
      this.vel = new Jama.Matrix(6, 1);
      this.acc = new Jama.Matrix(6, 1);
      this.dpl = new Jama.Matrix(6, 1);
      this.dpl_old = new Jama.Matrix(6, 1);
      this.pos = new Jama.Matrix(6, 1);
      this.pos_orig = new Jama.Matrix(6, 1);
      this.force = new Jama.Matrix(6, 1);
      this.internal_force = new Jama.Matrix(6, 1);
      this.external_force = new Jama.Matrix(6, 1);
      this.hourglass_force = new Jama.Matrix(6, 1);
      this.contact_force = new Jama.Matrix(6, 1);
      this.internal_force_old = new Jama.Matrix(6, 1);
      this.external_force_old = new Jama.Matrix(6, 1);
      this.hourglass_force_old = new Jama.Matrix(6, 1);
      this.contact_force_old = new Jama.Matrix(6, 1);
      this.force_positive = new Jama.Matrix(6, 1);
      this.lastload = new Jama.Matrix(6, 1);
      this.inertia = new Jama.Matrix(3, 3);
      this.type = run.Node.NODE;
   }
   public synchronized void addExternalForce(Jama.Matrix param) {
      this.external_force.set(0, 0, this.external_force.get(0, 0) + param.get(0, 0));
      this.external_force.set(1, 0, this.external_force.get(1, 0) + param.get(1, 0));
      this.external_force.set(2, 0, this.external_force.get(2, 0) + param.get(2, 0));
      this.force.set(0, 0, this.force.get(0, 0) + param.get(0, 0));
      this.force.set(1, 0, this.force.get(1, 0) + param.get(1, 0));
      this.force.set(2, 0, this.force.get(2, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(0, 0, this.force_positive.get(0, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(1, 0, this.force_positive.get(1, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(2, 0, this.force_positive.get(2, 0) + param.get(2, 0));
      }
   }
   public synchronized void addInternalForce(Jama.Matrix param) {
      this.internal_force.set(0, 0, this.internal_force.get(0, 0) + param.get(0, 0));
      this.internal_force.set(1, 0, this.internal_force.get(1, 0) + param.get(1, 0));
      this.internal_force.set(2, 0, this.internal_force.get(2, 0) + param.get(2, 0));
      this.force.set(0, 0, this.force.get(0, 0) + param.get(0, 0));
      this.force.set(1, 0, this.force.get(1, 0) + param.get(1, 0));
      this.force.set(2, 0, this.force.get(2, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(0, 0, this.force_positive.get(0, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(1, 0, this.force_positive.get(1, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(2, 0, this.force_positive.get(2, 0) + param.get(2, 0));
      }
   }
   public synchronized void addContactForce(Jama.Matrix param) {
      this.contact_force.set(0, 0, this.contact_force.get(0, 0) + param.get(0, 0));
      this.contact_force.set(1, 0, this.contact_force.get(1, 0) + param.get(1, 0));
      this.contact_force.set(2, 0, this.contact_force.get(2, 0) + param.get(2, 0));
      this.force.set(0, 0, this.force.get(0, 0) + param.get(0, 0));
      this.force.set(1, 0, this.force.get(1, 0) + param.get(1, 0));
      this.force.set(2, 0, this.force.get(2, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(0, 0, this.force_positive.get(0, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(1, 0, this.force_positive.get(1, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(2, 0, this.force_positive.get(2, 0) + param.get(2, 0));
      }
   }
   public synchronized void addHourglassForce(Jama.Matrix param) {
      this.hourglass_force.set(0, 0, this.hourglass_force.get(0, 0) + param.get(0, 0));
      this.hourglass_force.set(1, 0, this.hourglass_force.get(1, 0) + param.get(1, 0));
      this.hourglass_force.set(2, 0, this.hourglass_force.get(2, 0) + param.get(2, 0));
      this.force.set(0, 0, this.force.get(0, 0) + param.get(0, 0));
      this.force.set(1, 0, this.force.get(1, 0) + param.get(1, 0));
      this.force.set(2, 0, this.force.get(2, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(0, 0, this.force_positive.get(0, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(1, 0, this.force_positive.get(1, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(2, 0, this.force_positive.get(2, 0) + param.get(2, 0));
      }
   }
   public void addInertia(Jama.Matrix param) {
      this.inertia.plusEquals(param);
   }
   public Jama.Matrix getInertia() {
      return this.inertia;
   }
   public void addMass(double addmass) {
      this.mass += addmass;
   }
   public synchronized void addExternalMoment(Jama.Matrix param) {
      this.external_force.set(3, 0, this.external_force.get(3, 0) + param.get(0, 0));
      this.external_force.set(4, 0, this.external_force.get(4, 0) + param.get(1, 0));
      this.external_force.set(5, 0, this.external_force.get(5, 0) + param.get(2, 0));
      this.force.set(3, 0, this.force.get(3, 0) + param.get(0, 0));
      this.force.set(4, 0, this.force.get(4, 0) + param.get(1, 0));
      this.force.set(5, 0, this.force.get(5, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(3, 0, this.force_positive.get(3, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(4, 0, this.force_positive.get(4, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(5, 0, this.force_positive.get(5, 0) + param.get(2, 0));
      }
   }
   public synchronized void addInternalMoment(Jama.Matrix param) {
      this.internal_force.set(3, 0, this.internal_force.get(3, 0) + param.get(0, 0));
      this.internal_force.set(4, 0, this.internal_force.get(4, 0) + param.get(1, 0));
      this.internal_force.set(5, 0, this.internal_force.get(5, 0) + param.get(2, 0));
      this.force.set(3, 0, this.force.get(3, 0) + param.get(0, 0));
      this.force.set(4, 0, this.force.get(4, 0) + param.get(1, 0));
      this.force.set(5, 0, this.force.get(5, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(3, 0, this.force_positive.get(3, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(4, 0, this.force_positive.get(4, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(5, 0, this.force_positive.get(5, 0) + param.get(2, 0));
      }
   }
   public synchronized void addHourglassMoment(Jama.Matrix param) {
      this.hourglass_force.set(3, 0, this.hourglass_force.get(3, 0) + param.get(0, 0));
      this.hourglass_force.set(4, 0, this.hourglass_force.get(4, 0) + param.get(1, 0));
      this.hourglass_force.set(5, 0, this.hourglass_force.get(5, 0) + param.get(2, 0));
      this.force.set(3, 0, this.force.get(3, 0) + param.get(0, 0));
      this.force.set(4, 0, this.force.get(4, 0) + param.get(1, 0));
      this.force.set(5, 0, this.force.get(5, 0) + param.get(2, 0));
      if (param.get(0, 0) > 0) {
         this.force_positive.set(3, 0, this.force_positive.get(3, 0) + param.get(0, 0));
      }
      if (param.get(1, 0) > 0) {
         this.force_positive.set(4, 0, this.force_positive.get(4, 0) + param.get(1, 0));
      }
      if (param.get(2, 0) > 0) {
         this.force_positive.set(5, 0, this.force_positive.get(5, 0) + param.get(2, 0));
      }
   }
   public void calculateNewPosition(double timestep, double currtime) {
      int i;
      double t3;
      double t4;
      double t5;
      for (i = 0; i < 6; i++) {
         this.dpl_old.set(i, 0, this.dpl.get(i, 0));
         this.external_force_old.set(i, 0, this.external_force.get(i, 0));
         this.internal_force_old.set(i, 0, this.internal_force.get(i, 0));
         this.hourglass_force_old.set(i, 0, this.hourglass_force.get(i, 0));
         this.contact_force_old.set(i, 0, this.contact_force.get(i, 0));
      }
      if (this.load != null) {
         this.lastload = this.load.getLoad(currtime);
         this.force.plusEquals(this.lastload);
      }
      this.acc.set(0, 0, this.force.get(0, 0) / this.mass);
      this.acc.set(1, 0, this.force.get(1, 0) / this.mass);
      this.acc.set(2, 0, this.force.get(2, 0) / this.mass);
      t3 = this.inertia.get(0, 0) * this.vel.get(3, 0) + this.inertia.get(0, 1) * this.vel.get(4, 0) + this.inertia.get(0, 2) * this.vel.get(5, 0);
      t4 = this.inertia.get(1, 0) * this.vel.get(3, 0) + this.inertia.get(1, 1) * this.vel.get(4, 0) + this.inertia.get(1, 2) * this.vel.get(5, 0);
      t5 = this.inertia.get(2, 0) * this.vel.get(3, 0) + this.inertia.get(2, 1) * this.vel.get(4, 0) + this.inertia.get(2, 2) * this.vel.get(5, 0);
      this.acc.set(3, 0, this.vel.get(4, 0) * t5 - this.vel.get(5, 0) * t4);
      this.acc.set(4, 0, this.vel.get(5, 0) * t3 - this.vel.get(3, 0) * t5);
      this.acc.set(5, 0, this.vel.get(3, 0) * t4 - this.vel.get(4, 0) * t3);
      t3 = this.force.get(3, 0) - this.acc.get(3, 0);
      t4 = this.force.get(4, 0) - this.acc.get(4, 0);
      t5 = this.force.get(5, 0) - this.acc.get(5, 0);
      this.acc.set(3, 0, this.inv_inertia.get(0, 0) * t3 + this.inv_inertia.get(0, 1) * t4 + this.inv_inertia.get(0, 2) * t5);
      this.acc.set(4, 0, this.inv_inertia.get(1, 0) * t3 + this.inv_inertia.get(1, 1) * t4 + this.inv_inertia.get(1, 2) * t5);
      this.acc.set(5, 0, this.inv_inertia.get(2, 0) * t3 + this.inv_inertia.get(2, 1) * t4 + this.inv_inertia.get(2, 2) * t5);
      if (this.load != null) {
         this.acc.plusEquals(this.load.getAcc(currtime));
      }
      if (this.constraint != null) {
         this.constraint.applyAccelerationConditions(this, currtime);
      }
      this.halfstep = 0.5 * (this.oldstep + timestep);
      this.oldstep = timestep;
      this.vel.plusEquals(this.acc.times(this.halfstep));
      this.dpl.plusEquals(this.vel.times(timestep));
      updatePos();
      if (this.constraint != null) {
         this.constraint.applyVelocityConditions(this, currtime);
      }
      this.external_energy += 0.5 * timestep * (this.vel.get(0, 0) * (this.external_force_old.get(0, 0) + this.external_force.get(0, 0)) + this.vel.get(1, 0) * (this.external_force_old.get(1, 0) + this.external_force.get(1, 0)) + this.vel.get(2, 0) * (this.external_force_old.get(2, 0) + this.external_force.get(2, 0)) + this.vel.get(3, 0) * (this.external_force_old.get(3, 0) + this.external_force.get(3, 0)) + this.vel.get(4, 0) * (this.external_force_old.get(4, 0) + this.external_force.get(4, 0)) + this.vel.get(5, 0) * (this.external_force_old.get(5, 0) + this.external_force.get(5, 0)));
      this.internal_energy -= 0.5 * timestep * (this.vel.get(0, 0) * (this.internal_force_old.get(0, 0) + this.internal_force.get(0, 0)) + this.vel.get(1, 0) * (this.internal_force_old.get(1, 0) + this.internal_force.get(1, 0)) + this.vel.get(2, 0) * (this.internal_force_old.get(2, 0) + this.internal_force.get(2, 0)) + this.vel.get(3, 0) * (this.internal_force_old.get(3, 0) + this.internal_force.get(3, 0)) + this.vel.get(4, 0) * (this.internal_force_old.get(4, 0) + this.internal_force.get(4, 0)) + this.vel.get(5, 0) * (this.internal_force_old.get(5, 0) + this.internal_force.get(5, 0)));
      this.contact_energy += 0.5 * timestep * (this.vel.get(0, 0) * (this.contact_force_old.get(0, 0) + this.contact_force.get(0, 0)) + this.vel.get(1, 0) * (this.contact_force_old.get(1, 0) + this.contact_force.get(1, 0)) + this.vel.get(2, 0) * (this.contact_force_old.get(2, 0) + this.contact_force.get(2, 0)) + this.vel.get(3, 0) * (this.contact_force_old.get(3, 0) + this.contact_force.get(3, 0)) + this.vel.get(4, 0) * (this.contact_force_old.get(4, 0) + this.contact_force.get(4, 0)) + this.vel.get(5, 0) * (this.contact_force_old.get(5, 0) + this.contact_force.get(5, 0)));
      this.hourglass_energy -= 0.5 * timestep * (this.vel.get(0, 0) * (this.hourglass_force_old.get(0, 0) + this.hourglass_force.get(0, 0)) + this.vel.get(1, 0) * (this.hourglass_force_old.get(1, 0) + this.hourglass_force.get(1, 0)) + this.vel.get(2, 0) * (this.hourglass_force_old.get(2, 0) + this.hourglass_force.get(2, 0)) + this.vel.get(3, 0) * (this.hourglass_force_old.get(3, 0) + this.hourglass_force.get(3, 0)) + this.vel.get(4, 0) * (this.hourglass_force_old.get(4, 0) + this.hourglass_force.get(4, 0)) + this.vel.get(5, 0) * (this.hourglass_force_old.get(5, 0) + this.hourglass_force.get(5, 0)));
   }
   private void updatePos() {
      this.pos.set(0, 0, this.pos_orig.get(0, 0) + this.dpl.get(0, 0));
      this.pos.set(1, 0, this.pos_orig.get(1, 0) + this.dpl.get(1, 0));
      this.pos.set(2, 0, this.pos_orig.get(2, 0) + this.dpl.get(2, 0));
      this.pos.set(3, 0, this.pos_orig.get(3, 0) + this.dpl.get(3, 0));
      this.pos.set(4, 0, this.pos_orig.get(4, 0) + this.dpl.get(4, 0));
      this.pos.set(5, 0, this.pos_orig.get(5, 0) + this.dpl.get(5, 0));
   }
   public void checkNeighbours() {
      Node temp_neighbour;
      boolean finished = false;
      while (!finished) {
         finished = true;
         if (this.left_neighbour != null) {
            if (this.left_neighbour.getX_pos() > this.getX_pos()) {
               temp_neighbour = this.left_neighbour.getLeft_neighbour();
               this.left_neighbour.setRight_neighbour(this.right_neighbour);
               if (this.right_neighbour != null) {
                  this.right_neighbour.setLeft_neighbour(this.left_neighbour);
               }
               this.left_neighbour.setLeft_neighbour(this);
               this.right_neighbour = this.left_neighbour;
               this.left_neighbour = temp_neighbour;
               if (this.left_neighbour != null) {
                  this.left_neighbour.setRight_neighbour(this);
               }
               finished = false;
            } else if (this.right_neighbour != null) {
               if (this.right_neighbour.getX_pos() < this.getX_pos()) {
                  temp_neighbour = this.right_neighbour.getRight_neighbour();
                  this.right_neighbour.setLeft_neighbour(this.left_neighbour);
                  if (this.left_neighbour != null) {
                     this.left_neighbour.setRight_neighbour(this.right_neighbour);
                  }
                  this.right_neighbour.setRight_neighbour(this);
                  this.left_neighbour = this.right_neighbour;
                  this.right_neighbour = temp_neighbour;
                  if (this.right_neighbour != null) {
                     this.right_neighbour.setLeft_neighbour(this);
                  }
                  finished = false;
               }
            }
         }
      }
   }
   public void clearNodalForces() {
      int i;
      for (i = 0; i < 6; i++) {
         this.internal_force.set(i, 0, 0);
         this.external_force.set(i, 0, 0);
         this.contact_force.set(i, 0, 0);
         this.hourglass_force.set(i, 0, 0);
         this.force_positive.set(i, 0, 0);
         this.force.set(i, 0, 0);
      }
   }
   public void determineMassMatrix() {
      if (this.inertia.get(0, 0) == 0 && this.inertia.get(1, 1) == 0 && this.inertia.get(2, 2) == 0) {
         this.inertia.set(0, 0, 1.0E-15);
         this.inertia.set(1, 1, 1.0E-15);
         this.inertia.set(2, 2, 1.0E-15);
      }
      this.inv_inertia = this.inertia.inverse();
   }
   public Constraint getConstraint() {
      return this.constraint;
   }
   public Node getLeft_neighbour() {
      return this.left_neighbour;
   }
   public Load getLoad() {
      return this.load;
   }
   public Matrix getForce() {
      return this.force;
   }
   public int getNumber() {
      return this.number;
   }
   public Matrix getPos() {
      return this.pos.getMatrix(0, 2, 0, 0);
   }
   public Matrix getPos_orig() {
      return this.pos_orig.getMatrix(0, 2, 0, 0);
   }
   public Matrix getRot() {
      return this.pos.getMatrix(3, 5, 0, 0);
   }
   public Matrix getVel() {
      return this.vel.getMatrix(0, 2, 0, 0);
   }
   public Matrix getRotVel() {
      return this.vel.getMatrix(3, 5, 0, 0);
   }
   public Matrix getRot_orig() {
      return this.pos_orig.getMatrix(3, 5, 0, 0);
   }
   public Node getRight_neighbour() {
      return this.right_neighbour;
   }
   public double getX_acc() {
      return this.acc.get(0, 0);
   }
   public double getX_dpos() {
      return this.dpl.get(0, 0) - this.dpl_old.get(0, 0);
   }
   public double getX_force() {
      return this.force.get(0, 0);
   }
   public double getX_force_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(0, 0) > 0) {
            this.force_positive.set(0, 0, this.force_positive.get(0, 0) + this.lastload.get(0, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(0, 0);
      } else {
         return this.force.get(0, 0) - this.force_positive.get(0, 0);
      }
   }
   public double getX_moment() {
      return this.force.get(3, 0);
   }
   public double getX_moment_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(3, 0) > 0) {
            this.force_positive.set(3, 0, this.force_positive.get(3, 0) + this.lastload.get(3, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(3, 0);
      } else {
         return this.force.get(3, 0) - this.force_positive.get(3, 0);
      }
   }
   public double getX_pos() {
      return this.pos.get(0, 0);
   }
   public double getX_pos_orig() {
      return this.pos_orig.get(0, 0);
   }
   public double getX_rot() {
      return this.pos_orig.get(0, 0) + this.dpl.get(0, 0);
   }
   public double getX_rot_acc() {
      return this.acc.get(3, 0);
   }
   public double getX_rot_dpl() {
      return this.dpl.get(3, 0);
   }
   public double getX_rot_orig() {
      return this.pos_orig.get(3, 0);
   }
   public double getX_rot_vel() {
      return this.vel.get(3, 0);
   }
   public double getX_vel() {
      return this.vel.get(0, 0);
   }
   public double getY_acc() {
      return this.acc.get(1, 0);
   }
   public double getY_dpos() {
      return this.dpl.get(1, 0) - this.dpl_old.get(1, 0);
   }
   public double getY_force() {
      return this.force.get(1, 0);
   }
   public double getY_force_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(1, 0) > 0) {
            this.force_positive.set(1, 0, this.force_positive.get(1, 0) + this.lastload.get(1, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(1, 0);
      } else {
         return this.force.get(1, 0) - this.force_positive.get(1, 0);
      }
   }
   public double getY_moment() {
      return this.force.get(4, 0);
   }
   public double getY_moment_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(4, 0) > 0) {
            this.force_positive.set(4, 0, this.force_positive.get(4, 0) + this.lastload.get(4, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(4, 0);
      } else {
         return this.force.get(4, 0) - this.force_positive.get(4, 0);
      }
   }
   public double getY_pos() {
      return this.pos.get(1, 0);
   }
   public double getY_pos_orig() {
      return this.pos_orig.get(1, 0);
   }
   public double getY_rot() {
      return this.pos.get(4, 0);
   }
   public double getY_rot_acc() {
      return this.acc.get(4, 0);
   }
   public double getY_rot_dpl() {
      return this.dpl.get(4, 0);
   }
   public double getY_rot_orig() {
      return this.pos_orig.get(4, 0);
   }
   public double getY_rot_vel() {
      return this.vel.get(4, 0);
   }
   public double getY_vel() {
      return this.vel.get(1, 0);
   }
   public double getZ_acc() {
      return this.acc.get(2, 0);
   }
   public double getZ_dpos() {
      return this.dpl.get(2, 0) - this.dpl_old.get(2, 0);
   }
   public double getZ_force() {
      return this.force.get(2, 0);
   }
   public double getZ_force_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(2, 0) > 0) {
            this.force_positive.set(2, 0, this.force_positive.get(2, 0) + this.lastload.get(2, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(2, 0);
      } else {
         return this.force.get(2, 0) - this.force_positive.get(2, 0);
      }
   }
   public double getZ_moment() {
      return this.force.get(5, 0);
   }
   public double getZ_moment_component(boolean positive) {
      if (this.load != null) {
         if (this.lastload.get(5, 0) > 0) {
            this.force_positive.set(5, 0, this.force_positive.get(5, 0) + this.lastload.get(5, 0));
         }
      }
      if (positive) {
         return this.force_positive.get(5, 0);
      } else {
         return this.force.get(5, 0) - this.force_positive.get(5, 0);
      }
   }
   public double getZ_pos() {
      return this.pos.get(2, 0);
   }
   public double getZ_pos_orig() {
      return this.pos_orig.get(2, 0);
   }
   public double getZ_rot() {
      return this.pos.get(5, 0);
   }
   public double getZ_rot_acc() {
      return this.acc.get(5, 0);
   }
   public double getZ_rot_dpl() {
      return this.dpl.get(5, 0);
   }
   public double getZ_rot_orig() {
      return this.pos_orig.get(5, 0);
   }
   public double getZ_rot_vel() {
      return this.vel.get(5, 0);
   }
   public double getZ_vel() {
      return this.vel.get(2, 0);
   }
   public double getInternalEnergy() {
      return this.internal_energy;
   }
   public double getExternalEnergy() {
      return this.external_energy;
   }
   public double getContactEnergy() {
      return this.contact_energy;
   }
   public double getHourglassEnergy() {
      return this.hourglass_energy;
   }
   public void setConstraint(Constraint newConstraint) {
      this.constraint = newConstraint;
   }
   public void setInitialConditions() {
      this.pos_orig.set(3, 0, 0);
      this.pos_orig.set(4, 0, 0);
      this.pos_orig.set(5, 0, 0);
      this.dpl.set(0, 0, 0);
      this.dpl.set(1, 0, 0);
      this.dpl.set(2, 0, 0);
      this.dpl.set(3, 0, 0);
      this.dpl.set(4, 0, 0);
      this.dpl.set(5, 0, 0);
      this.pos = this.pos_orig.plus(this.dpl);
      if (this.constraint == null) {
         this.setX_vel(0);
         this.setY_vel(0);
         this.setZ_vel(0);
         this.setX_rot_vel(0);
         this.setY_rot_vel(0);
         this.setY_rot_vel(0);
         this.setX_acc(0);
         this.setY_acc(0);
         this.setZ_acc(0);
         this.setX_rot_acc(0);
         this.setY_rot_acc(0);
         this.setY_rot_acc(0);
      } else {
         this.constraint.applyAccelerationConditions(this, 0);
         this.constraint.applyVelocityConditions(this, 0);
         this.constraint.registerNode(this);
      }
      this.dpl_old = this.dpl.copy();
      this.internal_energy = 0;
      this.external_energy = 0;
      this.hourglass_energy = 0;
      this.contact_energy = 0;
      if (this.mass == 0.0) {
         this.mass = 1.0E-15;
      }
      this.oldstep = 0;
   }
   public void setLeft_neighbour(Node newLeft_neighbour) {
      this.left_neighbour = newLeft_neighbour;
   }
   public void setLoad(Load newLoad) {
      this.load = newLoad;
   }
   public void setNumber(int newNumber) {
      this.number = newNumber;
   }
   public void setRight_neighbour(Node newRight_neighbour) {
      this.right_neighbour = newRight_neighbour;
   }
   public synchronized void setX_acc(double param) {
      this.acc.set(0, 0, param);
   }
   public synchronized void setX_force(double param) {
      this.force.set(0, 0, param);
   }
   public synchronized void setX_moment(double param) {
      this.force.set(3, 0, param);
   }
   public synchronized void setX_pos_orig(double param) {
      this.pos_orig.set(0, 0, param);
      this.pos.set(0, 0, param + this.dpl.get(0, 0));
   }
   public synchronized void setX_rot_acc(double param) {
      this.acc.set(3, 0, param);
   }
   public synchronized void setX_rot_pos_orig(double param) {
      this.pos_orig.set(3, 0, param);
      this.pos.set(3, 0, param + this.dpl.get(3, 0));
   }
   public synchronized void setX_rot_vel(double param) {
      this.vel.set(3, 0, param);
   }
   public synchronized void setX_vel(double param) {
      this.vel.set(0, 0, param);
   }
   public synchronized void setY_acc(double param) {
      this.acc.set(1, 0, param);
   }
   public synchronized void setY_force(double param) {
      this.force.set(1, 0, param);
   }
   public synchronized void setY_moment(double param) {
      this.force.set(4, 0, param);
   }
   public synchronized void setY_pos_orig(double param) {
      this.pos_orig.set(1, 0, param);
      this.pos.set(1, 0, param + this.dpl.get(1, 0));
   }
   public synchronized void setY_rot_acc(double param) {
      this.acc.set(4, 0, param);
   }
   public synchronized void setY_rot_pos_orig(double param) {
      this.pos_orig.set(4, 0, param);
      this.pos.set(4, 0, param + this.dpl.get(4, 0));
   }
   public synchronized void setY_rot_vel(double param) {
      this.vel.set(4, 0, param);
   }
   public synchronized void setY_vel(double param) {
      this.vel.set(1, 0, param);
   }
   public synchronized void setZ_acc(double param) {
      this.acc.set(2, 0, param);
   }
   public synchronized void setZ_force(double param) {
      this.force.set(2, 0, param);
   }
   public synchronized void setZ_moment(double param) {
      this.force.set(5, 0, param);
   }
   public synchronized void setZ_pos_orig(double param) {
      this.pos_orig.set(2, 0, param);
      this.pos.set(2, 0, param + this.dpl.get(2, 0));
   }
   public synchronized void setZ_rot_acc(double param) {
      this.acc.set(5, 0, param);
   }
   public synchronized void setZ_rot_pos_orig(double param) {
      this.pos_orig.set(5, 0, param);
      this.pos.set(5, 0, param + this.dpl.get(5, 0));
   }
   public synchronized void setZ_rot_vel(double param) {
      this.vel.set(5, 0, param);
   }
   public synchronized void setZ_vel(double param) {
      this.vel.set(2, 0, param);
   }
   public double getMass() {
      return this.mass;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector constraintlist, RplVector loadlist) throws java.text.ParseException {
      int i = 0;
      int index;
      Constraint temp_constraint;
      Load temp_load;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("X") && param[i + 2].is_a_number()) {
            setX_pos_orig(param[i + 2].getn());
            i += 3;
            this.x_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("Y") && param[i + 2].is_a_number()) {
            setY_pos_orig(param[i + 2].getn());
            i += 3;
            this.y_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("Z") && param[i + 2].is_a_number()) {
            setZ_pos_orig(param[i + 2].getn());
            i += 3;
            this.z_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("M") && param[i + 2].is_a_number()) {
            this.mass = param[i + 2].getn();
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IXX") && param[i + 2].is_a_number()) {
            this.inertia.set(0, 0, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IYY") && param[i + 2].is_a_number()) {
            this.inertia.set(1, 1, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IZZ") && param[i + 2].is_a_number()) {
            this.inertia.set(2, 2, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IXY") && param[i + 2].is_a_number()) {
            this.inertia.set(0, 1, param[i + 2].getn());
            this.inertia.set(1, 0, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IYZ") && param[i + 2].is_a_number()) {
            this.inertia.set(1, 2, param[i + 2].getn());
            this.inertia.set(2, 1, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("IXZ") && param[i + 2].is_a_number()) {
            this.inertia.set(0, 2, param[i + 2].getn());
            this.inertia.set(2, 0, param[i + 2].getn());
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CONSTRAINT") && param[i + 2].is_a_word()) {
            for (index = 0; index < constraintlist.size(); index++) {
               temp_constraint = (Constraint)constraintlist.elementAt(index);
               if (temp_constraint.name.equals(param[i + 2].getw().toUpperCase())) {
                  setConstraint(temp_constraint);
                  break;
               }
            }
            if (index == constraintlist.size()) {
               throw new java.text.ParseException("Constraint name specified does not exist in line ", lineno);
            }
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("LOAD") && param[i + 2].is_a_word()) {
            for (index = 0; index < loadlist.size(); index++) {
               temp_load = (Load)loadlist.elementAt(index);
               if (temp_load.name.equals(param[i + 2].getw().toUpperCase())) {
                  setLoad(temp_load);
                  break;
               }
            }
            if (index == loadlist.size()) {
               throw new java.text.ParseException("Load name specified does not exist in line ", lineno);
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Unidentified node parameter indata in line ", lineno);
         }
      }
      updatePos();
   }
   public void parse_Gmsh(Token[] param, int lineno, RplVector constraintlist, RplVector loadlist) throws java.text.ParseException {
      int i = 0;
      int index;
      Constraint temp_constraint;
      Load temp_load;
      if (param[0].is_a_number() && param[1].is_a_number() && param[2].is_a_number()) {
         setX_pos_orig(param[0].getn());
         setY_pos_orig(param[1].getn());
         setZ_pos_orig(param[i + 2].getn());
         this.x_is_set = true;
         this.y_is_set = true;
         this.z_is_set = true;
      } else {
         throw new java.text.ParseException("Unidentified node parameter indata in line ", lineno);
      }
      updatePos();
   }
   public void parse_Nastran(Token[] param, int lineno, RplVector constraintlist, RplVector loadlist) throws java.text.ParseException {
      int i = 0;
      int index;
      Constraint temp_constraint;
      Load temp_load;
      if (param[1].is_a_number()) {
         this.number = (int)param[1].getn();
      } else throw new java.text.ParseException("Illegal identification number of GRID: " + param[1].getn(), lineno);
      if (param[3].is_a_number()) {
         setX_pos_orig(param[3].getn());
         this.x_is_set = true;
      } else throw new java.text.ParseException("Illegal x-coordinate for Grid: " + param[1].getn(), lineno);
      if (param[4].is_a_number()) {
         setY_pos_orig(param[4].getn());
         this.y_is_set = true;
      } else throw new java.text.ParseException("Illegal y-coordinate for Grid: " + param[1].getn(), lineno);
      if (param[5].is_a_number()) {
         setZ_pos_orig(param[5].getn());
         this.z_is_set = true;
      } else throw new java.text.ParseException("Illegal z-coordinate for GRID: " + param[1].getn(), lineno);
      updatePos();
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.x_is_set) {
         throw new IllegalArgumentException("No x-coordinate defined for Node nr" + this.number);
      }
      if (!this.y_is_set) {
         throw new IllegalArgumentException("No y-coordinate defined for Node nr" + this.number);
      }
      if (!this.z_is_set) {
         throw new IllegalArgumentException("No z-coordinate defined for Node nr" + this.number);
      }
      if (this.mass < 0) {
         throw new IllegalArgumentException("Negative mass not allowed for node nr " + this.number);
      }
      if (this.inertia.get(0, 0) < 0) {
         throw new IllegalArgumentException("Negative Ixx not allowed for node nr " + this.number);
      }
      if (this.inertia.get(1, 0) < 0) {
         throw new IllegalArgumentException("Negative Iyy not allowed for node nr " + this.number);
      }
      if (this.inertia.get(2, 0) < 0) {
         throw new IllegalArgumentException("Negative Izz not allowed for node nr " + this.number);
      }
   }
   public Contact_Line getContact_Line(int nr) {
      if (this.linelist == null) {
         return null;
      }
      if (nr > this.linelist.length - 1) {
         return null;
      }
      return this.linelist[nr];
   }
   public void addContact_Line(Contact_Line c_element) {
      Contact_Line[] tmp;
      int i = 0;
      if (this.linelist == null) {
         this.linelist = new Contact_Line[1];
         this.linelist[0] = c_element;
      } else {
         tmp = this.linelist;
         this.linelist = new Contact_Line[this.linelist.length + 1];
         i = 0;
         while (i < this.linelist.length - 1) {
            this.linelist[i] = tmp[i];
            i++;
         }
         this.linelist[this.linelist.length - 1] = c_element;
      }
   }
   public boolean hasContact_LineElementConnectedTo(Node endnode) {
      int i = 0;
      if (this.linelist == null) {
         return false;
      }
      while (i < this.linelist.length) {
         if (this.linelist[i].getNode(0).equals(endnode)) {
            return true;
         }
         if (this.linelist[i].getNode(1).equals(endnode)) {
            return true;
         }
         i++;
      }
      return false;
   }
   public void registerMasterElement(Element el) {
   }
   public int getCpu_number() {
      return this.cpu_number;
   }
   public void setCpu_number(int cpu_number) {
      this.cpu_number = cpu_number;
   }
   public int getMachineID() {
      return DistributedRuntime.getMachineID();
   }
   public int getType() {
      return this.type;
   }
   public void setForceReference(Matrix force) {
      this.force = force;
   }
   public void setInternalForceReference(Matrix force) {
      this.internal_force = force;
   }
   public void setExternalForceReference(Matrix force) {
      this.external_force = force;
   }
   public void setHourglassForceReference(Matrix force) {
      this.hourglass_force = force;
   }
   public void setContactForceReference(Matrix force) {
      this.contact_force = force;
   }
   public void setForcePositiveReference(Matrix force) {
      this.force_positive = force;
   }
   public void deActivate() {
      this.left_neighbour.setRight_neighbour(this.right_neighbour);
      this.right_neighbour.setLeft_neighbour(this.left_neighbour);
      this.deactivated = true;
   }
   public boolean isDeActivated() {
      return this.deactivated;
   }
}
