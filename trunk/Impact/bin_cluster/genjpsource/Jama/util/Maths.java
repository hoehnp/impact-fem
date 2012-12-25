package Jama.util;
public class Maths implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Maths copy = (Maths)_copy;
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Maths copy = (Maths)_copy;
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
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
         return new Maths(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Maths)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Maths)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Maths)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Maths((Maths)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Maths)copy).deepCloneReferences((Maths)orig, _helper);
         return false;
      }
      public Class getType() {
         return Maths.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public Maths(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public Maths(Maths _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(Maths _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
   }
   public Maths() {
      super();
   }
   public static double hypot(double a, double b) {
      double r;
      if (Math.abs(a) > Math.abs(b)) {
         r = b / a;
         r = Math.abs(a) * Math.sqrt(1 + r * r);
      } else if (b != 0) {
         r = a / b;
         r = Math.abs(b) * Math.sqrt(1 + r * r);
      } else {
         r = 0.0;
      }
      return r;
   }
}
