package run;
import uka.karmi.rmi.RemoteException;

import jp.lang.*;

import jp.sync.Barrier;

import jp.sync.BarrierFactory;

public class Impact implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Impact copy = (Impact)_copy;
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Impact copy = (Impact)_copy;
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
         return new Impact(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Impact)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Impact)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Impact)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Impact((Impact)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Impact)copy).deepCloneReferences((Impact)orig, _helper);
         return false;
      }
      public Class getType() {
         return Impact.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   public Impact(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public Impact(Impact _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
   }
   public void deepCloneReferences(Impact _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
   }
   public Impact() {
      super();
   }
   public static void main(java.lang.String[] args) {
      System.out.println("\n=========== Welcome to Impact ==========");
      System.out.println("= Impact is free software and licensed =");
      System.out.println("= under GPL. Please note that it comes =");
      System.out.println("= with no warranties whatsoever.       =");
      System.out.println("=                                      =");
      System.out.println("= Report any bugs at our webpage:      =");
      System.out.println("= http://impact.sourceforge.net        =");
      System.out.println("=============== ENJOY!!!! ==============\n\n");
      int nr_CPU = DistributedRuntime.getMachineCnt();
      if (args.length == 1) {
         if (nr_CPU > 0) try {
            run_cluster(args[0], nr_CPU);
         }  catch (Error e) {
            e.printStackTrace();
            return;
         } catch (Exception e) {
            e.printStackTrace();
            return;
         } else {
            nr_CPU = Runtime.getRuntime().availableProcessors();
            try {
               run_smp(args[0], nr_CPU);
            }  catch (Exception e) {
               e.printStackTrace();
               return;
            }
         }
      } else {
         System.out.println("Impact - A simple explicit dynamic program\n");
         System.out.println("Syntax: java run.Impact sourcefile.in  to start solver");
      }
      System.exit(0);
   }
   public static void run_smp(String fname, int nr_CPU) throws RemoteException, Exception {
      System.out.println("*******************************");
      System.out.println("*** Solver has been invoked ***");
      System.out.println("*******************************\n\n");
      System.out.println("Running on " + nr_CPU + " clients\n\n");
      ModelSmp node = new ModelSmp(nr_CPU, fname);
      node.run();
      System.out.println("*** Solution completed ***");
   }
   public static void run_cluster(final String fname, int nr_CPU) throws Exception {
      final ModelCluster[] nodes;
      final Barrier barrier;
      System.out.println("********************************");
      System.out.println("*** Cluster has been invoked ***");
      System.out.println("********************************\n\n");
      System.out.println("Running on " + nr_CPU + " clients\n\n");
      nodes = new ModelCluster[nr_CPU];
      barrier = BarrierFactory.createBarrier(nr_CPU);
      System.out.println("*** Creating cluster processes ***");
      for (int n = 0; n < nr_CPU; n++) {
         nodes[n] =  /** @at n */ new ModelCluster(jp.lang.Node.getNode(n), nr_CPU, n, fname, barrier);
      }
      for (int n = 0; n < nr_CPU; n++) nodes[n].setCluster_nodes(nodes);
      Thread[] tsolve = new Thread[nr_CPU];
      for (int n = 0; n < tsolve.length; n++) {
         tsolve[n] = new Thread(nodes[n]);
         tsolve[n].setPriority(Thread.MIN_PRIORITY);
      }
      System.out.println("*** Starting the solution ***");
      for (int n = 0; n < tsolve.length; n++) {
         tsolve[n].start();
      }
      long stime = System.currentTimeMillis();
      for (int n = 0; n < tsolve.length; n++) {
         try {
            tsolve[n].join();
         }  catch (InterruptedException e) {
            e.printStackTrace();
            return;
         }
      }
      System.out.println("Solving took " + (System.currentTimeMillis() - stime) + " ms");
   }
}
