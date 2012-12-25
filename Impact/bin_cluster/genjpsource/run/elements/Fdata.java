package run.elements;
import run.Node;

public class Fdata implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Fdata copy = (Fdata)_copy;
      if (po.writeDiff(this.checked, copy.checked)) copy.checked = this.checked;
      if (po.writeDiff(this.vec_is_set, copy.vec_is_set)) copy.vec_is_set = this.vec_is_set;
      if (po.writeDiff(this.q, copy.q)) copy.q = this.q;
      if (po.writeDiff(this.vecY, copy.vecY)) copy.vecY = this.vecY;
      if (po.writeDiff(this.vecX, copy.vecX)) copy.vecX = this.vecX;
      if (po.writeDiff(this.posY, copy.posY)) copy.posY = this.posY;
      if (po.writeDiff(this.posX, copy.posX)) copy.posX = this.posX;
      copy.cnode = this.cnode = (run.Node)po.writeDiff(this.cnode, copy.cnode);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Fdata copy = (Fdata)_copy;
      if (pi.hasDiff()) copy.checked = this.checked = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.vec_is_set = this.vec_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.q = this.q = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.vecY = this.vecY = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.vecX = this.vecX = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.posY = this.posY = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.posX = this.posX = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cnode = this.cnode = (run.Node)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.cnode);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.cnode = (run.Node)f.filter(this.cnode);
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
         return new Fdata(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Fdata)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Fdata)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Fdata)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Fdata((Fdata)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Fdata)copy).deepCloneReferences((Fdata)orig, _helper);
         return false;
      }
      public Class getType() {
         return Fdata.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Fdata(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Fdata._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.checked = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.vec_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.q = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.vecY = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.vecX = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.posY = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.posX = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Fdata._SIZE);
      this.cnode = (run.Node)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Fdata._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.checked);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.vec_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.q);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.vecY);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.vecX);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.posY);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.posX);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.cnode);
   }
   public Fdata(Fdata _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.checked = _orig.checked;
      this.vec_is_set = _orig.vec_is_set;
      this.q = _orig.q;
      this.vecY = _orig.vecY;
      this.vecX = _orig.vecX;
      this.posY = _orig.posY;
      this.posX = _orig.posX;
   }
   public void deepCloneReferences(Fdata _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.cnode = (run.Node)_helper.internalDeepClone(_orig.cnode);
   }
   public Node cnode;
   public double posX;
   public double posY;
   public double vecX;
   public double vecY;
   public double q;
   public boolean vec_is_set;
   public boolean checked;
   public Fdata(Node node, double px, double py) {
      super();
      this.cnode = node;
      this.posX = px;
      this.posY = py;
      this.checked = true;
   }
   public Fdata(Node node, double q) {
      super();
      this.cnode = node;
      this.q = q;
      this.checked = true;
   }
}
