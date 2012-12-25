package run.constraints;
import run.*;

import java.text.ParseException;

public class BoundaryCondition extends Constraint implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      BoundaryCondition copy = (BoundaryCondition)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.z, copy.z)) copy.z = this.z;
      if (po.writeDiff(this.y, copy.y)) copy.y = this.y;
      if (po.writeDiff(this.x, copy.x)) copy.x = this.x;
      if (po.writeDiff(this.update_is_set, copy.update_is_set)) copy.update_is_set = this.update_is_set;
      if (po.writeDiff(this.axis_is_set, copy.axis_is_set)) copy.axis_is_set = this.axis_is_set;
      if (po.writeDiff(this.y_rot_acc_is_set, copy.y_rot_acc_is_set)) copy.y_rot_acc_is_set = this.y_rot_acc_is_set;
      if (po.writeDiff(this.z_rot_acc_is_set, copy.z_rot_acc_is_set)) copy.z_rot_acc_is_set = this.z_rot_acc_is_set;
      if (po.writeDiff(this.x_rot_acc_is_set, copy.x_rot_acc_is_set)) copy.x_rot_acc_is_set = this.x_rot_acc_is_set;
      if (po.writeDiff(this.y_acc_is_set, copy.y_acc_is_set)) copy.y_acc_is_set = this.y_acc_is_set;
      if (po.writeDiff(this.z_acc_is_set, copy.z_acc_is_set)) copy.z_acc_is_set = this.z_acc_is_set;
      if (po.writeDiff(this.x_acc_is_set, copy.x_acc_is_set)) copy.x_acc_is_set = this.x_acc_is_set;
      if (po.writeDiff(this.x_rot_vel_is_set, copy.x_rot_vel_is_set)) copy.x_rot_vel_is_set = this.x_rot_vel_is_set;
      if (po.writeDiff(this.y_rot_vel_is_set, copy.y_rot_vel_is_set)) copy.y_rot_vel_is_set = this.y_rot_vel_is_set;
      if (po.writeDiff(this.z_rot_vel_is_set, copy.z_rot_vel_is_set)) copy.z_rot_vel_is_set = this.z_rot_vel_is_set;
      if (po.writeDiff(this.z_vel_is_set, copy.z_vel_is_set)) copy.z_vel_is_set = this.z_vel_is_set;
      if (po.writeDiff(this.y_vel_is_set, copy.y_vel_is_set)) copy.y_vel_is_set = this.y_vel_is_set;
      if (po.writeDiff(this.x_vel_is_set, copy.x_vel_is_set)) copy.x_vel_is_set = this.x_vel_is_set;
      copy.nodes = this.nodes = (java.lang.String)po.writeDiff(this.nodes, copy.nodes);
      copy.axis = this.axis = (Jama.Matrix)po.writeDiff(this.axis, copy.axis);
      copy.node = this.node = (run.Node[])po.writeDiff(this.node, copy.node);
      copy.z_rot_acc = this.z_rot_acc = (run.Variable)po.writeDiff(this.z_rot_acc, copy.z_rot_acc);
      copy.y_rot_acc = this.y_rot_acc = (run.Variable)po.writeDiff(this.y_rot_acc, copy.y_rot_acc);
      copy.x_rot_acc = this.x_rot_acc = (run.Variable)po.writeDiff(this.x_rot_acc, copy.x_rot_acc);
      copy.z_acc = this.z_acc = (run.Variable)po.writeDiff(this.z_acc, copy.z_acc);
      copy.y_acc = this.y_acc = (run.Variable)po.writeDiff(this.y_acc, copy.y_acc);
      copy.x_acc = this.x_acc = (run.Variable)po.writeDiff(this.x_acc, copy.x_acc);
      copy.z_rot_vel = this.z_rot_vel = (run.Variable)po.writeDiff(this.z_rot_vel, copy.z_rot_vel);
      copy.y_rot_vel = this.y_rot_vel = (run.Variable)po.writeDiff(this.y_rot_vel, copy.y_rot_vel);
      copy.x_rot_vel = this.x_rot_vel = (run.Variable)po.writeDiff(this.x_rot_vel, copy.x_rot_vel);
      copy.z_vel = this.z_vel = (run.Variable)po.writeDiff(this.z_vel, copy.z_vel);
      copy.y_vel = this.y_vel = (run.Variable)po.writeDiff(this.y_vel, copy.y_vel);
      copy.x_vel = this.x_vel = (run.Variable)po.writeDiff(this.x_vel, copy.x_vel);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      BoundaryCondition copy = (BoundaryCondition)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.z = this.z = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.y = this.y = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.x = this.x = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.update_is_set = this.update_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.axis_is_set = this.axis_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_rot_acc_is_set = this.y_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_rot_acc_is_set = this.z_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_rot_acc_is_set = this.x_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_acc_is_set = this.y_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_acc_is_set = this.z_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_acc_is_set = this.x_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_rot_vel_is_set = this.x_rot_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_rot_vel_is_set = this.y_rot_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_rot_vel_is_set = this.z_rot_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_vel_is_set = this.z_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_vel_is_set = this.y_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_vel_is_set = this.x_vel_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.nodes = this.nodes = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.axis = this.axis = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.node = this.node = (run.Node[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_rot_acc = this.z_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_rot_acc = this.y_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_rot_acc = this.x_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_acc = this.z_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_acc = this.y_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_acc = this.x_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_rot_vel = this.z_rot_vel = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_rot_vel = this.y_rot_vel = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_rot_vel = this.x_rot_vel = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_vel = this.z_vel = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_vel = this.y_vel = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_vel = this.x_vel = (run.Variable)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.nodes);
      c.descend(this.axis);
      c.descend(this.node);
      c.descend(this.z_rot_acc);
      c.descend(this.y_rot_acc);
      c.descend(this.x_rot_acc);
      c.descend(this.z_acc);
      c.descend(this.y_acc);
      c.descend(this.x_acc);
      c.descend(this.z_rot_vel);
      c.descend(this.y_rot_vel);
      c.descend(this.x_rot_vel);
      c.descend(this.z_vel);
      c.descend(this.y_vel);
      c.descend(this.x_vel);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.nodes = (java.lang.String)f.filter(this.nodes);
      this.axis = (Jama.Matrix)f.filter(this.axis);
      this.node = (run.Node[])f.filter(this.node);
      this.z_rot_acc = (run.Variable)f.filter(this.z_rot_acc);
      this.y_rot_acc = (run.Variable)f.filter(this.y_rot_acc);
      this.x_rot_acc = (run.Variable)f.filter(this.x_rot_acc);
      this.z_acc = (run.Variable)f.filter(this.z_acc);
      this.y_acc = (run.Variable)f.filter(this.y_acc);
      this.x_acc = (run.Variable)f.filter(this.x_acc);
      this.z_rot_vel = (run.Variable)f.filter(this.z_rot_vel);
      this.y_rot_vel = (run.Variable)f.filter(this.y_rot_vel);
      this.x_rot_vel = (run.Variable)f.filter(this.x_rot_vel);
      this.z_vel = (run.Variable)f.filter(this.z_vel);
      this.y_vel = (run.Variable)f.filter(this.y_vel);
      this.x_vel = (run.Variable)f.filter(this.x_vel);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new BoundaryCondition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((BoundaryCondition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((BoundaryCondition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((BoundaryCondition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new BoundaryCondition((BoundaryCondition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((BoundaryCondition)copy).deepCloneReferences((BoundaryCondition)orig, _helper);
         return false;
      }
      public Class getType() {
         return BoundaryCondition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public BoundaryCondition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(BoundaryCondition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.z = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.y = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.x = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.update_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.axis_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_rot_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_rot_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_rot_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_acc_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_rot_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_rot_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_rot_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_vel_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(BoundaryCondition._SIZE);
      this.nodes = (java.lang.String)_stream.readReference();
      this.axis = (Jama.Matrix)_stream.readReference();
      this.node = (run.Node[])_stream.readReference();
      this.z_rot_acc = (run.Variable)_stream.readReference();
      this.y_rot_acc = (run.Variable)_stream.readReference();
      this.x_rot_acc = (run.Variable)_stream.readReference();
      this.z_acc = (run.Variable)_stream.readReference();
      this.y_acc = (run.Variable)_stream.readReference();
      this.x_acc = (run.Variable)_stream.readReference();
      this.z_rot_vel = (run.Variable)_stream.readReference();
      this.y_rot_vel = (run.Variable)_stream.readReference();
      this.x_rot_vel = (run.Variable)_stream.readReference();
      this.z_vel = (run.Variable)_stream.readReference();
      this.y_vel = (run.Variable)_stream.readReference();
      this.x_vel = (run.Variable)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(BoundaryCondition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.update_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.axis_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_rot_vel_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_rot_vel_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_rot_vel_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_vel_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_vel_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_vel_is_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.nodes);
      _stream.writeReference(this.axis);
      _stream.writeReference(this.node);
      _stream.writeReference(this.z_rot_acc);
      _stream.writeReference(this.y_rot_acc);
      _stream.writeReference(this.x_rot_acc);
      _stream.writeReference(this.z_acc);
      _stream.writeReference(this.y_acc);
      _stream.writeReference(this.x_acc);
      _stream.writeReference(this.z_rot_vel);
      _stream.writeReference(this.y_rot_vel);
      _stream.writeReference(this.x_rot_vel);
      _stream.writeReference(this.z_vel);
      _stream.writeReference(this.y_vel);
      _stream.writeReference(this.x_vel);
   }
   public BoundaryCondition(BoundaryCondition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.z = _orig.z;
      this.y = _orig.y;
      this.x = _orig.x;
      this.update_is_set = _orig.update_is_set;
      this.axis_is_set = _orig.axis_is_set;
      this.y_rot_acc_is_set = _orig.y_rot_acc_is_set;
      this.z_rot_acc_is_set = _orig.z_rot_acc_is_set;
      this.x_rot_acc_is_set = _orig.x_rot_acc_is_set;
      this.y_acc_is_set = _orig.y_acc_is_set;
      this.z_acc_is_set = _orig.z_acc_is_set;
      this.x_acc_is_set = _orig.x_acc_is_set;
      this.x_rot_vel_is_set = _orig.x_rot_vel_is_set;
      this.y_rot_vel_is_set = _orig.y_rot_vel_is_set;
      this.z_rot_vel_is_set = _orig.z_rot_vel_is_set;
      this.z_vel_is_set = _orig.z_vel_is_set;
      this.y_vel_is_set = _orig.y_vel_is_set;
      this.x_vel_is_set = _orig.x_vel_is_set;
   }
   public void deepCloneReferences(BoundaryCondition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.nodes = (java.lang.String)_helper.internalDeepClone(_orig.nodes);
      this.axis = (Jama.Matrix)_helper.internalDeepClone(_orig.axis);
      this.node = (run.Node[])_helper.internalDeepClone(_orig.node);
      this.z_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.z_rot_acc);
      this.y_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.y_rot_acc);
      this.x_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.x_rot_acc);
      this.z_acc = (run.Variable)_helper.internalDeepClone(_orig.z_acc);
      this.y_acc = (run.Variable)_helper.internalDeepClone(_orig.y_acc);
      this.x_acc = (run.Variable)_helper.internalDeepClone(_orig.x_acc);
      this.z_rot_vel = (run.Variable)_helper.internalDeepClone(_orig.z_rot_vel);
      this.y_rot_vel = (run.Variable)_helper.internalDeepClone(_orig.y_rot_vel);
      this.x_rot_vel = (run.Variable)_helper.internalDeepClone(_orig.x_rot_vel);
      this.z_vel = (run.Variable)_helper.internalDeepClone(_orig.z_vel);
      this.y_vel = (run.Variable)_helper.internalDeepClone(_orig.y_vel);
      this.x_vel = (run.Variable)_helper.internalDeepClone(_orig.x_vel);
   }
   private boolean x_vel_is_set = false;
   private boolean y_vel_is_set = false;
   private boolean z_vel_is_set = false;
   private boolean z_rot_vel_is_set = false;
   private boolean y_rot_vel_is_set = false;
   private boolean x_rot_vel_is_set = false;
   private boolean x_acc_is_set = false;
   private boolean z_acc_is_set = false;
   private boolean y_acc_is_set = false;
   private boolean x_rot_acc_is_set = false;
   private boolean z_rot_acc_is_set = false;
   private boolean y_rot_acc_is_set = false;
   private boolean axis_is_set = false;
   private boolean update_is_set = false;
   private Variable x_vel;
   private Variable y_vel;
   private Variable z_vel;
   private Variable x_rot_vel;
   private Variable y_rot_vel;
   private Variable z_rot_vel;
   private Variable x_acc;
   private Variable y_acc;
   private Variable z_acc;
   private Variable x_rot_acc;
   private Variable y_rot_acc;
   private Variable z_rot_acc;
   private Node[] node;
   private Jama.Matrix axis;
   private String nodes;
   private double x;
   private double y;
   private double z;
   public BoundaryCondition() {
      super();
      this.type = new String("BOUNDARY_CONDITION");
   }
   public BoundaryCondition(Constraint param) {
      super();
      this.name = new String(param.getName());
      this.type = new String("BOUNDARY_CONDITION");
   }
   private boolean x_acc_is_on(double currtime) {
      if (!this.x_acc_is_set) {
         return false;
      }
      return this.x_acc.on(currtime);
   }
   private boolean y_acc_is_on(double currtime) {
      if (!this.y_acc_is_set) {
         return false;
      }
      return this.y_acc.on(currtime);
   }
   private boolean z_acc_is_on(double currtime) {
      if (!this.z_acc_is_set) {
         return false;
      }
      return this.z_acc.on(currtime);
   }
   private boolean x_vel_is_on(double currtime) {
      if (!this.x_vel_is_set) {
         return false;
      }
      return this.x_vel.on(currtime);
   }
   private boolean y_vel_is_on(double currtime) {
      if (!this.y_vel_is_set) {
         return false;
      }
      return this.y_vel.on(currtime);
   }
   private boolean z_vel_is_on(double currtime) {
      if (!this.z_vel_is_set) {
         return false;
      }
      return this.z_vel.on(currtime);
   }
   private boolean x_rot_acc_is_on(double currtime) {
      if (!this.x_rot_acc_is_set) {
         return false;
      }
      return this.x_rot_acc.on(currtime);
   }
   private boolean y_rot_acc_is_on(double currtime) {
      if (!this.y_rot_acc_is_set) {
         return false;
      }
      return this.y_rot_acc.on(currtime);
   }
   private boolean z_rot_acc_is_on(double currtime) {
      if (!this.z_rot_acc_is_set) {
         return false;
      }
      return this.z_rot_acc.on(currtime);
   }
   private boolean x_rot_vel_is_on(double currtime) {
      if (!this.x_rot_vel_is_set) {
         return false;
      }
      return this.x_rot_vel.on(currtime);
   }
   private boolean y_rot_vel_is_on(double currtime) {
      if (!this.y_rot_vel_is_set) {
         return false;
      }
      return this.y_rot_vel.on(currtime);
   }
   private boolean z_rot_vel_is_on(double currtime) {
      if (!this.z_rot_vel_is_set) {
         return false;
      }
      return this.z_rot_vel.on(currtime);
   }
   public void checkIndata() throws IllegalArgumentException {
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("VX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.x_vel = new Variable(param[i + 2].getn());
            }
            this.x_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("VY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.y_vel = new Variable(param[i + 2].getn());
            }
            this.y_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("VZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.z_vel = new Variable(param[i + 2].getn());
            }
            this.z_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("VRX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_rot_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VRX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.x_rot_vel = new Variable(param[i + 2].getn());
            }
            this.x_rot_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("VRY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_rot_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VRY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.y_rot_vel = new Variable(param[i + 2].getn());
            }
            this.y_rot_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("VRZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_rot_vel = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: VRZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.z_rot_vel = new Variable(param[i + 2].getn());
            }
            this.z_rot_vel_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: AX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.x_acc = new Variable(param[i + 2].getn());
            }
            this.x_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: AY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.y_acc = new Variable(param[i + 2].getn());
            }
            this.y_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: AZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.z_acc = new Variable(param[i + 2].getn());
            }
            this.z_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("ARX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_rot_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: ARX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.x_rot_acc = new Variable(param[i + 2].getn());
            }
            this.x_rot_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("ARY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_rot_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: ARY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.y_rot_acc = new Variable(param[i + 2].getn());
            }
            this.y_rot_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("ARZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_rot_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: ARZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.z_rot_acc = new Variable(param[i + 2].getn());
            }
            this.z_rot_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AXIS") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, Axis node number definition should be [nodenr1,nodenr2,nodenr3]", lineno);
            }
            this.nodes = param[i + 2].getw();
            this.node = new Node[3];
            i += 3;
            this.axis_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("UPDATE") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("ON")) {
               this.update_is_set = true;
            } else {
               throw new ParseException("Unrecognized update parameter. Only option is ON", lineno);
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Syntax error, unrecognized constraint parameter", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
      String temp;
      Node temp_node;
      int start;
      int end;
      int i;
      int j;
      int index;
      if (param[0].is_a_word() && param[0].getw().trim().equals("SPC1")) {
         if (param[1].is_a_number()) {
            this.name = new String("BC_" + lineno);
         } else {
            throw new ParseException("Illegal identification number of SPC1: " + param[1].getn(), lineno);
         }
         if (param[2].is_a_number()) {
            temp = new String("" + param[2].getn());
            if (temp.indexOf("1") != -1) {
               this.x_acc = new Variable(0);
               this.x_acc_is_set = true;
               this.x_vel = new Variable(0);
               this.x_vel_is_set = true;
            }
            if (temp.indexOf("2") != -1) {
               this.y_acc = new Variable(0);
               this.y_acc_is_set = true;
               this.y_vel = new Variable(0);
               this.y_vel_is_set = true;
            }
            if (temp.indexOf("3") != -1) {
               this.z_acc = new Variable(0);
               this.z_acc_is_set = true;
               this.z_vel = new Variable(0);
               this.z_vel_is_set = true;
            }
            if (temp.indexOf("4") != -1) {
               this.x_rot_acc = new Variable(0);
               this.x_rot_acc_is_set = true;
               this.x_rot_vel = new Variable(0);
               this.x_rot_vel_is_set = true;
            }
            if (temp.indexOf("5") != -1) {
               this.y_rot_acc = new Variable(0);
               this.y_rot_acc_is_set = true;
               this.y_rot_vel = new Variable(0);
               this.y_rot_vel_is_set = true;
            }
            if (temp.indexOf("6") != -1) {
               this.z_rot_acc = new Variable(0);
               this.z_rot_acc_is_set = true;
               this.z_rot_vel = new Variable(0);
               this.z_rot_vel_is_set = true;
            }
         } else throw new ParseException("Illegal component number for SPC1: " + param[1].getn(), lineno);
         i = 3;
      } else {
         i = 1;
      }
      do {
         start = 0;
         end = 0;
         if (param[i].is_a_number() && (i == param.length - 1 || i == 8 || param[i + 1].is_a_number())) {
            start = (int)param[i].getn();
            end = start;
            i++;
         } else if (param[i].is_a_number() && i <= param.length - 3 && param[i + 1].is_a_word() && param[i + 2].is_a_number()) {
            start = (int)param[i].getn();
            end = (int)param[i + 2].getn();
            i += 3;
         } else if (param[i].is_a_word() && i == 9) break; else {
            throw new ParseException("Illegal node number in SPC1: " + param[1].getn(), lineno);
         }
         for (j = start; j <= end; j++) for (index = 0; index < nodelist.size(); index++) {
            temp_node = (Node)nodelist.elementAt(index);
            if (temp_node.getNumber() == j) temp_node.setConstraint(this);
         }
      }       while (i < param.length);
   }
   public void parse_Gmsh(Token[] param, int val, RplVector nodelist) throws java.text.ParseException {
      Node temp_node;
      int i;
      int index;
      this.name = new String("BC_" + val);
      this.x_vel = new Variable(0);
      this.x_vel_is_set = true;
      this.y_vel = new Variable(0);
      this.y_vel_is_set = true;
      this.z_vel = new Variable(0);
      this.z_vel_is_set = true;
      this.x_rot_vel = new Variable(0);
      this.x_rot_vel_is_set = true;
      this.y_rot_vel = new Variable(0);
      this.y_rot_vel_is_set = true;
      this.z_rot_vel = new Variable(0);
      this.z_rot_vel_is_set = true;
      for (i = 5; i < 5 + (int)param[4].getn(); i++) for (index = 0; index < nodelist.size(); index++) {
         temp_node = (Node)nodelist.elementAt(index);
         if (temp_node.getNumber() == param[i].getn()) temp_node.setConstraint(this);
      }
   }
   public String print_Fembic(int ctrl) {
      String out;
      switch (ctrl) {
      case Element.MESH: 
         out = new String(this.name);
         if (this.x_acc_is_set) out += " ax = " + this.x_acc.printFembic();
         if (this.y_acc_is_set) out += " ay = " + this.y_acc.printFembic();
         if (this.z_acc_is_set) out += " az = " + this.z_acc.printFembic();
         if (this.x_rot_acc_is_set) out += " arx = " + this.x_rot_acc.printFembic();
         if (this.y_rot_acc_is_set) out += " ary = " + this.y_rot_acc.printFembic();
         if (this.z_rot_acc_is_set) out += " arz = " + this.z_rot_acc.printFembic();
         if (this.x_vel_is_set) out += " vx = " + this.x_vel.printFembic();
         if (this.y_vel_is_set) out += " vy = " + this.y_vel.printFembic();
         if (this.z_vel_is_set) out += " vz = " + this.z_vel.printFembic();
         if (this.x_rot_vel_is_set) out += " vrx = " + this.x_rot_vel.printFembic();
         if (this.y_rot_vel_is_set) out += " vry = " + this.y_rot_vel.printFembic();
         if (this.z_rot_vel_is_set) out += " vrz = " + this.z_rot_vel.printFembic();
         if (this.axis_is_set) out += " axis = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]";
         if (this.update_is_set) out += " Update = ON";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void applyAccelerationConditions(Node nod, double currtime) {
      if (this.axis_is_set) {
         if (x_vel_is_on(currtime)) {
            this.x = 0;
         } else if (x_acc_is_on(currtime)) {
            this.x = this.x_acc.value(currtime);
         } else {
            this.x = nod.getX_acc() * this.axis.get(0, 0) + nod.getY_acc() * this.axis.get(1, 0) + nod.getZ_acc() * this.axis.get(2, 0);
         }
         if (y_vel_is_on(currtime)) {
            this.y = 0;
         } else if (y_acc_is_on(currtime)) {
            this.y = this.y_acc.value(currtime);
         } else {
            this.y = nod.getX_acc() * this.axis.get(0, 1) + nod.getY_acc() * this.axis.get(1, 1) + nod.getZ_acc() * this.axis.get(2, 1);
         }
         if (z_vel_is_on(currtime)) {
            this.z = 0;
         } else if (z_acc_is_on(currtime)) {
            this.z = this.z_acc.value(currtime);
         } else {
            this.z = nod.getX_acc() * this.axis.get(0, 2) + nod.getY_acc() * this.axis.get(1, 2) + nod.getZ_acc() * this.axis.get(2, 2);
         }
         nod.setX_acc(this.x * this.axis.get(0, 0) + this.y * this.axis.get(0, 1) + this.z * this.axis.get(0, 2));
         nod.setY_acc(this.x * this.axis.get(1, 0) + this.y * this.axis.get(1, 1) + this.z * this.axis.get(1, 2));
         nod.setZ_acc(this.x * this.axis.get(2, 0) + this.y * this.axis.get(2, 1) + this.z * this.axis.get(2, 2));
         if (x_rot_vel_is_on(currtime)) {
            this.x = 0;
         } else if (x_rot_acc_is_on(currtime)) {
            this.x = this.x_rot_acc.value(currtime);
         } else {
            this.x = nod.getX_rot_acc() * this.axis.get(0, 0) + nod.getY_rot_acc() * this.axis.get(1, 0) + nod.getZ_rot_acc() * this.axis.get(2, 0);
         }
         if (y_rot_vel_is_on(currtime)) {
            this.y = 0;
         } else if (y_rot_acc_is_on(currtime)) {
            this.y = this.y_rot_acc.value(currtime);
         } else {
            this.y = nod.getX_rot_acc() * this.axis.get(0, 1) + nod.getY_rot_acc() * this.axis.get(1, 1) + nod.getZ_rot_acc() * this.axis.get(2, 1);
         }
         if (z_rot_vel_is_on(currtime)) {
            this.z = 0;
         } else if (z_rot_acc_is_on(currtime)) {
            this.z = this.z_rot_acc.value(currtime);
         } else {
            this.z = nod.getX_rot_acc() * this.axis.get(0, 2) + nod.getY_rot_acc() * this.axis.get(1, 2) + nod.getZ_rot_acc() * this.axis.get(2, 2);
         }
         nod.setX_rot_acc(this.x * this.axis.get(0, 0) + this.y * this.axis.get(0, 1) + this.z * this.axis.get(0, 2));
         nod.setY_rot_acc(this.x * this.axis.get(1, 0) + this.y * this.axis.get(1, 1) + this.z * this.axis.get(1, 2));
         nod.setZ_rot_acc(this.x * this.axis.get(2, 0) + this.y * this.axis.get(2, 1) + this.z * this.axis.get(2, 2));
      } else {
         if (x_vel_is_on(currtime)) {
            nod.setX_acc(0);
         } else if (x_acc_is_on(currtime)) {
            nod.setX_acc(this.x_acc.value(currtime));
         }
         if (y_vel_is_on(currtime)) {
            nod.setY_acc(0);
         } else if (y_acc_is_on(currtime)) {
            nod.setY_acc(this.y_acc.value(currtime));
         }
         if (z_vel_is_on(currtime)) {
            nod.setZ_acc(0);
         } else if (z_acc_is_on(currtime)) {
            nod.setZ_acc(this.z_acc.value(currtime));
         }
         if (x_rot_vel_is_on(currtime)) {
            nod.setX_rot_acc(0);
         } else if (x_rot_acc_is_on(currtime)) {
            nod.setX_rot_acc(this.x_rot_acc.value(currtime));
         }
         if (y_rot_vel_is_on(currtime)) {
            nod.setY_rot_acc(0);
         } else if (y_rot_acc_is_on(currtime)) {
            nod.setY_rot_acc(this.y_rot_acc.value(currtime));
         }
         if (z_rot_vel_is_on(currtime)) {
            nod.setZ_rot_acc(0);
         } else if (z_rot_acc_is_on(currtime)) {
            nod.setZ_rot_acc(this.z_rot_acc.value(currtime));
         }
      }
   }
   public void applyVelocityConditions(Node nod, double currtime) {
      if (this.axis_is_set) {
         if (x_vel_is_on(currtime)) {
            this.x = this.x_vel.value(currtime);
         } else {
            this.x = nod.getX_vel() * this.axis.get(0, 0) + nod.getY_vel() * this.axis.get(1, 0) + nod.getZ_vel() * this.axis.get(2, 0);
         }
         if (y_vel_is_on(currtime)) {
            this.y = this.y_vel.value(currtime);
         } else {
            this.y = nod.getX_vel() * this.axis.get(0, 1) + nod.getY_vel() * this.axis.get(1, 1) + nod.getZ_vel() * this.axis.get(2, 1);
         }
         if (z_vel_is_on(currtime)) {
            this.z = this.z_vel.value(currtime);
         } else {
            this.z = nod.getX_vel() * this.axis.get(0, 2) + nod.getY_vel() * this.axis.get(1, 2) + nod.getZ_vel() * this.axis.get(2, 2);
         }
         nod.setX_vel(this.x * this.axis.get(0, 0) + this.y * this.axis.get(0, 1) + this.z * this.axis.get(0, 2));
         nod.setY_vel(this.x * this.axis.get(1, 0) + this.y * this.axis.get(1, 1) + this.z * this.axis.get(1, 2));
         nod.setZ_vel(this.x * this.axis.get(2, 0) + this.y * this.axis.get(2, 1) + this.z * this.axis.get(2, 2));
         if (x_rot_vel_is_on(currtime)) {
            this.x = this.x_rot_vel.value(currtime);
         } else {
            this.x = nod.getX_rot_vel() * this.axis.get(0, 0) + nod.getY_rot_vel() * this.axis.get(1, 0) + nod.getZ_rot_vel() * this.axis.get(2, 0);
         }
         if (y_rot_vel_is_on(currtime)) {
            this.y = this.y_rot_vel.value(currtime);
         } else {
            this.y = nod.getX_rot_vel() * this.axis.get(0, 1) + nod.getY_rot_vel() * this.axis.get(1, 1) + nod.getZ_rot_vel() * this.axis.get(2, 1);
         }
         if (z_rot_vel_is_on(currtime)) {
            this.z = this.z_rot_vel.value(currtime);
         } else {
            this.z = nod.getX_rot_vel() * this.axis.get(0, 2) + nod.getY_rot_vel() * this.axis.get(1, 2) + nod.getZ_rot_vel() * this.axis.get(2, 2);
         }
         nod.setX_rot_vel(this.x * this.axis.get(0, 0) + this.y * this.axis.get(0, 1) + this.z * this.axis.get(0, 2));
         nod.setY_rot_vel(this.x * this.axis.get(1, 0) + this.y * this.axis.get(1, 1) + this.z * this.axis.get(1, 2));
         nod.setZ_rot_vel(this.x * this.axis.get(2, 0) + this.y * this.axis.get(2, 1) + this.z * this.axis.get(2, 2));
      } else {
         if (x_vel_is_on(currtime)) {
            nod.setX_vel(this.x_vel.value(currtime));
         }
         if (y_vel_is_on(currtime)) {
            nod.setY_vel(this.y_vel.value(currtime));
         }
         if (z_vel_is_on(currtime)) {
            nod.setZ_vel(this.z_vel.value(currtime));
         }
         if (x_rot_vel_is_on(currtime)) {
            nod.setX_rot_vel(this.x_rot_vel.value(currtime));
         }
         if (y_rot_vel_is_on(currtime)) {
            nod.setY_rot_vel(this.y_rot_vel.value(currtime));
         }
         if (z_rot_vel_is_on(currtime)) {
            nod.setZ_rot_vel(this.z_rot_vel.value(currtime));
         }
      }
   }
   public void registerNode(Node nod) {
   }
   public void setInitialConditions() {
   }
   public void update() {
      if (this.axis_is_set && this.update_is_set) {
         this.axis = this.calculateLocalBaseVectors(this.node[0].getX_pos(), this.node[0].getY_pos(), this.node[0].getZ_pos(), this.node[1].getX_pos(), this.node[1].getY_pos(), this.node[1].getZ_pos(), this.node[2].getX_pos(), this.node[2].getY_pos(), this.node[2].getZ_pos());
      }
   }
   public void determineMassMatrix(RplVector nodelist) {
      int j;
      if (this.axis_is_set) {
         for (j = 0; j < 3; j++) {
            this.node[j] = super.findNode(super.getNodeNumber(j + 1, this.nodes), nodelist);
         }
         this.axis = this.calculateLocalBaseVectors(this.node[0].getX_pos(), this.node[0].getY_pos(), this.node[0].getZ_pos(), this.node[1].getX_pos(), this.node[1].getY_pos(), this.node[1].getZ_pos(), this.node[2].getX_pos(), this.node[2].getY_pos(), this.node[2].getZ_pos());
      }
   }
}
