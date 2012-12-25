package run;
import java.io.*;

import java.util.*;

import uka.karmi.rmi.RemoteException;

import jp.lang.RemoteObject;

public abstract class Reader implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Reader copy = (Reader)_copy;
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Reader copy = (Reader)_copy;
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
   public Reader(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public Reader(Reader _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(Reader _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
   }
   public Reader() {
      super();
   }
   public abstract void close();
   public abstract void getControlSet(Controlset controlset) throws java.text.ParseException;
   public abstract Constraint getNextConstraint(RplVector nodelist) throws java.text.ParseException;
   public abstract Element getNextElement(RplVector materiallist, RplVector nodelist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException;
   public abstract Tracker getNextTracker(RplVector nodelist, RplVector elementlist) throws java.text.ParseException;
   public abstract Load getNextLoad(RplVector nodelist) throws java.text.ParseException;
   public abstract Material getNextMaterial() throws java.text.ParseException;
   public abstract Node getNextNode(RplVector constraintlist, RplVector loadlist) throws java.text.ParseException;
   public abstract int numberOfConstraints() throws java.text.ParseException;
   public abstract int numberOfControls() throws java.text.ParseException;
   public abstract int numberOfElements() throws java.text.ParseException;
   public abstract int numberOfTrackers() throws java.text.ParseException;
   public abstract int numberOfGroups() throws java.text.ParseException;
   public abstract int numberOfLoads() throws java.text.ParseException;
   public abstract int numberOfMaterials() throws java.text.ParseException;
   public abstract int numberOfNodes() throws java.text.ParseException;
   public abstract void open();
   public Token[] tokenize(java.io.StreamTokenizer str) throws IOException {
      int i;
      Vector v = new Vector();
      Token[] arr;
      while (str.nextToken() != java.io.StreamTokenizer.TT_EOL && str.ttype != java.io.StreamTokenizer.TT_EOF) {
         if (str.ttype == java.io.StreamTokenizer.TT_WORD) {
            v.add(new Token(str.sval));
         } else {
            v.add(new Token(str.nval));
         }
      }
      arr = new Token[v.size()];
      for (i = 0; i < v.size(); i++) {
         arr[i] = (Token)v.elementAt(i);
      }
      return arr;
   }
   public abstract Writer getWriter(RplVector nodelist, RplVector elementlist, Controlset control, RemoteObject[] cluster_nodes) throws RemoteException;
   public abstract TrackWriter getTrackWriter(RplVector trackerlist, Controlset control, RemoteObject[] cluster_nodes) throws RemoteException;
   public abstract void preProcess() throws java.text.ParseException;
}
