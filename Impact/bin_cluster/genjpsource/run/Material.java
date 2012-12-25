package run;
import run.materials.*;

public abstract class Material implements uka.patch.Patchable, uka.transport.Transportable, Cloneable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Material copy = (Material)_copy;
      if (po.writeDiff(this.processed, copy.processed)) copy.processed = this.processed;
      if (po.writeDiff(this.failure_stress_is_set, copy.failure_stress_is_set)) copy.failure_stress_is_set = this.failure_stress_is_set;
      if (po.writeDiff(this.failure_strain_is_set, copy.failure_strain_is_set)) copy.failure_strain_is_set = this.failure_strain_is_set;
      if (po.writeDiff(this.failure_stress, copy.failure_stress)) copy.failure_stress = this.failure_stress;
      if (po.writeDiff(this.failure_strain, copy.failure_strain)) copy.failure_strain = this.failure_strain;
      if (po.writeDiff(this.youngs_modulus_is_set, copy.youngs_modulus_is_set)) copy.youngs_modulus_is_set = this.youngs_modulus_is_set;
      if (po.writeDiff(this.youngs_modulus, copy.youngs_modulus)) copy.youngs_modulus = this.youngs_modulus;
      if (po.writeDiff(this.density_is_set, copy.density_is_set)) copy.density_is_set = this.density_is_set;
      if (po.writeDiff(this.nu, copy.nu)) copy.nu = this.nu;
      if (po.writeDiff(this.density, copy.density)) copy.density = this.density;
      if (po.writeDiff(this.name_is_set, copy.name_is_set)) copy.name_is_set = this.name_is_set;
      copy.type = this.type = (java.lang.String)po.writeDiff(this.type, copy.type);
      copy.name = this.name = (java.lang.String)po.writeDiff(this.name, copy.name);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Material copy = (Material)_copy;
      if (pi.hasDiff()) copy.processed = this.processed = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.failure_stress_is_set = this.failure_stress_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.failure_strain_is_set = this.failure_strain_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.failure_stress = this.failure_stress = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.failure_strain = this.failure_strain = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.youngs_modulus_is_set = this.youngs_modulus_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.youngs_modulus = this.youngs_modulus = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.density_is_set = this.density_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.nu = this.nu = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.density = this.density = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.name_is_set = this.name_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.type = this.type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.name = this.name = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.type);
      c.descend(this.name);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.type = (java.lang.String)f.filter(this.type);
      this.name = (java.lang.String)f.filter(this.name);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean;
   public Material(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Material._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.processed = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.failure_stress_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.failure_strain_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.failure_stress = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.failure_strain = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.youngs_modulus_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.youngs_modulus = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.density_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.nu = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.density = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.name_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(Material._SIZE);
      this.type = (java.lang.String)_stream.readReference();
      this.name = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Material._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.processed);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failure_stress_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failure_strain_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failure_stress);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failure_strain);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.youngs_modulus_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.youngs_modulus);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.density_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.nu);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.density);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.name_is_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.type);
      _stream.writeReference(this.name);
   }
   public Material(Material _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.processed = _orig.processed;
      this.failure_stress_is_set = _orig.failure_stress_is_set;
      this.failure_strain_is_set = _orig.failure_strain_is_set;
      this.failure_stress = _orig.failure_stress;
      this.failure_strain = _orig.failure_strain;
      this.youngs_modulus_is_set = _orig.youngs_modulus_is_set;
      this.youngs_modulus = _orig.youngs_modulus;
      this.density_is_set = _orig.density_is_set;
      this.nu = _orig.nu;
      this.density = _orig.density;
      this.name_is_set = _orig.name_is_set;
   }
   public void deepCloneReferences(Material _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.type = (java.lang.String)_helper.internalDeepClone(_orig.type);
      this.name = (java.lang.String)_helper.internalDeepClone(_orig.name);
   }
   protected java.lang.String name;
   protected boolean name_is_set = false;
   protected double density;
   protected double nu;
   protected boolean density_is_set = false;
   protected double youngs_modulus;
   protected boolean youngs_modulus_is_set = false;
   protected double failure_strain;
   protected double failure_stress;
   protected boolean failure_strain_is_set = false;
   protected boolean failure_stress_is_set = false;
   protected boolean processed;
   protected String type;
   public Material() {
      super();
   }
   public abstract void calculateStressOneDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep);
   public abstract void calculateStressThreeDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep);
   public abstract void calculateStressTwoDimensionalPlaneStress(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep);
   public Object copy() throws CloneNotSupportedException {
      Object o = null;
      o = super.clone();
      return o;
   }
   public double getDensity() {
      return this.density;
   }
   public double getNu() {
      return this.nu;
   }
   public java.lang.String getName() {
      return this.name;
   }
   protected double getNumber(int nr, String arg) throws java.lang.IllegalArgumentException {
      int i;
      int index;
      int nextindex;
      double value;
      index = 0;
      for (i = 0; i < nr; i++) {
         index = arg.indexOf(',', index + 1);
      }
      nextindex = arg.indexOf(',', index + 1);
      if (nextindex == -1) {
         nextindex = arg.length() - 1;
      }
      if (index == -1) {
         throw new IllegalArgumentException("Incorrect amount of numbers defined");
      }
      value = Double.valueOf(arg.substring(index + 1, nextindex)).doubleValue();
      return value;
   }
   public double getYoungsModulus() {
      return this.youngs_modulus;
   }
   public double getFailureStrain() {
      return this.failure_strain;
   }
   public boolean failureStrainIsSet() {
      return this.failure_strain_is_set;
   }
   public double getFailureStress() {
      return this.failure_stress;
   }
   public boolean failureStressIsSet() {
      return this.failure_stress_is_set;
   }
   protected int numberOfPoints(String arg) throws java.lang.IllegalArgumentException {
      int i;
      int index;
      index = 0;
      i = 0;
      do {
         index = arg.indexOf(',', index + 1);
         i++;
      }       while (index != -1);
      i = i / 2;
      return i;
   }
   public static Material getMaterialOfType_Gmsh(int type) throws java.lang.IllegalArgumentException {
      return new Elastic();
   }
   public static Material getMaterialOfType_Nastran(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("MAT1")) {
         return new Elastic();
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public static Material getMaterialOfType_Fembic(String type) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("ELASTIC")) {
         return new Elastic();
      }
      if (type.toUpperCase().equals("ELASTOPLASTIC")) {
         return new Elastoplastic();
      }
      if (type.toUpperCase().equals("THERMOELASTOPLASTIC")) {
         return new ThermoElastoplastic();
      }
      if (type.toUpperCase().equals("SPRING")) {
         return new SpringMaterial();
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public abstract void parse_Fembic(Token[] arg, int lineno) throws java.text.ParseException;
   public abstract void parse_Nastran(Token[] arg, int lineno) throws java.text.ParseException;
   public abstract void parse_Gmsh(Token[] arg, int lineno) throws java.text.ParseException;
   public abstract String print_Fembic(int ctrl);
   public abstract void checkIndata() throws IllegalArgumentException;
   public abstract void setInitialConditions();
   public void setName(java.lang.String newName) {
      this.name = new String(newName);
      this.name_is_set = true;
   }
   public abstract double wavespeedOneDimensional(double param, double param2);
   public abstract double wavespeedThreeDimensional(double param, double param2);
   public abstract double wavespeedTwoDimensional(double param, double param2);
   public boolean isProcessed() {
      return this.processed;
   }
   public void setProcessed(boolean processed) {
      this.processed = processed;
   }
   public String getType() {
      return this.type;
   }
}
