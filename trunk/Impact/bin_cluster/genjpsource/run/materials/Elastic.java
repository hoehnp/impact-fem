package run.materials;
import run.*;

public class Elastic extends Material implements uka.patch.Patchable, uka.transport.Transportable, Cloneable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Elastic copy = (Elastic)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.NU_is_set, copy.NU_is_set)) copy.NU_is_set = this.NU_is_set;
      if (po.writeDiff(this.E_is_set, copy.E_is_set)) copy.E_is_set = this.E_is_set;
      if (po.writeDiff(this.youngs_modulus_initialized, copy.youngs_modulus_initialized)) copy.youngs_modulus_initialized = this.youngs_modulus_initialized;
      if (po.writeDiff(this.nu_initialized, copy.nu_initialized)) copy.nu_initialized = this.nu_initialized;
      copy.stiffness_matrix_plane_stress = this.stiffness_matrix_plane_stress = (Jama.Matrix)po.writeDiff(this.stiffness_matrix_plane_stress, copy.stiffness_matrix_plane_stress);
      copy.stiffness_matrix_3d = this.stiffness_matrix_3d = (Jama.Matrix)po.writeDiff(this.stiffness_matrix_3d, copy.stiffness_matrix_3d);
      copy.new_stress = this.new_stress = (Jama.Matrix)po.writeDiff(this.new_stress, copy.new_stress);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Elastic copy = (Elastic)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.NU_is_set = this.NU_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.E_is_set = this.E_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.youngs_modulus_initialized = this.youngs_modulus_initialized = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.nu_initialized = this.nu_initialized = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.stiffness_matrix_plane_stress = this.stiffness_matrix_plane_stress = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stiffness_matrix_3d = this.stiffness_matrix_3d = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.new_stress = this.new_stress = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.stiffness_matrix_plane_stress);
      c.descend(this.stiffness_matrix_3d);
      c.descend(this.new_stress);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.stiffness_matrix_plane_stress = (Jama.Matrix)f.filter(this.stiffness_matrix_plane_stress);
      this.stiffness_matrix_3d = (Jama.Matrix)f.filter(this.stiffness_matrix_3d);
      this.new_stress = (Jama.Matrix)f.filter(this.new_stress);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Elastic(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Elastic)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Elastic)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Elastic)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Elastic((Elastic)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Elastic)copy).deepCloneReferences((Elastic)orig, _helper);
         return false;
      }
      public Class getType() {
         return Elastic.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public Elastic(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Elastic._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.NU_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.E_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.youngs_modulus_initialized = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.nu_initialized = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(Elastic._SIZE);
      this.stiffness_matrix_plane_stress = (Jama.Matrix)_stream.readReference();
      this.stiffness_matrix_3d = (Jama.Matrix)_stream.readReference();
      this.new_stress = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Elastic._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.NU_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.E_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.youngs_modulus_initialized);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.nu_initialized);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.stiffness_matrix_plane_stress);
      _stream.writeReference(this.stiffness_matrix_3d);
      _stream.writeReference(this.new_stress);
   }
   public Elastic(Elastic _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.NU_is_set = _orig.NU_is_set;
      this.E_is_set = _orig.E_is_set;
      this.youngs_modulus_initialized = _orig.youngs_modulus_initialized;
      this.nu_initialized = _orig.nu_initialized;
   }
   public void deepCloneReferences(Elastic _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.stiffness_matrix_plane_stress = (Jama.Matrix)_helper.internalDeepClone(_orig.stiffness_matrix_plane_stress);
      this.stiffness_matrix_3d = (Jama.Matrix)_helper.internalDeepClone(_orig.stiffness_matrix_3d);
      this.new_stress = (Jama.Matrix)_helper.internalDeepClone(_orig.new_stress);
   }
   private Jama.Matrix new_stress;
   private boolean nu_initialized = false;
   private boolean youngs_modulus_initialized = false;
   private Jama.Matrix stiffness_matrix_3d;
   private Jama.Matrix stiffness_matrix_plane_stress;
   private boolean E_is_set;
   private boolean NU_is_set;
   public Elastic() {
      super();
      this.type = new String("ELASTIC");
      this.new_stress = new Jama.Matrix(6, 1);
      this.stiffness_matrix_3d = new Jama.Matrix(6, 6);
      this.stiffness_matrix_plane_stress = new Jama.Matrix(6, 6);
   }
   public void calculateStressOneDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      strain.plusEquals(dstrain);
      stress.set(0, 0, strain.get(0, 0) * this.youngs_modulus);
   }
   public void calculateStressThreeDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      strain.plusEquals(dstrain);
      stress.setMatrix(0, 5, 0, 0, this.stiffness_matrix_3d.times(strain));
   }
   public void calculateStressTwoDimensionalPlaneStress(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      stress.set(0, 0, stress.get(0, 0) + this.stiffness_matrix_plane_stress.get(0, 0) * dstrain.get(0, 0) + this.stiffness_matrix_plane_stress.get(0, 1) * dstrain.get(1, 0));
      stress.set(1, 0, stress.get(1, 0) + this.stiffness_matrix_plane_stress.get(1, 0) * dstrain.get(0, 0) + this.stiffness_matrix_plane_stress.get(1, 1) * dstrain.get(1, 0));
      stress.set(3, 0, stress.get(3, 0) + this.stiffness_matrix_plane_stress.get(3, 3) * dstrain.get(3, 0));
      stress.set(4, 0, stress.get(4, 0) + this.stiffness_matrix_plane_stress.get(4, 4) * dstrain.get(4, 0));
      stress.set(5, 0, stress.get(5, 0) + this.stiffness_matrix_plane_stress.get(5, 5) * dstrain.get(5, 0));
      dstrain.set(2, 0, -(this.nu / (1 - this.nu)) * (dstrain.get(0, 0) + dstrain.get(1, 0)));
      strain.plusEquals(dstrain);
   }
   public void parse_Fembic(Token[] arg, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < arg.length) {
         if (arg[i].getw().toUpperCase().equals("E") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.youngs_modulus = arg[i + 2].getn();
            this.youngs_modulus_initialized = true;
            i += 3;
            this.E_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("RHO") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.density = arg[i + 2].getn();
            this.density_is_set = true;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("NU") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.nu = arg[i + 2].getn();
            this.nu_initialized = true;
            i += 3;
            this.NU_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("FAILURE_STRAIN") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.failure_strain = arg[i + 2].getn();
            i += 3;
            this.failure_strain_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("FAILURE_STRESS") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.failure_stress = arg[i + 2].getn();
            i += 3;
            this.failure_stress_is_set = true;
         } else {
            throw new java.text.ParseException("Unknown material parameter in line ", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno) throws java.text.ParseException {
      int i = 0;
      int index;
      Constraint temp_constraint;
      Load temp_load;
      if (param[1].is_a_number()) {
         this.name = new String("Mat_" + (int)param[1].getn());
         this.name_is_set = true;
      } else throw new java.text.ParseException("Illegal identification number of MAT1: " + param[1].getn(), lineno);
      if (param[2].is_a_number()) {
         this.youngs_modulus = param[1].getn();
         this.E_is_set = true;
         this.youngs_modulus_initialized = true;
      } else {
         this.youngs_modulus = 2 * (1 + param[4].getn()) * param[3].getn();
         this.E_is_set = true;
         this.youngs_modulus_initialized = true;
      }
      if (param[4].is_a_number()) {
         this.nu = param[4].getn();
         this.NU_is_set = true;
         this.nu_initialized = true;
      } else {
         this.nu = this.youngs_modulus / (2 * param[3].getn()) - 1;
         this.NU_is_set = true;
         this.nu_initialized = true;
      }
      if (param[5].is_a_number()) {
         this.density = param[5].getn();
         this.density_is_set = true;
      } else throw new java.text.ParseException("Illegal density for MAT1: " + param[1].getn(), lineno);
   }
   public void parse_Gmsh(Token[] param, int lineno) throws java.text.ParseException {
      int index;
      if (param[2].is_a_number()) {
         index = (int)(param[2].getn() / 1000.0);
         index %= 100;
         this.name = new String("MAT_" + index);
         this.name_is_set = true;
      } else throw new java.text.ParseException("Illegal identification number of material " + param[1].getn(), lineno);
      this.youngs_modulus = 210;
      this.E_is_set = true;
      this.youngs_modulus_initialized = true;
      this.nu = 0.3;
      this.NU_is_set = true;
      this.nu_initialized = true;
      this.density = 7.8E-6;
      this.density_is_set = true;
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.E_is_set) {
         throw new IllegalArgumentException("No Youngs modulus defined for this material: " + this.name);
      }
      if (!this.density_is_set) {
         throw new IllegalArgumentException("No Density defined for this material: " + this.name);
      }
      if (!this.NU_is_set) {
         throw new IllegalArgumentException("No Poissons_constant defined for this material: " + this.name);
      }
   }
   public String print_Fembic(int ctrl) {
      String out;
      switch (ctrl) {
      case Element.MESH: 
         out = new String(this.name + "\tE = " + this.youngs_modulus + "\tRHO = " + this.density + "\tNU = " + this.nu);
         if (this.failure_strain_is_set) out += " failure_strain = " + this.failure_strain;
         if (this.failure_stress_is_set) out += " failure_stress = " + this.failure_stress;
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() {
      double c;
      double c2;
      double G;
      if (!this.density_is_set) {
         throw new IllegalArgumentException("Material density not intialized");
      } else if (!this.name_is_set) {
         throw new IllegalArgumentException("Material name not intialized");
      } else if (!this.nu_initialized) {
         throw new IllegalArgumentException("Material Poisson constant (nu) not intialized");
      } else if (!this.youngs_modulus_initialized) {
         throw new IllegalArgumentException("Material youngs_modulus not intialized");
      }
      c = this.youngs_modulus / ((1.0 + this.nu) * (1.0 - 2.0 * this.nu));
      c2 = this.youngs_modulus / (1.0 - this.nu * this.nu);
      G = this.youngs_modulus / (2.0 * (1.0 + this.nu));
      this.stiffness_matrix_3d.set(0, 0, (1.0 - this.nu) * c);
      this.stiffness_matrix_3d.set(0, 1, this.nu * c);
      this.stiffness_matrix_3d.set(0, 2, this.nu * c);
      this.stiffness_matrix_3d.set(0, 3, 0);
      this.stiffness_matrix_3d.set(0, 4, 0);
      this.stiffness_matrix_3d.set(0, 5, 0);
      this.stiffness_matrix_3d.set(1, 0, this.nu * c);
      this.stiffness_matrix_3d.set(1, 1, (1.0 - this.nu) * c);
      this.stiffness_matrix_3d.set(1, 2, this.nu * c);
      this.stiffness_matrix_3d.set(1, 3, 0);
      this.stiffness_matrix_3d.set(1, 4, 0);
      this.stiffness_matrix_3d.set(1, 5, 0);
      this.stiffness_matrix_3d.set(2, 0, this.nu * c);
      this.stiffness_matrix_3d.set(2, 1, this.nu * c);
      this.stiffness_matrix_3d.set(2, 2, (1.0 - this.nu) * c);
      this.stiffness_matrix_3d.set(2, 3, 0);
      this.stiffness_matrix_3d.set(2, 4, 0);
      this.stiffness_matrix_3d.set(2, 5, 0);
      this.stiffness_matrix_3d.set(3, 0, 0);
      this.stiffness_matrix_3d.set(3, 1, 0);
      this.stiffness_matrix_3d.set(3, 2, 0);
      this.stiffness_matrix_3d.set(3, 3, G / 2.0);
      this.stiffness_matrix_3d.set(3, 4, 0);
      this.stiffness_matrix_3d.set(3, 5, 0);
      this.stiffness_matrix_3d.set(4, 0, 0);
      this.stiffness_matrix_3d.set(4, 1, 0);
      this.stiffness_matrix_3d.set(4, 2, 0);
      this.stiffness_matrix_3d.set(4, 3, 0);
      this.stiffness_matrix_3d.set(4, 4, G / 2.0);
      this.stiffness_matrix_3d.set(4, 5, 0);
      this.stiffness_matrix_3d.set(5, 0, 0);
      this.stiffness_matrix_3d.set(5, 1, 0);
      this.stiffness_matrix_3d.set(5, 2, 0);
      this.stiffness_matrix_3d.set(5, 3, 0);
      this.stiffness_matrix_3d.set(5, 4, 0);
      this.stiffness_matrix_3d.set(5, 5, G / 2.0);
      this.stiffness_matrix_plane_stress.set(0, 0, c2);
      this.stiffness_matrix_plane_stress.set(0, 1, this.nu * c2);
      this.stiffness_matrix_plane_stress.set(0, 2, 0);
      this.stiffness_matrix_plane_stress.set(0, 3, 0);
      this.stiffness_matrix_plane_stress.set(0, 4, 0);
      this.stiffness_matrix_plane_stress.set(0, 5, 0);
      this.stiffness_matrix_plane_stress.set(1, 0, this.nu * c2);
      this.stiffness_matrix_plane_stress.set(1, 1, c2);
      this.stiffness_matrix_plane_stress.set(1, 2, 0);
      this.stiffness_matrix_plane_stress.set(1, 3, 0);
      this.stiffness_matrix_plane_stress.set(1, 4, 0);
      this.stiffness_matrix_plane_stress.set(1, 5, 0);
      this.stiffness_matrix_plane_stress.set(2, 0, 0);
      this.stiffness_matrix_plane_stress.set(2, 1, 0);
      this.stiffness_matrix_plane_stress.set(2, 2, 0);
      this.stiffness_matrix_plane_stress.set(2, 3, 0);
      this.stiffness_matrix_plane_stress.set(2, 4, 0);
      this.stiffness_matrix_plane_stress.set(2, 5, 0);
      this.stiffness_matrix_plane_stress.set(3, 0, 0);
      this.stiffness_matrix_plane_stress.set(3, 1, 0);
      this.stiffness_matrix_plane_stress.set(3, 2, 0);
      this.stiffness_matrix_plane_stress.set(3, 3, (1 - this.nu) * c2 / 2);
      this.stiffness_matrix_plane_stress.set(3, 4, 0);
      this.stiffness_matrix_plane_stress.set(3, 5, 0);
      this.stiffness_matrix_plane_stress.set(4, 0, 0);
      this.stiffness_matrix_plane_stress.set(4, 1, 0);
      this.stiffness_matrix_plane_stress.set(4, 2, 0);
      this.stiffness_matrix_plane_stress.set(4, 3, 0);
      this.stiffness_matrix_plane_stress.set(4, 4, 5.0 / 6.0 * (1 - this.nu) * c2 / 2);
      this.stiffness_matrix_plane_stress.set(4, 5, 0);
      this.stiffness_matrix_plane_stress.set(5, 0, 0);
      this.stiffness_matrix_plane_stress.set(5, 1, 0);
      this.stiffness_matrix_plane_stress.set(5, 2, 0);
      this.stiffness_matrix_plane_stress.set(5, 3, 0);
      this.stiffness_matrix_plane_stress.set(5, 4, 0);
      this.stiffness_matrix_plane_stress.set(5, 5, 5.0 / 6.0 * (1 - this.nu) * c2 / 2);
   }
   public double wavespeedOneDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus / this.density);
   }
   public double wavespeedThreeDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus * (1 - this.nu) / (this.density * (1 + this.nu) * (1 - 2 * this.nu)));
   }
   public double wavespeedTwoDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus / (this.density * (1 - this.nu * this.nu)));
   }
}
