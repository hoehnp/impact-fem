package run.elements;
import run.*;

import java.util.*;

public class Beam_2 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Beam_2 copy = (Beam_2)_copy;
      super.createPatch(copy, po);
      copy.material = this.material = (run.Material)po.writeDiff(this.material, copy.material);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Beam_2 copy = (Beam_2)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.material = this.material = (run.Material)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.material);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.material = (run.Material)f.filter(this.material);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Beam_2(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Beam_2)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Beam_2)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Beam_2)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Beam_2((Beam_2)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Beam_2)copy).deepCloneReferences((Beam_2)orig, _helper);
         return false;
      }
      public Class getType() {
         return Beam_2.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public Beam_2(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      this.material = (run.Material)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.writeReference(this.material);
   }
   public Beam_2(Beam_2 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
   }
   public void deepCloneReferences(Beam_2 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.material = (run.Material)_helper.internalDeepClone(_orig.material);
   }
   private Material material;
   public Beam_2() {
      super();
      this.type = new String("BEAM_2");
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
   }
   public void calculateContactForces() {
   }
   public void calculateExternalForces(double currtime) {
   }
   public void calculateNodalForces(int integration_point, double timestep) throws IllegalArgumentException {
   }
   public void calculateStrain(double tstep, int integration_point) {
   }
   public void calculateStress(int integration_point, double timestep) {
   }
   public double checkTimestep(double current_timestep) {
      return 0;
   }
   public int getNumberOfIntegrationPoints() {
      return 1;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
   }
   public void checkIndata() throws IllegalArgumentException {
   }
   public void checkIfFailed() {
   }
   public String print_Gid(int ctrl, int gpn) {
      return new String("");
   }
   public String print_Fembic(int ctrl, int gpn) {
      return new String("");
   }
   public void setInitialConditions() {
      try {
         this.material = (Material)this.material.copy();
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      this.material.setInitialConditions();
   }
   public void updateLocalCoordinateSystem() {
   }
}
