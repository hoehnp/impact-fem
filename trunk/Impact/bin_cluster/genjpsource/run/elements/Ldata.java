package run.elements;
public class Ldata implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Ldata copy = (Ldata)_copy;
      if (po.writeDiff(this.checked, copy.checked)) copy.checked = this.checked;
      if (po.writeDiff(this.vec_is_set, copy.vec_is_set)) copy.vec_is_set = this.vec_is_set;
      if (po.writeDiff(this.vec, copy.vec)) copy.vec = this.vec;
      if (po.writeDiff(this.q, copy.q)) copy.q = this.q;
      copy.cline = this.cline = (run.elements.Contact_Line)po.writeDiff(this.cline, copy.cline);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Ldata copy = (Ldata)_copy;
      if (pi.hasDiff()) copy.checked = this.checked = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.vec_is_set = this.vec_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.vec = this.vec = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.q = this.q = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cline = this.cline = (run.elements.Contact_Line)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.cline);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.cline = (run.elements.Contact_Line)f.filter(this.cline);
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
         return new Ldata(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Ldata)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Ldata)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Ldata)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Ldata((Ldata)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Ldata)copy).deepCloneReferences((Ldata)orig, _helper);
         return false;
      }
      public Class getType() {
         return Ldata.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Ldata(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Ldata._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.checked = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.vec_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.vec = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.q = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Ldata._SIZE);
      this.cline = (run.elements.Contact_Line)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Ldata._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.checked);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.vec_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.vec);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.q);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.cline);
   }
   public Ldata(Ldata _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.checked = _orig.checked;
      this.vec_is_set = _orig.vec_is_set;
      this.vec = _orig.vec;
      this.q = _orig.q;
   }
   public void deepCloneReferences(Ldata _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.cline = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.cline);
   }
   public Contact_Line cline;
   public double q;
   public double vec;
   public boolean vec_is_set;
   public boolean checked;
   public Ldata(Contact_Line line, double q) {
      super();
      this.cline = line;
      this.q = q;
      this.checked = true;
   }
}
