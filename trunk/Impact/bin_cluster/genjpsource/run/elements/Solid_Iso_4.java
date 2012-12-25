package run.elements;
import run.*;

import java.util.*;

public class Solid_Iso_4 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Solid_Iso_4 copy = (Solid_Iso_4)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.NIP_is_set, copy.NIP_is_set)) copy.NIP_is_set = this.NIP_is_set;
      if (po.writeDiff(this.number_of_integration_points, copy.number_of_integration_points)) copy.number_of_integration_points = this.number_of_integration_points;
      copy.W = this.W = (double[])po.writeDiff(this.W, copy.W);
      copy.P = this.P = (Jama.Matrix)po.writeDiff(this.P, copy.P);
      copy.f = this.f = (Jama.Matrix)po.writeDiff(this.f, copy.f);
      copy.d = this.d = (Jama.Matrix)po.writeDiff(this.d, copy.d);
      copy.stress = this.stress = (Jama.Matrix[])po.writeDiff(this.stress, copy.stress);
      copy.dstrain = this.dstrain = (Jama.Matrix[])po.writeDiff(this.dstrain, copy.dstrain);
      copy.strain = this.strain = (Jama.Matrix[])po.writeDiff(this.strain, copy.strain);
      copy.J_inv = this.J_inv = (Jama.Matrix)po.writeDiff(this.J_inv, copy.J_inv);
      copy.J = this.J = (Jama.Matrix[])po.writeDiff(this.J, copy.J);
      copy.B = this.B = (Jama.Matrix[])po.writeDiff(this.B, copy.B);
      copy.N = this.N = (Jama.Matrix)po.writeDiff(this.N, copy.N);
      copy.M = this.M = (Jama.Matrix)po.writeDiff(this.M, copy.M);
      copy.H = this.H = (Jama.Matrix)po.writeDiff(this.H, copy.H);
      copy.etha = this.etha = (double[])po.writeDiff(this.etha, copy.etha);
      copy.phi = this.phi = (double[])po.writeDiff(this.phi, copy.phi);
      copy.xsi = this.xsi = (double[])po.writeDiff(this.xsi, copy.xsi);
      copy.D = this.D = (Jama.Matrix)po.writeDiff(this.D, copy.D);
      copy.material = this.material = (run.Material[])po.writeDiff(this.material, copy.material);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Solid_Iso_4 copy = (Solid_Iso_4)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.NIP_is_set = this.NIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.number_of_integration_points = this.number_of_integration_points = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.W = this.W = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.P = this.P = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.f = this.f = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.d = this.d = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stress = this.stress = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dstrain = this.dstrain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strain = this.strain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.J_inv = this.J_inv = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.J = this.J = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.B = this.B = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.N = this.N = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.M = this.M = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.H = this.H = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.etha = this.etha = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.phi = this.phi = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.xsi = this.xsi = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.D = this.D = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.material = this.material = (run.Material[])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.W);
      c.descend(this.P);
      c.descend(this.f);
      c.descend(this.d);
      c.descend(this.stress);
      c.descend(this.dstrain);
      c.descend(this.strain);
      c.descend(this.J_inv);
      c.descend(this.J);
      c.descend(this.B);
      c.descend(this.N);
      c.descend(this.M);
      c.descend(this.H);
      c.descend(this.etha);
      c.descend(this.phi);
      c.descend(this.xsi);
      c.descend(this.D);
      c.descend(this.material);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.W = (double[])f.filter(this.W);
      this.P = (Jama.Matrix)f.filter(this.P);
      this.f = (Jama.Matrix)f.filter(this.f);
      this.d = (Jama.Matrix)f.filter(this.d);
      this.stress = (Jama.Matrix[])f.filter(this.stress);
      this.dstrain = (Jama.Matrix[])f.filter(this.dstrain);
      this.strain = (Jama.Matrix[])f.filter(this.strain);
      this.J_inv = (Jama.Matrix)f.filter(this.J_inv);
      this.J = (Jama.Matrix[])f.filter(this.J);
      this.B = (Jama.Matrix[])f.filter(this.B);
      this.N = (Jama.Matrix)f.filter(this.N);
      this.M = (Jama.Matrix)f.filter(this.M);
      this.H = (Jama.Matrix)f.filter(this.H);
      this.etha = (double[])f.filter(this.etha);
      this.phi = (double[])f.filter(this.phi);
      this.xsi = (double[])f.filter(this.xsi);
      this.D = (Jama.Matrix)f.filter(this.D);
      this.material = (run.Material[])f.filter(this.material);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Solid_Iso_4(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Solid_Iso_4)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Solid_Iso_4)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Solid_Iso_4)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Solid_Iso_4((Solid_Iso_4)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Solid_Iso_4)copy).deepCloneReferences((Solid_Iso_4)orig, _helper);
         return false;
      }
      public Class getType() {
         return Solid_Iso_4.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int;
   public Solid_Iso_4(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Solid_Iso_4._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Material_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.NIP_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.number_of_integration_points = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(Solid_Iso_4._SIZE);
      this.W = (double[])_stream.readReference();
      this.P = (Jama.Matrix)_stream.readReference();
      this.f = (Jama.Matrix)_stream.readReference();
      this.d = (Jama.Matrix)_stream.readReference();
      this.stress = (Jama.Matrix[])_stream.readReference();
      this.dstrain = (Jama.Matrix[])_stream.readReference();
      this.strain = (Jama.Matrix[])_stream.readReference();
      this.J_inv = (Jama.Matrix)_stream.readReference();
      this.J = (Jama.Matrix[])_stream.readReference();
      this.B = (Jama.Matrix[])_stream.readReference();
      this.N = (Jama.Matrix)_stream.readReference();
      this.M = (Jama.Matrix)_stream.readReference();
      this.H = (Jama.Matrix)_stream.readReference();
      this.etha = (double[])_stream.readReference();
      this.phi = (double[])_stream.readReference();
      this.xsi = (double[])_stream.readReference();
      this.D = (Jama.Matrix)_stream.readReference();
      this.material = (run.Material[])_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Solid_Iso_4._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Material_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.NIP_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_integration_points);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.W);
      _stream.writeReference(this.P);
      _stream.writeReference(this.f);
      _stream.writeReference(this.d);
      _stream.writeReference(this.stress);
      _stream.writeReference(this.dstrain);
      _stream.writeReference(this.strain);
      _stream.writeReference(this.J_inv);
      _stream.writeReference(this.J);
      _stream.writeReference(this.B);
      _stream.writeReference(this.N);
      _stream.writeReference(this.M);
      _stream.writeReference(this.H);
      _stream.writeReference(this.etha);
      _stream.writeReference(this.phi);
      _stream.writeReference(this.xsi);
      _stream.writeReference(this.D);
      _stream.writeReference(this.material);
   }
   public Solid_Iso_4(Solid_Iso_4 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Material_is_set = _orig.Material_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.NIP_is_set = _orig.NIP_is_set;
      this.number_of_integration_points = _orig.number_of_integration_points;
   }
   public void deepCloneReferences(Solid_Iso_4 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.W = (double[])_helper.internalDeepClone(_orig.W);
      this.P = (Jama.Matrix)_helper.internalDeepClone(_orig.P);
      this.f = (Jama.Matrix)_helper.internalDeepClone(_orig.f);
      this.d = (Jama.Matrix)_helper.internalDeepClone(_orig.d);
      this.stress = (Jama.Matrix[])_helper.internalDeepClone(_orig.stress);
      this.dstrain = (Jama.Matrix[])_helper.internalDeepClone(_orig.dstrain);
      this.strain = (Jama.Matrix[])_helper.internalDeepClone(_orig.strain);
      this.J_inv = (Jama.Matrix)_helper.internalDeepClone(_orig.J_inv);
      this.J = (Jama.Matrix[])_helper.internalDeepClone(_orig.J);
      this.B = (Jama.Matrix[])_helper.internalDeepClone(_orig.B);
      this.N = (Jama.Matrix)_helper.internalDeepClone(_orig.N);
      this.M = (Jama.Matrix)_helper.internalDeepClone(_orig.M);
      this.H = (Jama.Matrix)_helper.internalDeepClone(_orig.H);
      this.etha = (double[])_helper.internalDeepClone(_orig.etha);
      this.phi = (double[])_helper.internalDeepClone(_orig.phi);
      this.xsi = (double[])_helper.internalDeepClone(_orig.xsi);
      this.D = (Jama.Matrix)_helper.internalDeepClone(_orig.D);
      this.material = (run.Material[])_helper.internalDeepClone(_orig.material);
   }
   private Material[] material;
   private Jama.Matrix D;
   private int number_of_integration_points;
   private double[] xsi;
   private double[] phi;
   private double[] etha;
   private Jama.Matrix H;
   private Jama.Matrix M;
   private Jama.Matrix N;
   private Jama.Matrix[] B;
   private Jama.Matrix[] J;
   private Jama.Matrix J_inv;
   private Jama.Matrix[] strain;
   private Jama.Matrix[] dstrain;
   private Jama.Matrix[] stress;
   private Jama.Matrix d;
   private Jama.Matrix f;
   private Jama.Matrix P;
   private double[] W;
   private boolean NIP_is_set;
   private boolean Nodes_are_set;
   private boolean Material_is_set;
   public Solid_Iso_4() {
      super();
      this.type = new String("SOLID_ISO_4");
      int i;
      this.material = new Material[8];
      this.xsi = new double[8];
      this.etha = new double[8];
      this.phi = new double[8];
      this.node = new Node[8];
      this.W = new double[8];
      this.H = new Jama.Matrix(6, 9);
      this.M = new Jama.Matrix(8, 3);
      this.d = new Jama.Matrix(24, 1);
      this.f = new Jama.Matrix(24, 1);
      this.B = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.B[i] = new Jama.Matrix(6, 24);
      }
      this.D = new Jama.Matrix(3, 8);
      this.J = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.J[i] = new Jama.Matrix(3, 3);
      }
      this.J_inv = new Jama.Matrix(3, 3);
      this.P = new Jama.Matrix(9, 9);
      this.N = new Jama.Matrix(9, 24);
      this.strain = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.strain[i] = new Jama.Matrix(6, 1);
      }
      this.dstrain = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.dstrain[i] = new Jama.Matrix(6, 1);
      }
      this.stress = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.stress[i] = new Jama.Matrix(6, 1);
      }
      this.number_of_integration_points = 8;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      int i;
      int j;
      int k;
      Jama.Matrix mass;
      double total_mass;
      double s;
      mass = new Jama.Matrix(24, 24);
      total_mass = 0;
      s = 0;
      for (j = 0; j < 8; j++) {
         this.M.set(j, 0, this.node[j].getX_pos());
         this.M.set(j, 1, this.node[j].getY_pos());
         this.M.set(j, 2, this.node[j].getZ_pos());
      }
      calculateD(0, 0, 0);
      calculateN();
      this.J[0] = this.D.times(this.M);
      mass = this.N.transpose().times(this.N).times(this.material[0].getDensity()).times(this.J[0].det()).times(8.0);
      for (j = 0; j < 24; j++) {
         for (k = 0; k < 24; k++) {
            mass.set(j, k, j == k ? mass.get(j, k) : 0);
         }
      }
      total_mass = calculateElementVolume() * this.material[0].getDensity();
      if (total_mass <= 0) {
         throw new IllegalArgumentException("Error in Solid_iso_4 (tetra) element " + this.number + ". Element mass is zero or negative.\nMaterial density: " + this.material[0].getDensity());
      }
      if (this.J[0].det() <= 0) {
         throw new IllegalArgumentException("Error in Solid Tetra Element " + this.number + ". Element Volume is zero or negative. Check node defintion in indata file.");
      }
      for (i = 0; i < 8; i++) {
         s += mass.get(3 * i, 0);
      }
      for (i = 0; i < 24; i++) {
         mass.set(i, i, mass.get(i, i) * total_mass / s);
      }
      for (i = 0; i < 8; i++) {
         this.node[i].addMass(mass.get(3 * i, 3 * i) / 8.0);
      }
   }
   private double calculateElementVolume() {
      double total_volume = 0;
      int[] indx = {0, 2, 3, 6};
      Jama.Matrix M = new Jama.Matrix(4, 4);
      for (int i = 0; i < 4; i++) {
         M.set(i, 0, this.node[indx[i]].getX_pos());
         M.set(i, 1, this.node[indx[i]].getY_pos());
         M.set(i, 2, this.node[indx[i]].getZ_pos());
         M.set(i, 3, 1.0);
      }
      total_volume = Math.abs(M.det() / 6.0);
      return total_volume;
   }
   public void calculateContactForces() {
   }
   private void calculateD(double xsi, double phi, double etha) {
      this.D.set(0, 0, -(1.0 / 8) * (1 - etha) * (1 + phi));
      this.D.set(0, 1, -(1.0 / 8) * (1 - etha) * (1 - phi));
      this.D.set(0, 2, -(1.0 / 8) * (1 + etha) * (1 - phi));
      this.D.set(0, 3, -(1.0 / 8) * (1 + etha) * (1 + phi));
      this.D.set(0, 4, 1.0 / 8 * (1 - etha) * (1 + phi));
      this.D.set(0, 5, 1.0 / 8 * (1 - etha) * (1 - phi));
      this.D.set(0, 6, 1.0 / 8 * (1 + etha) * (1 - phi));
      this.D.set(0, 7, 1.0 / 8 * (1 + etha) * (1 + phi));
      this.D.set(1, 0, -(1.0 / 8) * (1 - xsi) * (1 + phi));
      this.D.set(1, 1, -(1.0 / 8) * (1 - xsi) * (1 - phi));
      this.D.set(1, 2, 1.0 / 8 * (1 - xsi) * (1 - phi));
      this.D.set(1, 3, 1.0 / 8 * (1 - xsi) * (1 + phi));
      this.D.set(1, 4, -(1.0 / 8) * (1 + xsi) * (1 + phi));
      this.D.set(1, 5, -(1.0 / 8) * (1 + xsi) * (1 - phi));
      this.D.set(1, 6, 1.0 / 8 * (1 + xsi) * (1 - phi));
      this.D.set(1, 7, 1.0 / 8 * (1 + xsi) * (1 + phi));
      this.D.set(2, 0, 1.0 / 8 * (1 - xsi) * (1 - etha));
      this.D.set(2, 1, -(1.0 / 8) * (1 - xsi) * (1 - etha));
      this.D.set(2, 2, -(1.0 / 8) * (1 - xsi) * (1 + etha));
      this.D.set(2, 3, 1.0 / 8 * (1 - xsi) * (1 + etha));
      this.D.set(2, 4, 1.0 / 8 * (1 + xsi) * (1 - etha));
      this.D.set(2, 5, -(1.0 / 8) * (1 + xsi) * (1 - etha));
      this.D.set(2, 6, -(1.0 / 8) * (1 + xsi) * (1 + etha));
      this.D.set(2, 7, 1.0 / 8 * (1 + xsi) * (1 + etha));
   }
   public void calculateExternalForces(double currtime) {
   }
   private void calculateN() {
      this.N.setMatrix(0, 2, 0, 0, this.D.getMatrix(0, 2, 0, 0));
      this.N.setMatrix(3, 5, 1, 1, this.D.getMatrix(0, 2, 0, 0));
      this.N.setMatrix(6, 8, 2, 2, this.D.getMatrix(0, 2, 0, 0));
      this.N.setMatrix(0, 2, 3, 3, this.D.getMatrix(0, 2, 1, 1));
      this.N.setMatrix(3, 5, 4, 4, this.D.getMatrix(0, 2, 1, 1));
      this.N.setMatrix(6, 8, 5, 5, this.D.getMatrix(0, 2, 1, 1));
      this.N.setMatrix(0, 2, 6, 6, this.D.getMatrix(0, 2, 2, 2));
      this.N.setMatrix(3, 5, 7, 7, this.D.getMatrix(0, 2, 2, 2));
      this.N.setMatrix(6, 8, 8, 8, this.D.getMatrix(0, 2, 2, 2));
      this.N.setMatrix(0, 2, 9, 9, this.D.getMatrix(0, 2, 3, 3));
      this.N.setMatrix(3, 5, 10, 10, this.D.getMatrix(0, 2, 3, 3));
      this.N.setMatrix(6, 8, 11, 11, this.D.getMatrix(0, 2, 3, 3));
      this.N.setMatrix(0, 2, 12, 12, this.D.getMatrix(0, 2, 4, 4));
      this.N.setMatrix(3, 5, 13, 13, this.D.getMatrix(0, 2, 4, 4));
      this.N.setMatrix(6, 8, 14, 14, this.D.getMatrix(0, 2, 4, 4));
      this.N.setMatrix(0, 2, 15, 15, this.D.getMatrix(0, 2, 5, 5));
      this.N.setMatrix(3, 5, 16, 16, this.D.getMatrix(0, 2, 5, 5));
      this.N.setMatrix(6, 8, 17, 17, this.D.getMatrix(0, 2, 5, 5));
      this.N.setMatrix(0, 2, 18, 18, this.D.getMatrix(0, 2, 6, 6));
      this.N.setMatrix(3, 5, 19, 19, this.D.getMatrix(0, 2, 6, 6));
      this.N.setMatrix(6, 8, 20, 20, this.D.getMatrix(0, 2, 6, 6));
      this.N.setMatrix(0, 2, 21, 21, this.D.getMatrix(0, 2, 7, 7));
      this.N.setMatrix(3, 5, 22, 22, this.D.getMatrix(0, 2, 7, 7));
      this.N.setMatrix(6, 8, 23, 23, this.D.getMatrix(0, 2, 7, 7));
   }
   public void calculateNodalForces(int i, double timestep) {
      int n;
      int k;
      Jama.Matrix global_force;
      this.f = this.B[i].transpose().times(this.stress[i]).times(this.J[i].det()).times(this.W[i] * this.W[i] * this.W[i]);
      for (n = 0; n < 8; n++) {
         global_force = this.f.getMatrix(3 * n, 3 * n + 2, 0, 0);
         this.node[n].addInternalForce(global_force.times(-1.0));
      }
   }
   public void calculateStrain(double tstep, int i) {
      int j;
      calculateD(this.xsi[i], this.phi[i], this.etha[i]);
      calculateN();
      for (j = 0; j < 8; j++) {
         this.M.set(j, 0, this.node[j].getX_pos());
         this.M.set(j, 1, this.node[j].getY_pos());
         this.M.set(j, 2, this.node[j].getZ_pos());
      }
      for (j = 0; j < 8; j++) {
         this.d.set(3 * j, 0, this.node[j].getX_dpos());
         this.d.set(3 * j + 1, 0, this.node[j].getY_dpos());
         this.d.set(3 * j + 2, 0, this.node[j].getZ_dpos());
      }
      this.J[i] = this.D.times(this.M);
      this.J_inv = this.J[i].inverse();
      this.P.setMatrix(0, 2, 0, 2, this.J_inv);
      this.P.setMatrix(3, 5, 3, 5, this.J_inv);
      this.P.setMatrix(6, 8, 6, 8, this.J_inv);
      this.B[i] = this.H.times(this.P.times(this.N));
      this.dstrain[i] = this.B[i].times(this.d);
   }
   public void calculateStress(int i, double timestep) {
      this.material[i].calculateStressThreeDimensional(this.strain[i], this.dstrain[i], this.stress[i], timestep);
   }
   public double checkTimestep(double current_timestep) {
      double critical_length = Double.MAX_VALUE;
      double timestep;
      double c;
      c = Math.sqrt((this.node[1].getX_pos() - this.node[0].getX_pos()) * (this.node[1].getX_pos() - this.node[0].getX_pos()) + (this.node[1].getY_pos() - this.node[0].getY_pos()) * (this.node[1].getY_pos() - this.node[0].getY_pos()) + (this.node[1].getZ_pos() - this.node[0].getZ_pos()) * (this.node[1].getZ_pos() - this.node[0].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[2].getX_pos() - this.node[1].getX_pos()) * (this.node[2].getX_pos() - this.node[1].getX_pos()) + (this.node[2].getY_pos() - this.node[1].getY_pos()) * (this.node[2].getY_pos() - this.node[1].getY_pos()) + (this.node[2].getZ_pos() - this.node[1].getZ_pos()) * (this.node[2].getZ_pos() - this.node[1].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[3].getX_pos() - this.node[2].getX_pos()) * (this.node[3].getX_pos() - this.node[2].getX_pos()) + (this.node[3].getY_pos() - this.node[2].getY_pos()) * (this.node[3].getY_pos() - this.node[2].getY_pos()) + (this.node[3].getZ_pos() - this.node[2].getZ_pos()) * (this.node[3].getZ_pos() - this.node[2].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[0].getX_pos() - this.node[3].getX_pos()) * (this.node[0].getX_pos() - this.node[3].getX_pos()) + (this.node[0].getY_pos() - this.node[3].getY_pos()) * (this.node[0].getY_pos() - this.node[3].getY_pos()) + (this.node[0].getZ_pos() - this.node[3].getZ_pos()) * (this.node[0].getZ_pos() - this.node[3].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[5].getX_pos() - this.node[4].getX_pos()) * (this.node[5].getX_pos() - this.node[4].getX_pos()) + (this.node[5].getY_pos() - this.node[4].getY_pos()) * (this.node[5].getY_pos() - this.node[4].getY_pos()) + (this.node[5].getZ_pos() - this.node[4].getZ_pos()) * (this.node[5].getZ_pos() - this.node[4].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[6].getX_pos() - this.node[5].getX_pos()) * (this.node[6].getX_pos() - this.node[5].getX_pos()) + (this.node[6].getY_pos() - this.node[5].getY_pos()) * (this.node[6].getY_pos() - this.node[5].getY_pos()) + (this.node[6].getZ_pos() - this.node[5].getZ_pos()) * (this.node[6].getZ_pos() - this.node[5].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[7].getX_pos() - this.node[6].getX_pos()) * (this.node[7].getX_pos() - this.node[6].getX_pos()) + (this.node[7].getY_pos() - this.node[6].getY_pos()) * (this.node[7].getY_pos() - this.node[6].getY_pos()) + (this.node[7].getZ_pos() - this.node[6].getZ_pos()) * (this.node[7].getZ_pos() - this.node[6].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[4].getX_pos() - this.node[7].getX_pos()) * (this.node[4].getX_pos() - this.node[7].getX_pos()) + (this.node[4].getY_pos() - this.node[7].getY_pos()) * (this.node[4].getY_pos() - this.node[7].getY_pos()) + (this.node[4].getZ_pos() - this.node[7].getZ_pos()) * (this.node[4].getZ_pos() - this.node[7].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[4].getX_pos() - this.node[0].getX_pos()) * (this.node[4].getX_pos() - this.node[0].getX_pos()) + (this.node[4].getY_pos() - this.node[0].getY_pos()) * (this.node[4].getY_pos() - this.node[0].getY_pos()) + (this.node[4].getZ_pos() - this.node[0].getZ_pos()) * (this.node[4].getZ_pos() - this.node[0].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[5].getX_pos() - this.node[1].getX_pos()) * (this.node[5].getX_pos() - this.node[1].getX_pos()) + (this.node[5].getY_pos() - this.node[1].getY_pos()) * (this.node[5].getY_pos() - this.node[1].getY_pos()) + (this.node[5].getZ_pos() - this.node[1].getZ_pos()) * (this.node[5].getZ_pos() - this.node[1].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[6].getX_pos() - this.node[2].getX_pos()) * (this.node[6].getX_pos() - this.node[2].getX_pos()) + (this.node[6].getY_pos() - this.node[2].getY_pos()) * (this.node[6].getY_pos() - this.node[2].getY_pos()) + (this.node[6].getZ_pos() - this.node[2].getZ_pos()) * (this.node[6].getZ_pos() - this.node[2].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      c = Math.sqrt((this.node[7].getX_pos() - this.node[3].getX_pos()) * (this.node[7].getX_pos() - this.node[3].getX_pos()) + (this.node[7].getY_pos() - this.node[3].getY_pos()) * (this.node[7].getY_pos() - this.node[3].getY_pos()) + (this.node[7].getZ_pos() - this.node[3].getZ_pos()) * (this.node[7].getZ_pos() - this.node[3].getZ_pos()));
      if (c > 0) critical_length = Math.min(critical_length, c);
      timestep = critical_length / this.material[0].wavespeedThreeDimensional(0.0, 0.0);
      return Math.min(timestep, current_timestep);
   }
   public int getNumberOfIntegrationPoints() {
      return this.number_of_integration_points;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int nodenumber;
      int j;
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3,nodenr4]", lineno);
            }
            try {
               for (j = 0; j < 4; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
               }
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException(e.getMessage(), lineno);
            }
            this.node[6] = this.node[3];
            this.node[3] = this.node[2];
            this.node[7] = this.node[2];
            this.node[2] = this.node[1];
            this.node[1] = this.node[0];
            this.node[5] = this.node[0];
            this.node[4] = this.node[0];
            i += 3;
            this.Nodes_are_set = true;
         } else if (param[i].getw().toUpperCase().equals("MATERIAL") && param[i + 1].getw().toUpperCase().equals("=")) {
            try {
               this.material[0] = super.findMaterial(param[i + 2].getw().toUpperCase(), materiallist);
               i += 3;
               this.Material_is_set = true;
            }  catch (IllegalArgumentException e) {
               throw e;
            }
         } else if (param[i].getw().toUpperCase().equals("NIP") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.number_of_integration_points = (int)param[i + 2].getn();
            i += 3;
            this.NIP_is_set = true;
         } else {
            throw new java.text.ParseException("Unknown Solid (Hexahedran) element parameter ", lineno);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Solid_Iso_4 element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for Solid_Iso_4 element nr" + this.number);
      }
      if (this.number_of_integration_points != 1) throw new IllegalArgumentException("NIP can only be set to 1 in Solid_Iso_4 element nr" + this.number);
   }
   public void deActivate() {
      super.deActivate();
   }
   public void checkIfFailed() {
      if (!this.material[0].failureStrainIsSet() && !this.material[0].failureStressIsSet()) {
         this.failed = false;
         return;
      }
      if (this.material[0].failureStressIsSet()) {
         double s = 0;
         for (int i = 0; i < this.number_of_integration_points; i++) {
            s += 0.7071F * Math.sqrt(Math.pow(this.stress[i].get(0, 0) - this.stress[i].get(1, 0), 2) + Math.pow(this.stress[i].get(1, 0) - this.stress[i].get(2, 0), 2) + Math.pow(this.stress[i].get(2, 0) - this.stress[i].get(0, 0), 2) + 6 * (Math.pow(this.stress[i].get(3, 0), 2) + Math.pow(this.stress[i].get(4, 0), 2) + Math.pow(this.stress[i].get(5, 0), 2)));
         }
         s /= this.number_of_integration_points;
         if (s > this.material[0].getFailureStress()) {
            this.failed = true;
            return;
         }
      }
      if (this.material[0].failureStrainIsSet()) {
         double e = 0;
         for (int i = 0; i < this.number_of_integration_points; i++) {
            e += 0.4714F * Math.sqrt(Math.pow(this.strain[i].get(0, 0) - this.strain[i].get(1, 0), 2) + Math.pow(this.strain[i].get(1, 0) - this.strain[i].get(2, 0), 2) + Math.pow(this.strain[i].get(2, 0) - this.strain[i].get(0, 0), 2) + 1.5 * (Math.pow(this.strain[i].get(3, 0), 2) + Math.pow(this.strain[i].get(4, 0), 2) + Math.pow(this.strain[i].get(5, 0), 2)));
            e /= this.number_of_integration_points;
            if (e > this.material[0].getFailureStrain()) {
               this.failed = true;
               return;
            }
         }
      }
      this.failed = false;
   }
   public String print_Gid(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH_HEADER: 
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Hexahedra Nnode 8\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\t" + this.node[2].getNumber() + "\t" + this.node[3].getNumber() + "\t" + this.node[4].getNumber() + "\t" + this.node[5].getNumber() + "\t" + this.node[6].getNumber() + "\t" + this.node[7].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Hexahedra \"MeshType" + this.type + "\"\n");
         out += "Number Of Gauss Points: " + this.number_of_integration_points + "\n";
         out += "Nodes Not Included\n";
         out += "Natural Coordinates: Given\n";
         if (this.number_of_integration_points == 1) {
            out += "0.0 0.0 0.0\n";
         } else if (this.number_of_integration_points == 8) {
            out += "-0.57735 -0.57735 -0.57735\n";
            out += "0.57735 -0.57735 -0.57735\n";
            out += "0.57735 0.57735 -0.57735\n";
            out += "-0.57735 0.57735 -0.57735\n";
            out += "-0.57735 -0.57735 0.57735\n";
            out += "0.57735 -0.57735 0.57735\n";
            out += "0.57735 0.57735 0.57735\n";
            out += "-0.57735 0.57735 0.57735\n";
         }
         out += "End GaussPoints\n";
         return out;
      
      case run.Element.RESULT_SUB_HEADER: 
         out = new String(" 3 2 0 \"Type" + this.type + "\"\n");
         return out;
      
      case run.Element.RESULT_STRESS_GLOBAL: 
         if (gpn == 0) {
            out = new String(this.number + " ");
         } else {
            out = new String("");
         }
         out += this.stress[gpn].get(0, 0) + "\t" + this.stress[gpn].get(1, 0) + "\t" + this.stress[gpn].get(2, 0) + "\t" + this.stress[gpn].get(3, 0) + "\t" + this.stress[gpn].get(4, 0) + "\t" + this.stress[gpn].get(5, 0) + "\n";
         return out;
      
      case run.Element.RESULT_STRAIN_GLOBAL: 
         if (gpn == 0) {
            out = new String(this.number + " ");
         } else {
            out = new String("");
         }
         out += this.strain[gpn].get(0, 0) + "\t" + this.strain[gpn].get(1, 0) + "\t" + this.strain[gpn].get(2, 0) + "\t" + this.strain[gpn].get(3, 0) + "\t" + this.strain[gpn].get(4, 0) + "\t" + this.strain[gpn].get(5, 0) + "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public String print_Fembic(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH: 
         out = new String(this.number + "\t nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "," + this.node[3].getNumber() + "," + this.node[4].getNumber() + "," + this.node[5].getNumber() + "," + this.node[6].getNumber() + "," + this.node[7].getNumber() + "]\t" + "material = " + this.material[0].getName() + "\t");
         if (this.NIP_is_set) out += " nip = " + this.number_of_integration_points;
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() throws IllegalArgumentException {
      double t = 1.0 / Math.sqrt(3);
      int i;
      int j;
      try {
         for (i = 0; i < this.number_of_integration_points; i++) {
            this.material[i] = (Material)this.material[0].copy();
         }
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      for (i = 0; i < this.number_of_integration_points; i++) {
         this.material[i].setInitialConditions();
      }
      if (this.number_of_integration_points == 1) {
         this.xsi[0] = 0;
         this.etha[0] = 0;
         this.phi[0] = 0;
         this.W[0] = 2.0;
      } else {
         this.xsi[0] = -t;
         this.xsi[1] = -t;
         this.xsi[2] = -t;
         this.xsi[3] = -t;
         this.xsi[4] = t;
         this.xsi[5] = t;
         this.xsi[6] = t;
         this.xsi[7] = t;
         this.etha[0] = -t;
         this.etha[1] = -t;
         this.etha[2] = t;
         this.etha[3] = t;
         this.etha[4] = -t;
         this.etha[5] = -t;
         this.etha[6] = t;
         this.etha[7] = t;
         this.phi[0] = t;
         this.phi[1] = -t;
         this.phi[2] = -t;
         this.phi[3] = t;
         this.phi[4] = t;
         this.phi[5] = -t;
         this.phi[6] = -t;
         this.phi[7] = t;
         this.W[0] = 1.0;
         this.W[1] = 1.0;
         this.W[2] = 1.0;
         this.W[3] = 1.0;
         this.W[4] = 1.0;
         this.W[5] = 1.0;
         this.W[6] = 1.0;
         this.W[7] = 1.0;
      }
      this.H.set(0, 0, 1.0);
      this.H.set(0, 1, 0);
      this.H.set(0, 2, 0);
      this.H.set(0, 3, 0);
      this.H.set(0, 4, 0);
      this.H.set(0, 5, 0);
      this.H.set(0, 6, 0);
      this.H.set(0, 7, 0);
      this.H.set(0, 8, 0);
      this.H.set(1, 0, 0);
      this.H.set(1, 1, 0);
      this.H.set(1, 2, 0);
      this.H.set(1, 3, 0);
      this.H.set(1, 4, 1.0);
      this.H.set(1, 5, 0);
      this.H.set(1, 6, 0);
      this.H.set(1, 7, 0);
      this.H.set(1, 8, 0);
      this.H.set(2, 0, 0);
      this.H.set(2, 1, 0);
      this.H.set(2, 2, 0);
      this.H.set(2, 3, 0);
      this.H.set(2, 4, 0);
      this.H.set(2, 5, 0);
      this.H.set(2, 6, 0);
      this.H.set(2, 7, 0);
      this.H.set(2, 8, 1.0);
      this.H.set(3, 0, 0);
      this.H.set(3, 1, 1.0);
      this.H.set(3, 2, 0);
      this.H.set(3, 3, 1.0);
      this.H.set(3, 4, 0);
      this.H.set(3, 5, 0);
      this.H.set(3, 6, 0);
      this.H.set(3, 7, 0);
      this.H.set(3, 8, 0);
      this.H.set(4, 0, 0);
      this.H.set(4, 1, 0);
      this.H.set(4, 2, 0);
      this.H.set(4, 3, 0);
      this.H.set(4, 4, 0);
      this.H.set(4, 5, 1.0);
      this.H.set(4, 6, 0);
      this.H.set(4, 7, 1.0);
      this.H.set(4, 8, 0);
      this.H.set(5, 0, 0);
      this.H.set(5, 1, 0);
      this.H.set(5, 2, 1.0);
      this.H.set(5, 3, 0);
      this.H.set(5, 4, 0);
      this.H.set(5, 5, 0);
      this.H.set(5, 6, 1.0);
      this.H.set(5, 7, 0);
      this.H.set(5, 8, 0);
      for (i = 0; i < 9; i++) {
         for (j = 0; j < 24; j++) {
            this.N.set(i, j, 0.0);
         }
      }
      for (i = 0; i < 9; i++) {
         for (j = 0; j < 9; j++) {
            this.P.set(i, j, 0.0);
         }
      }
   }
   public void updateLocalCoordinateSystem() {
   }
}
