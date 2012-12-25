package run;
import Jama.Matrix;

import jp.lang.DistributedRuntime;

import jp.lang.RMICompatibility;

import jp.lang.RemoteObject;

import uka.karmi.rmi.RemoteException;

import uka.karmi.rmi.server.ReplicatedObject;

public class SharedData extends ReplicatedObject implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      SharedData copy = (SharedData)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.length, copy.length)) copy.length = this.length;
      copy.force_positive = this.force_positive = (Jama.Matrix[])po.writeDiff(this.force_positive, copy.force_positive);
      copy.contact_force = this.contact_force = (Jama.Matrix[])po.writeDiff(this.contact_force, copy.contact_force);
      copy.hourglass_force = this.hourglass_force = (Jama.Matrix[])po.writeDiff(this.hourglass_force, copy.hourglass_force);
      copy.internal_force = this.internal_force = (Jama.Matrix[])po.writeDiff(this.internal_force, copy.internal_force);
      copy.external_force = this.external_force = (Jama.Matrix[])po.writeDiff(this.external_force, copy.external_force);
      copy.force = this.force = (Jama.Matrix[])po.writeDiff(this.force, copy.force);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      SharedData copy = (SharedData)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.length = this.length = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.force_positive = this.force_positive = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.contact_force = this.contact_force = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_force = this.hourglass_force = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_force = this.internal_force = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.external_force = this.external_force = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix[])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.force_positive);
      c.descend(this.contact_force);
      c.descend(this.hourglass_force);
      c.descend(this.internal_force);
      c.descend(this.external_force);
      c.descend(this.force);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.force_positive = (Jama.Matrix[])f.filter(this.force_positive);
      this.contact_force = (Jama.Matrix[])f.filter(this.contact_force);
      this.hourglass_force = (Jama.Matrix[])f.filter(this.hourglass_force);
      this.internal_force = (Jama.Matrix[])f.filter(this.internal_force);
      this.external_force = (Jama.Matrix[])f.filter(this.external_force);
      this.force = (Jama.Matrix[])f.filter(this.force);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new SharedData(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((SharedData)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SharedData)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SharedData)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new SharedData((SharedData)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((SharedData)copy).deepCloneReferences((SharedData)orig, _helper);
         return false;
      }
      public Class getType() {
         return SharedData.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int;
   public SharedData(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(SharedData._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.length = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(SharedData._SIZE);
      this.force_positive = (Jama.Matrix[])_stream.readReference();
      this.contact_force = (Jama.Matrix[])_stream.readReference();
      this.hourglass_force = (Jama.Matrix[])_stream.readReference();
      this.internal_force = (Jama.Matrix[])_stream.readReference();
      this.external_force = (Jama.Matrix[])_stream.readReference();
      this.force = (Jama.Matrix[])_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(SharedData._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.length);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.force_positive);
      _stream.writeReference(this.contact_force);
      _stream.writeReference(this.hourglass_force);
      _stream.writeReference(this.internal_force);
      _stream.writeReference(this.external_force);
      _stream.writeReference(this.force);
   }
   public SharedData(SharedData _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.length = _orig.length;
   }
   public void deepCloneReferences(SharedData _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.force_positive = (Jama.Matrix[])_helper.internalDeepClone(_orig.force_positive);
      this.contact_force = (Jama.Matrix[])_helper.internalDeepClone(_orig.contact_force);
      this.hourglass_force = (Jama.Matrix[])_helper.internalDeepClone(_orig.hourglass_force);
      this.internal_force = (Jama.Matrix[])_helper.internalDeepClone(_orig.internal_force);
      this.external_force = (Jama.Matrix[])_helper.internalDeepClone(_orig.external_force);
      this.force = (Jama.Matrix[])_helper.internalDeepClone(_orig.force);
   }
   private Matrix[] force;
   private Matrix[] external_force;
   private Matrix[] internal_force;
   private Matrix[] hourglass_force;
   private Matrix[] contact_force;
   private Matrix[] force_positive;
   int length;
   public SharedData(RemoteObject[] cluster_nodes, int length) throws RemoteException {
      super(RMICompatibility.getStubs(cluster_nodes));
      this.length = length;
      this.force = new Matrix[length];
      this.external_force = new Matrix[length];
      this.internal_force = new Matrix[length];
      this.hourglass_force = new Matrix[length];
      this.contact_force = new Matrix[length];
      this.force_positive = new Matrix[length];
      for (int i = 0; i < length; i++) {
         this.force[i] = new Jama.Matrix(6, 1);
         this.internal_force[i] = new Jama.Matrix(6, 1);
         this.external_force[i] = new Jama.Matrix(6, 1);
         this.hourglass_force[i] = new Jama.Matrix(6, 1);
         this.contact_force[i] = new Jama.Matrix(6, 1);
         this.force_positive[i] = new Jama.Matrix(6, 1);
      }
   }
   public Matrix getForce(int index) {
      return this.force[index];
   }
   public Matrix getExternalForce(int index) {
      return this.external_force[index];
   }
   public Matrix getInternalForce(int index) {
      return this.internal_force[index];
   }
   public Matrix getHourglassForce(int index) {
      return this.hourglass_force[index];
   }
   public Matrix getContactForce(int index) {
      return this.contact_force[index];
   }
   public Matrix getForcePositive(int index) {
      return this.force_positive[index];
   }
   public void freeze() {
      for (int i = 0; i < this.length; i++) {
         DistributedRuntime.setReadOnly(this, this.external_force[i]);
         DistributedRuntime.setReadOnly(this, this.internal_force[i]);
         DistributedRuntime.setReadOnly(this, this.contact_force[i]);
         DistributedRuntime.setReadOnly(this, this.hourglass_force[i]);
         DistributedRuntime.setReadOnly(this, this.force_positive[i]);
      }
      DistributedRuntime.setReadOnly(this, this.external_force);
      DistributedRuntime.setReadOnly(this, this.internal_force);
      DistributedRuntime.setReadOnly(this, this.contact_force);
      DistributedRuntime.setReadOnly(this, this.hourglass_force);
      DistributedRuntime.setReadOnly(this, this.force_positive);
   }
}
