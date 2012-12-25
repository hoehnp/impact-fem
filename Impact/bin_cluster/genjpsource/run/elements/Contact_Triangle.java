package run.elements;
import Jama.*;

import run.*;

import java.util.*;

public class Contact_Triangle extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Contact_Triangle copy = (Contact_Triangle)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.z_min, copy.z_min)) copy.z_min = this.z_min;
      if (po.writeDiff(this.z_max, copy.z_max)) copy.z_max = this.z_max;
      if (po.writeDiff(this.y_min, copy.y_min)) copy.y_min = this.y_min;
      if (po.writeDiff(this.y_max, copy.y_max)) copy.y_max = this.y_max;
      if (po.writeDiff(this.friction_factor, copy.friction_factor)) copy.friction_factor = this.friction_factor;
      if (po.writeDiff(this.distance, copy.distance)) copy.distance = this.distance;
      if (po.writeDiff(this.xsi3, copy.xsi3)) copy.xsi3 = this.xsi3;
      if (po.writeDiff(this.xsi2, copy.xsi2)) copy.xsi2 = this.xsi2;
      if (po.writeDiff(this.xsi1, copy.xsi1)) copy.xsi1 = this.xsi1;
      if (po.writeDiff(this.A22, copy.A22)) copy.A22 = this.A22;
      if (po.writeDiff(this.A12, copy.A12)) copy.A12 = this.A12;
      if (po.writeDiff(this.A11, copy.A11)) copy.A11 = this.A11;
      if (po.writeDiff(this.A02, copy.A02)) copy.A02 = this.A02;
      if (po.writeDiff(this.A01, copy.A01)) copy.A01 = this.A01;
      if (po.writeDiff(this.A00, copy.A00)) copy.A00 = this.A00;
      if (po.writeDiff(this.Friction_is_set, copy.Friction_is_set)) copy.Friction_is_set = this.Friction_is_set;
      if (po.writeDiff(this.T_is_set, copy.T_is_set)) copy.T_is_set = this.T_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.contact_force, copy.contact_force)) copy.contact_force = this.contact_force;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      if (po.writeDiff(this.thickness, copy.thickness)) copy.thickness = this.thickness;
      if (po.writeDiff(this.area, copy.area)) copy.area = this.area;
      copy.Ftable = this.Ftable = (java.util.Vector)po.writeDiff(this.Ftable, copy.Ftable);
      copy.trash = this.trash = (Jama.Matrix)po.writeDiff(this.trash, copy.trash);
      copy.pos = this.pos = (Jama.Matrix)po.writeDiff(this.pos, copy.pos);
      copy.p0 = this.p0 = (Jama.Matrix)po.writeDiff(this.p0, copy.p0);
      copy.p = this.p = (Jama.Matrix)po.writeDiff(this.p, copy.p);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)po.writeDiff(this.local_coordinate_system, copy.local_coordinate_system);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Contact_Triangle copy = (Contact_Triangle)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.z_min = this.z_min = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.z_max = this.z_max = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.y_min = this.y_min = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.y_max = this.y_max = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.friction_factor = this.friction_factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.distance = this.distance = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.xsi3 = this.xsi3 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.xsi2 = this.xsi2 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.xsi1 = this.xsi1 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A22 = this.A22 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A12 = this.A12 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A11 = this.A11 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A02 = this.A02 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A01 = this.A01 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.A00 = this.A00 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.Friction_is_set = this.Friction_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.T_is_set = this.T_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.contact_force = this.contact_force = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.thickness = this.thickness = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.area = this.area = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.Ftable = this.Ftable = (java.util.Vector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trash = this.trash = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.pos = this.pos = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.p0 = this.p0 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.p = this.p = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.Ftable);
      c.descend(this.trash);
      c.descend(this.pos);
      c.descend(this.p0);
      c.descend(this.p);
      c.descend(this.force);
      c.descend(this.local_coordinate_system);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.Ftable = (java.util.Vector)f.filter(this.Ftable);
      this.trash = (Jama.Matrix)f.filter(this.trash);
      this.pos = (Jama.Matrix)f.filter(this.pos);
      this.p0 = (Jama.Matrix)f.filter(this.p0);
      this.p = (Jama.Matrix)f.filter(this.p);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.local_coordinate_system = (Jama.Matrix)f.filter(this.local_coordinate_system);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Contact_Triangle(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Contact_Triangle)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Contact_Triangle)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Contact_Triangle)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Contact_Triangle((Contact_Triangle)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Contact_Triangle)copy).deepCloneReferences((Contact_Triangle)orig, _helper);
         return false;
      }
      public Class getType() {
         return Contact_Triangle.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Contact_Triangle(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Contact_Triangle._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.z_min = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.z_max = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.y_min = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.y_max = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.friction_factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.distance = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.xsi3 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.xsi2 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.xsi1 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A22 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A12 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A11 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A02 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A01 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.A00 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.Friction_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.T_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Factor_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.contact_force = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.thickness = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.area = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Contact_Triangle._SIZE);
      this.Ftable = (java.util.Vector)_stream.readReference();
      this.trash = (Jama.Matrix)_stream.readReference();
      this.pos = (Jama.Matrix)_stream.readReference();
      this.p0 = (Jama.Matrix)_stream.readReference();
      this.p = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.local_coordinate_system = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Contact_Triangle._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_min);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_max);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_min);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_max);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.friction_factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.distance);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.xsi3);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.xsi2);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.xsi1);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A22);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A12);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A11);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A02);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A01);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.A00);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Friction_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.T_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Factor_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.contact_force);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.thickness);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.area);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.Ftable);
      _stream.writeReference(this.trash);
      _stream.writeReference(this.pos);
      _stream.writeReference(this.p0);
      _stream.writeReference(this.p);
      _stream.writeReference(this.force);
      _stream.writeReference(this.local_coordinate_system);
   }
   public Contact_Triangle(Contact_Triangle _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.z_min = _orig.z_min;
      this.z_max = _orig.z_max;
      this.y_min = _orig.y_min;
      this.y_max = _orig.y_max;
      this.friction_factor = _orig.friction_factor;
      this.distance = _orig.distance;
      this.xsi3 = _orig.xsi3;
      this.xsi2 = _orig.xsi2;
      this.xsi1 = _orig.xsi1;
      this.A22 = _orig.A22;
      this.A12 = _orig.A12;
      this.A11 = _orig.A11;
      this.A02 = _orig.A02;
      this.A01 = _orig.A01;
      this.A00 = _orig.A00;
      this.Friction_is_set = _orig.Friction_is_set;
      this.T_is_set = _orig.T_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.contact_force = _orig.contact_force;
      this.factor = _orig.factor;
      this.thickness = _orig.thickness;
      this.area = _orig.area;
   }
   public void deepCloneReferences(Contact_Triangle _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.Ftable = (java.util.Vector)_helper.internalDeepClone(_orig.Ftable);
      this.trash = (Jama.Matrix)_helper.internalDeepClone(_orig.trash);
      this.pos = (Jama.Matrix)_helper.internalDeepClone(_orig.pos);
      this.p0 = (Jama.Matrix)_helper.internalDeepClone(_orig.p0);
      this.p = (Jama.Matrix)_helper.internalDeepClone(_orig.p);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.local_coordinate_system = (Jama.Matrix)_helper.internalDeepClone(_orig.local_coordinate_system);
   }
   private double area;
   private Jama.Matrix local_coordinate_system;
   private Jama.Matrix force;
   private Jama.Matrix p;
   private Jama.Matrix p0;
   private Jama.Matrix pos;
   private Jama.Matrix trash;
   private double thickness;
   private double factor;
   private double contact_force;
   private boolean Nodes_are_set;
   private boolean Factor_is_set;
   private boolean T_is_set;
   private boolean Friction_is_set;
   private double A00;
   private double A01;
   private double A02;
   private double A11;
   private double A12;
   private double A22;
   private double xsi1;
   private double xsi2;
   private double xsi3;
   private double distance;
   private double friction_factor;
   private double y_max;
   private double y_min;
   private double z_max;
   private double z_min;
   private Vector Ftable;
   public Contact_Triangle() {
      super();
      this.type = new String("CONTACT_TRIANGLE");
      int i;
      this.p = new Jama.Matrix(9, 1);
      this.trash = new Jama.Matrix(9, 1);
      this.p0 = new Jama.Matrix(3, 1);
      this.node = new Node[3];
      this.force = new Jama.Matrix(3, 1);
      this.local_coordinate_system = new Jama.Matrix(3, 3);
      this.factor = 100;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      this.updateLocalCoordinateSystem();
      this.calculateLocalVariables();
   }
   public synchronized void calculateContactForces() {
      Node smallest;
      Node largest;
      Node current;
      int i;
      boolean finished;
      this.updateLocalCoordinateSystem();
      this.calculateLocalVariables();
      this.contact_force = 0;
      smallest = this.node[0];
      if (this.node[1].getX_pos() < smallest.getX_pos()) {
         smallest = this.node[1];
      }
      if (this.node[2].getX_pos() < smallest.getX_pos()) {
         smallest = this.node[2];
      }
      current = smallest;
      while (current.getLeft_neighbour() != null && current.getX_pos() > smallest.getX_pos() - this.thickness / 2.0) {
         current = current.getLeft_neighbour();
      }
      smallest = current;
      largest = this.node[0];
      if (this.node[1].getX_pos() > largest.getX_pos()) {
         largest = this.node[1];
      }
      if (this.node[2].getX_pos() > largest.getX_pos()) {
         largest = this.node[2];
      }
      current = largest;
      while (current.getRight_neighbour() != null && current.getX_pos() < largest.getX_pos() + this.thickness / 2.0) {
         current = current.getRight_neighbour();
      }
      largest = current;
      current = smallest;
      this.y_min = Math.min(this.node[0].getY_pos(), Math.min(this.node[1].getY_pos(), this.node[2].getY_pos())) - this.thickness;
      this.y_max = Math.max(this.node[0].getY_pos(), Math.max(this.node[1].getY_pos(), this.node[2].getY_pos())) + this.thickness;
      this.z_min = Math.min(this.node[0].getZ_pos(), Math.min(this.node[1].getZ_pos(), this.node[2].getZ_pos())) - this.thickness;
      this.z_max = Math.max(this.node[0].getZ_pos(), Math.max(this.node[1].getZ_pos(), this.node[2].getZ_pos())) + this.thickness;
      finished = false;
      while (!finished) {
         if (this.isInContact(current)) {
            this.force.set(0, 0, 0);
            this.force.set(1, 0, 0);
            this.force.set(2, 0, this.factor * this.distance / (this.thickness / 2.0));
            this.contact_force += this.force.get(2, 0);
            if (this.Friction_is_set == true) {
               this.addFriction(current);
            }
            this.force = this.local_coordinate_system.transpose().times(this.force);
            current.addContactForce(this.force.times(-1));
            this.node[0].addContactForce(this.force.times(this.xsi1));
            this.node[1].addContactForce(this.force.times(this.xsi2));
            this.node[2].addContactForce(this.force.times(this.xsi3));
         }
         if (current == largest) {
            finished = true;
         } else {
            current = current.getRight_neighbour();
         }
      }
      if (this.Friction_is_set == true) {
         for (i = 0; i < this.Ftable.size(); i++) {
            if (((Fdata)this.Ftable.elementAt(i)).checked == false) {
               this.Ftable.removeElementAt(i);
               i--;
            }
         }
         for (i = 0; i < this.Ftable.size(); i++) {
            ((Fdata)this.Ftable.elementAt(i)).checked = false;
         }
      }
   }
   private boolean isInContact(Node contact_node) {
      if (contact_node.getY_pos() < this.y_min || contact_node.getY_pos() > this.y_max) {
         return false;
      }
      if (contact_node.getZ_pos() < this.z_min || contact_node.getZ_pos() > this.z_max) {
         return false;
      }
      if (contact_node == this.node[0] || contact_node == this.node[1] || contact_node == this.node[2]) {
         return false;
      }
      this.pos = contact_node.getPos();
      this.pos = this.local_coordinate_system.times(this.pos).minus(this.p0);
      this.xsi1 = this.A00 + this.A01 * this.pos.get(0, 0) + this.A02 * this.pos.get(1, 0);
      this.xsi2 = this.A11 * this.pos.get(0, 0) + this.A12 * this.pos.get(1, 0);
      this.xsi3 = this.A22 * this.pos.get(1, 0);
      if (this.xsi1 < 0) {
         return false;
      }
      if (this.xsi2 < 0) {
         return false;
      }
      if (this.xsi3 < 0) {
         return false;
      }
      if (Math.abs(this.pos.get(2, 0)) > this.thickness / 2) {
         return false;
      }
      if (this.pos.get(2, 0) > 0) {
         this.distance = this.pos.get(2, 0) - this.thickness / 2;
      } else {
         this.distance = this.pos.get(2, 0) + this.thickness / 2;
      }
      return true;
   }
   private void addFriction(Node contact_node) {
      Fdata tmp;
      double length1;
      double length2;
      double angle;
      int i;
      Matrix v1;
      Matrix v2;
      for (i = 0; i < this.Ftable.size(); i++) {
         if (((Fdata)this.Ftable.elementAt(i)).cnode.equals(contact_node)) {
            break;
         }
      }
      if (i == this.Ftable.size()) {
         this.Ftable.add(new Fdata(contact_node, this.pos.get(0, 0), this.pos.get(1, 0)));
         return;
      }
      tmp = (Fdata)this.Ftable.elementAt(i);
      if (tmp.vec_is_set == false) {
         tmp.vecX = this.pos.get(0, 0) - tmp.posX;
         tmp.vecY = this.pos.get(1, 0) - tmp.posY;
         tmp.posX = this.pos.get(0, 0);
         tmp.posY = this.pos.get(1, 0);
         tmp.vec_is_set = true;
         tmp.checked = true;
         length1 = Math.sqrt(tmp.vecX * tmp.vecX + tmp.vecY * tmp.vecY);
         if (length1 < 1.0E-15) {
            return;
         }
         this.force.set(0, 0, this.force.get(0, 0) + (this.pos.get(2, 0) > 0 ? -0.5 : 0.5) * this.friction_factor * this.force.get(2, 0) * tmp.vecX / length1);
         this.force.set(1, 0, this.force.get(1, 0) + (this.pos.get(2, 0) > 0 ? -0.5 : 0.5) * this.friction_factor * this.force.get(2, 0) * tmp.vecY / length1);
         return;
      }
      v1 = new Matrix(2, 1);
      v2 = new Matrix(2, 1);
      v1.set(0, 0, this.pos.get(0, 0) - tmp.posX);
      v1.set(1, 0, this.pos.get(1, 0) - tmp.posY);
      v2.set(0, 0, tmp.vecX);
      v2.set(1, 0, tmp.vecY);
      tmp.vecX = v1.get(0, 0);
      tmp.vecY = v1.get(1, 0);
      tmp.posX = this.pos.get(0, 0);
      tmp.posY = this.pos.get(1, 0);
      tmp.vec_is_set = true;
      tmp.checked = true;
      length1 = Math.sqrt(tmp.vecX * tmp.vecX + tmp.vecY * tmp.vecY);
      if (length1 < 1.0E-15) {
         return;
      }
      length2 = Math.sqrt(v2.get(0, 0) * v2.get(0, 0) + v2.get(1, 0) * v2.get(1, 0));
      angle = Math.abs(Math.acos(v1.transpose().times(v2).get(0, 0) / (length1 * length2)));
      this.force.set(0, 0, this.force.get(0, 0) + (this.pos.get(2, 0) > 0 ? -1 : 1) * (angle < 1.5708 ? 1.0 : 0.5) * this.friction_factor * this.force.get(2, 0) * tmp.vecX / length1);
      this.force.set(1, 0, this.force.get(1, 0) + (this.pos.get(2, 0) > 0 ? -1 : 1) * (angle < 1.5708 ? 1.0 : 0.5) * this.friction_factor * this.force.get(2, 0) * tmp.vecY / length1);
      return;
   }
   public void calculateExternalForces(double currtime) {
   }
   public void calculateNodalForces(int integration_point, double timestep) {
   }
   public void calculateStrain(double tstep, int integration_point) {
   }
   public void calculateStress(int integration_point, double timestep) {
   }
   public double checkTimestep(double current_timestep) {
      return current_timestep;
   }
   public void checkIfFailed() {
   }
   public int getNumberOfIntegrationPoints() {
      return 1;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int nodenumber;
      int j;
      int i = 0;
      int index;
      Load temp_load;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3,nodenr4]", lineno);
            }
            try {
               for (j = 0; j < 3; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
               }
               i += 3;
               this.Nodes_are_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException(e.getMessage() + " in line ", lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("FACTOR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.factor = param[i + 2].getn();
            i += 3;
            this.Factor_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("T") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.thickness = param[i + 2].getn();
            i += 3;
            this.T_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("FRICTION") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.friction_factor = param[i + 2].getn();
            i += 3;
            this.Friction_is_set = true;
            this.Ftable = new Vector();
         } else {
            throw new java.text.ParseException("Unknown Contact_Triangle element parameter ", lineno);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Contact_Triangle element nr" + this.number);
      }
      if (!this.T_is_set) {
         throw new IllegalArgumentException("No Contact sensing thickness (T) defined for Contact_Triangle element nr" + this.number);
      }
   }
   public String print_Gid(int ctrl, int gpn) {
      String out;
      int i;
      double average;
      switch (ctrl) {
      case run.Element.MESH_HEADER: 
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Triangle Nnode 3\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\t" + this.node[2].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Triangle \"MeshType" + this.type + "\"\n");
         out += "Number Of Gauss Points: 1\n";
         out += "Nodes Not Included\n";
         out += "Natural Coordinates: Given\n";
         out += "0.0 0.0 \n";
         out += "End GaussPoints\n";
         return out;
      
      case run.Element.RESULT_SUB_HEADER: 
         out = new String(" 3 2 0 \"Type" + this.type + "\"\n");
         return out;
      
      case run.Element.RESULT_STRESS_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + "\t 0 \t 0 \t 0 \t 0 \t 0 \t 0 \n");
         } else {
            out = new String("");
         }
         return out;
      
      case run.Element.RESULT_STRAIN_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + "\t 0 \t 0 \t 0 \t 0 \t 0 \t 0 \n");
         } else {
            out = new String("");
         }
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public String print_Fembic(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH: 
         out = new String(this.number + "\t nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]\t" + "t = " + this.thickness + "\t");
         if (this.Factor_is_set) out += " factor = " + this.factor;
         if (this.Friction_is_set) out += " friction = " + this.friction_factor;
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() {
      this.updateLocalCoordinateSystem();
      this.calculateLocalVariables();
   }
   public synchronized void updateLocalCoordinateSystem() {
      this.calculateLocalBaseVectors(this.node[0].getX_pos(), this.node[0].getY_pos(), this.node[0].getZ_pos(), this.node[1].getX_pos(), this.node[1].getY_pos(), this.node[1].getZ_pos(), this.node[2].getX_pos(), this.node[2].getY_pos(), this.node[2].getZ_pos(), this.local_coordinate_system);
   }
   private void calculateLocalVariables() {
      this.trash.set(0, 0, this.node[0].getX_pos());
      this.trash.set(1, 0, this.node[0].getY_pos());
      this.trash.set(2, 0, this.node[0].getZ_pos());
      this.trash.set(3, 0, this.node[1].getX_pos());
      this.trash.set(4, 0, this.node[1].getY_pos());
      this.trash.set(5, 0, this.node[1].getZ_pos());
      this.trash.set(6, 0, this.node[2].getX_pos());
      this.trash.set(7, 0, this.node[2].getY_pos());
      this.trash.set(8, 0, this.node[2].getZ_pos());
      this.p.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.p.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.p.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.p.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.p.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.p.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.p.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.p.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.p.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.p0.set(0, 0, this.p.get(0, 0));
      this.p0.set(1, 0, this.p.get(1, 0));
      this.p0.set(2, 0, this.p.get(2, 0));
      this.p.set(3, 0, this.p.get(3, 0) - this.p.get(0, 0));
      this.p.set(4, 0, this.p.get(4, 0) - this.p.get(1, 0));
      this.p.set(5, 0, this.p.get(5, 0) - this.p.get(2, 0));
      this.p.set(6, 0, this.p.get(6, 0) - this.p.get(0, 0));
      this.p.set(7, 0, this.p.get(7, 0) - this.p.get(1, 0));
      this.p.set(8, 0, this.p.get(8, 0) - this.p.get(2, 0));
      this.p.set(0, 0, 0.0);
      this.p.set(1, 0, 0.0);
      this.p.set(2, 0, 0.0);
      this.area = 0.5 * this.p.get(3, 0) * this.p.get(7, 0);
      this.A00 = this.p.get(3, 0) * this.p.get(7, 0) / (2 * this.area);
      this.A01 = -this.p.get(7, 0) / (2 * this.area);
      this.A02 = (this.p.get(6, 0) - this.p.get(3, 0)) / (2 * this.area);
      this.A11 = this.p.get(7, 0) / (2 * this.area);
      this.A12 = -this.p.get(6, 0) / (2 * this.area);
      this.A22 = this.p.get(3, 0) / (2 * this.area);
   }
   public double getArea() {
      return this.area;
   }
   public double getContactForce() {
      return this.contact_force;
   }
}
