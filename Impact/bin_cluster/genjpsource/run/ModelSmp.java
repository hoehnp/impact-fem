package run;
import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import jp.sync.*;

public class ModelSmp implements uka.patch.Patchable, uka.transport.Transportable, Runnable, ExceptionListener {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      ModelSmp copy = (ModelSmp)_copy;
      if (po.writeDiff(this.time_error, copy.time_error)) copy.time_error = this.time_error;
      if (po.writeDiff(this.timestep_error, copy.timestep_error)) copy.timestep_error = this.timestep_error;
      if (po.writeDiff(this.i, copy.i)) copy.i = this.i;
      if (po.writeDiff(this.nr_of_CPUs, copy.nr_of_CPUs)) copy.nr_of_CPUs = this.nr_of_CPUs;
      if (po.writeDiff(this.number_of_loads, copy.number_of_loads)) copy.number_of_loads = this.number_of_loads;
      if (po.writeDiff(this.number_of_constraints, copy.number_of_constraints)) copy.number_of_constraints = this.number_of_constraints;
      if (po.writeDiff(this.number_of_groups, copy.number_of_groups)) copy.number_of_groups = this.number_of_groups;
      if (po.writeDiff(this.number_of_controls, copy.number_of_controls)) copy.number_of_controls = this.number_of_controls;
      if (po.writeDiff(this.number_of_materials, copy.number_of_materials)) copy.number_of_materials = this.number_of_materials;
      if (po.writeDiff(this.number_of_nodes, copy.number_of_nodes)) copy.number_of_nodes = this.number_of_nodes;
      if (po.writeDiff(this.number_of_trackers, copy.number_of_trackers)) copy.number_of_trackers = this.number_of_trackers;
      if (po.writeDiff(this.number_of_elements, copy.number_of_elements)) copy.number_of_elements = this.number_of_elements;
      if (po.writeDiff(this.failure_is_set, copy.failure_is_set)) copy.failure_is_set = this.failure_is_set;
      if (po.writeDiff(this.autostep, copy.autostep)) copy.autostep = this.autostep;
      if (po.writeDiff(this.timestep, copy.timestep)) copy.timestep = this.timestep;
      if (po.writeDiff(this.ttemp, copy.ttemp)) copy.ttemp = this.ttemp;
      if (po.writeDiff(this.time, copy.time)) copy.time = this.time;
      copy.exception_listeners = this.exception_listeners = (java.util.Set)po.writeDiff(this.exception_listeners, copy.exception_listeners);
      copy.worker = this.worker = (run.Worker[])po.writeDiff(this.worker, copy.worker);
      copy.tsolve = this.tsolve = (java.lang.Thread[])po.writeDiff(this.tsolve, copy.tsolve);
      copy.trackwriter = this.trackwriter = (run.TrackWriter)po.writeDiff(this.trackwriter, copy.trackwriter);
      copy.resultwriter = this.resultwriter = (run.Writer)po.writeDiff(this.resultwriter, copy.resultwriter);
      copy.temporary_node = this.temporary_node = (run.Node)po.writeDiff(this.temporary_node, copy.temporary_node);
      copy.temporary_constraint = this.temporary_constraint = (run.Constraint)po.writeDiff(this.temporary_constraint, copy.temporary_constraint);
      copy.temporary_tracker = this.temporary_tracker = (run.Tracker)po.writeDiff(this.temporary_tracker, copy.temporary_tracker);
      copy.temporary_element = this.temporary_element = (run.Element)po.writeDiff(this.temporary_element, copy.temporary_element);
      copy.controlset = this.controlset = (run.Controlset)po.writeDiff(this.controlset, copy.controlset);
      copy.loadlist = this.loadlist = (run.RplVector)po.writeDiff(this.loadlist, copy.loadlist);
      copy.constraintlist = this.constraintlist = (run.RplVector)po.writeDiff(this.constraintlist, copy.constraintlist);
      copy.materiallist = this.materiallist = (run.RplVector)po.writeDiff(this.materiallist, copy.materiallist);
      copy.trackerlist = this.trackerlist = (run.RplVector)po.writeDiff(this.trackerlist, copy.trackerlist);
      copy.elementlist = this.elementlist = (run.RplVector)po.writeDiff(this.elementlist, copy.elementlist);
      copy.nodelist = this.nodelist = (run.RplVector)po.writeDiff(this.nodelist, copy.nodelist);
      copy.nodetable = this.nodetable = (java.util.Hashtable)po.writeDiff(this.nodetable, copy.nodetable);
      copy.filename = this.filename = (java.lang.String)po.writeDiff(this.filename, copy.filename);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      ModelSmp copy = (ModelSmp)_copy;
      if (pi.hasDiff()) copy.time_error = this.time_error = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.timestep_error = this.timestep_error = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.i = this.i = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.nr_of_CPUs = this.nr_of_CPUs = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_loads = this.number_of_loads = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_constraints = this.number_of_constraints = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_groups = this.number_of_groups = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_controls = this.number_of_controls = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_materials = this.number_of_materials = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_nodes = this.number_of_nodes = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_trackers = this.number_of_trackers = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_elements = this.number_of_elements = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.failure_is_set = this.failure_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.autostep = this.autostep = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.timestep = this.timestep = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.ttemp = this.ttemp = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.time = this.time = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.exception_listeners = this.exception_listeners = (java.util.Set)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.worker = this.worker = (run.Worker[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.tsolve = this.tsolve = (java.lang.Thread[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trackwriter = this.trackwriter = (run.TrackWriter)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.resultwriter = this.resultwriter = (run.Writer)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_node = this.temporary_node = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_constraint = this.temporary_constraint = (run.Constraint)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_tracker = this.temporary_tracker = (run.Tracker)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_element = this.temporary_element = (run.Element)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.controlset = this.controlset = (run.Controlset)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.loadlist = this.loadlist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.constraintlist = this.constraintlist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.materiallist = this.materiallist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trackerlist = this.trackerlist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.elementlist = this.elementlist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodelist = this.nodelist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodetable = this.nodetable = (java.util.Hashtable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.filename = this.filename = (java.lang.String)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.exception_listeners);
      c.descend(this.worker);
      c.descend(this.tsolve);
      c.descend(this.trackwriter);
      c.descend(this.resultwriter);
      c.descend(this.temporary_node);
      c.descend(this.temporary_constraint);
      c.descend(this.temporary_tracker);
      c.descend(this.temporary_element);
      c.descend(this.controlset);
      c.descend(this.loadlist);
      c.descend(this.constraintlist);
      c.descend(this.materiallist);
      c.descend(this.trackerlist);
      c.descend(this.elementlist);
      c.descend(this.nodelist);
      c.descend(this.nodetable);
      c.descend(this.filename);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.exception_listeners = (java.util.Set)f.filter(this.exception_listeners);
      this.worker = (run.Worker[])f.filter(this.worker);
      this.tsolve = (java.lang.Thread[])f.filter(this.tsolve);
      this.trackwriter = (run.TrackWriter)f.filter(this.trackwriter);
      this.resultwriter = (run.Writer)f.filter(this.resultwriter);
      this.temporary_node = (run.Node)f.filter(this.temporary_node);
      this.temporary_constraint = (run.Constraint)f.filter(this.temporary_constraint);
      this.temporary_tracker = (run.Tracker)f.filter(this.temporary_tracker);
      this.temporary_element = (run.Element)f.filter(this.temporary_element);
      this.controlset = (run.Controlset)f.filter(this.controlset);
      this.loadlist = (run.RplVector)f.filter(this.loadlist);
      this.constraintlist = (run.RplVector)f.filter(this.constraintlist);
      this.materiallist = (run.RplVector)f.filter(this.materiallist);
      this.trackerlist = (run.RplVector)f.filter(this.trackerlist);
      this.elementlist = (run.RplVector)f.filter(this.elementlist);
      this.nodelist = (run.RplVector)f.filter(this.nodelist);
      this.nodetable = (java.util.Hashtable)f.filter(this.nodetable);
      this.filename = (java.lang.String)f.filter(this.filename);
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
         return new ModelSmp(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((ModelSmp)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ModelSmp)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((ModelSmp)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new ModelSmp((ModelSmp)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((ModelSmp)copy).deepCloneReferences((ModelSmp)orig, _helper);
         return false;
      }
      public Class getType() {
         return ModelSmp.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public ModelSmp(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(ModelSmp._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.time_error = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.timestep_error = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.i = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.nr_of_CPUs = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_loads = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_constraints = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_groups = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_controls = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_materials = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_nodes = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_trackers = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_elements = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.failure_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.autostep = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.timestep = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.ttemp = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.time = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(ModelSmp._SIZE);
      this.exception_listeners = (java.util.Set)_stream.readReference();
      this.worker = (run.Worker[])_stream.readReference();
      this.tsolve = (java.lang.Thread[])_stream.readReference();
      this.trackwriter = (run.TrackWriter)_stream.readReference();
      this.resultwriter = (run.Writer)_stream.readReference();
      this.temporary_node = (run.Node)_stream.readReference();
      this.temporary_constraint = (run.Constraint)_stream.readReference();
      this.temporary_tracker = (run.Tracker)_stream.readReference();
      this.temporary_element = (run.Element)_stream.readReference();
      this.controlset = (run.Controlset)_stream.readReference();
      this.loadlist = (run.RplVector)_stream.readReference();
      this.constraintlist = (run.RplVector)_stream.readReference();
      this.materiallist = (run.RplVector)_stream.readReference();
      this.trackerlist = (run.RplVector)_stream.readReference();
      this.elementlist = (run.RplVector)_stream.readReference();
      this.nodelist = (run.RplVector)_stream.readReference();
      this.nodetable = (java.util.Hashtable)_stream.readReference();
      this.filename = (java.lang.String)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(ModelSmp._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.time_error);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.timestep_error);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.i);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.nr_of_CPUs);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_loads);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_constraints);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_groups);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_controls);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_materials);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_nodes);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_trackers);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_elements);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.failure_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.autostep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.timestep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.ttemp);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.time);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.exception_listeners);
      _stream.writeReference(this.worker);
      _stream.writeReference(this.tsolve);
      _stream.writeReference(this.trackwriter);
      _stream.writeReference(this.resultwriter);
      _stream.writeReference(this.temporary_node);
      _stream.writeReference(this.temporary_constraint);
      _stream.writeReference(this.temporary_tracker);
      _stream.writeReference(this.temporary_element);
      _stream.writeReference(this.controlset);
      _stream.writeReference(this.loadlist);
      _stream.writeReference(this.constraintlist);
      _stream.writeReference(this.materiallist);
      _stream.writeReference(this.trackerlist);
      _stream.writeReference(this.elementlist);
      _stream.writeReference(this.nodelist);
      _stream.writeReference(this.nodetable);
      _stream.writeReference(this.filename);
   }
   public ModelSmp(ModelSmp _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.time_error = _orig.time_error;
      this.timestep_error = _orig.timestep_error;
      this.i = _orig.i;
      this.nr_of_CPUs = _orig.nr_of_CPUs;
      this.number_of_loads = _orig.number_of_loads;
      this.number_of_constraints = _orig.number_of_constraints;
      this.number_of_groups = _orig.number_of_groups;
      this.number_of_controls = _orig.number_of_controls;
      this.number_of_materials = _orig.number_of_materials;
      this.number_of_nodes = _orig.number_of_nodes;
      this.number_of_trackers = _orig.number_of_trackers;
      this.number_of_elements = _orig.number_of_elements;
      this.failure_is_set = _orig.failure_is_set;
      this.autostep = _orig.autostep;
      this.timestep = _orig.timestep;
      this.ttemp = _orig.ttemp;
      this.time = _orig.time;
   }
   public void deepCloneReferences(ModelSmp _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.exception_listeners = (java.util.Set)_helper.internalDeepClone(_orig.exception_listeners);
      this.worker = (run.Worker[])_helper.internalDeepClone(_orig.worker);
      this.tsolve = (java.lang.Thread[])_helper.internalDeepClone(_orig.tsolve);
      this.trackwriter = (run.TrackWriter)_helper.internalDeepClone(_orig.trackwriter);
      this.resultwriter = (run.Writer)_helper.internalDeepClone(_orig.resultwriter);
      this.temporary_node = (run.Node)_helper.internalDeepClone(_orig.temporary_node);
      this.temporary_constraint = (run.Constraint)_helper.internalDeepClone(_orig.temporary_constraint);
      this.temporary_tracker = (run.Tracker)_helper.internalDeepClone(_orig.temporary_tracker);
      this.temporary_element = (run.Element)_helper.internalDeepClone(_orig.temporary_element);
      this.controlset = (run.Controlset)_helper.internalDeepClone(_orig.controlset);
      this.loadlist = (run.RplVector)_helper.internalDeepClone(_orig.loadlist);
      this.constraintlist = (run.RplVector)_helper.internalDeepClone(_orig.constraintlist);
      this.materiallist = (run.RplVector)_helper.internalDeepClone(_orig.materiallist);
      this.trackerlist = (run.RplVector)_helper.internalDeepClone(_orig.trackerlist);
      this.elementlist = (run.RplVector)_helper.internalDeepClone(_orig.elementlist);
      this.nodelist = (run.RplVector)_helper.internalDeepClone(_orig.nodelist);
      this.nodetable = (java.util.Hashtable)_helper.internalDeepClone(_orig.nodetable);
      this.filename = (java.lang.String)_helper.internalDeepClone(_orig.filename);
   }
   private volatile double time;
   private volatile double ttemp;
   private double timestep;
   private boolean autostep;
   private boolean failure_is_set = false;
   private int number_of_elements;
   private int number_of_trackers;
   private int number_of_nodes;
   private int number_of_materials;
   private int number_of_controls;
   private int number_of_groups;
   private int number_of_constraints;
   private int number_of_loads;
   private int nr_of_CPUs;
   private String filename;
   private Hashtable nodetable;
   private RplVector nodelist;
   private RplVector elementlist;
   private RplVector trackerlist;
   private RplVector materiallist;
   private RplVector constraintlist;
   private RplVector loadlist;
   private Controlset controlset;
   private int i;
   private Element temporary_element;
   private Tracker temporary_tracker;
   private Constraint temporary_constraint;
   private Node temporary_node;
   private Writer resultwriter;
   private TrackWriter trackwriter;
   private Thread[] tsolve;
   private Worker[] worker;
   private Set exception_listeners;
   private double timestep_error = Double.MAX_VALUE;
   private double time_error = Double.MAX_VALUE;
   public ModelSmp(int nr_of_CPUs, String fname) {
      super();
      this.nr_of_CPUs = nr_of_CPUs;
      this.exception_listeners = Collections.synchronizedSet(new HashSet());
      this.filename = fname;
   }
   public void assembleMassMatrix() throws Exception {
      int i;
      Node temp_node;
      Element temp_element;
      Constraint temp_constraint;
      try {
         System.out.println("Assembling Elements");
         for (i = 0; i < this.number_of_elements; i++) {
            temp_element = (Element)this.elementlist.elementAt(i);
            temp_element.assembleMassMatrix();
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating" + e);
      } catch (NullPointerException e) {
         throw new NullPointerException("\n* Error during Assembly phase of Element\n* This error could be the result of a missing (or wrong) parameter in the indata file \n* " + e);
      }
      try {
         System.out.println("Assembling Nodes");
         for (i = 0; i < this.nodelist.size(); i++) {
            temp_node = (Node)this.nodelist.elementAt(i);
            temp_node.determineMassMatrix();
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating" + e);
      } catch (NullPointerException e) {
         throw new NullPointerException("\n* Error during Assembly phase of Node \n* This error could be the result of a missing (or wrong) parameter in the indata file \n* " + e);
      }
      try {
         System.out.println("Assembling Constraints");
         for (i = 0; i < this.number_of_constraints; i++) {
            temp_constraint = (Constraint)this.constraintlist.elementAt(i);
            temp_constraint.determineMassMatrix(this.nodelist);
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating" + e);
      } catch (NullPointerException e) {
         throw new NullPointerException("\n* Error during Assembly phase of Constraint \n* This error could be the result of a missing (or wrong) parameter in the indata file \n* " + e);
      }
   }
   public void initialize(String fname) throws Exception {
      double frac;
      double frac2;
      this.filename = new String(fname);
      Reader indatafile = new FembicReader(this.filename);
      this.number_of_elements = indatafile.numberOfElements();
      this.number_of_trackers = indatafile.numberOfTrackers();
      this.number_of_materials = indatafile.numberOfMaterials();
      this.number_of_nodes = indatafile.numberOfNodes();
      this.number_of_constraints = indatafile.numberOfConstraints();
      this.number_of_loads = indatafile.numberOfLoads();
      this.number_of_controls = indatafile.numberOfControls();
      this.number_of_groups = indatafile.numberOfGroups();
      this.elementlist = new RplVector(this.number_of_elements);
      this.trackerlist = new RplVector(this.number_of_trackers);
      this.materiallist = new RplVector(this.number_of_materials);
      this.nodelist = new RplVector(this.number_of_nodes);
      this.nodetable = new Hashtable(this.number_of_nodes);
      this.constraintlist = new RplVector(this.number_of_constraints);
      this.loadlist = new RplVector(this.number_of_loads);
      this.controlset = new Controlset();
      try {
         System.out.println("Reading Constraints");
         indatafile.open();
         for (this.i = 0; this.i < this.number_of_constraints; this.i++) {
            this.constraintlist.addElement(indatafile.getNextConstraint(this.nodelist));
         }
         indatafile.close();
         System.out.println("Filled constraintlist");
         System.out.println("Reading Loads");
         indatafile.open();
         for (this.i = 0; this.i < this.number_of_loads; this.i++) {
            this.loadlist.addElement(indatafile.getNextLoad(this.nodelist));
         }
         indatafile.close();
         System.out.println("Filled loadlist");
         indatafile.open();
         System.out.println("Reading Nodes");
         frac2 = 0;
         for (this.i = 0; this.i < this.number_of_nodes; this.i++) {
            this.temporary_node = indatafile.getNextNode(this.constraintlist, this.loadlist);
            this.nodelist.addElement(this.temporary_node);
            this.nodetable.put(new Integer(this.temporary_node.getNumber()), this.temporary_node);
            frac = this.i * 10 / this.number_of_nodes;
            frac %= 10;
            if (frac != frac2) {
               System.out.println("" + 10 * frac + "% complete");
               frac2 = frac;
            }
         }
         indatafile.close();
         System.out.println("Filled nodelist");
         indatafile.open();
         System.out.println("Reading Materials");
         Material m;
         for (this.i = 0; this.i < this.number_of_materials; this.i++) {
            m = indatafile.getNextMaterial();
            if (m.failure_strain_is_set || m.failure_stress_is_set) {
               this.failure_is_set = true;
            }
            this.materiallist.addElement(m);
         }
         indatafile.close();
         System.out.println("Filled materiallist");
         indatafile.open();
         System.out.println("Reading Elements");
         frac2 = 0;
         for (this.i = 0; this.i < this.number_of_elements; this.i++) {
            this.elementlist.addElement(indatafile.getNextElement(this.materiallist, this.nodelist, this.loadlist, this.nodetable));
            frac = this.i * 10 / this.number_of_elements;
            frac %= 10;
            if (frac != frac2) {
               System.out.println("" + 10 * frac + "% complete");
               frac2 = frac;
            }
         }
         indatafile.close();
         System.out.println("Filled elementlist");
         indatafile.open();
         System.out.println("Reading Trackers");
         for (this.i = 0; this.i < this.number_of_trackers; this.i++) {
            this.trackerlist.addElement(indatafile.getNextTracker(this.nodelist, this.elementlist));
         }
         indatafile.close();
         System.out.println("Filled trackerlist");
         indatafile.open();
         System.out.println("Reading Controls");
         for (this.i = 0; this.i < this.number_of_controls; this.i++) {
            indatafile.getControlSet(this.controlset);
         }
         indatafile.close();
         System.out.println("Filled controlset");
         this.resultwriter = indatafile.getWriter(this.nodelist, this.elementlist, this.controlset, null);
         this.trackwriter = indatafile.getTrackWriter(this.trackerlist, this.controlset, null);
      }  catch (java.text.ParseException e) {
         throw new java.text.ParseException("Parameter error in indata file \n" + e + " in line " + e.getErrorOffset(), e.getErrorOffset());
      }
      try {
         this.resultwriter.initialize();
      }  catch (Exception e) {
         throw new Exception("Initialization error of writer" + e, e);
      }
      try {
         this.trackwriter.initialize();
      }  catch (Exception e) {
         throw new Exception("Initialization error of trackwriter" + e, e);
      }
   }
   public void post() {
   }
   private void print() {
      System.out.println();
      System.out.println();
      System.out.println("time:" + this.time);
      try {
         this.resultwriter.write(this.filename, this.time);
         this.trackwriter.write(this.time);
      }  catch (IOException ioe) {
         System.out.println(ioe);
         return;
      }
   }
   public void setInitialConditions() {
      int i;
      int j;
      Node temp_node;
      Node neighbour_node;
      Element temp_element;
      Tracker temp_tracker;
      Constraint temp_constraint;
      double total_mass;
      System.out.println("Initializing nodes");
      for (i = 0; i < this.nodelist.size(); i++) {
         temp_node = (Node)this.nodelist.elementAt(i);
         temp_node.setInitialConditions();
      }
      System.out.println("Sorting nodes");
      Collections.sort(this.nodelist, new NodeComparator());
      System.out.println("Setting up node neighbour handles");
      for (j = 0; j < this.nodelist.size(); j++) {
         temp_node = (Node)this.nodelist.elementAt(j);
         if (j < this.nodelist.size() - 1) {
            temp_node.setRight_neighbour((Node)this.nodelist.elementAt(j + 1));
         }
         if (j > 0) {
            temp_node.setLeft_neighbour((Node)this.nodelist.elementAt(j - 1));
         }
      }
      System.out.println("Determining optimal model distribution for nodes");
      temp_node = (Node)this.nodelist.firstElement();
      while (temp_node.getLeft_neighbour() != null) temp_node = temp_node.getLeft_neighbour();
      for (i = 0; i < this.nodelist.size(); i++) {
         temp_node.setCpu_number(i * this.nr_of_CPUs / this.nodelist.size());
         temp_node = temp_node.getRight_neighbour();
      }
      System.out.println("Initializing elements");
      for (i = 0; i < this.number_of_elements; i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         temp_element.setInitialConditions();
      }
      System.out.println("Assigning each element to a CPU");
      for (i = 0; i < this.number_of_elements; i++) {
         temp_element = (Element)this.elementlist.elementAt(i);
         temp_element.determineCpu_number();
      }
      System.out.println("Initializing trackers");
      for (i = 0; i < this.number_of_trackers; i++) {
         temp_tracker = (Tracker)this.trackerlist.elementAt(i);
         temp_tracker.setInitialConditions();
      }
      System.out.println("Initializing constraints");
      for (i = 0; i < this.number_of_constraints; i++) {
         temp_constraint = (Constraint)this.constraintlist.elementAt(i);
         temp_constraint.setInitialConditions();
      }
      this.controlset.setInitialConditions();
      System.out.println("Determining smallest timestep size");
      if (this.controlset.getTimestep(0) == 0) {
         this.timestep = 1.0E10;
         this.autostep = true;
         for (i = 0; i < this.number_of_elements; i++) {
            this.timestep = ((Element)this.elementlist.elementAt(i)).checkTimestep(this.timestep);
         }
      } else {
         this.timestep = this.controlset.getTimestep(0);
         this.autostep = false;
      }
      System.out.println("Determined timestep: " + this.timestep);
      System.out.println("Calculating total model mass");
      total_mass = 0;
      for (i = 0; i < this.nodelist.size(); i++) {
         temp_node = (Node)this.nodelist.elementAt(i);
         total_mass += temp_node.getMass();
      }
      System.out.println("Total model mass = " + total_mass);
   }
   public void solve() throws InterruptedException {
      long time_info;
      long time_info_tmp;
      long time_remained;
      int time_h;
      int time_m;
      int time_s;
      String time_str;
      final Barrier barrier;
      boolean autosave = false;
      time_info = new Date().getTime();
      this.ttemp = 1.0E10;
      this.tsolve = new Thread[this.nr_of_CPUs];
      this.worker = new Worker[this.nr_of_CPUs];
      int[] worker_element = new int[this.nr_of_CPUs];
      int[] worker_node = new int[this.nr_of_CPUs];
      barrier = BarrierFactory.createBarrier(this.nr_of_CPUs + 1);
      this.time = this.controlset.getStarttime();
      if (new File(this.filename + ".autosave").exists()) {
         readAutoSave();
         System.out.println("Found saved result for Time: " + this.time + "\tTime step: " + this.timestep);
      }
      if (new File(this.filename + ".error").exists()) {
         readAutoSaveError();
         System.out.println("Found saved error for Time: " + this.time_error + "\tTime step: " + this.timestep_error);
         this.timestep_error /= 2.0;
         if (this.time >= this.time_error && this.timestep > this.timestep_error) this.timestep = this.timestep_error;
         System.out.println("Changed time step: " + this.timestep_error);
      }
      for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
         this.worker[this.i] = new Worker(barrier, this.time, this.timestep, this.autostep);
         this.worker[this.i].addExceptionListener(this);
         this.tsolve[this.i] = new Thread(this.worker[this.i]);
         worker_element[this.i] = 0;
         worker_node[this.i] = 0;
      }
      System.out.println("Distributing the model on " + this.nr_of_CPUs + " CPU:s");
      for (int i = 0; i < this.elementlist.size(); i++) {
         this.temporary_element = (Element)this.elementlist.elementAt(i);
         this.worker[this.temporary_element.getCpu_number()].addElement(this.temporary_element);
         worker_element[this.temporary_element.getCpu_number()]++;
      }
      for (int i = 0; i < this.nodelist.size(); i++) {
         this.temporary_node = (Node)this.nodelist.elementAt(i);
         this.worker[this.temporary_node.getCpu_number()].addNode(this.temporary_node);
         worker_node[this.temporary_node.getCpu_number()]++;
      }
      for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
         System.out.println("CPU " + this.i + " Nodes: " + worker_node[this.i] + " \tElements: " + worker_element[this.i]);
      }
      for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
         this.tsolve[this.i].setPriority(Thread.MIN_PRIORITY);
         this.tsolve[this.i].start();
      }
      for (this.time = this.time; this.time <= this.controlset.getEndtime(); this.time += this.timestep) {
         for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
            this.worker[this.i].setTime(this.time);
            this.worker[this.i].setTimestep(this.timestep);
            this.worker[this.i].setAutostep(this.autostep);
         }
         barrier.sync();
         barrier.sync();
         if (this.failure_is_set) {
            for (this.i = 0; this.i < this.number_of_elements; this.i++) {
               this.temporary_element = (Element)this.elementlist.elementAt(this.i);
               if (!this.temporary_element.isDeActivated()) {
                  this.temporary_element.checkIfFailed();
                  if (this.temporary_element.hasFailed()) this.temporary_element.deActivate();
               }
            }
         }
         for (this.i = 0; this.i < this.number_of_constraints; this.i++) {
            this.temporary_constraint = (Constraint)this.constraintlist.elementAt(this.i);
            this.temporary_constraint.update();
         }
         for (this.i = 0; this.i < this.number_of_nodes; this.i++) {
            this.temporary_node = (Node)this.nodelist.elementAt(this.i);
            if (!this.temporary_node.isDeActivated()) {
               this.temporary_node.calculateNewPosition(this.timestep, this.time);
               this.temporary_node.checkNeighbours();
            }
         }
         for (this.i = 0; this.i < this.number_of_trackers; this.i++) {
            this.temporary_tracker = (Tracker)this.trackerlist.elementAt(this.i);
            this.temporary_tracker.collectData();
            this.temporary_tracker.calculate();
         }
         if (this.controlset.getTimestep(this.time) == 0) {
            for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
               this.ttemp = Math.min(this.ttemp, this.worker[this.i].getTtemp());
            }
            this.timestep = this.ttemp;
            this.ttemp = 1.0E10;
            this.autostep = true;
         } else {
            this.timestep = this.controlset.getTimestep(this.time);
            if (this.time >= this.time_error && this.timestep > this.timestep_error) this.timestep = this.timestep_error;
            this.autostep = false;
         }
         if (this.controlset.timeToPrint(this.time)) {
            System.out.println();
            System.out.println();
            time_info_tmp = new Date().getTime();
            time_remained = (time_info_tmp - time_info) * (int)((this.controlset.getEndtime() - this.time) / this.controlset.getPrintstep()) / 1000;
            time_h = (int)(time_remained / 3600);
            time_m = (int)(time_remained / 60 - time_h * 60);
            time_s = (int)(time_remained - (int)(time_remained / 60) * 60);
            time_str = "";
            if (time_h < 10) {
               time_str += "0" + time_h;
            } else {
               time_str += time_h;
            }
            if (time_m < 10) {
               time_str += ":0" + time_m;
            } else {
               time_str += ":" + time_m;
            }
            if (time_s < 10) {
               time_str += ":0" + time_s;
            } else {
               time_str += ":" + time_s;
            }
            System.out.println("Time: " + this.time + "\tRemaining time (hh:mm:ss) " + time_str);
            time_info = time_info_tmp;
            try {
               this.resultwriter.write(this.filename, this.time);
               autosave = true;
            }  catch (IOException ioe) {
               System.out.println(ioe);
               return;
            }
         }
         if (this.controlset.timeToPrintTracker(this.time)) {
            this.trackwriter.write(this.time);
         }
         barrier.sync();
         barrier.sync();
         if (autosave) {
            writeAutoSave();
            System.out.println("Auto Save Time: " + this.time + " ... ok\n");
            autosave = false;
         }
      }
      for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) this.tsolve[this.i].interrupt();
      this.post();
   }
   public void exceptionOccurred(Exception e, Object o) {
      stopThreads();
      sendException(e);
   }
   private void sendException(Exception e) {
      if (this.exception_listeners.size() == 0) {
         e.printStackTrace();
         return;
      }
      Iterator iter = this.exception_listeners.iterator();
      while (iter.hasNext()) {
         ExceptionListener l = (ExceptionListener)iter.next();
         l.exceptionOccurred(e, this);
      }
      if (!(e instanceof InterruptedException)) writeAutoSaveError();
   }
   public void stopThreads() {
      for (int i = 0; i < this.nr_of_CPUs; i++) if (this.tsolve != null && this.tsolve[i] != null) this.tsolve[i].interrupt();
      for (int i = 0; i < this.nr_of_CPUs; i++) {
         try {
            if (this.tsolve != null && this.tsolve[i] != null) this.tsolve[i].join();
         }  catch (InterruptedException e) {
         }
      }
   }
   public void addExceptionListener(ExceptionListener l) {
      this.exception_listeners.add(l);
   }
   public void run() {
      long stime;
      System.out.println("Processing file: " + this.filename);
      System.out.println("*** Initializing ***");
      try {
         initialize(this.filename);
         if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
         System.out.println("*** Assembling the Mass Matrix ***");
         assembleMassMatrix();
         if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
         System.out.println("*** Setting Initial Conditions ***");
         setInitialConditions();
         if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
         stime = System.currentTimeMillis();
         System.out.println("*** Initiating Solver ***");
         solve();
      }  catch (Exception e) {
         stopThreads();
         sendException(e);
         return;
      }
      System.out.println("Solving took " + (System.currentTimeMillis() - stime) + " ms");
      post();
   }
   public void writeAutoSave() {
      try {
         ObjectOutputStream aout = new ObjectOutputStream(new FileOutputStream(this.filename + ".autosave"));
         writeObject(aout);
         aout.flush();
         aout.close();
      }  catch (Exception e) {
         e.printStackTrace();
      }
   }
   public void readAutoSave() {
      try {
         ObjectInputStream ain = new ObjectInputStream(new FileInputStream(this.filename + ".autosave"));
         readObject(ain);
         ain.close();
      }  catch (Exception e) {
         if (!(e instanceof FileNotFoundException)) e.printStackTrace();
      }
   }
   private void writeObject(java.io.ObjectOutputStream out) throws IOException {
      out.writeDouble(this.time);
      out.writeDouble(this.ttemp);
      out.writeDouble(this.timestep);
      out.writeBoolean(this.autostep);
      out.writeBoolean(this.failure_is_set);
      out.writeInt(this.number_of_elements);
      out.writeInt(this.number_of_trackers);
      out.writeInt(this.number_of_nodes);
      out.writeInt(this.number_of_materials);
      out.writeInt(this.number_of_controls);
      out.writeInt(this.number_of_groups);
      out.writeInt(this.number_of_constraints);
      out.writeInt(this.number_of_loads);
      out.writeInt(this.nr_of_CPUs);
      out.writeObject(this.filename);
      out.writeObject(this.nodetable);
      out.writeObject(this.nodelist);
      out.writeObject(this.elementlist);
      out.writeObject(this.trackerlist);
      out.writeObject(this.materiallist);
      out.writeObject(this.constraintlist);
      out.writeObject(this.loadlist);
      out.writeObject(this.controlset);
      out.writeObject(this.resultwriter);
      out.writeObject(this.trackwriter);
   }
   private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
      this.time = in.readDouble();
      this.ttemp = in.readDouble();
      this.timestep = in.readDouble();
      this.autostep = in.readBoolean();
      this.failure_is_set = in.readBoolean();
      this.number_of_elements = in.readInt();
      this.number_of_trackers = in.readInt();
      this.number_of_nodes = in.readInt();
      this.number_of_materials = in.readInt();
      this.number_of_controls = in.readInt();
      this.number_of_groups = in.readInt();
      this.number_of_constraints = in.readInt();
      this.number_of_loads = in.readInt();
      this.nr_of_CPUs = in.readInt();
      this.filename = (String)in.readObject();
      this.nodetable = (Hashtable)in.readObject();
      this.nodelist = (RplVector)in.readObject();
      this.elementlist = (RplVector)in.readObject();
      this.trackerlist = (RplVector)in.readObject();
      this.materiallist = (RplVector)in.readObject();
      this.constraintlist = (RplVector)in.readObject();
      this.loadlist = (RplVector)in.readObject();
      this.controlset = (Controlset)in.readObject();
      this.resultwriter = (Writer)in.readObject();
      this.trackwriter = (TrackWriter)in.readObject();
   }
   public void writeAutoSaveError() {
      try {
         ObjectOutputStream aout = new ObjectOutputStream(new FileOutputStream(this.filename + ".error"));
         aout.writeDouble(this.time);
         aout.writeDouble(this.timestep);
         aout.flush();
         aout.close();
      }  catch (Exception e) {
         e.printStackTrace();
      }
   }
   public void readAutoSaveError() {
      try {
         ObjectInputStream ain = new ObjectInputStream(new FileInputStream(this.filename + ".error"));
         this.time_error = ain.readDouble();
         this.timestep_error = ain.readDouble();
         ain.close();
      }  catch (Exception e) {
         if (!(e instanceof FileNotFoundException)) e.printStackTrace();
      }
   }
}
