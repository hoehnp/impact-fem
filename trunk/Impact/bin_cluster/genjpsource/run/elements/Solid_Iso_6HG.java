package run.elements;
import run.*;

import java.util.*;

public class Solid_Iso_6HG extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Solid_Iso_6HG copy = (Solid_Iso_6HG)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.NIP_is_set, copy.NIP_is_set)) copy.NIP_is_set = this.NIP_is_set;
      if (po.writeDiff(this.AHR_is_set, copy.AHR_is_set)) copy.AHR_is_set = this.AHR_is_set;
      if (po.writeDiff(this.AHR, copy.AHR)) copy.AHR = this.AHR;
      if (po.writeDiff(this.etha, copy.etha)) copy.etha = this.etha;
      if (po.writeDiff(this.phi, copy.phi)) copy.phi = this.phi;
      if (po.writeDiff(this.xsi, copy.xsi)) copy.xsi = this.xsi;
      if (po.writeDiff(this.number_of_integration_points, copy.number_of_integration_points)) copy.number_of_integration_points = this.number_of_integration_points;
      copy.W = this.W = (double[])po.writeDiff(this.W, copy.W);
      copy.P = this.P = (Jama.Matrix)po.writeDiff(this.P, copy.P);
      copy.f = this.f = (Jama.Matrix)po.writeDiff(this.f, copy.f);
      copy.d = this.d = (Jama.Matrix)po.writeDiff(this.d, copy.d);
      copy.elemp = this.elemp = (double[][])po.writeDiff(this.elemp, copy.elemp);
      copy.hforce = this.hforce = (Jama.Matrix[])po.writeDiff(this.hforce, copy.hforce);
      copy.stress = this.stress = (Jama.Matrix)po.writeDiff(this.stress, copy.stress);
      copy.dstrain = this.dstrain = (Jama.Matrix)po.writeDiff(this.dstrain, copy.dstrain);
      copy.strain = this.strain = (Jama.Matrix)po.writeDiff(this.strain, copy.strain);
      copy.J_inv = this.J_inv = (Jama.Matrix)po.writeDiff(this.J_inv, copy.J_inv);
      copy.J = this.J = (Jama.Matrix)po.writeDiff(this.J, copy.J);
      copy.B = this.B = (Jama.Matrix)po.writeDiff(this.B, copy.B);
      copy.N = this.N = (Jama.Matrix)po.writeDiff(this.N, copy.N);
      copy.M = this.M = (Jama.Matrix)po.writeDiff(this.M, copy.M);
      copy.H = this.H = (Jama.Matrix)po.writeDiff(this.H, copy.H);
      copy.D = this.D = (Jama.Matrix)po.writeDiff(this.D, copy.D);
      copy.material = this.material = (run.Material[])po.writeDiff(this.material, copy.material);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Solid_Iso_6HG copy = (Solid_Iso_6HG)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.NIP_is_set = this.NIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.AHR_is_set = this.AHR_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.AHR = this.AHR = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.etha = this.etha = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.phi = this.phi = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.xsi = this.xsi = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.number_of_integration_points = this.number_of_integration_points = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.W = this.W = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.P = this.P = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.f = this.f = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.d = this.d = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.elemp = this.elemp = (double[][])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hforce = this.hforce = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stress = this.stress = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dstrain = this.dstrain = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strain = this.strain = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.J_inv = this.J_inv = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.J = this.J = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.B = this.B = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.N = this.N = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.M = this.M = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.H = this.H = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.D = this.D = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.material = this.material = (run.Material[])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.W);
      c.descend(this.P);
      c.descend(this.f);
      c.descend(this.d);
      c.descend(this.elemp);
      c.descend(this.hforce);
      c.descend(this.stress);
      c.descend(this.dstrain);
      c.descend(this.strain);
      c.descend(this.J_inv);
      c.descend(this.J);
      c.descend(this.B);
      c.descend(this.N);
      c.descend(this.M);
      c.descend(this.H);
      c.descend(this.D);
      c.descend(this.material);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.W = (double[])f.filter(this.W);
      this.P = (Jama.Matrix)f.filter(this.P);
      this.f = (Jama.Matrix)f.filter(this.f);
      this.d = (Jama.Matrix)f.filter(this.d);
      this.elemp = (double[][])f.filter(this.elemp);
      this.hforce = (Jama.Matrix[])f.filter(this.hforce);
      this.stress = (Jama.Matrix)f.filter(this.stress);
      this.dstrain = (Jama.Matrix)f.filter(this.dstrain);
      this.strain = (Jama.Matrix)f.filter(this.strain);
      this.J_inv = (Jama.Matrix)f.filter(this.J_inv);
      this.J = (Jama.Matrix)f.filter(this.J);
      this.B = (Jama.Matrix)f.filter(this.B);
      this.N = (Jama.Matrix)f.filter(this.N);
      this.M = (Jama.Matrix)f.filter(this.M);
      this.H = (Jama.Matrix)f.filter(this.H);
      this.D = (Jama.Matrix)f.filter(this.D);
      this.material = (run.Material[])f.filter(this.material);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Solid_Iso_6HG(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Solid_Iso_6HG)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Solid_Iso_6HG)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Solid_Iso_6HG)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Solid_Iso_6HG((Solid_Iso_6HG)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Solid_Iso_6HG)copy).deepCloneReferences((Solid_Iso_6HG)orig, _helper);
         return false;
      }
      public Class getType() {
         return Solid_Iso_6HG.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int;
   public Solid_Iso_6HG(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Solid_Iso_6HG._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Material_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.NIP_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.AHR_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.AHR = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.etha = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.phi = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.xsi = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.number_of_integration_points = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(Solid_Iso_6HG._SIZE);
      this.W = (double[])_stream.readReference();
      this.P = (Jama.Matrix)_stream.readReference();
      this.f = (Jama.Matrix)_stream.readReference();
      this.d = (Jama.Matrix)_stream.readReference();
      this.elemp = (double[][])_stream.readReference();
      this.hforce = (Jama.Matrix[])_stream.readReference();
      this.stress = (Jama.Matrix)_stream.readReference();
      this.dstrain = (Jama.Matrix)_stream.readReference();
      this.strain = (Jama.Matrix)_stream.readReference();
      this.J_inv = (Jama.Matrix)_stream.readReference();
      this.J = (Jama.Matrix)_stream.readReference();
      this.B = (Jama.Matrix)_stream.readReference();
      this.N = (Jama.Matrix)_stream.readReference();
      this.M = (Jama.Matrix)_stream.readReference();
      this.H = (Jama.Matrix)_stream.readReference();
      this.D = (Jama.Matrix)_stream.readReference();
      this.material = (run.Material[])_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Solid_Iso_6HG._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Material_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.NIP_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.AHR_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.AHR);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.etha);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.phi);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.xsi);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_integration_points);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.W);
      _stream.writeReference(this.P);
      _stream.writeReference(this.f);
      _stream.writeReference(this.d);
      _stream.writeReference(this.elemp);
      _stream.writeReference(this.hforce);
      _stream.writeReference(this.stress);
      _stream.writeReference(this.dstrain);
      _stream.writeReference(this.strain);
      _stream.writeReference(this.J_inv);
      _stream.writeReference(this.J);
      _stream.writeReference(this.B);
      _stream.writeReference(this.N);
      _stream.writeReference(this.M);
      _stream.writeReference(this.H);
      _stream.writeReference(this.D);
      _stream.writeReference(this.material);
   }
   public Solid_Iso_6HG(Solid_Iso_6HG _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Material_is_set = _orig.Material_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.NIP_is_set = _orig.NIP_is_set;
      this.AHR_is_set = _orig.AHR_is_set;
      this.AHR = _orig.AHR;
      this.etha = _orig.etha;
      this.phi = _orig.phi;
      this.xsi = _orig.xsi;
      this.number_of_integration_points = _orig.number_of_integration_points;
   }
   public void deepCloneReferences(Solid_Iso_6HG _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.W = (double[])_helper.internalDeepClone(_orig.W);
      this.P = (Jama.Matrix)_helper.internalDeepClone(_orig.P);
      this.f = (Jama.Matrix)_helper.internalDeepClone(_orig.f);
      this.d = (Jama.Matrix)_helper.internalDeepClone(_orig.d);
      this.elemp = (double[][])_helper.internalDeepClone(_orig.elemp);
      this.hforce = (Jama.Matrix[])_helper.internalDeepClone(_orig.hforce);
      this.stress = (Jama.Matrix)_helper.internalDeepClone(_orig.stress);
      this.dstrain = (Jama.Matrix)_helper.internalDeepClone(_orig.dstrain);
      this.strain = (Jama.Matrix)_helper.internalDeepClone(_orig.strain);
      this.J_inv = (Jama.Matrix)_helper.internalDeepClone(_orig.J_inv);
      this.J = (Jama.Matrix)_helper.internalDeepClone(_orig.J);
      this.B = (Jama.Matrix)_helper.internalDeepClone(_orig.B);
      this.N = (Jama.Matrix)_helper.internalDeepClone(_orig.N);
      this.M = (Jama.Matrix)_helper.internalDeepClone(_orig.M);
      this.H = (Jama.Matrix)_helper.internalDeepClone(_orig.H);
      this.D = (Jama.Matrix)_helper.internalDeepClone(_orig.D);
      this.material = (run.Material[])_helper.internalDeepClone(_orig.material);
   }
   private Material[] material;
   private Jama.Matrix D;
   private int number_of_integration_points;
   private double xsi;
   private double phi;
   private double etha;
   private double AHR;
   private Jama.Matrix H;
   private Jama.Matrix M;
   private Jama.Matrix N;
   private Jama.Matrix B;
   private Jama.Matrix J;
   private Jama.Matrix J_inv;
   private Jama.Matrix strain;
   private Jama.Matrix dstrain;
   private Jama.Matrix stress;
   private Jama.Matrix[] hforce;
   private double[][] elemp;
   private Jama.Matrix d;
   private Jama.Matrix f;
   private Jama.Matrix P;
   private double[] W;
   private boolean AHR_is_set;
   private boolean NIP_is_set;
   private boolean Nodes_are_set;
   private boolean Material_is_set;
   public Solid_Iso_6HG() {
      super();
      this.type = new String("SOLID_ISO_6HG");
      int i;
      this.material = new Material[1];
      this.xsi = 0;
      this.etha = 0;
      this.phi = 0;
      this.node = new Node[8];
      this.W = new double[1];
      this.H = new Jama.Matrix(6, 9);
      this.M = new Jama.Matrix(8, 3);
      this.d = new Jama.Matrix(24, 1);
      this.f = new Jama.Matrix(24, 1);
      this.B = new Jama.Matrix(6, 24);
      this.D = new Jama.Matrix(3, 8);
      this.J = new Jama.Matrix(3, 3);
      this.J_inv = new Jama.Matrix(3, 3);
      this.P = new Jama.Matrix(9, 9);
      this.N = new Jama.Matrix(9, 24);
      this.strain = new Jama.Matrix(6, 1);
      this.dstrain = new Jama.Matrix(6, 1);
      this.stress = new Jama.Matrix(6, 1);
      this.hforce = new Jama.Matrix[8];
      for (i = 0; i < 8; i++) {
         this.hforce[i] = new Jama.Matrix(3, 1);
      }
      this.number_of_integration_points = 1;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      int i;
      int j;
      int k;
      Jama.Matrix mass;
      double total_mass;
      double s;
      double det_j;
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
      this.J = this.D.times(this.M);
      det_j = this.J.det();
      mass = this.N.transpose().times(this.N).times(this.material[0].getDensity()).times(det_j).times(8.0);
      for (j = 0; j < 24; j++) {
         for (k = 0; k < 24; k++) {
            mass.set(j, k, j == k ? mass.get(j, k) : 0);
         }
      }
      total_mass = this.material[0].getDensity() * det_j * 8;
      if (total_mass <= 0) {
         throw new IllegalArgumentException("Error in Solid Hexahedron Element " + this.number + ". Element mass is zero or negative.\nMaterial density: " + this.material[0].getDensity());
      }
      if (det_j <= 0) {
         throw new IllegalArgumentException("Error in Solid Hexahedron Element " + this.number + ". Element Volume is zero or negative. Check node defintion in indata file.");
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
   public void calculateContactForces() {
   }
   private void calculateD(double xsi, double phi, double etha) {
      this.D.set(0, 0, -(1.0 / 8));
      this.D.set(0, 1, +(1.0 / 8));
      this.D.set(0, 2, +(1.0 / 8));
      this.D.set(0, 3, -(1.0 / 8));
      this.D.set(0, 4, -(1.0 / 8));
      this.D.set(0, 5, +(1.0 / 8));
      this.D.set(0, 6, +(1.0 / 8));
      this.D.set(0, 7, -(1.0 / 8));
      this.D.set(1, 0, -(1.0 / 8));
      this.D.set(1, 1, -(1.0 / 8));
      this.D.set(1, 2, 1.0 / 8);
      this.D.set(1, 3, 1.0 / 8);
      this.D.set(1, 4, -(1.0 / 8));
      this.D.set(1, 5, -(1.0 / 8));
      this.D.set(1, 6, 1.0 / 8);
      this.D.set(1, 7, 1.0 / 8);
      this.D.set(2, 0, -(1.0 / 8));
      this.D.set(2, 1, -(1.0 / 8));
      this.D.set(2, 2, -(1.0 / 8));
      this.D.set(2, 3, -(1.0 / 8));
      this.D.set(2, 4, 1.0 / 8);
      this.D.set(2, 5, 1.0 / 8);
      this.D.set(2, 6, 1.0 / 8);
      this.D.set(2, 7, 1.0 / 8);
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
   public void calculateNodalForces(int dummy, double dt) {
      int n;
      int i;
      int j;
      int k;
      int l;
      Jama.Matrix global_force;
      double A = 0;
      double vol = 0;
      double S0 = 0;
      double G = 0;
      double[][] X;
      double[][] V;
      double[][] BB;
      double[][] GS = {{1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0}, {1.0, -1.0, -1.0, 1.0, -1.0, 1.0, 1.0, -1.0}, {1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0}, {-1.0, 1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0}};
      double[][] GB = {{1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0}, {1.0, -1.0, -1.0, 1.0, -1.0, 1.0, 1.0, -1.0}, {1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0}, {-1.0, 1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0}};
      this.f = this.B.transpose().times(this.stress).times(this.J.det()).times(8);
      for (n = 0; n < 8; n++) {
         global_force = this.f.getMatrix(3 * n, 3 * n + 2, 0, 0);
         this.node[n].addInternalForce(global_force.times(-1.0));
      }
      BB = this.B.getArray();
      vol = 8 * this.J.det();
   }
   public void calculateStrain(double tstep, int i) {
      int j;
      calculateD(this.xsi, this.phi, this.etha);
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
      this.J = this.D.times(this.M);
      this.J_inv = this.J.inverse();
      this.P.setMatrix(0, 2, 0, 2, this.J_inv);
      this.P.setMatrix(3, 5, 3, 5, this.J_inv);
      this.P.setMatrix(6, 8, 6, 8, this.J_inv);
      this.B = this.H.times(this.P.times(this.N));
      this.dstrain = this.B.times(this.d);
   }
   public void calculateStress(int i, double timestep) {
      this.material[i].calculateStressThreeDimensional(this.strain, this.dstrain, this.stress, timestep);
   }
   public double checkTimestep(double current_timestep) {
      double critical_length;
      double timestep;
      double c;
      critical_length = Math.sqrt((this.node[1].getX_pos() - this.node[0].getX_pos()) * (this.node[1].getX_pos() - this.node[0].getX_pos()) + (this.node[1].getY_pos() - this.node[0].getY_pos()) * (this.node[1].getY_pos() - this.node[0].getY_pos()) + (this.node[1].getZ_pos() - this.node[0].getZ_pos()) * (this.node[1].getZ_pos() - this.node[0].getZ_pos()));
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
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3,nodenr4,nodenr5,nodenr6,nodenr7,nodenr8]", lineno);
            }
            try {
               for (j = 0; j < 8; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
               }
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException(e.getMessage(), lineno);
            }
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
         } else if (param[i].getw().toUpperCase().equals("AHR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.AHR = param[i + 2].getn();
            i += 3;
            this.AHR_is_set = true;
         } else {
            throw new java.text.ParseException("Unknown Solid (Hexahedran) element parameter ", lineno);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Solid_Iso_6 element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for Solid_Iso_6 element nr" + this.number);
      }
      if (!this.AHR_is_set) {
         throw new IllegalArgumentException("No Hourglass parameter AHR set for Solid_Iso_6HG element nr" + this.number);
      }
   }
   public void checkIfFailed() {
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
         return out;
      
      case run.Element.RESULT_STRAIN_GLOBAL: 
         if (gpn == 0) {
            out = new String(this.number + " ");
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
