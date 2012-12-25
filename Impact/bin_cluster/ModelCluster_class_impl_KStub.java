// Generated code, do not modify

package run;


/** Stub class for remote class 'run.ModelCluster_class_impl' */
public   class ModelCluster_class_impl_KStub extends jp.lang.RemoteObject_class_impl_KStub
  implements uka.karmi.rmi.Remote, jp.lang.RemoteObject_class_intf, run.ModelCluster_class_intf
{
  /** Explicitly defined default constructor is necessary
      if uka.transport is used. */
  public ModelCluster_class_impl_KStub() {
    super();
  }

  /** Smart stubs reuse the stub of the servers super class. The first
      method identifier can not be computed at class loading time, 
      because a compile time constant is needed in switch statements. */
  private static final int ID_FIRSTMETHOD = jp.lang.RemoteObject_class_impl_KStub.ID_LASTMETHOD + 1;

  static { 
    if (ID_FIRSTMETHOD != jp.lang.RemoteObject_class_impl_KStub._KARMI_getLastMethodID() + 1) {
      // The compile time constants differ from the constant at class
      // loading time. This is an error due to incomplete separate
      // compilation
      throw new InternalError(
        "Separate compilation problem: Please recompile " +
        "class 'run.ModelCluster_class_impl' and all its subclasses."
      );
    }
  }

  /** Method identifier for method run_ModelCluster__class_get_() */
  public static final int ID_run_ModelCluster__class_get_$ = ID_FIRSTMETHOD + 0;

  public run.ModelCluster_class_intf run_ModelCluster__class_get_() throws uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      return (run.ModelCluster_class_intf) uka.karmi.rmi.ExportPoint.toStub(((run.ModelCluster_class_impl) remoteServer).run_ModelCluster__class_get_());
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_class_impl_KStub.ID_run_ModelCluster__class_get_$);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (run.ModelCluster_class_intf) _c.receiveObject();
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

  /** Method identifier for method _new(int p0, int p1, java.lang.String p2, jp.sync.Barrier p3) */
  public static final int ID__new$int$int$java_lang_String$jp_sync_Barrier = ID_FIRSTMETHOD + 1;

  public java.lang.Object _new(int p0, int p1, java.lang.String p2, jp.sync.Barrier p3) throws uka.karmi.rmi.RemoteException {
    if (remoteServer != null) {
      // short cut: call server implementation directly
      uka.karmi.rmi.CopyEnvironment _cenv = uka.karmi.rmi.Transport.getCopyEnvironment();
      try {
        return (java.lang.Object) _cenv.doDeepClone(((run.ModelCluster_class_impl) remoteServer)._new(p0, p1, p2, (jp.sync.Barrier) _cenv.doDeepClone(p3)));
      } catch (CloneNotSupportedException ex) {
        throw new uka.karmi.rmi.RemoteException("KaRMIc: arg or result not clonable", ex);
      } finally {
        uka.karmi.rmi.Transport.putCopyEnvironment(_cenv);
      }
    } else {
      uka.karmi.rmi.ClientConnection _c = remoteClientRef.getContext(run.ModelCluster_class_impl_KStub.ID__new$int$int$java_lang_String$jp_sync_Barrier);

      Throwable resultex;
      try {
        _c.openSendCall();
        _c.openSendPrimitive(8);
        _c.sendInt(p0);
        _c.sendInt(p1);
        _c.closeSendPrimitive(8);
        _c.sendObject(p2);
        _c.sendObject(p3);
        _c.closeSendCall();

        boolean _normalReturn = _c.openReceiveResult();
        try {
          if (_normalReturn) {
            return (java.lang.Object) _c.receiveObject();
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
  protected static final int ID_LASTMETHOD = ID__new$int$int$java_lang_String$jp_sync_Barrier;

  /** Allow check for separate compilation problems 
      at class loading time. */
  protected static int _KARMI_getLastMethodID() {
    return ID_LASTMETHOD;
  }

  /**
   * Transport descriptor for class ModelCluster_class_impl_KStub.
   */
  public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR =
    new uka.transport.TransportDescriptor() {
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id)
        throws java.io.IOException, ClassNotFoundException
      {
        return new ModelCluster_class_impl_KStub(s, id);
      }

      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s)
        throws ClassNotFoundException, java.io.IOException
      {
        ((ModelCluster_class_impl_KStub) obj).unmarshal(s);
        return true;
      }

      public void marshalReference(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster_class_impl_KStub) obj).marshalReference(s);
      }

      public void marshal(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster_class_impl_KStub) obj).marshal(s);
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
        ((ModelCluster_class_impl_KStub) obj).externalRestoreAfterUnmarshal();
      }

      public Class getType() {
        return ModelCluster_class_impl_KStub.class;
      }
    };

  public uka.transport.TransportDescriptor getTransportDescriptor() {
    return TRANSPORT_DESCRIPTOR;
  }

  /**
   * Called from uka.transport.UnmarshalStream to create
   * a transportable object.
   */
  public ModelCluster_class_impl_KStub(uka.transport.UnmarshalStream _stream, int _id)
    throws java.io.IOException, ClassNotFoundException
  {
    super(_stream, _id);
  }

}
