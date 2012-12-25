package run.elements;
import Jama.*;

import run.*;

import java.util.*;

public class Contact_Line extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Contact_Line copy = (Contact_Line)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.l1, copy.l1)) copy.l1 = this.l1;
      if (po.writeDiff(this.z_min, copy.z_min)) copy.z_min = this.z_min;
      if (po.writeDiff(this.z_max, copy.z_max)) copy.z_max = this.z_max;
      if (po.writeDiff(this.y_min, copy.y_min)) copy.y_min = this.y_min;
      if (po.writeDiff(this.y_max, copy.y_max)) copy.y_max = this.y_max;
      if (po.writeDiff(this.Friction_is_set, copy.Friction_is_set)) copy.Friction_is_set = this.Friction_is_set;
      if (po.writeDiff(this.D_is_set, copy.D_is_set)) copy.D_is_set = this.D_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.friction_factor, copy.friction_factor)) copy.friction_factor = this.friction_factor;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      if (po.writeDiff(this.radius, copy.radius)) copy.radius = this.radius;
      copy.Ltable = this.Ltable = (java.util.Vector)po.writeDiff(this.Ltable, copy.Ltable);
      copy.Ftable = this.Ftable = (java.util.Vector)po.writeDiff(this.Ftable, copy.Ftable);
      copy.a_b_distance = this.a_b_distance = (Jama.Matrix)po.writeDiff(this.a_b_distance, copy.a_b_distance);
      copy.trash = this.trash = (Jama.Matrix)po.writeDiff(this.trash, copy.trash);
      copy.P = this.P = (Jama.Matrix)po.writeDiff(this.P, copy.P);
      copy.v3 = this.v3 = (Jama.Matrix)po.writeDiff(this.v3, copy.v3);
      copy.v2 = this.v2 = (Jama.Matrix)po.writeDiff(this.v2, copy.v2);
      copy.v1 = this.v1 = (Jama.Matrix)po.writeDiff(this.v1, copy.v1);
      copy.n4 = this.n4 = (run.Node)po.writeDiff(this.n4, copy.n4);
      copy.n3 = this.n3 = (run.Node)po.writeDiff(this.n3, copy.n3);
      copy.n2 = this.n2 = (run.Node)po.writeDiff(this.n2, copy.n2);
      copy.n1 = this.n1 = (run.Node)po.writeDiff(this.n1, copy.n1);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Contact_Line copy = (Contact_Line)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.l1 = this.l1 = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.z_min = this.z_min = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.z_max = this.z_max = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.y_min = this.y_min = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.y_max = this.y_max = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.Friction_is_set = this.Friction_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.D_is_set = this.D_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.friction_factor = this.friction_factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.radius = this.radius = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.Ltable = this.Ltable = (java.util.Vector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.Ftable = this.Ftable = (java.util.Vector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.a_b_distance = this.a_b_distance = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trash = this.trash = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.P = this.P = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.v3 = this.v3 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.v2 = this.v2 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.v1 = this.v1 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.n4 = this.n4 = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.n3 = this.n3 = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.n2 = this.n2 = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.n1 = this.n1 = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.Ltable);
      c.descend(this.Ftable);
      c.descend(this.a_b_distance);
      c.descend(this.trash);
      c.descend(this.P);
      c.descend(this.v3);
      c.descend(this.v2);
      c.descend(this.v1);
      c.descend(this.n4);
      c.descend(this.n3);
      c.descend(this.n2);
      c.descend(this.n1);
      c.descend(this.force);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.Ltable = (java.util.Vector)f.filter(this.Ltable);
      this.Ftable = (java.util.Vector)f.filter(this.Ftable);
      this.a_b_distance = (Jama.Matrix)f.filter(this.a_b_distance);
      this.trash = (Jama.Matrix)f.filter(this.trash);
      this.P = (Jama.Matrix)f.filter(this.P);
      this.v3 = (Jama.Matrix)f.filter(this.v3);
      this.v2 = (Jama.Matrix)f.filter(this.v2);
      this.v1 = (Jama.Matrix)f.filter(this.v1);
      this.n4 = (run.Node)f.filter(this.n4);
      this.n3 = (run.Node)f.filter(this.n3);
      this.n2 = (run.Node)f.filter(this.n2);
      this.n1 = (run.Node)f.filter(this.n1);
      this.force = (Jama.Matrix)f.filter(this.force);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Contact_Line(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Contact_Line)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Contact_Line)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Contact_Line)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Contact_Line((Contact_Line)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Contact_Line)copy).deepCloneReferences((Contact_Line)orig, _helper);
         return false;
      }
      public Class getType() {
         return Contact_Line.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Contact_Line(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Contact_Line._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.l1 = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.z_min = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.z_max = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.y_min = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.y_max = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.Friction_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.D_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Factor_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.friction_factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.radius = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Contact_Line._SIZE);
      this.Ltable = (java.util.Vector)_stream.readReference();
      this.Ftable = (java.util.Vector)_stream.readReference();
      this.a_b_distance = (Jama.Matrix)_stream.readReference();
      this.trash = (Jama.Matrix)_stream.readReference();
      this.P = (Jama.Matrix)_stream.readReference();
      this.v3 = (Jama.Matrix)_stream.readReference();
      this.v2 = (Jama.Matrix)_stream.readReference();
      this.v1 = (Jama.Matrix)_stream.readReference();
      this.n4 = (run.Node)_stream.readReference();
      this.n3 = (run.Node)_stream.readReference();
      this.n2 = (run.Node)_stream.readReference();
      this.n1 = (run.Node)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Contact_Line._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.l1);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_min);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_max);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_min);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_max);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Friction_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.D_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Factor_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.friction_factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.radius);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.Ltable);
      _stream.writeReference(this.Ftable);
      _stream.writeReference(this.a_b_distance);
      _stream.writeReference(this.trash);
      _stream.writeReference(this.P);
      _stream.writeReference(this.v3);
      _stream.writeReference(this.v2);
      _stream.writeReference(this.v1);
      _stream.writeReference(this.n4);
      _stream.writeReference(this.n3);
      _stream.writeReference(this.n2);
      _stream.writeReference(this.n1);
      _stream.writeReference(this.force);
   }
   public Contact_Line(Contact_Line _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.l1 = _orig.l1;
      this.z_min = _orig.z_min;
      this.z_max = _orig.z_max;
      this.y_min = _orig.y_min;
      this.y_max = _orig.y_max;
      this.Friction_is_set = _orig.Friction_is_set;
      this.D_is_set = _orig.D_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.friction_factor = _orig.friction_factor;
      this.factor = _orig.factor;
      this.radius = _orig.radius;
   }
   public void deepCloneReferences(Contact_Line _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.Ltable = (java.util.Vector)_helper.internalDeepClone(_orig.Ltable);
      this.Ftable = (java.util.Vector)_helper.internalDeepClone(_orig.Ftable);
      this.a_b_distance = (Jama.Matrix)_helper.internalDeepClone(_orig.a_b_distance);
      this.trash = (Jama.Matrix)_helper.internalDeepClone(_orig.trash);
      this.P = (Jama.Matrix)_helper.internalDeepClone(_orig.P);
      this.v3 = (Jama.Matrix)_helper.internalDeepClone(_orig.v3);
      this.v2 = (Jama.Matrix)_helper.internalDeepClone(_orig.v2);
      this.v1 = (Jama.Matrix)_helper.internalDeepClone(_orig.v1);
      this.n4 = (run.Node)_helper.internalDeepClone(_orig.n4);
      this.n3 = (run.Node)_helper.internalDeepClone(_orig.n3);
      this.n2 = (run.Node)_helper.internalDeepClone(_orig.n2);
      this.n1 = (run.Node)_helper.internalDeepClone(_orig.n1);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
   }
   private Jama.Matrix force;
   private Node n1;
   private Node n2;
   private Node n3;
   private Node n4;
   private Jama.Matrix v1;
   private Jama.Matrix v2;
   private Jama.Matrix v3;
   private Jama.Matrix P;
   private Jama.Matrix trash;
   private double radius;
   private double factor;
   private double friction_factor;
   private boolean Nodes_are_set;
   private boolean Factor_is_set;
   private boolean D_is_set;
   private boolean Friction_is_set;
   private Matrix a_b_distance;
   private double y_max;
   private double y_min;
   private double z_max;
   private double z_min;
   private double l1;
   private Vector Ftable;
   private Vector Ltable;
   public Contact_Line() {
      super();
      this.type = new String("CONTACT_LINE");
      this.node = new Node[2];
      this.force = new Jama.Matrix(3, 1);
      this.P = new Matrix(3, 3);
      this.a_b_distance = new Matrix(3, 1);
      this.v1 = new Matrix(3, 1);
      this.v2 = new Matrix(3, 1);
      this.v3 = new Matrix(3, 1);
      this.trash = new Matrix(3, 1);
      this.factor = 10;
   }
   public void assembleMassMatrix() {
      this.calculateLocalVariables();
   }
   public synchronized void calculateContactForces() {
      Node smallest;
      Node largest;
      Node current;
      int i;
      Contact_Line c_element;
      boolean finished;
      double frictionforce;
      this.calculateLocalVariables();
      if (this.node[1].getX_pos() < this.node[0].getX_pos()) {
         smallest = this.node[1];
         largest = this.node[0];
      } else {
         smallest = this.node[0];
         largest = this.node[1];
      }
      current = smallest;
      while (current.getLeft_neighbour() != null && current.getLeft_neighbour().getX_pos() > smallest.getX_pos() - this.radius) {
         current = current.getLeft_neighbour();
      }
      smallest = current;
      current = largest;
      while (current.getRight_neighbour() != null && current.getRight_neighbour().getX_pos() < largest.getX_pos() + this.radius) {
         current = current.getRight_neighbour();
      }
      largest = current;
      current = smallest;
      this.y_min = Math.min(this.node[0].getY_pos(), this.node[1].getY_pos()) - this.radius;
      this.y_max = Math.max(this.node[0].getY_pos(), this.node[1].getY_pos()) + this.radius;
      this.z_min = Math.min(this.node[0].getZ_pos(), this.node[1].getZ_pos()) - this.radius;
      this.z_max = Math.max(this.node[0].getZ_pos(), this.node[1].getZ_pos()) + this.radius;
      finished = false;
      while (!finished) {
         i = 0;
         if (this.isInContact(current)) {
            current.addContactForce(this.v3.times(this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius)));
            this.n1.addContactForce(this.v3.times(-this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * (1 - this.a_b_distance.get(0, 0))));
            this.n2.addContactForce(this.v3.times(-this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * this.a_b_distance.get(0, 0)));
            if (this.Friction_is_set == true) {
               frictionforce = this.addFriction(current, this.a_b_distance.get(0, 0));
               current.addContactForce(this.v1.times(this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
               this.n1.addContactForce(this.v1.times(-0.5 * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
               this.n2.addContactForce(this.v1.times(-0.5 * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
            }
         }
         c_element = current.getContact_Line(i);
         while (c_element != null) {
            this.n3 = c_element.getNode(0);
            this.n4 = c_element.getNode(1);
            if (this.isInContact(c_element)) {
               this.n1.addContactForce(this.v3.times(-1 * (1 - this.a_b_distance.get(0, 0)) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius)));
               this.n2.addContactForce(this.v3.times(-1 * this.a_b_distance.get(0, 0) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius)));
               this.n3.addContactForce(this.v3.times((1 - this.a_b_distance.get(1, 0)) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius)));
               this.n4.addContactForce(this.v3.times(this.a_b_distance.get(1, 0) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius)));
               if (this.Friction_is_set == true) {
                  frictionforce = this.addFriction(c_element, this.a_b_distance.get(0, 0));
                  this.n1.addContactForce(this.v1.times(-0.5 * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
                  this.n2.addContactForce(this.v1.times(-0.5 * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
                  this.n3.addContactForce(this.v1.times((1 - this.a_b_distance.get(1, 0)) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
                  this.n4.addContactForce(this.v1.times(this.a_b_distance.get(1, 0) * this.factor * (1 - this.a_b_distance.get(2, 0) / this.radius) * frictionforce));
               }
            }
            i++;
            c_element = current.getContact_Line(i);
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
         for (i = 0; i < this.Ltable.size(); i++) {
            if (((Ldata)this.Ltable.elementAt(i)).checked == false) {
               this.Ltable.removeElementAt(i);
               i--;
            }
         }
         for (i = 0; i < this.Ftable.size(); i++) {
            ((Fdata)this.Ftable.elementAt(i)).checked = false;
         }
         for (i = 0; i < this.Ltable.size(); i++) {
            ((Ldata)this.Ltable.elementAt(i)).checked = false;
         }
      }
   }
   private boolean isInContact(Node c_node) {
      double a;
      if (c_node.equals(this.n1) || c_node.equals(this.n2)) {
         return false;
      }
      if (c_node.getY_pos() < this.y_min || c_node.getY_pos() > this.y_max) {
         return false;
      }
      if (c_node.getZ_pos() < this.z_min || c_node.getZ_pos() > this.z_max) {
         return false;
      }
      this.v2 = c_node.getPos().minus(this.n1.getPos());
      this.v3.set(0, 0, this.v1.get(1, 0) * this.v2.get(2, 0) - this.v1.get(2, 0) * this.v2.get(1, 0));
      this.v3.set(1, 0, this.v1.get(2, 0) * this.v2.get(0, 0) - this.v1.get(0, 0) * this.v2.get(2, 0));
      this.v3.set(2, 0, this.v1.get(0, 0) * this.v2.get(1, 0) - this.v1.get(1, 0) * this.v2.get(0, 0));
      this.a_b_distance.set(2, 0, this.v3.length() / this.l1);
      if (this.a_b_distance.get(2, 0) > this.radius) {
         return false;
      }
      this.trash.set(0, 0, this.v3.get(1, 0) * this.v1.get(2, 0) - this.v3.get(2, 0) * this.v1.get(1, 0));
      this.trash.set(1, 0, this.v3.get(2, 0) * this.v1.get(0, 0) - this.v3.get(0, 0) * this.v1.get(2, 0));
      this.trash.set(2, 0, this.v3.get(0, 0) * this.v1.get(1, 0) - this.v3.get(1, 0) * this.v1.get(0, 0));
      this.v3.set(0, 0, this.trash.get(0, 0));
      this.v3.set(1, 0, this.trash.get(1, 0));
      this.v3.set(2, 0, this.trash.get(2, 0));
      if (this.v3.length() != 0) {
         this.v3.timesEquals(1 / this.v3.length());
      }
      this.v2 = this.v2.minus(this.v3.times(this.a_b_distance.get(2, 0)));
      a = this.v2.length() / this.l1;
      this.v2 = this.v1.plus(this.v2);
      if (this.v2.length() < this.l1) {
         a = -a;
      }
      if (a < 0) {
         this.v3 = c_node.getPos().minus(this.n1.getPos());
         this.a_b_distance.set(2, 0, this.v3.length());
         if (this.a_b_distance.get(2, 0) > this.radius) {
            return false;
         }
         this.v3.timesEquals(1 / this.a_b_distance.get(2, 0));
         a = 0;
      } else if (a > 1) {
         this.v3 = c_node.getPos().minus(this.n2.getPos());
         this.a_b_distance.set(2, 0, this.v3.length());
         if (this.a_b_distance.get(2, 0) > this.radius) {
            return false;
         }
         this.v3.timesEquals(1 / this.a_b_distance.get(2, 0));
         a = 1;
      }
      this.a_b_distance.set(0, 0, a);
      return true;
   }
   private boolean isInContact(Contact_Line cl) {
      double area;
      if (cl.equals(this)) {
         return false;
      }
      if (this.n3.getY_pos() < this.y_min && this.n4.getY_pos() < this.y_min) {
         return false;
      }
      if (this.n3.getY_pos() > this.y_max && this.n4.getY_pos() > this.y_max) {
         return false;
      }
      if (this.n3.getZ_pos() < this.z_min && this.n4.getZ_pos() < this.z_min) {
         return false;
      }
      if (this.n3.getZ_pos() > this.z_max && this.n4.getZ_pos() > this.z_max) {
         return false;
      }
      if (this.n3.equals(this.n1) || this.n3.equals(this.n2)) {
         return false;
      }
      if (this.n4.equals(this.n1) || this.n4.equals(this.n2)) {
         return false;
      }
      this.v2 = this.n4.getPos().minus(this.n3.getPos());
      this.v3.set(0, 0, this.v1.get(1, 0) * this.v2.get(2, 0) - this.v1.get(2, 0) * this.v2.get(1, 0));
      this.v3.set(1, 0, this.v1.get(2, 0) * this.v2.get(0, 0) - this.v1.get(0, 0) * this.v2.get(2, 0));
      this.v3.set(2, 0, this.v1.get(0, 0) * this.v2.get(1, 0) - this.v1.get(1, 0) * this.v2.get(0, 0));
      area = this.v3.length();
      if (area < 1.0E-15) {
         return false;
      }
      this.v3.timesEquals(1 / area);
      this.P.setMatrix(0, 2, 1, 1, this.v2.times(-1));
      this.P.setMatrix(0, 2, 2, 2, this.v3);
      this.a_b_distance = this.P.inverse().times(this.n3.getPos().minus(this.n1.getPos()));
      if (this.a_b_distance.get(0, 0) < 0 || this.a_b_distance.get(0, 0) > 1) {
         return false;
      }
      if (this.a_b_distance.get(1, 0) < 0 || this.a_b_distance.get(1, 0) > 1) {
         return false;
      }
      if (Math.abs(this.a_b_distance.get(2, 0)) > this.radius) {
         return false;
      }
      if (this.a_b_distance.get(2, 0) < 0) {
         this.a_b_distance.set(2, 0, Math.abs(this.a_b_distance.get(2, 0)));
         this.v3.timesEquals(-1);
      }
      return true;
   }
   private double addFriction(Node contact_node, double qa) {
      Fdata tmp;
      int i;
      double vec2;
      for (i = 0; i < this.Ftable.size(); i++) {
         if (((Fdata)this.Ftable.elementAt(i)).cnode.equals(contact_node)) {
            break;
         }
      }
      if (i == this.Ftable.size()) {
         this.Ftable.add(new Fdata(contact_node, qa));
         return 0;
      }
      tmp = (Fdata)this.Ftable.elementAt(i);
      if (tmp.vec_is_set == false) {
         tmp.vecX = qa - tmp.q;
         tmp.q = qa;
         tmp.vec_is_set = true;
         tmp.checked = true;
         if (Math.abs(tmp.vecX) < 1.0E-15) {
            return 0;
         }
         return (tmp.vecX > 0 ? -0.5 : 0.5) * this.friction_factor / this.l1;
      }
      vec2 = tmp.vecX;
      tmp.vecX = qa - tmp.q;
      tmp.q = qa;
      tmp.vec_is_set = true;
      tmp.checked = true;
      if (Math.abs(tmp.vecX) < 1.0E-15) {
         return 0;
      }
      return (tmp.vecX > 0 ? -1 : 1) * (Math.abs(tmp.vecX + vec2) > Math.abs(vec2) ? 1.0 : 0.5) * this.friction_factor / this.l1;
   }
   private double addFriction(Contact_Line contact_line, double qa) {
      Ldata tmp;
      int i;
      double vec2;
      for (i = 0; i < this.Ltable.size(); i++) {
         if (((Ldata)this.Ltable.elementAt(i)).cline.equals(contact_line)) {
            break;
         }
      }
      if (i == this.Ltable.size()) {
         this.Ltable.add(new Ldata(contact_line, qa));
         return 0;
      }
      tmp = (Ldata)this.Ltable.elementAt(i);
      if (tmp.vec_is_set == false) {
         tmp.vec = qa - tmp.q;
         tmp.q = qa;
         tmp.vec_is_set = true;
         tmp.checked = true;
         if (Math.abs(tmp.vec) < 1.0E-15) {
            return 0;
         }
         return (tmp.vec > 0 ? -0.5 : 0.5) * this.friction_factor / this.l1;
      }
      vec2 = tmp.vec;
      tmp.vec = qa - tmp.q;
      tmp.q = qa;
      tmp.vec_is_set = true;
      tmp.checked = true;
      if (Math.abs(tmp.vec) < 1.0E-15) {
         return 0;
      }
      return (tmp.vec > 0 ? -1 : 1) * (Math.abs(tmp.vec + vec2) > Math.abs(vec2) ? 1.0 : 0.5) * this.friction_factor / this.l1;
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
   public int getNumberOfIntegrationPoints() {
      return 1;
   }
   public void checkIfFailed() {
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int j;
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3,nodenr4]", lineno);
            }
            try {
               for (j = 0; j < 2; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
                  this.node[j].addContact_Line(this);
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
         } else if (param[i].getw().toUpperCase().equals("FRICTION") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.friction_factor = param[i + 2].getn();
            i += 3;
            this.Friction_is_set = true;
            this.Ftable = new Vector();
            this.Ltable = new Vector();
         } else if (param[i].getw().toUpperCase().equals("D") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.radius = 0.5 * param[i + 2].getn();
            i += 3;
            this.D_is_set = true;
         } else {
            throw new java.text.ParseException("Unknown Contact_Line element parameter ", lineno);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Contact_Line element nr" + this.number);
      }
      if (!this.D_is_set) {
         throw new IllegalArgumentException("No Contact sensing diameter (D) defined for Contact_Line element nr" + this.number);
      }
   }
   public String print_Gid(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH_HEADER: 
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Linear Nnode 2\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Linear \"MeshType" + this.type + "\"\n");
         out += "Number Of Gauss Points: 1\n";
         out += "Nodes Not Included\n";
         out += "Natural Coordinates: Internal\n";
         out += "End GaussPoints\n";
         return out;
      
      case run.Element.RESULT_SUB_HEADER: 
         out = new String(" 1 2 0 \"Type" + this.type + "\"\n");
         return out;
      
      case run.Element.RESULT_STRESS_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + " 0.0\n");
         } else {
            out = new String("");
         }
         return out;
      
      case run.Element.RESULT_STRAIN_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + " 0.0\n");
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
         out = new String(this.number + "\t  nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "]\t" + "D = " + 2 * this.radius + "\t");
         if (this.Factor_is_set) out += " factor = " + this.factor;
         if (this.Friction_is_set) out += " friction = " + this.friction_factor;
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() {
   }
   public synchronized void updateLocalCoordinateSystem() {
   }
   private void calculateLocalVariables() {
      this.n1 = this.node[0];
      this.n2 = this.node[1];
      this.v1 = this.n2.getPos().minus(this.n1.getPos());
      this.l1 = this.v1.length();
      this.P.setMatrix(0, 2, 0, 0, this.v1);
   }
   public Node getNode(int nr) {
      return this.node[nr];
   }
}
