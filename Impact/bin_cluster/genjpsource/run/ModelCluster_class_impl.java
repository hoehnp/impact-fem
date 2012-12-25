package run;

import java.text.ParseException;

import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import uka.karmi.rmi.RemoteException;

import jp.sync.*;

import jp.lang.*;



import jp.lang.*;

public final class ModelCluster_class_impl extends jp.lang.RemoteObject_class_impl
  implements ModelCluster_class_intf
{

  /** Constructor for class implementation part of class ModelCluster. */
  public ModelCluster_class_impl(boolean isConstructor) throws uka.karmi.rmi.RemoteException {
    super(isConstructor);
  }

  /** Dummy method to achieve type conversion inside an expression 
      between the handle class 'ModelCluster' and the the class implementation 
      'ModelCluster_class_impl'. The argument is not needed. 
      This is only used by the transformation internally.
  */
  private static final ModelCluster_class_impl _ClassType_(ModelCluster x) {
    return null;
  }

  /** Replicated static constant '_class' */
  public static ModelCluster_class_intf _class;

  /** Remote static variable access: get ModelCluster._class */
  public final ModelCluster_class_intf run_ModelCluster__class_get_()  {
    return this._class;
  }

  /** Factory method to calls the constructor ModelCluster_instance_impl(nr_of_CPUs, client_nr, path, barrier) 
      on a remote node and passes the result back to the caller. This
      method is used during remote object instantiations on remote nodes.
  */
  public java.lang.Object _new(int nr_of_CPUs, int client_nr, String path, Barrier barrier) throws uka.karmi.rmi.RemoteException {
    // remote object creation may throw a RemoteException
    // during object export
    ModelCluster_instance_impl _impl = new ModelCluster_instance_impl(nr_of_CPUs, client_nr, path, barrier);

    return (java.lang.Object) _impl._getRef();
  }

  /** Code of all static initializers of the class */
  protected void _init() {
  }

  static {
    int _location = RuntimeEnvironment.getMachineID();
    try {
      // Lookup class object for initialization
      // of replicated constants (if already present).
      _class = (ModelCluster_class_intf) RuntimeEnvironment.rm.getClassInitializer("run.ModelCluster", _location);
      if (_class == null) {
        // Class is not yet loaded, load and initialize locally.
        ModelCluster_class_impl _classImpl = new ModelCluster_class_impl(false);
        _class = (ModelCluster_class_intf) _classImpl._getStub();
        RuntimeEnvironment.rm.setClassObject("run.ModelCluster",_class);
      } else {
        // Class was loaded elsewhere, copy replicated constants (if any).
      }
    } catch (uka.karmi.rmi.RemoteException _e) {
      throw new jp.lang.RemoteError("ModelCluster_class_impl.<clinit>()", _e);
    } catch (Exception _e) {
      // ClassNotFoundException, IllegalAccessException, RuntimeException
      _e.printStackTrace();
      throw new InternalError("ModelCluster_class_impl.<clinit>(): " + _e);
    }
  }
}
