package run;
import jp.sync.Barrier;

import java.util.*;

public class Worker implements uka.patch.Patchable, uka.transport.Transportable, Runnable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Worker copy = (Worker)_copy;
      if (po.writeDiff(this.autostep, copy.autostep)) copy.autostep = this.autostep;
      if (po.writeDiff(this.keep_running, copy.keep_running)) copy.keep_running = this.keep_running;
      if (po.writeDiff(this.ttemp, copy.ttemp)) copy.ttemp = this.ttemp;
      if (po.writeDiff(this.timestep, copy.timestep)) copy.timestep = this.timestep;
      if (po.writeDiff(this.time, copy.time)) copy.time = this.time;
      copy.exception_listeners = this.exception_listeners = (java.util.Set)po.writeDiff(this.exception_listeners, copy.exception_listeners);
      copy.barrier = this.barrier = (jp.sync.Barrier)po.writeDiff(this.barrier, copy.barrier);
      copy.nodelist = this.nodelist = (java.util.Vector)po.writeDiff(this.nodelist, copy.nodelist);
      copy.elementlist = this.elementlist = (java.util.Vector)po.writeDiff(this.elementlist, copy.elementlist);
      copy.temporary_node = this.temporary_node = (run.Node)po.writeDiff(this.temporary_node, copy.temporary_node);
      copy.temporary_element = this.temporary_element = (run.Element)po.writeDiff(this.temporary_element, copy.temporary_element);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Worker copy = (Worker)_copy;
      if (pi.hasDiff()) copy.autostep = this.autostep = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.keep_running = this.keep_running = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.ttemp = this.ttemp = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.timestep = this.timestep = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.time = this.time = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.exception_listeners = this.exception_listeners = (java.util.Set)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.barrier = this.barrier = (jp.sync.Barrier)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodelist = this.nodelist = (java.util.Vector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.elementlist = this.elementlist = (java.util.Vector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_node = this.temporary_node = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_element = this.temporary_element = (run.Element)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.exception_listeners);
      c.descend(this.barrier);
      c.descend(this.nodelist);
      c.descend(this.elementlist);
      c.descend(this.temporary_node);
      c.descend(this.temporary_element);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.exception_listeners = (java.util.Set)f.filter(this.exception_listeners);
      this.barrier = (jp.sync.Barrier)f.filter(this.barrier);
      this.nodelist = (java.util.Vector)f.filter(this.nodelist);
      this.elementlist = (java.util.Vector)f.filter(this.elementlist);
      this.temporary_node = (run.Node)f.filter(this.temporary_node);
      this.temporary_element = (run.Element)f.filter(this.temporary_element);
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
         return new Worker(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Worker)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Worker)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Worker)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Worker((Worker)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Worker)copy).deepCloneReferences((Worker)orig, _helper);
         return false;
      }
      public Class getType() {
         return Worker.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Worker(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Worker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.autostep = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.keep_running = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.ttemp = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.timestep = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.time = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Worker._SIZE);
      this.exception_listeners = (java.util.Set)_stream.readReference();
      this.barrier = (jp.sync.Barrier)_stream.readReference();
      this.nodelist = (java.util.Vector)_stream.readReference();
      this.elementlist = (java.util.Vector)_stream.readReference();
      this.temporary_node = (run.Node)_stream.readReference();
      this.temporary_element = (run.Element)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Worker._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.autostep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.keep_running);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.ttemp);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.timestep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.time);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.exception_listeners);
      _stream.writeReference(this.barrier);
      _stream.writeReference(this.nodelist);
      _stream.writeReference(this.elementlist);
      _stream.writeReference(this.temporary_node);
      _stream.writeReference(this.temporary_element);
   }
   public Worker(Worker _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.autostep = _orig.autostep;
      this.keep_running = _orig.keep_running;
      this.ttemp = _orig.ttemp;
      this.timestep = _orig.timestep;
      this.time = _orig.time;
   }
   public void deepCloneReferences(Worker _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.exception_listeners = (java.util.Set)_helper.internalDeepClone(_orig.exception_listeners);
      this.barrier = (jp.sync.Barrier)_helper.internalDeepClone(_orig.barrier);
      this.nodelist = (java.util.Vector)_helper.internalDeepClone(_orig.nodelist);
      this.elementlist = (java.util.Vector)_helper.internalDeepClone(_orig.elementlist);
      this.temporary_node = (run.Node)_helper.internalDeepClone(_orig.temporary_node);
      this.temporary_element = (run.Element)_helper.internalDeepClone(_orig.temporary_element);
   }
   private Element temporary_element;
   private Node temporary_node;
   private Vector elementlist;
   private Vector nodelist;
   private Barrier barrier;
   private double time;
   private double timestep;
   private double ttemp;
   private boolean keep_running;
   private boolean autostep;
   private Set exception_listeners;
   public Worker(Barrier barrier, double time, double timestep, boolean autostep) {
      super();
      this.barrier = barrier;
      this.time = time;
      this.timestep = timestep;
      this.autostep = autostep;
      this.elementlist = new Vector();
      this.nodelist = new Vector();
      this.exception_listeners = Collections.synchronizedSet(new HashSet());
   }
   public void addElement(Element el) {
      this.elementlist.addElement(el);
   }
   public void removeElement(Element el) {
      this.elementlist.removeElement(el);
   }
   public void addNode(Node node) {
      this.nodelist.addElement(node);
   }
   public void removeNode(Node node) {
      this.nodelist.removeElement(node);
   }
   public void run() {
      int i;
      int j;
      int number_of_integration_points;
      int number_of_nodes = this.nodelist.size();
      try {
         while (true) {
            this.barrier.sync();
            if (this.autostep == true) {
               this.ttemp = 1.0E10;
            }
            for (i = 0; i < this.elementlist.size(); i++) {
               this.temporary_element = (Element)this.elementlist.elementAt(i);
               if (!this.temporary_element.isDeActivated()) {
                  this.temporary_element.updateLocalCoordinateSystem();
                  number_of_integration_points = this.temporary_element.getNumberOfIntegrationPoints();
                  for (j = 0; j < number_of_integration_points; j++) {
                     this.temporary_element.calculateStrain(this.timestep, j);
                     this.temporary_element.calculateStress(j, this.timestep);
                  }
                  for (j = 0; j < number_of_integration_points; j++) {
                     this.temporary_element.calculateNodalForces(j, this.timestep);
                  }
                  this.temporary_element.calculateExternalForces(this.time);
                  this.temporary_element.calculateContactForces();
                  if (this.autostep == true) {
                     this.ttemp = this.temporary_element.checkTimestep(this.ttemp);
                  }
               }
            }
            this.barrier.sync();
            this.barrier.sync();
            for (i = 0; i < this.nodelist.size(); i++) {
               this.temporary_node = (Node)this.nodelist.elementAt(i);
               if (!this.temporary_node.isDeActivated()) {
                  this.temporary_node.clearNodalForces();
               }
            }
            this.barrier.sync();
         }
      }  catch (InterruptedException e) {
         try {
            this.barrier.sync();
         }  catch (Exception eb) {
         }
         System.err.println("\nWorker Interrupted: Time: " + this.time + "   Time step: " + this.timestep);
         sendException(e);
         return;
      } catch (Exception e) {
         try {
            this.barrier.sync();
         }  catch (Exception eb) {
         }
         System.err.println("\nWorker Exception: Time: " + this.time + "   Time step: " + this.timestep);
         sendException(e);
         return;
      }
   }
   public double getTime() {
      return this.time;
   }
   public void setTime(double time) {
      this.time = time;
   }
   public double getTimestep() {
      return this.timestep;
   }
   public void setTimestep(double timestep) {
      this.timestep = timestep;
   }
   public double getTtemp() {
      return this.ttemp;
   }
   public boolean isAutostep() {
      return this.autostep;
   }
   public void setAutostep(boolean autostep) {
      this.autostep = autostep;
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
   }
   void addExceptionListener(ExceptionListener l) {
      this.exception_listeners.add(l);
   }
}
