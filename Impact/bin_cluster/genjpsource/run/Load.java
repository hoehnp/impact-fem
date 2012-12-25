package run;
import java.text.ParseException;

public class Load implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Load copy = (Load)_copy;
      if (po.writeDiff(this.pressure_is_set, copy.pressure_is_set)) copy.pressure_is_set = this.pressure_is_set;
      if (po.writeDiff(this.y_rot_acc_is_set, copy.y_rot_acc_is_set)) copy.y_rot_acc_is_set = this.y_rot_acc_is_set;
      if (po.writeDiff(this.z_rot_acc_is_set, copy.z_rot_acc_is_set)) copy.z_rot_acc_is_set = this.z_rot_acc_is_set;
      if (po.writeDiff(this.x_rot_acc_is_set, copy.x_rot_acc_is_set)) copy.x_rot_acc_is_set = this.x_rot_acc_is_set;
      if (po.writeDiff(this.y_acc_is_set, copy.y_acc_is_set)) copy.y_acc_is_set = this.y_acc_is_set;
      if (po.writeDiff(this.z_acc_is_set, copy.z_acc_is_set)) copy.z_acc_is_set = this.z_acc_is_set;
      if (po.writeDiff(this.x_acc_is_set, copy.x_acc_is_set)) copy.x_acc_is_set = this.x_acc_is_set;
      if (po.writeDiff(this.x_moment_is_set, copy.x_moment_is_set)) copy.x_moment_is_set = this.x_moment_is_set;
      if (po.writeDiff(this.y_moment_is_set, copy.y_moment_is_set)) copy.y_moment_is_set = this.y_moment_is_set;
      if (po.writeDiff(this.z_moment_is_set, copy.z_moment_is_set)) copy.z_moment_is_set = this.z_moment_is_set;
      if (po.writeDiff(this.z_force_is_set, copy.z_force_is_set)) copy.z_force_is_set = this.z_force_is_set;
      if (po.writeDiff(this.y_force_is_set, copy.y_force_is_set)) copy.y_force_is_set = this.y_force_is_set;
      if (po.writeDiff(this.x_force_is_set, copy.x_force_is_set)) copy.x_force_is_set = this.x_force_is_set;
      copy.pressure = this.pressure = (run.Variable)po.writeDiff(this.pressure, copy.pressure);
      copy.z_rot_acc = this.z_rot_acc = (run.Variable)po.writeDiff(this.z_rot_acc, copy.z_rot_acc);
      copy.y_rot_acc = this.y_rot_acc = (run.Variable)po.writeDiff(this.y_rot_acc, copy.y_rot_acc);
      copy.x_rot_acc = this.x_rot_acc = (run.Variable)po.writeDiff(this.x_rot_acc, copy.x_rot_acc);
      copy.z_acc = this.z_acc = (run.Variable)po.writeDiff(this.z_acc, copy.z_acc);
      copy.y_acc = this.y_acc = (run.Variable)po.writeDiff(this.y_acc, copy.y_acc);
      copy.x_acc = this.x_acc = (run.Variable)po.writeDiff(this.x_acc, copy.x_acc);
      copy.z_moment = this.z_moment = (run.Variable)po.writeDiff(this.z_moment, copy.z_moment);
      copy.y_moment = this.y_moment = (run.Variable)po.writeDiff(this.y_moment, copy.y_moment);
      copy.x_moment = this.x_moment = (run.Variable)po.writeDiff(this.x_moment, copy.x_moment);
      copy.z_force = this.z_force = (run.Variable)po.writeDiff(this.z_force, copy.z_force);
      copy.y_force = this.y_force = (run.Variable)po.writeDiff(this.y_force, copy.y_force);
      copy.x_force = this.x_force = (run.Variable)po.writeDiff(this.x_force, copy.x_force);
      copy.acc = this.acc = (Jama.Matrix)po.writeDiff(this.acc, copy.acc);
      copy.load = this.load = (Jama.Matrix)po.writeDiff(this.load, copy.load);
      copy.name = this.name = (java.lang.String)po.writeDiff(this.name, copy.name);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Load copy = (Load)_copy;
      if (pi.hasDiff()) copy.pressure_is_set = this.pressure_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_rot_acc_is_set = this.y_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_rot_acc_is_set = this.z_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_rot_acc_is_set = this.x_rot_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_acc_is_set = this.y_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_acc_is_set = this.z_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_acc_is_set = this.x_acc_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_moment_is_set = this.x_moment_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_moment_is_set = this.y_moment_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_moment_is_set = this.z_moment_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.z_force_is_set = this.z_force_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.y_force_is_set = this.y_force_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.x_force_is_set = this.x_force_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.pressure = this.pressure = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_rot_acc = this.z_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_rot_acc = this.y_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_rot_acc = this.x_rot_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_acc = this.z_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_acc = this.y_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_acc = this.x_acc = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_moment = this.z_moment = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_moment = this.y_moment = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_moment = this.x_moment = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z_force = this.z_force = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y_force = this.y_force = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x_force = this.x_force = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.acc = this.acc = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.load = this.load = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.name = this.name = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.pressure);
      c.descend(this.z_rot_acc);
      c.descend(this.y_rot_acc);
      c.descend(this.x_rot_acc);
      c.descend(this.z_acc);
      c.descend(this.y_acc);
      c.descend(this.x_acc);
      c.descend(this.z_moment);
      c.descend(this.y_moment);
      c.descend(this.x_moment);
      c.descend(this.z_force);
      c.descend(this.y_force);
      c.descend(this.x_force);
      c.descend(this.acc);
      c.descend(this.load);
      c.descend(this.name);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.pressure = (run.Variable)f.filter(this.pressure);
      this.z_rot_acc = (run.Variable)f.filter(this.z_rot_acc);
      this.y_rot_acc = (run.Variable)f.filter(this.y_rot_acc);
      this.x_rot_acc = (run.Variable)f.filter(this.x_rot_acc);
      this.z_acc = (run.Variable)f.filter(this.z_acc);
      this.y_acc = (run.Variable)f.filter(this.y_acc);
      this.x_acc = (run.Variable)f.filter(this.x_acc);
      this.z_moment = (run.Variable)f.filter(this.z_moment);
      this.y_moment = (run.Variable)f.filter(this.y_moment);
      this.x_moment = (run.Variable)f.filter(this.x_moment);
      this.z_force = (run.Variable)f.filter(this.z_force);
      this.y_force = (run.Variable)f.filter(this.y_force);
      this.x_force = (run.Variable)f.filter(this.x_force);
      this.acc = (Jama.Matrix)f.filter(this.acc);
      this.load = (Jama.Matrix)f.filter(this.load);
      this.name = (java.lang.String)f.filter(this.name);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Load(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Load)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Load)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Load)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Load((Load)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Load)copy).deepCloneReferences((Load)orig, _helper);
         return false;
      }
      public Class getType() {
         return Load.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public Load(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Load._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.pressure_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
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
      this.x_moment_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_moment_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_moment_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.z_force_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.y_force_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.x_force_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(Load._SIZE);
      this.pressure = (run.Variable)_stream.readReference();
      this.z_rot_acc = (run.Variable)_stream.readReference();
      this.y_rot_acc = (run.Variable)_stream.readReference();
      this.x_rot_acc = (run.Variable)_stream.readReference();
      this.z_acc = (run.Variable)_stream.readReference();
      this.y_acc = (run.Variable)_stream.readReference();
      this.x_acc = (run.Variable)_stream.readReference();
      this.z_moment = (run.Variable)_stream.readReference();
      this.y_moment = (run.Variable)_stream.readReference();
      this.x_moment = (run.Variable)_stream.readReference();
      this.z_force = (run.Variable)_stream.readReference();
      this.y_force = (run.Variable)_stream.readReference();
      this.x_force = (run.Variable)_stream.readReference();
      this.acc = (Jama.Matrix)_stream.readReference();
      this.load = (Jama.Matrix)_stream.readReference();
      this.name = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Load._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.pressure_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_rot_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_acc_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_moment_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_moment_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_moment_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.z_force_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.y_force_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.x_force_is_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.pressure);
      _stream.writeReference(this.z_rot_acc);
      _stream.writeReference(this.y_rot_acc);
      _stream.writeReference(this.x_rot_acc);
      _stream.writeReference(this.z_acc);
      _stream.writeReference(this.y_acc);
      _stream.writeReference(this.x_acc);
      _stream.writeReference(this.z_moment);
      _stream.writeReference(this.y_moment);
      _stream.writeReference(this.x_moment);
      _stream.writeReference(this.z_force);
      _stream.writeReference(this.y_force);
      _stream.writeReference(this.x_force);
      _stream.writeReference(this.acc);
      _stream.writeReference(this.load);
      _stream.writeReference(this.name);
   }
   public Load(Load _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.pressure_is_set = _orig.pressure_is_set;
      this.y_rot_acc_is_set = _orig.y_rot_acc_is_set;
      this.z_rot_acc_is_set = _orig.z_rot_acc_is_set;
      this.x_rot_acc_is_set = _orig.x_rot_acc_is_set;
      this.y_acc_is_set = _orig.y_acc_is_set;
      this.z_acc_is_set = _orig.z_acc_is_set;
      this.x_acc_is_set = _orig.x_acc_is_set;
      this.x_moment_is_set = _orig.x_moment_is_set;
      this.y_moment_is_set = _orig.y_moment_is_set;
      this.z_moment_is_set = _orig.z_moment_is_set;
      this.z_force_is_set = _orig.z_force_is_set;
      this.y_force_is_set = _orig.y_force_is_set;
      this.x_force_is_set = _orig.x_force_is_set;
   }
   public void deepCloneReferences(Load _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.pressure = (run.Variable)_helper.internalDeepClone(_orig.pressure);
      this.z_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.z_rot_acc);
      this.y_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.y_rot_acc);
      this.x_rot_acc = (run.Variable)_helper.internalDeepClone(_orig.x_rot_acc);
      this.z_acc = (run.Variable)_helper.internalDeepClone(_orig.z_acc);
      this.y_acc = (run.Variable)_helper.internalDeepClone(_orig.y_acc);
      this.x_acc = (run.Variable)_helper.internalDeepClone(_orig.x_acc);
      this.z_moment = (run.Variable)_helper.internalDeepClone(_orig.z_moment);
      this.y_moment = (run.Variable)_helper.internalDeepClone(_orig.y_moment);
      this.x_moment = (run.Variable)_helper.internalDeepClone(_orig.x_moment);
      this.z_force = (run.Variable)_helper.internalDeepClone(_orig.z_force);
      this.y_force = (run.Variable)_helper.internalDeepClone(_orig.y_force);
      this.x_force = (run.Variable)_helper.internalDeepClone(_orig.x_force);
      this.acc = (Jama.Matrix)_helper.internalDeepClone(_orig.acc);
      this.load = (Jama.Matrix)_helper.internalDeepClone(_orig.load);
      this.name = (java.lang.String)_helper.internalDeepClone(_orig.name);
   }
   public java.lang.String name;
   private Jama.Matrix load;
   private Jama.Matrix acc;
   private boolean x_force_is_set = false;
   private boolean y_force_is_set = false;
   private boolean z_force_is_set = false;
   private boolean z_moment_is_set = false;
   private boolean y_moment_is_set = false;
   private boolean x_moment_is_set = false;
   private boolean x_acc_is_set = false;
   private boolean z_acc_is_set = false;
   private boolean y_acc_is_set = false;
   private boolean x_rot_acc_is_set = false;
   private boolean z_rot_acc_is_set = false;
   private boolean y_rot_acc_is_set = false;
   private boolean pressure_is_set = false;
   private Variable x_force;
   private Variable y_force;
   private Variable z_force;
   private Variable x_moment;
   private Variable y_moment;
   private Variable z_moment;
   private Variable x_acc;
   private Variable y_acc;
   private Variable z_acc;
   private Variable x_rot_acc;
   private Variable y_rot_acc;
   private Variable z_rot_acc;
   private Variable pressure;
   public Load() {
      super();
      int i;
      this.load = new Jama.Matrix(6, 1);
      this.acc = new Jama.Matrix(6, 1);
      for (i = 0; i < 6; i++) {
         this.load.set(i, 0, 0);
         this.acc.set(i, 0, 0);
      }
   }
   public Jama.Matrix getLoad(double currtime) {
      if (this.x_force_is_set) {
         this.load.set(0, 0, this.x_force.value(currtime) * (this.x_force.on(currtime) ? 1.0 : 0.0));
      }
      if (this.y_force_is_set) {
         this.load.set(1, 0, this.y_force.value(currtime) * (this.y_force.on(currtime) ? 1.0 : 0.0));
      }
      if (this.z_force_is_set) {
         this.load.set(2, 0, this.z_force.value(currtime) * (this.z_force.on(currtime) ? 1.0 : 0.0));
      }
      if (this.x_moment_is_set) {
         this.load.set(3, 0, this.x_moment.value(currtime) * (this.x_moment.on(currtime) ? 1.0 : 0.0));
      }
      if (this.y_moment_is_set) {
         this.load.set(4, 0, this.y_moment.value(currtime) * (this.y_moment.on(currtime) ? 1.0 : 0.0));
      }
      if (this.z_moment_is_set) {
         this.load.set(5, 0, this.z_moment.value(currtime) * (this.z_moment.on(currtime) ? 1.0 : 0.0));
      }
      return this.load;
   }
   public Jama.Matrix getAcc(double currtime) {
      if (this.x_acc_is_set) {
         this.acc.set(0, 0, this.x_acc.value(currtime) * (this.x_acc.on(currtime) ? 1.0 : 0.0));
      }
      if (this.y_acc_is_set) {
         this.acc.set(1, 0, this.y_acc.value(currtime) * (this.y_acc.on(currtime) ? 1.0 : 0.0));
      }
      if (this.z_acc_is_set) {
         this.acc.set(2, 0, this.z_acc.value(currtime) * (this.z_acc.on(currtime) ? 1.0 : 0.0));
      }
      if (this.x_rot_acc_is_set) {
         this.acc.set(3, 0, this.x_rot_acc.value(currtime) * (this.x_rot_acc.on(currtime) ? 1.0 : 0.0));
      }
      if (this.y_rot_acc_is_set) {
         this.acc.set(4, 0, this.y_rot_acc.value(currtime) * (this.y_rot_acc.on(currtime) ? 1.0 : 0.0));
      }
      if (this.z_rot_acc_is_set) {
         this.acc.set(5, 0, this.z_rot_acc.value(currtime) * (this.z_rot_acc.on(currtime) ? 1.0 : 0.0));
      }
      return this.acc;
   }
   public double getPressure(double currtime) {
      if (this.pressure_is_set) {
         return this.pressure.value(currtime) * (this.pressure.on(currtime) ? 1.0 : 0.0);
      }
      return 0.0;
   }
   public void parse_Fembic(Token[] param, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("FX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FX = [t1,fx1,t2,fx2,...] ", lineno);
               }
            } else {
               this.x_force = new Variable(param[i + 2].getn());
            }
            this.x_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("FY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FY = [t1,fy1,t2,fy2,...] ", lineno);
               }
            } else {
               this.y_force = new Variable(param[i + 2].getn());
            }
            this.y_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("FZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FZ = [t1,fz1,t2,fz2,...] ", lineno);
               }
            } else {
               this.z_force = new Variable(param[i + 2].getn());
            }
            this.z_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MX = [t1,mx1,t2,mx2,...] ", lineno);
               }
            } else {
               this.x_moment = new Variable(param[i + 2].getn());
            }
            this.x_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MY = [t1,my1,t2,my2,...] ", lineno);
               }
            } else {
               this.y_moment = new Variable(param[i + 2].getn());
            }
            this.y_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MZ = [t1,mz1,t2,mz2,...] ", lineno);
               }
            } else {
               this.z_moment = new Variable(param[i + 2].getn());
            }
            this.z_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: AX = [t1,ax1,t2,ax2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: AY = [t1,ay1,t2,ay2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: AZ = [t1,az1,t2,az2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARX = [t1,arx1,t2,arx2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARY = [t1,ary1,t2,ary2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARZ = [t1,arz1,t2,arz2,...] ", lineno);
               }
            } else {
               this.z_rot_acc = new Variable(param[i + 2].getn());
            }
            this.z_rot_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("P")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.pressure = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: P = [t1,p1,t2,p2,...] ", lineno);
               }
            } else {
               this.pressure = new Variable(param[i + 2].getn());
            }
            this.pressure_is_set = true;
            i += 3;
         } else {
            throw new java.text.ParseException("Syntax error, unknown force parameter", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("FX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FX = [t1,fx1,t2,fx2,...] ", lineno);
               }
            } else {
               this.x_force = new Variable(param[i + 2].getn());
            }
            this.x_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("FY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FY = [t1,fy1,t2,fy2,...] ", lineno);
               }
            } else {
               this.y_force = new Variable(param[i + 2].getn());
            }
            this.y_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("FZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_force = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: FZ = [t1,fz1,t2,fz2,...] ", lineno);
               }
            } else {
               this.z_force = new Variable(param[i + 2].getn());
            }
            this.z_force_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MX = [t1,mx1,t2,mx2,...] ", lineno);
               }
            } else {
               this.x_moment = new Variable(param[i + 2].getn());
            }
            this.x_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.y_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MY = [t1,my1,t2,my2,...] ", lineno);
               }
            } else {
               this.y_moment = new Variable(param[i + 2].getn());
            }
            this.y_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.z_moment = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: MZ = [t1,mz1,t2,mz2,...] ", lineno);
               }
            } else {
               this.z_moment = new Variable(param[i + 2].getn());
            }
            this.z_moment_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("AX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.x_acc = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: AX = [t1,ax1,t2,ax2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: AY = [t1,ay1,t2,ay2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: AZ = [t1,az1,t2,az2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARX = [t1,arx1,t2,arx2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARY = [t1,ary1,t2,ary2,...] ", lineno);
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
                  throw new ParseException("Illegal parameter. Syntax: ARZ = [t1,arz1,t2,arz2,...] ", lineno);
               }
            } else {
               this.z_rot_acc = new Variable(param[i + 2].getn());
            }
            this.z_rot_acc_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("P")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.pressure = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: P = [t1,p1,t2,p2,...] ", lineno);
               }
            } else {
               this.pressure = new Variable(param[i + 2].getn());
            }
            this.pressure_is_set = true;
            i += 3;
         } else {
            throw new java.text.ParseException("Syntax error, unknown force parameter", lineno);
         }
      }
   }
   public void parse_Gmsh(Token[] param, int lineno, RplVector nodelist) throws java.text.ParseException {
      int index = 0;
      Node temp_node;
      this.name = new String("LD_" + lineno);
      this.x_force = new Variable(0);
      this.x_force_is_set = true;
      this.y_force = new Variable(0);
      this.y_force_is_set = true;
      this.z_force = new Variable(0);
      this.z_force_is_set = true;
      this.x_moment = new Variable(0);
      this.x_moment_is_set = true;
      this.y_moment = new Variable(0);
      this.y_moment_is_set = true;
      this.z_moment = new Variable(0);
      this.z_moment_is_set = true;
      for (index = 0; index < nodelist.size(); index++) {
         temp_node = (Node)nodelist.elementAt(index);
         if (temp_node.getNumber() == param[5].getn()) temp_node.setLoad(this);
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
         if (this.x_force_is_set) out += " fx = " + this.x_force.printFembic();
         if (this.y_force_is_set) out += " fy = " + this.y_force.printFembic();
         if (this.z_force_is_set) out += " fz = " + this.z_force.printFembic();
         if (this.x_moment_is_set) out += " mx = " + this.x_moment.printFembic();
         if (this.y_moment_is_set) out += " my = " + this.y_moment.printFembic();
         if (this.z_moment_is_set) out += " mz = " + this.z_moment.printFembic();
         if (this.pressure_is_set) out += " p = " + this.pressure.printFembic();
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void checkIndata() throws IllegalArgumentException {
   }
   public java.lang.String getName() {
      return this.name;
   }
   public void setName(java.lang.String name) {
      this.name = name;
   }
}
