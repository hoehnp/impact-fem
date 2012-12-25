// Generated code, do not modify

package run;


/** Stub class for remote class 'run.ModelCluster_instance_impl' */
public   class ModelCluster_instance_impl_KStub extends jp.lang.RemoteObject_instance_impl_KStub
  implements ModelCluster_instance_intf
{
  /** Explicitly defined default constructor is necessary
      if uka.transport is used. */
  public ModelCluster_instance_impl_KStub() {
    super();
  }

  /** Smart stubs reuse the stub of the servers super class. The first
      method identifier can not be computed at class loading time, 
      because a compile time constant is needed in switch statements. */
  private static final int ID_FIRSTMETHOD = jp.lang.RemoteObject_instance_impl_KStub.ID_LASTMETHOD + 1;

  static { 
    if (ID_FIRSTMETHOD != jp.lang.RemoteObject_instance_impl_KStub._KARMI_getLastMethodID() + 1) {
      // The compile time constants differ from the constant at class
      // loading time. This is an error due to incomplete separate
      // compilation
      throw new InternalError(
        "Separate compilation problem: Please recompile " +
        "class 'run.ModelCluster_instance_impl' and all its subclasses."
      );
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_elements_get_() */
  public static final int ID_run_ModelCluster_number_of_elements_get_$ = ID_FIRSTMETHOD + 0;

  public int run_ModelCluster_number_of_elements_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_elements_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_elements_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_elements_set_$int = ID_FIRSTMETHOD + 1;

  public int run_ModelCluster_number_of_elements_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_elements_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_elements_inc_$int$boolean = ID_FIRSTMETHOD + 2;

  public int run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_elements_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_trackers_get_() */
  public static final int ID_run_ModelCluster_number_of_trackers_get_$ = ID_FIRSTMETHOD + 3;

  public int run_ModelCluster_number_of_trackers_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_trackers_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_trackers_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_trackers_set_$int = ID_FIRSTMETHOD + 4;

  public int run_ModelCluster_number_of_trackers_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_trackers_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_trackers_inc_$int$boolean = ID_FIRSTMETHOD + 5;

  public int run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_trackers_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_nodes_get_() */
  public static final int ID_run_ModelCluster_number_of_nodes_get_$ = ID_FIRSTMETHOD + 6;

  public int run_ModelCluster_number_of_nodes_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_nodes_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_nodes_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_nodes_set_$int = ID_FIRSTMETHOD + 7;

  public int run_ModelCluster_number_of_nodes_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_nodes_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_nodes_inc_$int$boolean = ID_FIRSTMETHOD + 8;

  public int run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_nodes_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_materials_get_() */
  public static final int ID_run_ModelCluster_number_of_materials_get_$ = ID_FIRSTMETHOD + 9;

  public int run_ModelCluster_number_of_materials_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_materials_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_materials_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_materials_set_$int = ID_FIRSTMETHOD + 10;

  public int run_ModelCluster_number_of_materials_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_materials_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_materials_inc_$int$boolean = ID_FIRSTMETHOD + 11;

  public int run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_materials_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_controls_get_() */
  public static final int ID_run_ModelCluster_number_of_controls_get_$ = ID_FIRSTMETHOD + 12;

  public int run_ModelCluster_number_of_controls_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_controls_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_controls_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_controls_set_$int = ID_FIRSTMETHOD + 13;

  public int run_ModelCluster_number_of_controls_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_controls_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_controls_inc_$int$boolean = ID_FIRSTMETHOD + 14;

  public int run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_controls_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_constraints_get_() */
  public static final int ID_run_ModelCluster_number_of_constraints_get_$ = ID_FIRSTMETHOD + 15;

  public int run_ModelCluster_number_of_constraints_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_constraints_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_constraints_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_constraints_set_$int = ID_FIRSTMETHOD + 16;

  public int run_ModelCluster_number_of_constraints_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_constraints_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_constraints_inc_$int$boolean = ID_FIRSTMETHOD + 17;

  public int run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_constraints_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_loads_get_() */
  public static final int ID_run_ModelCluster_number_of_loads_get_$ = ID_FIRSTMETHOD + 18;

  public int run_ModelCluster_number_of_loads_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_loads_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_loads_set_(int _value_) */
  public static final int ID_run_ModelCluster_number_of_loads_set_$int = ID_FIRSTMETHOD + 19;

  public int run_ModelCluster_number_of_loads_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_loads_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_number_of_loads_inc_$int$boolean = ID_FIRSTMETHOD + 20;

  public int run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_number_of_loads_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_constraintlist_get_() */
  public static final int ID_run_ModelCluster_constraintlist_get_$ = ID_FIRSTMETHOD + 21;

  public run.RplVector run_ModelCluster_constraintlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_constraintlist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_constraintlist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_constraintlist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_constraintlist_set_$run_RplVector = ID_FIRSTMETHOD + 22;

  public run.RplVector run_ModelCluster_constraintlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_constraintlist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_constraintlist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_loadlist_get_() */
  public static final int ID_run_ModelCluster_loadlist_get_$ = ID_FIRSTMETHOD + 23;

  public run.RplVector run_ModelCluster_loadlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_loadlist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_loadlist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_loadlist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_loadlist_set_$run_RplVector = ID_FIRSTMETHOD + 24;

  public run.RplVector run_ModelCluster_loadlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_loadlist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_loadlist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodelist_get_() */
  public static final int ID_run_ModelCluster_nodelist_get_$ = ID_FIRSTMETHOD + 25;

  public run.RplVector run_ModelCluster_nodelist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodelist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodelist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodelist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_nodelist_set_$run_RplVector = ID_FIRSTMETHOD + 26;

  public run.RplVector run_ModelCluster_nodelist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodelist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodelist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodetable_get_() */
  public static final int ID_run_ModelCluster_nodetable_get_$ = ID_FIRSTMETHOD + 27;

  public java.util.Hashtable run_ModelCluster_nodetable_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (java.util.Hashtable) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodetable_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodetable_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.util.Hashtable) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodetable_set_(java.util.Hashtable _value_) */
  public static final int ID_run_ModelCluster_nodetable_set_$java_util_Hashtable = ID_FIRSTMETHOD + 28;

  public java.util.Hashtable run_ModelCluster_nodetable_set_(java.util.Hashtable _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (java.util.Hashtable) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodetable_set_((java.util.Hashtable) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodetable_set_$java_util_Hashtable);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.util.Hashtable) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementlist_get_() */
  public static final int ID_run_ModelCluster_elementlist_get_$ = ID_FIRSTMETHOD + 29;

  public run.RplVector run_ModelCluster_elementlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementlist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementlist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementlist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_elementlist_set_$run_RplVector = ID_FIRSTMETHOD + 30;

  public run.RplVector run_ModelCluster_elementlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementlist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementlist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_trackerlist_get_() */
  public static final int ID_run_ModelCluster_trackerlist_get_$ = ID_FIRSTMETHOD + 31;

  public run.RplVector run_ModelCluster_trackerlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_trackerlist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackerlist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_trackerlist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_trackerlist_set_$run_RplVector = ID_FIRSTMETHOD + 32;

  public run.RplVector run_ModelCluster_trackerlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_trackerlist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackerlist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_materiallist_get_() */
  public static final int ID_run_ModelCluster_materiallist_get_$ = ID_FIRSTMETHOD + 33;

  public run.RplVector run_ModelCluster_materiallist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_materiallist_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_materiallist_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_materiallist_set_(run.RplVector _value_) */
  public static final int ID_run_ModelCluster_materiallist_set_$run_RplVector = ID_FIRSTMETHOD + 34;

  public run.RplVector run_ModelCluster_materiallist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.RplVector) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_materiallist_set_((run.RplVector) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_materiallist_set_$run_RplVector);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.RplVector) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_shareddata_get_() */
  public static final int ID_run_ModelCluster_shareddata_get_$ = ID_FIRSTMETHOD + 35;

  public run.SharedData run_ModelCluster_shareddata_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.SharedData) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_shareddata_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_shareddata_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.SharedData) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_shareddata_set_(run.SharedData _value_) */
  public static final int ID_run_ModelCluster_shareddata_set_$run_SharedData = ID_FIRSTMETHOD + 36;

  public run.SharedData run_ModelCluster_shareddata_set_(run.SharedData _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.SharedData) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_shareddata_set_((run.SharedData) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_shareddata_set_$run_SharedData);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.SharedData) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_time_get_() */
  public static final int ID_run_ModelCluster_time_get_$ = ID_FIRSTMETHOD + 37;

  public double run_ModelCluster_time_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_time_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_time_set_(double _value_) */
  public static final int ID_run_ModelCluster_time_set_$double = ID_FIRSTMETHOD + 38;

  public double run_ModelCluster_time_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_time_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_set_$double);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendDouble(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_time_inc_(double _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_time_inc_$double$boolean = ID_FIRSTMETHOD + 39;

  public double run_ModelCluster_time_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_time_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_inc_$double$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendDouble(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_ttemp_get_() */
  public static final int ID_run_ModelCluster_ttemp_get_$ = ID_FIRSTMETHOD + 40;

  public double run_ModelCluster_ttemp_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_ttemp_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_ttemp_set_(double _value_) */
  public static final int ID_run_ModelCluster_ttemp_set_$double = ID_FIRSTMETHOD + 41;

  public double run_ModelCluster_ttemp_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_ttemp_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_set_$double);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendDouble(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_ttemp_inc_(double _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_ttemp_inc_$double$boolean = ID_FIRSTMETHOD + 42;

  public double run_ModelCluster_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_ttemp_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_inc_$double$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendDouble(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_exported_ttemp_get_() */
  public static final int ID_run_ModelCluster_exported_ttemp_get_$ = ID_FIRSTMETHOD + 43;

  public double run_ModelCluster_exported_ttemp_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_exported_ttemp_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_exported_ttemp_set_(double _value_) */
  public static final int ID_run_ModelCluster_exported_ttemp_set_$double = ID_FIRSTMETHOD + 44;

  public double run_ModelCluster_exported_ttemp_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_exported_ttemp_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_set_$double);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendDouble(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_exported_ttemp_inc_$double$boolean = ID_FIRSTMETHOD + 45;

  public double run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_exported_ttemp_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_inc_$double$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendDouble(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_i_get_() */
  public static final int ID_run_ModelCluster_i_get_$ = ID_FIRSTMETHOD + 46;

  public int run_ModelCluster_i_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_i_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_i_set_(int _value_) */
  public static final int ID_run_ModelCluster_i_set_$int = ID_FIRSTMETHOD + 47;

  public int run_ModelCluster_i_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_i_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_i_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_i_inc_$int$boolean = ID_FIRSTMETHOD + 48;

  public int run_ModelCluster_i_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_i_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_controlset_get_() */
  public static final int ID_run_ModelCluster_controlset_get_$ = ID_FIRSTMETHOD + 49;

  public run.Controlset run_ModelCluster_controlset_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Controlset) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_controlset_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_controlset_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Controlset) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_controlset_set_(run.Controlset _value_) */
  public static final int ID_run_ModelCluster_controlset_set_$run_Controlset = ID_FIRSTMETHOD + 50;

  public run.Controlset run_ModelCluster_controlset_set_(run.Controlset _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Controlset) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_controlset_set_((run.Controlset) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_controlset_set_$run_Controlset);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Controlset) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_element_get_() */
  public static final int ID_run_ModelCluster_temporary_element_get_$ = ID_FIRSTMETHOD + 51;

  public run.Element run_ModelCluster_temporary_element_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Element) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_element_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_element_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Element) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_element_set_(run.Element _value_) */
  public static final int ID_run_ModelCluster_temporary_element_set_$run_Element = ID_FIRSTMETHOD + 52;

  public run.Element run_ModelCluster_temporary_element_set_(run.Element _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Element) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_element_set_((run.Element) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_element_set_$run_Element);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Element) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_tracker_get_() */
  public static final int ID_run_ModelCluster_temporary_tracker_get_$ = ID_FIRSTMETHOD + 53;

  public run.Tracker run_ModelCluster_temporary_tracker_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Tracker) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_tracker_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_tracker_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Tracker) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_tracker_set_(run.Tracker _value_) */
  public static final int ID_run_ModelCluster_temporary_tracker_set_$run_Tracker = ID_FIRSTMETHOD + 54;

  public run.Tracker run_ModelCluster_temporary_tracker_set_(run.Tracker _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Tracker) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_tracker_set_((run.Tracker) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_tracker_set_$run_Tracker);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Tracker) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_constraint_get_() */
  public static final int ID_run_ModelCluster_temporary_constraint_get_$ = ID_FIRSTMETHOD + 55;

  public run.Constraint run_ModelCluster_temporary_constraint_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Constraint) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_constraint_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_constraint_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Constraint) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_constraint_set_(run.Constraint _value_) */
  public static final int ID_run_ModelCluster_temporary_constraint_set_$run_Constraint = ID_FIRSTMETHOD + 56;

  public run.Constraint run_ModelCluster_temporary_constraint_set_(run.Constraint _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Constraint) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_constraint_set_((run.Constraint) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_constraint_set_$run_Constraint);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Constraint) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_node_get_() */
  public static final int ID_run_ModelCluster_temporary_node_get_$ = ID_FIRSTMETHOD + 57;

  public run.Node run_ModelCluster_temporary_node_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Node) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_node_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_node_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Node) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_temporary_node_set_(run.Node _value_) */
  public static final int ID_run_ModelCluster_temporary_node_set_$run_Node = ID_FIRSTMETHOD + 58;

  public run.Node run_ModelCluster_temporary_node_set_(run.Node _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Node) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_temporary_node_set_((run.Node) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_node_set_$run_Node);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Node) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_resultwriter_get_() */
  public static final int ID_run_ModelCluster_resultwriter_get_$ = ID_FIRSTMETHOD + 59;

  public run.Writer run_ModelCluster_resultwriter_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Writer) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_resultwriter_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_resultwriter_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Writer) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_resultwriter_set_(run.Writer _value_) */
  public static final int ID_run_ModelCluster_resultwriter_set_$run_Writer = ID_FIRSTMETHOD + 60;

  public run.Writer run_ModelCluster_resultwriter_set_(run.Writer _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.Writer) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_resultwriter_set_((run.Writer) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_resultwriter_set_$run_Writer);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.Writer) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_trackwriter_get_() */
  public static final int ID_run_ModelCluster_trackwriter_get_$ = ID_FIRSTMETHOD + 61;

  public run.TrackWriter run_ModelCluster_trackwriter_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.TrackWriter) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_trackwriter_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackwriter_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.TrackWriter) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_trackwriter_set_(run.TrackWriter _value_) */
  public static final int ID_run_ModelCluster_trackwriter_set_$run_TrackWriter = ID_FIRSTMETHOD + 62;

  public run.TrackWriter run_ModelCluster_trackwriter_set_(run.TrackWriter _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.TrackWriter) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_trackwriter_set_((run.TrackWriter) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackwriter_set_$run_TrackWriter);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.TrackWriter) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_filename_get_() */
  public static final int ID_run_ModelCluster_filename_get_$ = ID_FIRSTMETHOD + 63;

  public java.lang.String run_ModelCluster_filename_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_filename_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_filename_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.lang.String) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_filename_set_(java.lang.String _value_) */
  public static final int ID_run_ModelCluster_filename_set_$java_lang_String = ID_FIRSTMETHOD + 64;

  public java.lang.String run_ModelCluster_filename_set_(java.lang.String _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_filename_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_filename_set_$java_lang_String);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.lang.String) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_timestep_get_() */
  public static final int ID_run_ModelCluster_timestep_get_$ = ID_FIRSTMETHOD + 65;

  public double run_ModelCluster_timestep_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_timestep_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_timestep_set_(double _value_) */
  public static final int ID_run_ModelCluster_timestep_set_$double = ID_FIRSTMETHOD + 66;

  public double run_ModelCluster_timestep_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_timestep_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_set_$double);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendDouble(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_timestep_inc_(double _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_timestep_inc_$double$boolean = ID_FIRSTMETHOD + 67;

  public double run_ModelCluster_timestep_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_timestep_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_inc_$double$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendDouble(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_failure_is_set_get_() */
  public static final int ID_run_ModelCluster_failure_is_set_get_$ = ID_FIRSTMETHOD + 68;

  public boolean run_ModelCluster_failure_is_set_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_failure_is_set_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_failure_is_set_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleBoolean();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_failure_is_set_set_(boolean _value_) */
  public static final int ID_run_ModelCluster_failure_is_set_set_$boolean = ID_FIRSTMETHOD + 69;

  public boolean run_ModelCluster_failure_is_set_set_(boolean _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_failure_is_set_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_failure_is_set_set_$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(1);
        _c.sendBoolean(_value_);
        _c.closeSendPrimitive(1);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleBoolean();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_autostep_get_() */
  public static final int ID_run_ModelCluster_autostep_get_$ = ID_FIRSTMETHOD + 70;

  public boolean run_ModelCluster_autostep_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_autostep_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_autostep_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleBoolean();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_autostep_set_(boolean _value_) */
  public static final int ID_run_ModelCluster_autostep_set_$boolean = ID_FIRSTMETHOD + 71;

  public boolean run_ModelCluster_autostep_set_(boolean _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_autostep_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_autostep_set_$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(1);
        _c.sendBoolean(_value_);
        _c.closeSendPrimitive(1);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleBoolean();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nr_of_CPUs_get_() */
  public static final int ID_run_ModelCluster_nr_of_CPUs_get_$ = ID_FIRSTMETHOD + 72;

  public int run_ModelCluster_nr_of_CPUs_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nr_of_CPUs_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nr_of_CPUs_set_(int _value_) */
  public static final int ID_run_ModelCluster_nr_of_CPUs_set_$int = ID_FIRSTMETHOD + 73;

  public int run_ModelCluster_nr_of_CPUs_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nr_of_CPUs_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_nr_of_CPUs_inc_$int$boolean = ID_FIRSTMETHOD + 74;

  public int run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nr_of_CPUs_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_client_nr_get_() */
  public static final int ID_run_ModelCluster_client_nr_get_$ = ID_FIRSTMETHOD + 75;

  public int run_ModelCluster_client_nr_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_client_nr_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_client_nr_set_(int _value_) */
  public static final int ID_run_ModelCluster_client_nr_set_$int = ID_FIRSTMETHOD + 76;

  public int run_ModelCluster_client_nr_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_client_nr_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_set_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_client_nr_inc_(int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_client_nr_inc_$int$boolean = ID_FIRSTMETHOD + 77;

  public int run_ModelCluster_client_nr_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_client_nr_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_inc_$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(5);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(5);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_cluster_nodes_get_() */
  public static final int ID_run_ModelCluster_cluster_nodes_get_$ = ID_FIRSTMETHOD + 78;

  public run.ModelCluster[] run_ModelCluster_cluster_nodes_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.ModelCluster[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_cluster_nodes_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.ModelCluster[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_) */
  public static final int ID_run_ModelCluster_cluster_nodes_set_$_run_ModelCluster = ID_FIRSTMETHOD + 79;

  public run.ModelCluster[] run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (run.ModelCluster[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_cluster_nodes_set_((run.ModelCluster[]) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_set_$_run_ModelCluster);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.ModelCluster[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_cluster_nodes_get_(int p0) */
  public static final int ID_run_ModelCluster_cluster_nodes_get_$int = ID_FIRSTMETHOD + 80;

  public run.ModelCluster run_ModelCluster_cluster_nodes_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_cluster_nodes_get_(p0);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_get_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(p0);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.ModelCluster) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_) */
  public static final int ID_run_ModelCluster_cluster_nodes_set_$int$run_ModelCluster = ID_FIRSTMETHOD + 81;

  public run.ModelCluster run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_cluster_nodes_set_(p0, _value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_set_$int$run_ModelCluster);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(p0);
        _c.closeSendPrimitive(4);
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.ModelCluster) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodeindicies_get_() */
  public static final int ID_run_ModelCluster_nodeindicies_get_$ = ID_FIRSTMETHOD + 82;

  public int[] run_ModelCluster_nodeindicies_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (int[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodeindicies_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (int[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodeindicies_set_(int[] _value_) */
  public static final int ID_run_ModelCluster_nodeindicies_set_$_int = ID_FIRSTMETHOD + 83;

  public int[] run_ModelCluster_nodeindicies_set_(int[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (int[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodeindicies_set_((int[]) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_set_$_int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (int[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodeindicies_get_(int p0) */
  public static final int ID_run_ModelCluster_nodeindicies_get_$int = ID_FIRSTMETHOD + 84;

  public int run_ModelCluster_nodeindicies_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodeindicies_get_(p0);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_get_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(p0);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodeindicies_set_(int p0, int _value_) */
  public static final int ID_run_ModelCluster_nodeindicies_set_$int$int = ID_FIRSTMETHOD + 85;

  public int run_ModelCluster_nodeindicies_set_(int p0, int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodeindicies_set_(p0, _value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_set_$int$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendInt(p0);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_nodeindicies_inc_$int$int$boolean = ID_FIRSTMETHOD + 86;

  public int run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_nodeindicies_inc_(p0, _value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_inc_$int$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendInt(p0);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementindicies_get_() */
  public static final int ID_run_ModelCluster_elementindicies_get_$ = ID_FIRSTMETHOD + 87;

  public int[] run_ModelCluster_elementindicies_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (int[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementindicies_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (int[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementindicies_set_(int[] _value_) */
  public static final int ID_run_ModelCluster_elementindicies_set_$_int = ID_FIRSTMETHOD + 88;

  public int[] run_ModelCluster_elementindicies_set_(int[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (int[]) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementindicies_set_((int[]) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_set_$_int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (int[]) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementindicies_get_(int p0) */
  public static final int ID_run_ModelCluster_elementindicies_get_$int = ID_FIRSTMETHOD + 89;

  public int run_ModelCluster_elementindicies_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementindicies_get_(p0);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_get_$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(4);
        _c.sendInt(p0);
        _c.closeSendPrimitive(4);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementindicies_set_(int p0, int _value_) */
  public static final int ID_run_ModelCluster_elementindicies_set_$int$int = ID_FIRSTMETHOD + 90;

  public int run_ModelCluster_elementindicies_set_(int p0, int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementindicies_set_(p0, _value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_set_$int$int);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendInt(p0);
        _c.sendInt(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_elementindicies_inc_$int$int$boolean = ID_FIRSTMETHOD + 91;

  public int run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_elementindicies_inc_(p0, _value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_inc_$int$int$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendInt(p0);
        _c.sendInt(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleInt();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_benchmark_get_() */
  public static final int ID_run_ModelCluster_benchmark_get_$ = ID_FIRSTMETHOD + 92;

  public long run_ModelCluster_benchmark_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_benchmark_get_();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleLong();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_benchmark_set_(long _value_) */
  public static final int ID_run_ModelCluster_benchmark_set_$long = ID_FIRSTMETHOD + 93;

  public long run_ModelCluster_benchmark_set_(long _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_benchmark_set_(_value_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_set_$long);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendLong(_value_);
        _c.closeSendPrimitive(8);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleLong();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_benchmark_inc_(long _value_, boolean _post_) */
  public static final int ID_run_ModelCluster_benchmark_inc_$long$boolean = ID_FIRSTMETHOD + 94;

  public long run_ModelCluster_benchmark_inc_(long _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_benchmark_inc_(_value_, _post_);
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_inc_$long$boolean);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(9);
        _c.sendLong(_value_);
        _c.sendBoolean(_post_);
        _c.closeSendPrimitive(9);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleLong();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_barrier_get_() */
  public static final int ID_run_ModelCluster_barrier_get_$ = ID_FIRSTMETHOD + 95;

  public jp.sync.Barrier run_ModelCluster_barrier_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (jp.sync.Barrier) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_barrier_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_barrier_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (jp.sync.Barrier) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_barrier_set_(jp.sync.Barrier _value_) */
  public static final int ID_run_ModelCluster_barrier_set_$jp_sync_Barrier = ID_FIRSTMETHOD + 96;

  public jp.sync.Barrier run_ModelCluster_barrier_set_(jp.sync.Barrier _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (jp.sync.Barrier) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_barrier_set_((jp.sync.Barrier) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_barrier_set_$jp_sync_Barrier);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (jp.sync.Barrier) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_exception_listeners_get_() */
  public static final int ID_run_ModelCluster_exception_listeners_get_$ = ID_FIRSTMETHOD + 97;

  public java.util.Set run_ModelCluster_exception_listeners_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (java.util.Set) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_exception_listeners_get_());
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exception_listeners_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.util.Set) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run_ModelCluster_exception_listeners_set_(java.util.Set _value_) */
  public static final int ID_run_ModelCluster_exception_listeners_set_$java_util_Set = ID_FIRSTMETHOD + 98;

  public java.util.Set run_ModelCluster_exception_listeners_set_(java.util.Set _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (java.util.Set) _cenv.doDeepClone(((run.ModelCluster_instance_impl) remoteServer).run_ModelCluster_exception_listeners_set_((java.util.Set) _cenv.doDeepClone(_value_)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exception_listeners_set_$java_util_Set);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(_value_);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.util.Set) _c.receiveObject();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method assembleMassMatrix() */
  public static final int ID_assembleMassMatrix$ = ID_FIRSTMETHOD + 99;

  public void assembleMassMatrix() throws java.lang.Exception {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).assembleMassMatrix();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_assembleMassMatrix$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof java.lang.Exception) {
        throw (java.lang.Exception) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method initialize() */
  public static final int ID_initialize$ = ID_FIRSTMETHOD + 100;

  public void initialize() throws java.lang.Exception {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).initialize();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_initialize$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof java.lang.Exception) {
        throw (java.lang.Exception) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method post() */
  public static final int ID_post$ = ID_FIRSTMETHOD + 101;

  public void post() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).post();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_post$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method print() */
  public static final int ID_print$ = ID_FIRSTMETHOD + 102;

  public void print() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).print();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_print$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method setInitialConditions() */
  public static final int ID_setInitialConditions$ = ID_FIRSTMETHOD + 103;

  public void setInitialConditions() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).setInitialConditions();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_setInitialConditions$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method solve(jp.sync.Barrier barrier) */
  public static final int ID_solve$jp_sync_Barrier = ID_FIRSTMETHOD + 104;

  public void solve(jp.sync.Barrier barrier) throws java.lang.Exception {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        ((run.ModelCluster_instance_impl) remoteServer).solve((jp.sync.Barrier) _cenv.doDeepClone(barrier));
        return;
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_solve$jp_sync_Barrier);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(barrier);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof java.lang.Exception) {
        throw (java.lang.Exception) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method passReferences() */
  public static final int ID_passReferences$ = ID_FIRSTMETHOD + 105;

  public void passReferences() throws uka.karmi.rmi.RemoteException, jp.lang.MovedException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).passReferences();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_passReferences$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof uka.karmi.rmi.RemoteException) {
        throw (uka.karmi.rmi.RemoteException) resultex;
      }
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method setReferences(run.SharedData sd) */
  public static final int ID_setReferences$run_SharedData = ID_FIRSTMETHOD + 106;

  public void setReferences(run.SharedData sd) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        ((run.ModelCluster_instance_impl) remoteServer).setReferences((run.SharedData) _cenv.doDeepClone(sd));
        return;
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_setReferences$run_SharedData);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(sd);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method getTtemp() */
  public static final int ID_getTtemp$ = ID_FIRSTMETHOD + 107;

  public double getTtemp() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).getTtemp();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_getTtemp$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleDouble();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method determineDistribution() */
  public static final int ID_determineDistribution$ = ID_FIRSTMETHOD + 108;

  public void determineDistribution() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).determineDistribution();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_determineDistribution$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method referenceNodes() */
  public static final int ID_referenceNodes$ = ID_FIRSTMETHOD + 109;

  public void referenceNodes() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).referenceNodes();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_referenceNodes$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method optimize() */
  public static final int ID_optimize$ = ID_FIRSTMETHOD + 110;

  public void optimize() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).optimize();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_optimize$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method getBenchmark() */
  public static final int ID_getBenchmark$ = ID_FIRSTMETHOD + 111;

  public long getBenchmark() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return ((run.ModelCluster_instance_impl) remoteServer).getBenchmark();
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_getBenchmark$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return _c.receiveSingleLong();
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method run() */
  public static final int ID_run$ = ID_FIRSTMETHOD + 112;

  public void run() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).run();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_run$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method stopThreads() */
  public static final int ID_stopThreads$ = ID_FIRSTMETHOD + 113;

  public void stopThreads() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      ((run.ModelCluster_instance_impl) remoteServer).stopThreads();
      return;
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_stopThreads$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method sendException(java.lang.Exception e) */
  public static final int ID_sendException$java_lang_Exception = ID_FIRSTMETHOD + 114;

  public void sendException(java.lang.Exception e) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        ((run.ModelCluster_instance_impl) remoteServer).sendException((java.lang.Exception) _cenv.doDeepClone(e));
        return;
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_sendException$java_lang_Exception);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(e);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method addExceptionListener(run.ExceptionListener l) */
  public static final int ID_addExceptionListener$run_ExceptionListener = ID_FIRSTMETHOD + 115;

  public void addExceptionListener(run.ExceptionListener l) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        ((run.ModelCluster_instance_impl) remoteServer).addExceptionListener((run.ExceptionListener) _cenv.doDeepClone(l));
        return;
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_addExceptionListener$run_ExceptionListener);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(l);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Method identifier for method setCluster_nodes(run.ModelCluster[] cluster_nodes) */
  public static final int ID_setCluster_nodes$_run_ModelCluster = ID_FIRSTMETHOD + 116;

  public void setCluster_nodes(run.ModelCluster[] cluster_nodes) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        ((run.ModelCluster_instance_impl) remoteServer).setCluster_nodes((run.ModelCluster[]) _cenv.doDeepClone(cluster_nodes));
        return;
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_instance_impl_KStub.ID_setCluster_nodes$_run_ModelCluster);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.sendObject(cluster_nodes);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return;
          } else {
            resultex = (Throwable) _c.receiveObject();
          }
        } finally {
          _c.closeReceiveResult();
        }
      } catch (ClassNotFoundException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: unmarshal problem", ex);
      } catch (uka.karmi.rmi.RemoteException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (java.io.IOException ex) {
        _c.closeExceptionally();
        throw new uka.karmi.rmi.RemoteException("KaRMI: transport problem", ex);
      } catch (RuntimeException ex) {
        _c.closeExceptionally();
        throw ex;
      } catch (Error ex) {
        _c.closeExceptionally();
        throw ex;
      }

      // rethrow runtime exceptions and declared exceptions
      if (resultex instanceof jp.lang.MovedException) {
        throw (jp.lang.MovedException) resultex;
      }
      if (resultex instanceof java.lang.Error) {
        throw (java.lang.Error) resultex;
      }
      if (resultex instanceof java.lang.RuntimeException) {
        throw (java.lang.RuntimeException) resultex;
      }
      // exception not possible here
      throw new InternalError("KaRMI: exception not declared: " + resultex);
    }
  }

  /** Export the last method id to subclasses of 
      this stub class to produce unique method ids
      within a branch of the class hierarchy. */
  protected static final int ID_LASTMETHOD = ID_setCluster_nodes$_run_ModelCluster;

  /** Allow check for separate compilation problems 
      at class loading time. */
  protected static int _KARMI_getLastMethodID() {
    return ID_LASTMETHOD;
  }

  /**
   * Transport descriptor for class ModelCluster_instance_impl_KStub.
   */
  public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR =
    new uka.transport.TransportDescriptor() {
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id)
        throws java.io.IOException, ClassNotFoundException
      {
        return new ModelCluster_instance_impl_KStub(s, id);
      }

      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s)
        throws ClassNotFoundException, java.io.IOException
      {
        ((ModelCluster_instance_impl_KStub) obj).unmarshal(s);
        return true;
      }

      public void marshalReference(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster_instance_impl_KStub) obj).marshalReference(s);
      }

      public void marshal(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster_instance_impl_KStub) obj).marshal(s);
      }

      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper)
        throws CloneNotSupportedException
      {
        return orig;
      }

      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper)
        throws CloneNotSupportedException
      {
        return false;
      }

      public void restoreAfterUnmarshal(Object obj)
        throws ClassNotFoundException, java.io.IOException
      {
        ((ModelCluster_instance_impl_KStub) obj).externalRestoreAfterUnmarshal();
      }

      public Class getType() {
        return ModelCluster_instance_impl_KStub.class;
      }
    };

  public uka.transport.TransportDescriptor getTransportDescriptor() {
    return TRANSPORT_DESCRIPTOR;
  }

  /**
   * Called from uka.transport.UnmarshalStream to create
   * a transportable object.
   */
  public ModelCluster_instance_impl_KStub(uka.transport.UnmarshalStream _stream, int _id)
    throws java.io.IOException, ClassNotFoundException
  {
    super(_stream, _id);
  }

}
