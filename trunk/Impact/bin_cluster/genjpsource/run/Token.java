package run;
public class Token implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Token copy = (Token)_copy;
      if (po.writeDiff(this.is_a_word, copy.is_a_word)) copy.is_a_word = this.is_a_word;
      if (po.writeDiff(this.d, copy.d)) copy.d = this.d;
      copy.s = this.s = (java.lang.String)po.writeDiff(this.s, copy.s);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Token copy = (Token)_copy;
      if (pi.hasDiff()) copy.is_a_word = this.is_a_word = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.d = this.d = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.s = this.s = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.s);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.s = (java.lang.String)f.filter(this.s);
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
         return new Token(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Token)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Token)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Token)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Token((Token)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Token)copy).deepCloneReferences((Token)orig, _helper);
         return false;
      }
      public Class getType() {
         return Token.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double;
   public Token(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Token._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.is_a_word = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.d = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Token._SIZE);
      this.s = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Token._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.is_a_word);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.d);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.s);
   }
   public Token(Token _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.is_a_word = _orig.is_a_word;
      this.d = _orig.d;
   }
   public void deepCloneReferences(Token _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.s = (java.lang.String)_helper.internalDeepClone(_orig.s);
   }
   String s;
   double d;
   boolean is_a_word;
   public Token(String w) {
      super();
      try {
         this.d = Double.parseDouble(w);
      }  catch (NumberFormatException e) {
         this.s = new String(w);
         this.is_a_word = true;
         return;
      }
      this.is_a_word = false;
   }
   public Token(double n) {
      super();
      this.d = n;
      this.is_a_word = false;
   }
   public String getw() {
      return this.s;
   }
   public double getn() {
      return this.d;
   }
   public boolean is_a_word() {
      return this.is_a_word;
   }
   public boolean is_a_number() {
      return !this.is_a_word;
   }
}
