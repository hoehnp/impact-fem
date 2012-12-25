package run.writers;
import java.io.*;

import jp.sync.Barrier;

import run.Constraint;

import run.Controlset;

import run.Element;

import run.Load;

import run.Material;

import run.Node;

import run.RplVector;

import run.Writer;

public class FembicWriter extends Writer implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      FembicWriter copy = (FembicWriter)_copy;
      super.createPatch(copy, po);
      copy.materiallist = this.materiallist = (run.RplVector)po.writeDiff(this.materiallist, copy.materiallist);
      copy.loadlist = this.loadlist = (run.RplVector)po.writeDiff(this.loadlist, copy.loadlist);
      copy.controlset = this.controlset = (run.Controlset)po.writeDiff(this.controlset, copy.controlset);
      copy.constraintlist = this.constraintlist = (run.RplVector)po.writeDiff(this.constraintlist, copy.constraintlist);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      FembicWriter copy = (FembicWriter)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.materiallist = this.materiallist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.loadlist = this.loadlist = (run.RplVector)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.controlset = this.controlset = (run.Controlset)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.constraintlist = this.constraintlist = (run.RplVector)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.materiallist);
      c.descend(this.loadlist);
      c.descend(this.controlset);
      c.descend(this.constraintlist);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.materiallist = (run.RplVector)f.filter(this.materiallist);
      this.loadlist = (run.RplVector)f.filter(this.loadlist);
      this.controlset = (run.Controlset)f.filter(this.controlset);
      this.constraintlist = (run.RplVector)f.filter(this.constraintlist);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new FembicWriter(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((FembicWriter)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((FembicWriter)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((FembicWriter)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new FembicWriter((FembicWriter)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((FembicWriter)copy).deepCloneReferences((FembicWriter)orig, _helper);
         return false;
      }
      public Class getType() {
         return FembicWriter.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public FembicWriter(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      this.materiallist = (run.RplVector)_stream.readReference();
      this.loadlist = (run.RplVector)_stream.readReference();
      this.controlset = (run.Controlset)_stream.readReference();
      this.constraintlist = (run.RplVector)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.writeReference(this.materiallist);
      _stream.writeReference(this.loadlist);
      _stream.writeReference(this.controlset);
      _stream.writeReference(this.constraintlist);
   }
   public FembicWriter(FembicWriter _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
   }
   public void deepCloneReferences(FembicWriter _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.materiallist = (run.RplVector)_helper.internalDeepClone(_orig.materiallist);
      this.loadlist = (run.RplVector)_helper.internalDeepClone(_orig.loadlist);
      this.controlset = (run.Controlset)_helper.internalDeepClone(_orig.controlset);
      this.constraintlist = (run.RplVector)_helper.internalDeepClone(_orig.constraintlist);
   }
   private RplVector constraintlist;
   private Controlset controlset;
   private RplVector loadlist;
   private RplVector materiallist;
   public FembicWriter(RplVector nlist, RplVector elist) {
      super(nlist, elist);
   }
   public FembicWriter(RplVector nlist, RplVector elist, Controlset cset, RplVector clist, RplVector mlist, RplVector llist) {
      super(nlist, elist);
      this.constraintlist = clist;
      this.controlset = cset;
      this.loadlist = llist;
      this.materiallist = mlist;
   }
   private void open() {
   }
   public void initialize() {
   }
   public void write(String fname, double currtime) throws java.io.IOException {
      int i;
      int j;
      int k;
      String type;
      Element temp_element;
      Node temp_node;
      Load temp_load;
      Constraint temp_constraint;
      Material temp_material;
      try {
         BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
         bw.write("# This file has been translated into Fembic format\n");
         bw.write("# by Impact acting as a translator. \n");
         bw.write("# \n");
         bw.write("\nNODES\n");
         for (k = 0; k < this.nodelist.size(); k++) {
            temp_node = (Node)this.nodelist.elementAt(k);
            if (temp_node.getNumber() >= 0) {
               bw.write(temp_node.getNumber() + " \t");
               bw.write(" x = " + temp_node.getX_pos_orig() + " \t");
               bw.write(" y = " + temp_node.getY_pos_orig() + " \t");
               bw.write(" z = " + temp_node.getZ_pos_orig() + " \t");
               if (temp_node.getConstraint() != null) bw.write(" constraint = " + temp_node.getConstraint().getName() + "\t");
               if (temp_node.getLoad() != null) bw.write(" load = " + temp_node.getLoad().getName() + "\t");
               bw.write("\n");
            }
         }
         bw.write("\n");
         for (i = 0; i < this.elementlist.size(); i++) {
            temp_element = (Element)this.elementlist.elementAt(i);
            if (!temp_element.isProcessed()) {
               type = temp_element.getType();
               bw.write("\nELEMENTS OF TYPE " + type);
               bw.write("\n");
               for (j = i; j < this.elementlist.size(); j++) {
                  temp_element = (Element)this.elementlist.elementAt(j);
                  if (temp_element.getType().equals(type) && !temp_element.isProcessed()) {
                     bw.write(temp_element.print_Fembic(Element.MESH, 0));
                     temp_element.setProcessed(true);
                  }
               }
            }
         }
         for (k = 0; k < this.elementlist.size(); k++) {
            ((Element)this.elementlist.elementAt(k)).setProcessed(false);
         }
         if (this.loadlist.size() > 0) {
            bw.write("\nLOADS\n");
            for (k = 0; k < this.loadlist.size(); k++) {
               temp_load = (Load)this.loadlist.elementAt(k);
               bw.write(temp_load.getName() + " \t");
               bw.write(temp_load.print_Fembic(Element.MESH) + " \t");
            }
            bw.write("\n");
         }
         if (this.constraintlist.size() > 0) for (i = 0; i < this.constraintlist.size(); i++) {
            temp_constraint = (Constraint)this.constraintlist.elementAt(i);
            if (!temp_constraint.isProcessed()) {
               type = temp_constraint.getType();
               bw.write("\nCONSTRAINTS OF TYPE " + type);
               bw.write("\n");
               for (j = i; j < this.constraintlist.size(); j++) {
                  temp_constraint = (Constraint)this.constraintlist.elementAt(j);
                  if (temp_constraint.getType().equals(type) && !temp_constraint.isProcessed()) {
                     bw.write(temp_constraint.print_Fembic(Element.MESH));
                     temp_constraint.setProcessed(true);
                  }
               }
            }
         }
         for (k = 0; k < this.constraintlist.size(); k++) {
            ((Constraint)this.constraintlist.elementAt(k)).setProcessed(false);
         }
         for (i = 0; i < this.materiallist.size(); i++) {
            temp_material = (Material)this.materiallist.elementAt(i);
            if (!temp_material.isProcessed()) {
               type = temp_material.getType();
               bw.write("\nMATERIALS OF TYPE " + type);
               bw.write("\n");
               for (j = i; j < this.materiallist.size(); j++) {
                  temp_material = (Material)this.materiallist.elementAt(j);
                  if (temp_material.getType().equals(type) && !temp_material.isProcessed()) {
                     bw.write(temp_material.print_Fembic(Element.MESH));
                     temp_material.setProcessed(true);
                  }
               }
            }
         }
         for (k = 0; k < this.materiallist.size(); k++) {
            ((Material)this.materiallist.elementAt(k)).setProcessed(false);
         }
         bw.write("\nCONTROLS\n");
         bw.write(this.controlset.print_Fembic(Element.MESH));
         bw.flush();
         bw.close();
      }  catch (IOException ioe) {
         System.out.println(ioe);
      }
   }
   public void writeParallel(String fname, double time, int[] indicies, Barrier barrier, int client_nr, int nr_of_clients) throws java.io.IOException {
   }
   public void checkIndata() throws IllegalArgumentException {
   }
}
