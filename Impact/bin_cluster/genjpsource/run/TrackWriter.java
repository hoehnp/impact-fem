package run;
import run.trackwriters.GidTrackWriter;

public abstract class TrackWriter implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      TrackWriter copy = (TrackWriter)_copy;
      copy.tracker_print_types = this.tracker_print_types = (boolean[])po.writeDiff(this.tracker_print_types, copy.tracker_print_types);
      copy.trackerlist = this.trackerlist = (run.RplVector)po.writeDiff(this.trackerlist, copy.trackerlist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      TrackWriter copy = (TrackWriter)_copy;
      if (pi.hasDiff()) copy.tracker_print_types = this.tracker_print_types = (boolean[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trackerlist = this.trackerlist = (run.RplVector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.tracker_print_types);
      c.descend(this.trackerlist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.tracker_print_types = (boolean[])f.filter(this.tracker_print_types);
      this.trackerlist = (run.RplVector)f.filter(this.trackerlist);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   public TrackWriter(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      this.tracker_print_types = (boolean[])_stream.readReference();
      this.trackerlist = (run.RplVector)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.writeReference(this.tracker_print_types);
      _stream.writeReference(this.trackerlist);
   }
   public TrackWriter(TrackWriter _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(TrackWriter _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.tracker_print_types = (boolean[])_helper.internalDeepClone(_orig.tracker_print_types);
      this.trackerlist = (run.RplVector)_helper.internalDeepClone(_orig.trackerlist);
   }
   protected RplVector trackerlist;
   protected boolean[] tracker_print_types;
   public TrackWriter(RplVector tlist) {
      super();
      this.trackerlist = tlist;
   }
   public static TrackWriter getTrackWriterOfType_Fembic(String type, RplVector trackerlist) throws java.lang.IllegalArgumentException {
      if (type.toUpperCase().equals("GIDTRACKWRITER")) {
         return new GidTrackWriter(trackerlist);
      }
      throw new IllegalArgumentException("Illegal TrackWriter Type");
   }
   public abstract void write(double time);
   public abstract void initialize();
   public abstract void checkIndata() throws IllegalArgumentException;
}
