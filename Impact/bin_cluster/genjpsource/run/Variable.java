package run;
public class Variable implements uka.patch.Patchable, uka.transport.Transportable, Cloneable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Variable copy = (Variable)_copy;
      if (po.writeDiff(this.index, copy.index)) copy.index = this.index;
      if (po.writeDiff(this.is_a_constant, copy.is_a_constant)) copy.is_a_constant = this.is_a_constant;
      copy.v = this.v = (run.Variable)po.writeDiff(this.v, copy.v);
      copy.z = this.z = (run.Variable[])po.writeDiff(this.z, copy.z);
      copy.token = this.token = (java.lang.String)po.writeDiff(this.token, copy.token);
      copy.on = this.on = (boolean[])po.writeDiff(this.on, copy.on);
      copy.y = this.y = (double[])po.writeDiff(this.y, copy.y);
      copy.x = this.x = (double[])po.writeDiff(this.x, copy.x);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Variable copy = (Variable)_copy;
      if (pi.hasDiff()) copy.index = this.index = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.is_a_constant = this.is_a_constant = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.v = this.v = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z = this.z = (run.Variable[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.token = this.token = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.on = this.on = (boolean[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.y = this.y = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.x = this.x = (double[])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.v);
      c.descend(this.z);
      c.descend(this.token);
      c.descend(this.on);
      c.descend(this.y);
      c.descend(this.x);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.v = (run.Variable)f.filter(this.v);
      this.z = (run.Variable[])f.filter(this.z);
      this.token = (java.lang.String)f.filter(this.token);
      this.on = (boolean[])f.filter(this.on);
      this.y = (double[])f.filter(this.y);
      this.x = (double[])f.filter(this.x);
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
         return new Variable(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Variable)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Variable)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Variable)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Variable((Variable)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Variable)copy).deepCloneReferences((Variable)orig, _helper);
         return false;
      }
      public Class getType() {
         return Variable.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean;
   public Variable(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Variable._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.index = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.is_a_constant = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(Variable._SIZE);
      this.v = (run.Variable)_stream.readReference();
      this.z = (run.Variable[])_stream.readReference();
      this.token = (java.lang.String)_stream.readReference();
      this.on = (boolean[])_stream.readReference();
      this.y = (double[])_stream.readReference();
      this.x = (double[])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Variable._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.index);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.is_a_constant);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.v);
      _stream.writeReference(this.z);
      _stream.writeReference(this.token);
      _stream.writeReference(this.on);
      _stream.writeReference(this.y);
      _stream.writeReference(this.x);
   }
   public Variable(Variable _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.index = _orig.index;
      this.is_a_constant = _orig.is_a_constant;
   }
   public void deepCloneReferences(Variable _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.v = (run.Variable)_helper.internalDeepClone(_orig.v);
      this.z = (run.Variable[])_helper.internalDeepClone(_orig.z);
      this.token = (java.lang.String)_helper.internalDeepClone(_orig.token);
      this.on = (boolean[])_helper.internalDeepClone(_orig.on);
      this.y = (double[])_helper.internalDeepClone(_orig.y);
      this.x = (double[])_helper.internalDeepClone(_orig.x);
   }
   private double[] x;
   private double[] y;
   private boolean[] on;
   private boolean is_a_constant;
   private int index;
   private String token;
   private Variable[] z;
   private Variable v;
   public Variable(String arg) throws IllegalArgumentException {
      super();
      int number_of_commas;
      int i;
      int temp_index;
      int next_index;
      number_of_commas = 0;
      this.is_a_constant = false;
      for (i = 0; i < arg.length(); i++) {
         if (arg.charAt(i) == ',') {
            number_of_commas++;
         }
      }
      if (number_of_commas / 2 * 2 == number_of_commas) {
         throw new IllegalArgumentException("Missing coordinate pairs in: " + arg);
      }
      this.x = new double[(number_of_commas + 1) / 2];
      this.y = new double[(number_of_commas + 1) / 2];
      this.on = new boolean[(number_of_commas + 1) / 2];
      next_index = -1;
      for (i = 0; i < (number_of_commas + 1) / 2; i++) {
         temp_index = next_index;
         next_index = arg.indexOf(',', temp_index + 1);
         this.token = new String(arg.substring(temp_index + 1, next_index).trim());
         if (this.is_a_number(this.token)) {
            this.x[i] = Double.valueOf(this.token).doubleValue();
         } else {
            throw new IllegalArgumentException("No number specified for x-value in this indata: " + arg);
         }
         temp_index = next_index;
         next_index = arg.indexOf(',', temp_index + 1);
         if (next_index == -1) {
            next_index = arg.length();
         }
         this.token = new String(arg.substring(temp_index + 1, next_index).trim());
         if (this.is_a_number(this.token)) {
            this.y[i] = Double.valueOf(this.token).doubleValue();
            this.on[i] = true;
         } else if (i > 0) {
            this.y[i] = this.y[i - 1];
            this.on[i] = false;
         } else {
            this.y[i] = 0.0;
            this.on[i] = false;
         }
      }
   }
   public Variable(double arg) throws IllegalArgumentException {
      super();
      this.is_a_constant = true;
      this.y = new double[1];
      this.y[0] = arg;
   }
   public Variable(Variable q, Variable[] a) {
      super();
      this.v = q;
      this.z = a;
   }
   public double value(double x_val) {
      if (this.is_a_constant == true) {
         return this.y[0];
      }
      while (this.index < this.x.length && x_val > this.x[this.index + 1]) {
         this.index++;
      }
      while (x_val < this.x[this.index] && this.index > 0) {
         this.index--;
      }
      if (this.index == this.x.length) {
         return this.y[this.index];
      }
      if (this.index > this.x.length) {
         throw new IllegalArgumentException("Parameter out of bounds");
      }
      return (this.y[this.index + 1] - this.y[this.index]) * (x_val - this.x[this.index]) / (this.x[this.index + 1] - this.x[this.index]) + this.y[this.index];
   }
   public double derivate(double x_val) {
      if (this.is_a_constant == true) {
         return 0;
      }
      while (this.index < this.x.length && x_val > this.x[this.index + 1]) {
         this.index++;
      }
      while (x_val < this.x[this.index] && this.index > 0) {
         this.index--;
      }
      if (this.index == this.x.length) {
         return this.y[this.index];
      }
      if (this.index > this.x.length) {
         throw new IllegalArgumentException("Parameter out of bounds");
      }
      return (this.y[this.index + 1] - this.y[this.index]) / (this.x[this.index + 1] - this.x[this.index]);
   }
   public double value(double x_value, double y_value) {
      if (this.z == null) {
         throw new IllegalArgumentException("This variable has not been initalized as multi variable");
      }
      this.index = (int)this.v.value(y_value);
      if (this.index == this.z.length) {
         return this.z[this.index - 1].value(x_value);
      }
      if (this.index > this.z.length) {
         throw new IllegalArgumentException("Parameter out of bounds");
      }
      return (this.z[this.index + 1].value(x_value) - this.z[this.index].value(x_value)) * (this.v.value(y_value) - (int)this.v.value(y_value)) + this.z[this.index].value(x_value);
   }
   public double derivate(double x_value, double y_value) {
      if (this.z == null) {
         throw new IllegalArgumentException("This variable has not been initalized as multi variable");
      }
      this.index = (int)this.v.value(y_value);
      if (this.index == this.z.length) {
         return this.z[this.index - 1].derivate(x_value);
      }
      if (this.index > this.z.length) {
         throw new IllegalArgumentException("Parameter out of bounds");
      }
      return (this.z[this.index + 1].derivate(x_value) - this.z[this.index].derivate(x_value)) * (this.v.value(y_value) - (int)this.v.value(y_value)) + this.z[this.index].derivate(x_value);
   }
   public boolean on(double x_val) {
      if (this.is_a_constant) {
         return true;
      }
      while (this.index < this.x.length && x_val > this.x[this.index + 1]) {
         this.index++;
      }
      while (x_val < this.x[this.index] && this.index > 0) {
         this.index--;
      }
      if (this.index > this.x.length) {
         throw new IllegalArgumentException("Parameter out of bounds");
      }
      return this.on[this.index];
   }
   private boolean is_a_number(String w) {
      Double d;
      try {
         d = new Double(w);
      }  catch (NumberFormatException n) {
         return false;
      }
      return true;
   }
   public String printFembic() {
      int i;
      String out;
      out = "";
      if (this.is_a_constant) {
         out += this.y[0];
         return out;
      }
      out = "[";
      for (i = 0; i < this.x.length; i++) {
         out += this.x[i] + ",";
         if (this.on[i]) out += this.y[i]; else out += "off";
         out += ",";
      }
      out = out.substring(0, out.length() - 1) + "]";
      return out;
   }
   public Object copy() throws CloneNotSupportedException {
      Object o = null;
      try {
         o = super.clone();
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      return o;
   }
   public boolean isAConstant() {
      return this.is_a_constant;
   }
}
