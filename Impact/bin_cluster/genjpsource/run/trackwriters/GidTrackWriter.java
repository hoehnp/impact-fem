package run.trackwriters;
import java.io.*;

import run.RplVector;

import run.TrackWriter;

import run.Tracker;

public class GidTrackWriter extends TrackWriter implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      GidTrackWriter copy = (GidTrackWriter)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.counter, copy.counter)) copy.counter = this.counter;
      if (po.writeDiff(this.time, copy.time)) copy.time = this.time;
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      GidTrackWriter copy = (GidTrackWriter)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.counter = this.counter = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.time = this.time = pi.getDiffAsDouble();
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new GidTrackWriter(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((GidTrackWriter)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((GidTrackWriter)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((GidTrackWriter)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new GidTrackWriter((GidTrackWriter)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((GidTrackWriter)copy).deepCloneReferences((GidTrackWriter)orig, _helper);
         return false;
      }
      public Class getType() {
         return GidTrackWriter.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double;
   public GidTrackWriter(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(GidTrackWriter._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.counter = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.time = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(GidTrackWriter._SIZE);
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(GidTrackWriter._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.counter);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.time);
      _stream.deliver(_SIZE);
   }
   public GidTrackWriter(GidTrackWriter _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.counter = _orig.counter;
      this.time = _orig.time;
   }
   private double time;
   private int counter;
   public GidTrackWriter(RplVector tlist) {
      super(tlist);
      this.counter = 0;
   }
   public void initialize() {
   }
   public void write(double currtime) {
      try {
         writeResult(currtime);
         this.counter++;
      }  catch (IOException ioe) {
         System.out.println("Error during Track Writing phase:" + ioe);
         return;
      }
   }
   private void writeResult(double currtime) throws java.io.IOException {
      int i;
      Tracker temp_tracker;
      for (i = 0; i < this.trackerlist.size(); i++) {
         temp_tracker = (Tracker)this.trackerlist.elementAt(i);
         if (this.counter == 0) {
            temp_tracker.print_Gid(Tracker.RESULT_HEADER, currtime);
         } else {
            temp_tracker.print_Gid(Tracker.RESULT, currtime);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
   }
}
