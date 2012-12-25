package run.constraints;
import run.*;

import java.util.*;

public class RigidBody extends Constraint implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      RigidBody copy = (RigidBody)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.master_node_number, copy.master_node_number)) copy.master_node_number = this.master_node_number;
      if (po.writeDiff(this.master_node_update, copy.master_node_update)) copy.master_node_update = this.master_node_update;
      if (po.writeDiff(this.master_node_number_is_set, copy.master_node_number_is_set)) copy.master_node_number_is_set = this.master_node_number_is_set;
      copy.master_node = this.master_node = (run.Node)po.writeDiff(this.master_node, copy.master_node);
      copy.moment_arm = this.moment_arm = (Jama.Matrix)po.writeDiff(this.moment_arm, copy.moment_arm);
      copy.moment = this.moment = (Jama.Matrix)po.writeDiff(this.moment, copy.moment);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.nodes = this.nodes = (java.util.Vector)po.writeDiff(this.nodes, copy.nodes);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      RigidBody copy = (RigidBody)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.master_node_number = this.master_node_number = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.master_node_update = this.master_node_update = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.master_node_number_is_set = this.master_node_number_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.master_node = this.master_node = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.moment_arm = this.moment_arm = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.moment = this.moment = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodes = this.nodes = (java.util.Vector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.master_node);
      c.descend(this.moment_arm);
      c.descend(this.moment);
      c.descend(this.force);
      c.descend(this.nodes);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.master_node = (run.Node)f.filter(this.master_node);
      this.moment_arm = (Jama.Matrix)f.filter(this.moment_arm);
      this.moment = (Jama.Matrix)f.filter(this.moment);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.nodes = (java.util.Vector)f.filter(this.nodes);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new RigidBody(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((RigidBody)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((RigidBody)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((RigidBody)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new RigidBody((RigidBody)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((RigidBody)copy).deepCloneReferences((RigidBody)orig, _helper);
         return false;
      }
      public Class getType() {
         return RigidBody.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public RigidBody(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(RigidBody._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.master_node_number = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.master_node_update = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.master_node_number_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(RigidBody._SIZE);
      this.master_node = (run.Node)_stream.readReference();
      this.moment_arm = (Jama.Matrix)_stream.readReference();
      this.moment = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.nodes = (java.util.Vector)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(RigidBody._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.master_node_number);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.master_node_update);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.master_node_number_is_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.master_node);
      _stream.writeReference(this.moment_arm);
      _stream.writeReference(this.moment);
      _stream.writeReference(this.force);
      _stream.writeReference(this.nodes);
   }
   public RigidBody(RigidBody _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.master_node_number = _orig.master_node_number;
      this.master_node_update = _orig.master_node_update;
      this.master_node_number_is_set = _orig.master_node_number_is_set;
   }
   public void deepCloneReferences(RigidBody _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.master_node = (run.Node)_helper.internalDeepClone(_orig.master_node);
      this.moment_arm = (Jama.Matrix)_helper.internalDeepClone(_orig.moment_arm);
      this.moment = (Jama.Matrix)_helper.internalDeepClone(_orig.moment);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.nodes = (java.util.Vector)_helper.internalDeepClone(_orig.nodes);
   }
   private boolean master_node_number_is_set;
   private boolean master_node_update;
   private int master_node_number;
   private Vector nodes;
   private Jama.Matrix force;
   private Jama.Matrix moment;
   private Jama.Matrix moment_arm;
   private Node master_node;
   public RigidBody() {
      super();
      this.nodes = new Vector();
      this.master_node_update = false;
      this.type = new String("RIGID_BODY");
   }
   public RigidBody(Constraint param) {
      super();
      this.name = new String(param.getName());
      this.type = new String("RIGID_BODY");
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.master_node_number_is_set) {
         throw new IllegalArgumentException("No master_node defined for Rigid_Body nr" + this.number);
      }
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("MASTER_NODE") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].is_a_number()) {
               this.master_node_number = (int)param[i + 2].getn();
               i += 3;
               this.master_node_number_is_set = true;
            }
         } else if (param[i].getw().toUpperCase().equals("UPDATE_POSITION") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("ON")) {
               this.master_node_update = true;
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Syntax error, unrecognized Rigid_Body constraint parameter", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
   }
   public void parse_Gmsh(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
   }
   public String print_Fembic(int ctrl) {
      String out;
      switch (ctrl) {
      case Element.MESH: 
         out = new String(this.name + "\tMaster_node = " + this.master_node.getNumber());
         if (this.master_node_update) out += " Update_position = ON";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void applyAccelerationConditions(Node nod, double currtime) {
      nod.setX_acc(0);
      nod.setY_acc(0);
      nod.setZ_acc(0);
      nod.setX_rot_acc(0);
      nod.setY_rot_acc(0);
      nod.setZ_rot_acc(0);
   }
   public void applyVelocityConditions(Node nod, double currtime) {
      this.moment_arm = this.master_node.getPos().minus(nod.getPos());
      nod.setX_vel(this.master_node.getX_vel() + this.moment_arm.get(1, 0) * this.master_node.getZ_rot_vel() - this.moment_arm.get(2, 0) * this.master_node.getY_rot_vel());
      nod.setY_vel(this.master_node.getY_vel() + this.moment_arm.get(2, 0) * this.master_node.getX_rot_vel() - this.moment_arm.get(0, 0) * this.master_node.getZ_rot_vel());
      nod.setZ_vel(this.master_node.getZ_vel() + this.moment_arm.get(0, 0) * this.master_node.getY_rot_vel() - this.moment_arm.get(1, 0) * this.master_node.getX_rot_vel());
      nod.setX_rot_vel(this.master_node.getX_rot_vel());
      nod.setY_rot_vel(this.master_node.getY_rot_vel());
      nod.setZ_rot_vel(this.master_node.getZ_rot_vel());
   }
   public void registerNode(Node nod) {
      this.nodes.add(nod);
   }
   public void setInitialConditions() {
      Node nod;
      int i;
      Jama.Matrix inertia;
      Jama.Matrix pos;
      double mass;
      double vx;
      double vy;
      double vz;
      inertia = new Jama.Matrix(3, 3);
      pos = this.master_node.getPos().times(this.master_node.getMass());
      mass = this.master_node.getMass();
      for (i = 0; i < this.nodes.size(); i++) {
         nod = (Node)this.nodes.elementAt(i);
         pos.plusEquals(nod.getPos().times(nod.getMass()));
         mass += nod.getMass();
      }
      pos.timesEquals(1 / mass);
      if (this.master_node_update) {
         this.master_node.setX_pos_orig(pos.get(0, 0));
         this.master_node.setY_pos_orig(pos.get(1, 0));
         this.master_node.setZ_pos_orig(pos.get(2, 0));
      }
      for (i = 0; i < this.nodes.size(); i++) {
         nod = (Node)this.nodes.elementAt(i);
         this.master_node.addMass(nod.getMass());
         inertia = nod.getInertia();
         vx = nod.getX_pos() - pos.get(0, 0);
         vy = nod.getY_pos() - pos.get(1, 0);
         vz = nod.getZ_pos() - pos.get(2, 0);
         inertia.set(0, 0, inertia.get(0, 0) + nod.getMass() * (vy * vy + vz * vz));
         inertia.set(1, 1, inertia.get(1, 1) + nod.getMass() * (vx * vx + vz * vz));
         inertia.set(2, 2, inertia.get(2, 2) + nod.getMass() * (vx * vx + vy * vy));
         inertia.set(0, 1, inertia.get(0, 1) + nod.getMass() * (vx + vy));
         inertia.set(1, 0, inertia.get(1, 0) + nod.getMass() * (vx + vy));
         inertia.set(1, 2, inertia.get(1, 2) + nod.getMass() * (vy + vz));
         inertia.set(2, 1, inertia.get(2, 1) + nod.getMass() * (vy + vz));
         inertia.set(2, 0, inertia.get(2, 0) + nod.getMass() * (vx + vz));
         inertia.set(0, 2, inertia.get(0, 2) + nod.getMass() * (vx + vz));
         this.master_node.addInertia(inertia);
      }
      if (!this.master_node_update) {
         vx = this.master_node.getX_pos() - pos.get(0, 0);
         vy = this.master_node.getY_pos() - pos.get(1, 0);
         vz = this.master_node.getZ_pos() - pos.get(2, 0);
         inertia.set(0, 0, this.master_node.getMass() * (vy * vy + vz * vz));
         inertia.set(1, 1, this.master_node.getMass() * (vx * vx + vz * vz));
         inertia.set(2, 2, this.master_node.getMass() * (vx * vx + vy * vy));
         inertia.set(0, 1, this.master_node.getMass() * (vx + vy));
         inertia.set(1, 0, this.master_node.getMass() * (vx + vy));
         inertia.set(1, 2, this.master_node.getMass() * (vy + vz));
         inertia.set(2, 1, this.master_node.getMass() * (vy + vz));
         inertia.set(2, 0, this.master_node.getMass() * (vx + vz));
         inertia.set(0, 2, this.master_node.getMass() * (vx + vz));
         this.master_node.addInertia(inertia);
      }
      this.master_node.determineMassMatrix();
      this.master_node.setInitialConditions();
   }
   public void update() {
      int i = 0;
      Node nod;
      for (i = 0; i < this.nodes.size(); i++) {
         nod = (Node)this.nodes.elementAt(i);
         this.force = nod.getForce().getMatrix(0, 2, 0, 0);
         this.master_node.addInternalForce(this.force);
         this.moment = nod.getForce().getMatrix(3, 5, 0, 0);
         this.moment_arm = nod.getPos().minus(this.master_node.getPos());
         this.moment.plusEquals(this.moment_arm.vectorProduct(this.force));
         this.master_node.addInternalMoment(this.moment);
      }
   }
   public void determineMassMatrix(RplVector nodelist) {
      this.master_node = super.findNode(this.master_node_number, nodelist);
      nodelist.remove(this.master_node);
      nodelist.insertElementAt(this.master_node, 0);
   }
}
