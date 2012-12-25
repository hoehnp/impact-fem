package run.materials;
import run.*;

public class ThermoElastoplastic extends Material implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      ThermoElastoplastic copy = (ThermoElastoplastic)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.isInitialTemperature, copy.isInitialTemperature)) copy.isInitialTemperature = this.isInitialTemperature;
      if (po.writeDiff(this.temperature, copy.temperature)) copy.temperature = this.temperature;
      if (po.writeDiff(this.thermal_expantion, copy.thermal_expantion)) copy.thermal_expantion = this.thermal_expantion;
      if (po.writeDiff(this.temperature_is_set, copy.temperature_is_set)) copy.temperature_is_set = this.temperature_is_set;
      if (po.writeDiff(this.thermal_expantion_is_set, copy.thermal_expantion_is_set)) copy.thermal_expantion_is_set = this.thermal_expantion_is_set;
      if (po.writeDiff(this.TOL_is_set, copy.TOL_is_set)) copy.TOL_is_set = this.TOL_is_set;
      if (po.writeDiff(this.EP_is_required, copy.EP_is_required)) copy.EP_is_required = this.EP_is_required;
      if (po.writeDiff(this.EP_is_set, copy.EP_is_set)) copy.EP_is_set = this.EP_is_set;
      if (po.writeDiff(this.YIELD_is_set, copy.YIELD_is_set)) copy.YIELD_is_set = this.YIELD_is_set;
      if (po.writeDiff(this.RHO_is_set, copy.RHO_is_set)) copy.RHO_is_set = this.RHO_is_set;
      if (po.writeDiff(this.NU_is_set, copy.NU_is_set)) copy.NU_is_set = this.NU_is_set;
      if (po.writeDiff(this.E_is_set, copy.E_is_set)) copy.E_is_set = this.E_is_set;
      if (po.writeDiff(this.eps_vel, copy.eps_vel)) copy.eps_vel = this.eps_vel;
      if (po.writeDiff(this.eps, copy.eps)) copy.eps = this.eps;
      if (po.writeDiff(this.V_is_set, copy.V_is_set)) copy.V_is_set = this.V_is_set;
      if (po.writeDiff(this.Y_is_set, copy.Y_is_set)) copy.Y_is_set = this.Y_is_set;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      copy.I = this.I = (Jama.Matrix)po.writeDiff(this.I, copy.I);
      copy.A = this.A = (Jama.Matrix)po.writeDiff(this.A, copy.A);
      copy.trial_stress = this.trial_stress = (Jama.Matrix)po.writeDiff(this.trial_stress, copy.trial_stress);
      copy.stiffness_matrix_plane_stress = this.stiffness_matrix_plane_stress = (Jama.Matrix)po.writeDiff(this.stiffness_matrix_plane_stress, copy.stiffness_matrix_plane_stress);
      copy.stiffness_matrix_3d = this.stiffness_matrix_3d = (Jama.Matrix)po.writeDiff(this.stiffness_matrix_3d, copy.stiffness_matrix_3d);
      copy.V = this.V = (double[])po.writeDiff(this.V, copy.V);
      copy.yield_array = this.yield_array = (run.Variable[])po.writeDiff(this.yield_array, copy.yield_array);
      copy.yield_stress = this.yield_stress = (run.Variable)po.writeDiff(this.yield_stress, copy.yield_stress);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      ThermoElastoplastic copy = (ThermoElastoplastic)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.isInitialTemperature = this.isInitialTemperature = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.temperature = this.temperature = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.thermal_expantion = this.thermal_expantion = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.temperature_is_set = this.temperature_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.thermal_expantion_is_set = this.thermal_expantion_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.TOL_is_set = this.TOL_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.EP_is_required = this.EP_is_required = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.EP_is_set = this.EP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.YIELD_is_set = this.YIELD_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.RHO_is_set = this.RHO_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.NU_is_set = this.NU_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.E_is_set = this.E_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.eps_vel = this.eps_vel = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.eps = this.eps = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.V_is_set = this.V_is_set = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.Y_is_set = this.Y_is_set = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.I = this.I = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.A = this.A = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trial_stress = this.trial_stress = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stiffness_matrix_plane_stress = this.stiffness_matrix_plane_stress = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stiffness_matrix_3d = this.stiffness_matrix_3d = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.V = this.V = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.yield_array = this.yield_array = (run.Variable[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.yield_stress = this.yield_stress = (run.Variable)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.I);
      c.descend(this.A);
      c.descend(this.trial_stress);
      c.descend(this.stiffness_matrix_plane_stress);
      c.descend(this.stiffness_matrix_3d);
      c.descend(this.V);
      c.descend(this.yield_array);
      c.descend(this.yield_stress);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.I = (Jama.Matrix)f.filter(this.I);
      this.A = (Jama.Matrix)f.filter(this.A);
      this.trial_stress = (Jama.Matrix)f.filter(this.trial_stress);
      this.stiffness_matrix_plane_stress = (Jama.Matrix)f.filter(this.stiffness_matrix_plane_stress);
      this.stiffness_matrix_3d = (Jama.Matrix)f.filter(this.stiffness_matrix_3d);
      this.V = (double[])f.filter(this.V);
      this.yield_array = (run.Variable[])f.filter(this.yield_array);
      this.yield_stress = (run.Variable)f.filter(this.yield_stress);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new ThermoElastoplastic(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((ThermoElastoplastic)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ThermoElastoplastic)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ThermoElastoplastic)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new ThermoElastoplastic((ThermoElastoplastic)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((ThermoElastoplastic)copy).deepCloneReferences((ThermoElastoplastic)orig, _helper);
         return false;
      }
      public Class getType() {
         return ThermoElastoplastic.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double;
   public ThermoElastoplastic(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(ThermoElastoplastic._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.isInitialTemperature = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.temperature = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.thermal_expantion = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.temperature_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.thermal_expantion_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.TOL_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.EP_is_required = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.EP_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.YIELD_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.RHO_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.NU_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.E_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.eps_vel = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.eps = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.V_is_set = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.Y_is_set = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(ThermoElastoplastic._SIZE);
      this.I = (Jama.Matrix)_stream.readReference();
      this.A = (Jama.Matrix)_stream.readReference();
      this.trial_stress = (Jama.Matrix)_stream.readReference();
      this.stiffness_matrix_plane_stress = (Jama.Matrix)_stream.readReference();
      this.stiffness_matrix_3d = (Jama.Matrix)_stream.readReference();
      this.V = (double[])_stream.readReference();
      this.yield_array = (run.Variable[])_stream.readReference();
      this.yield_stress = (run.Variable)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(ThermoElastoplastic._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.isInitialTemperature);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.temperature);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.thermal_expantion);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.temperature_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.thermal_expantion_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.TOL_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.EP_is_required);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.EP_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.YIELD_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.RHO_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.NU_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.E_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.eps_vel);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.eps);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.V_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Y_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.I);
      _stream.writeReference(this.A);
      _stream.writeReference(this.trial_stress);
      _stream.writeReference(this.stiffness_matrix_plane_stress);
      _stream.writeReference(this.stiffness_matrix_3d);
      _stream.writeReference(this.V);
      _stream.writeReference(this.yield_array);
      _stream.writeReference(this.yield_stress);
   }
   public ThermoElastoplastic(ThermoElastoplastic _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.isInitialTemperature = _orig.isInitialTemperature;
      this.temperature = _orig.temperature;
      this.thermal_expantion = _orig.thermal_expantion;
      this.temperature_is_set = _orig.temperature_is_set;
      this.thermal_expantion_is_set = _orig.thermal_expantion_is_set;
      this.TOL_is_set = _orig.TOL_is_set;
      this.EP_is_required = _orig.EP_is_required;
      this.EP_is_set = _orig.EP_is_set;
      this.YIELD_is_set = _orig.YIELD_is_set;
      this.RHO_is_set = _orig.RHO_is_set;
      this.NU_is_set = _orig.NU_is_set;
      this.E_is_set = _orig.E_is_set;
      this.eps_vel = _orig.eps_vel;
      this.eps = _orig.eps;
      this.V_is_set = _orig.V_is_set;
      this.Y_is_set = _orig.Y_is_set;
      this.factor = _orig.factor;
   }
   public void deepCloneReferences(ThermoElastoplastic _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.I = (Jama.Matrix)_helper.internalDeepClone(_orig.I);
      this.A = (Jama.Matrix)_helper.internalDeepClone(_orig.A);
      this.trial_stress = (Jama.Matrix)_helper.internalDeepClone(_orig.trial_stress);
      this.stiffness_matrix_plane_stress = (Jama.Matrix)_helper.internalDeepClone(_orig.stiffness_matrix_plane_stress);
      this.stiffness_matrix_3d = (Jama.Matrix)_helper.internalDeepClone(_orig.stiffness_matrix_3d);
      this.V = (double[])_helper.internalDeepClone(_orig.V);
      this.yield_array = (run.Variable[])_helper.internalDeepClone(_orig.yield_array);
      this.yield_stress = (run.Variable)_helper.internalDeepClone(_orig.yield_stress);
   }
   private Variable yield_stress;
   private Variable[] yield_array;
   private double[] V;
   private double factor;
   private int Y_is_set;
   private int V_is_set;
   private Jama.Matrix stiffness_matrix_3d;
   private Jama.Matrix stiffness_matrix_plane_stress;
   private Jama.Matrix trial_stress;
   private double eps;
   private double eps_vel;
   private Jama.Matrix A;
   private Jama.Matrix I;
   private boolean E_is_set;
   private boolean NU_is_set;
   private boolean RHO_is_set;
   private boolean YIELD_is_set;
   private boolean EP_is_set;
   private boolean EP_is_required;
   private boolean TOL_is_set;
   private boolean thermal_expantion_is_set;
   private boolean temperature_is_set;
   private double thermal_expantion;
   private double temperature;
   private boolean isInitialTemperature;
   public ThermoElastoplastic() {
      super();
      this.type = new String("THERMOELASTOPLASTIC");
      this.trial_stress = new Jama.Matrix(6, 1);
      this.stiffness_matrix_3d = new Jama.Matrix(6, 6);
      this.stiffness_matrix_plane_stress = new Jama.Matrix(6, 6);
      this.A = new Jama.Matrix(6, 6);
      this.I = new Jama.Matrix(6, 6);
      this.eps = 0;
      this.eps_vel = 0;
      this.thermal_expantion = 0;
      this.temperature = 0;
      this.isInitialTemperature = false;
   }
   public void calculateStressOneDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      double yield_function;
      double strain_vel;
      if (!this.isInitialTemperature) {
         strain.set(0, 0, -this.thermal_expantion * this.temperature);
         this.isInitialTemperature = !this.isInitialTemperature;
      }
      strain.plusEquals(dstrain);
      stress.set(0, 0, this.youngs_modulus * strain.get(0, 0));
      yield_function = Math.abs(stress.get(0, 0)) - this.yieldStress(this.eps, this.eps_vel);
      if (yield_function > 0) {
         this.eps_vel = Math.abs(dstrain.get(0, 0) / timestep);
         this.eps += Math.abs(dstrain.get(0, 0));
         stress.set(0, 0, yieldStress(this.eps, this.eps_vel));
      }
   }
   public void calculateStressThreeDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      double pressure;
      double vm_stress;
      if (!this.isInitialTemperature) {
         Jama.Matrix dstrain_tmp = new Jama.Matrix(6, 1);
         for (int i = 0; i < 3; i++) dstrain_tmp.set(i, 0, -this.thermal_expantion * this.temperature);
         for (int i = 3; i < 6; i++) dstrain_tmp.set(i, 0, 0);
         stress.plusEquals(this.stiffness_matrix_3d.times(dstrain_tmp));
         strain.plusEquals(dstrain_tmp);
         this.isInitialTemperature = !this.isInitialTemperature;
      }
      stress.plusEquals(this.stiffness_matrix_3d.times(dstrain));
      pressure = -(stress.get(0, 0) + stress.get(1, 0) + stress.get(2, 0)) / 3.0;
      stress.set(0, 0, stress.get(0, 0) + pressure);
      stress.set(1, 0, stress.get(1, 0) + pressure);
      stress.set(2, 0, stress.get(2, 0) + pressure);
      vm_stress = Math.sqrt(1.5 * (stress.get(0, 0) * stress.get(0, 0) + stress.get(1, 0) * stress.get(1, 0) + stress.get(2, 0) * stress.get(2, 0)) + 3.0 * (stress.get(3, 0) * stress.get(3, 0) + stress.get(4, 0) * stress.get(4, 0) + stress.get(5, 0) * stress.get(5, 0)));
      if (vm_stress > yieldStress(this.eps, this.eps_vel)) {
         this.eps_vel = (vm_stress - yieldStress(this.eps, this.eps_vel)) / (3.0 * this.youngs_modulus / (2.0 * (1.0 + this.nu)) + yieldStressDerivate(this.eps, this.eps_vel)) / timestep;
         this.eps += this.eps_vel * timestep;
         stress.timesEquals(yieldStress(this.eps, this.eps_vel) / vm_stress);
      }
      stress.set(0, 0, stress.get(0, 0) - pressure);
      stress.set(1, 0, stress.get(1, 0) - pressure);
      stress.set(2, 0, stress.get(2, 0) - pressure);
      strain.plusEquals(dstrain);
   }
   public void calculateStressTwoDimensionalPlaneStress(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
      double vm_stress;
      if (!this.isInitialTemperature) {
         stress.set(0, 0, stress.get(0, 0) + this.stiffness_matrix_plane_stress.get(0, 0) * -this.thermal_expantion * this.temperature + this.stiffness_matrix_plane_stress.get(0, 1) * -this.thermal_expantion * this.temperature);
         stress.set(1, 0, stress.get(1, 0) + this.stiffness_matrix_plane_stress.get(1, 0) * -this.thermal_expantion * this.temperature + this.stiffness_matrix_plane_stress.get(1, 1) * -this.thermal_expantion * this.temperature);
         this.isInitialTemperature = !this.isInitialTemperature;
      }
      stress.set(0, 0, stress.get(0, 0) + this.stiffness_matrix_plane_stress.get(0, 0) * dstrain.get(0, 0) + this.stiffness_matrix_plane_stress.get(0, 1) * dstrain.get(1, 0));
      stress.set(1, 0, stress.get(1, 0) + this.stiffness_matrix_plane_stress.get(1, 0) * dstrain.get(0, 0) + this.stiffness_matrix_plane_stress.get(1, 1) * dstrain.get(1, 0));
      stress.set(3, 0, stress.get(3, 0) + this.stiffness_matrix_plane_stress.get(3, 3) * dstrain.get(3, 0));
      stress.set(4, 0, stress.get(4, 0) + this.stiffness_matrix_plane_stress.get(4, 4) * dstrain.get(4, 0));
      stress.set(5, 0, stress.get(5, 0) + this.stiffness_matrix_plane_stress.get(5, 5) * dstrain.get(5, 0));
      vm_stress = Math.sqrt(stress.get(0, 0) * stress.get(0, 0) + stress.get(1, 0) * stress.get(1, 0) - stress.get(0, 0) * stress.get(1, 0) + 3.0 * (stress.get(3, 0) * stress.get(3, 0)));
      if (vm_stress > yieldStress(this.eps, this.eps_vel)) {
         this.eps_vel = (vm_stress - yieldStress(this.eps, this.eps_vel)) / (this.youngs_modulus * timestep);
         this.eps += this.eps_vel * timestep;
         stress.timesEquals(yieldStress(this.eps, this.eps_vel) / vm_stress);
         dstrain.set(2, 0, -(dstrain.get(0, 0) + dstrain.get(1, 0)));
      } else {
         dstrain.set(2, 0, -(this.nu / (1.0 - this.nu)) * (dstrain.get(0, 0) + dstrain.get(1, 0)));
      }
      strain.plusEquals(dstrain);
   }
   public void parse_Fembic(Token[] arg, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < arg.length) {
         if (arg[i].getw().toUpperCase().equals("E") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.youngs_modulus = arg[i + 2].getn();
            i += 3;
            this.E_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("RHO") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.density = arg[i + 2].getn();
            this.density_is_set = true;
            i += 3;
            this.RHO_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("NU") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.nu = arg[i + 2].getn();
            i += 3;
            this.NU_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("A") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.thermal_expantion = arg[i + 2].getn();
            i += 3;
            this.thermal_expantion_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("T") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.temperature = arg[i + 2].getn();
            i += 3;
            this.temperature_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("FAILURE_STRAIN") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.failure_strain = arg[i + 2].getn();
            i += 3;
            this.failure_strain_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("FAILURE_STRESS") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.failure_stress = arg[i + 2].getn();
            i += 3;
            this.failure_stress_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("V1") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[1] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V1 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 1 ? 1 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V2") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[2] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V2 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 2 ? 2 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V3") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[3] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V3 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 3 ? 3 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V4") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[4] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V4 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 4 ? 4 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V5") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[5] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V5 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 5 ? 5 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V6") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[6] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V6 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 6 ? 6 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V7") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[7] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V7 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 7 ? 7 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V8") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[8] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V8 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 8 ? 8 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("V9") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               this.V[9] = arg[i + 2].getn();
            } else {
               throw new java.text.ParseException("Unknown V9 parameter in line ", lineno);
            }
            this.V_is_set = this.V_is_set < 9 ? 9 : this.V_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("YIELD_STRESS") && arg[i + 1].getw().toUpperCase().equals("=")) {
            if (arg[i + 2].is_a_number()) {
               this.yield_stress = new Variable(arg[i + 2].getn());
               this.EP_is_required = true;
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_stress = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            i += 3;
            this.YIELD_is_set = true;
         } else if (arg[i].getw().toUpperCase().toUpperCase().equals("EP") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.factor = arg[i + 2].getn();
            i += 3;
            this.EP_is_set = true;
         } else if (arg[i].getw().toUpperCase().equals("Y1") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y1 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[1] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 1 ? 1 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y2") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y2 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[2] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 2 ? 2 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y3") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y3 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[3] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 3 ? 3 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y4") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y4 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[4] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 4 ? 4 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y5") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y5 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[5] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 5 ? 5 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y6") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y6 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[6] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 6 ? 6 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y7") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y7 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[7] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 7 ? 7 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y8") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y8 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[8] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 8 ? 8 : this.Y_is_set;
            i += 3;
         } else if (arg[i].getw().toUpperCase().equals("Y9") && arg[i + 1].getw().toUpperCase().equals("=")) {
            this.check_array();
            if (arg[i + 2].is_a_number()) {
               throw new java.text.ParseException("Only curves accepted for the Y9 option.", lineno);
            } else if (arg[i + 2].getw().startsWith("[") && arg[i + 2].getw().endsWith("]")) {
               this.yield_array[9] = new Variable(arg[i + 2].getw().substring(1, arg[i + 2].getw().length() - 1));
            } else {
               throw new java.text.ParseException("Unknown Yield_Stress parameter in line ", lineno);
            }
            this.Y_is_set = this.Y_is_set < 9 ? 9 : this.Y_is_set;
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown material parameter in line ", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno) throws java.text.ParseException {
   }
   public void parse_Gmsh(Token[] param, int lineno) throws java.text.ParseException {
   }
   public void checkIndata() throws IllegalArgumentException {
      int i;
      String out = new String("");
      if (!this.E_is_set) {
         throw new IllegalArgumentException("No Youngs modulus (E) defined for this material: " + this.name);
      }
      if (!this.RHO_is_set) {
         throw new IllegalArgumentException("No Density (RHO) defined for this material: " + this.name);
      }
      if (!this.NU_is_set) {
         throw new IllegalArgumentException("No Poissons_constant (NU) defined for this material: " + this.name);
      }
      if (this.EP_is_required && !this.EP_is_set) {
         throw new IllegalArgumentException("No Plastic Modulus (EP) defined for this material: " + this.name);
      }
      if (!this.thermal_expantion_is_set) {
         throw new IllegalArgumentException("No Thermal Expantion (A) defined for this material: " + this.name);
      }
      if (!this.temperature_is_set) {
         throw new IllegalArgumentException("No Temperature (T) defined for this material: " + this.name);
      }
      if (!this.YIELD_is_set) {
         throw new IllegalArgumentException("No Yield stress level (YIELD_STRESS) defined for this material: " + this.name);
      }
      if (!this.name_is_set) {
         throw new IllegalArgumentException("Material name not intialized");
      }
      if ((this.V_is_set > 0 || this.Y_is_set > 0) && this.V_is_set != this.Y_is_set) {
         throw new IllegalArgumentException("Number of V:s (strain rates) specified is not same as number of Y:s (stress/strain curves)" + this.name);
      }
      if (this.V_is_set > 0 && this.Y_is_set > 0) {
         this.yield_array[0] = this.yield_stress;
         for (i = 0; i < this.V_is_set + 1; i++) {
            out += this.V[i] + "," + i + ",";
         }
         out = out.substring(0, out.length() - 1);
         this.yield_stress = new Variable(new Variable(out), this.yield_array);
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
      this.stiffness_matrix_plane_stress.set(3, 3, (1.0 - this.nu) * c2 / 2.0);
      this.stiffness_matrix_plane_stress.set(3, 4, 0);
      this.stiffness_matrix_plane_stress.set(3, 5, 0);
      this.stiffness_matrix_plane_stress.set(4, 0, 0);
      this.stiffness_matrix_plane_stress.set(4, 1, 0);
      this.stiffness_matrix_plane_stress.set(4, 2, 0);
      this.stiffness_matrix_plane_stress.set(4, 3, 0);
      this.stiffness_matrix_plane_stress.set(4, 4, 5.0 / 6.0 * (1.0 - this.nu) * c2 / 2.0);
      this.stiffness_matrix_plane_stress.set(4, 5, 0);
      this.stiffness_matrix_plane_stress.set(5, 0, 0);
      this.stiffness_matrix_plane_stress.set(5, 1, 0);
      this.stiffness_matrix_plane_stress.set(5, 2, 0);
      this.stiffness_matrix_plane_stress.set(5, 3, 0);
      this.stiffness_matrix_plane_stress.set(5, 4, 0);
      this.stiffness_matrix_plane_stress.set(5, 5, 5.0 / 6.0 * (1.0 - this.nu) * c2 / 2.0);
      this.A.set(0, 0, 1.0);
      this.A.set(0, 1, -0.5);
      this.A.set(0, 2, 0);
      this.A.set(0, 3, 0);
      this.A.set(0, 4, 0);
      this.A.set(0, 5, 0);
      this.A.set(1, 0, -0.5);
      this.A.set(1, 1, 1.0);
      this.A.set(1, 2, 0);
      this.A.set(1, 3, 0);
      this.A.set(1, 4, 0);
      this.A.set(1, 5, 0);
      this.A.set(2, 0, 0);
      this.A.set(2, 1, 0);
      this.A.set(2, 2, 0);
      this.A.set(2, 3, 0);
      this.A.set(2, 4, 0);
      this.A.set(2, 5, 0);
      this.A.set(3, 0, 0);
      this.A.set(3, 1, 0);
      this.A.set(3, 2, 0);
      this.A.set(3, 3, 3.0);
      this.A.set(3, 4, 0);
      this.A.set(3, 5, 0);
      this.A.set(4, 0, 0);
      this.A.set(4, 1, 0);
      this.A.set(4, 2, 0);
      this.A.set(4, 3, 0);
      this.A.set(4, 4, 0);
      this.A.set(4, 5, 0);
      this.A.set(5, 0, 0);
      this.A.set(5, 1, 0);
      this.A.set(5, 2, 0);
      this.A.set(5, 3, 0);
      this.A.set(5, 4, 0);
      this.A.set(5, 5, 0);
      this.I.set(0, 0, 1.0);
      this.I.set(0, 1, 0);
      this.I.set(0, 2, 0);
      this.I.set(0, 3, 0);
      this.I.set(0, 4, 0);
      this.I.set(0, 5, 0);
      this.I.set(1, 0, 0);
      this.I.set(1, 1, 1.0);
      this.I.set(1, 2, 0);
      this.I.set(1, 3, 0);
      this.I.set(1, 4, 0);
      this.I.set(1, 5, 0);
      this.I.set(2, 0, 0);
      this.I.set(2, 1, 0);
      this.I.set(2, 2, 1.0);
      this.I.set(2, 3, 0);
      this.I.set(2, 4, 0);
      this.I.set(2, 5, 0);
      this.I.set(3, 0, 0);
      this.I.set(3, 1, 0);
      this.I.set(3, 2, 0);
      this.I.set(3, 3, 1.0);
      this.I.set(3, 4, 0);
      this.I.set(3, 5, 0);
      this.I.set(4, 0, 0);
      this.I.set(4, 1, 0);
      this.I.set(4, 2, 0);
      this.I.set(4, 3, 0);
      this.I.set(4, 4, 1.0);
      this.I.set(4, 5, 0);
      this.I.set(5, 0, 0);
      this.I.set(5, 1, 0);
      this.I.set(5, 2, 0);
      this.I.set(5, 3, 0);
      this.I.set(5, 4, 0);
      this.I.set(5, 5, 1.0);
   }
   public double wavespeedOneDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus / this.density);
   }
   public double wavespeedThreeDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus * (1.0 - this.nu) / (this.density * (1.0 + this.nu) * (1.0 - 2.0 * this.nu)));
   }
   public double wavespeedTwoDimensional(double param, double param2) {
      return Math.sqrt(this.youngs_modulus / (this.density * (1.0 - this.nu * this.nu)));
   }
   private double yieldStress(double plastic_strain, double strain_vel) {
      if (this.yield_stress.isAConstant()) {
         return this.yield_stress.value(plastic_strain) + this.factor * plastic_strain;
      } else if (this.V_is_set == 0) {
         return this.yield_stress.value(plastic_strain);
      } else {
         return this.yield_stress.value(plastic_strain, strain_vel);
      }
   }
   private double yieldStressDerivate(double plastic_strain, double strain_vel) {
      if (this.yield_stress.isAConstant()) {
         return this.factor;
      } else if (this.V_is_set == 0) {
         return this.yield_stress.derivate(plastic_strain);
      } else {
         return this.yield_stress.derivate(plastic_strain, strain_vel);
      }
   }
   private void check_array() {
      if (this.yield_array == null) {
         this.yield_array = new Variable[10];
         this.V = new double[10];
         this.V[0] = 0;
      }
   }
}
