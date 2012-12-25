package run;
import java.util.Comparator;

public class NodeComparator implements uka.patch.Patchable, uka.transport.Transportable, Comparator {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      NodeComparator copy = (NodeComparator)_copy;
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      NodeComparator copy = (NodeComparator)_copy;
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
         return new NodeComparator(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((NodeComparator)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeComparator)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((NodeComparator)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new NodeComparator((NodeComparator)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((NodeComparator)copy).deepCloneReferences((NodeComparator)orig, _helper);
         return false;
      }
      public Class getType() {
         return NodeComparator.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public NodeComparator(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public NodeComparator(NodeComparator _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(NodeComparator _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
   }
   public NodeComparator() {
      super();
   }
   public int compare(Object arg0, Object arg1) {
      Node n1 = (Node)arg0;
      Node n2 = (Node)arg1;
      double diff = n1.getX_pos() - n2.getX_pos();
      if (diff > 0) return 1;
      if (diff < 0) return -1;
      return 0;
   }
}
