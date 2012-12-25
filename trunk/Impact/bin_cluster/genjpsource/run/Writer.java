package run;
import run.writers.GidWriter;

import uka.karmi.rmi.RemoteException;

import jp.lang.RemoteObject;

import jp.sync.Barrier;

public abstract class Writer implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Writer copy = (Writer)_copy;
      copy.element_print_types = this.element_print_types = (boolean[])po.writeDiff(this.element_print_types, copy.element_print_types);
      copy.nodelist = this.nodelist = (run.RplVector)po.writeDiff(this.nodelist, copy.nodelist);
      copy.elementlist = this.elementlist = (run.RplVector)po.writeDiff(this.elementlist, copy.elementlist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Writer copy = (Writer)_copy;
      if (pi.hasDiff()) copy.element_print_types = this.element_print_types = (boolean[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.nodelist = this.nodelist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.elementlist = this.elementlist = (run.RplVector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.element_print_types);
      c.descend(this.nodelist);
      c.descend(this.elementlist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.element_print_types = (boolean[])f.filter(this.element_print_types);
      this.nodelist = (run.RplVector)f.filter(this.nodelist);
      this.elementlist = (run.RplVector)f.filter(this.elementlist);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   public Writer(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      this.element_print_types = (boolean[])_stream.readReference();
      this.nodelist = (run.RplVector)_stream.readReference();
      this.elementlist = (run.RplVector)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.writeReference(this.element_print_types);
      _stream.writeReference(this.nodelist);
      _stream.writeReference(this.elementlist);
   }
   public Writer(Writer _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(Writer _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.element_print_types = (boolean[])_helper.internalDeepClone(_orig.element_print_types);
      this.nodelist = (run.RplVector)_helper.internalDeepClone(_orig.nodelist);
      this.elementlist = (run.RplVector)_helper.internalDeepClone(_orig.elementlist);
   }
   protected RplVector elementlist;
   protected RplVector nodelist;
   protected boolean[] element_print_types;
   public Writer(RplVector nlist, RplVector elist) {
      super();
      this.nodelist = nlist;
      this.elementlist = elist;
   }
   public static Writer getWriterOfType_Fembic(String type, RplVector nodelist, RplVector elementlist, RemoteObject[] cluster_nodes) throws java.lang.IllegalArgumentException, RemoteException {
      if (type.toUpperCase().equals("GIDWRITER")) {
         return new GidWriter(nodelist, elementlist);
      }
      throw new IllegalArgumentException("Illegal Element Type");
   }
   public abstract void write(String fname, double time) throws java.io.IOException;
   public abstract void writeParallel(String fname, double time, int[] indicies, Barrier barrier, int client_nr, int nr_of_clients) throws java.io.IOException, InterruptedException;
   public abstract void initialize();
   public abstract void checkIndata() throws IllegalArgumentException;
}
