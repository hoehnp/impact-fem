package run;
public class InternalNode extends Node implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      InternalNode copy = (InternalNode)_copy;
      super.createPatch(copy, po);
      copy.master = this.master = (run.Element)po.writeDiff(this.master, copy.master);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      InternalNode copy = (InternalNode)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.master = this.master = (run.Element)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.master);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.master = (run.Element)f.filter(this.master);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new InternalNode(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((InternalNode)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((InternalNode)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((InternalNode)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new InternalNode((InternalNode)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((InternalNode)copy).deepCloneReferences((InternalNode)orig, _helper);
         return false;
      }
      public Class getType() {
         return InternalNode.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public InternalNode(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      this.master = (run.Element)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.writeReference(this.master);
   }
   public InternalNode(InternalNode _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
   }
   public void deepCloneReferences(InternalNode _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.master = (run.Element)_helper.internalDeepClone(_orig.master);
   }
   Element master;
   public InternalNode() {
      super();
      this.type = run.Node.INTERNAL_NODE;
   }
   public void calculateNewPosition(double timestep, double currtime) {
      this.master.setInternalNodePosition();
   }
   public void registerMasterElement(Element el) {
      this.master = el;
   }
   public void setInitialConditions() {
      super.setInitialConditions();
      this.master.setInternalNodePosition();
   }
}
