package run;

import java.text.ParseException;

import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import uka.karmi.rmi.RemoteException;

import jp.sync.*;

import jp.lang.*;



public class ModelCluster extends jp.lang.RemoteObject
  implements Runnable
{

  /**
   * Transport descriptor for class ModelCluster.
   */
  public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR =
    new uka.transport.TransportDescriptor() {
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id)
        throws java.io.IOException, ClassNotFoundException
      {
        return new ModelCluster(s, id);
      }

      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s)
        throws ClassNotFoundException, java.io.IOException
      {
        ((ModelCluster) obj).unmarshal(s);
        return true;
      }

      public void marshalReference(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster) obj).marshalReference(s);
      }

      public void marshal(Object obj, uka.transport.MarshalStream s)
        throws java.io.IOException
      {
        ((ModelCluster) obj).marshal(s);
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
        ((ModelCluster) obj).externalRestoreAfterUnmarshal();
      }

      public Class getType() {
        return ModelCluster.class;
      }
    };

  public uka.transport.TransportDescriptor getTransportDescriptor() {
    return TRANSPORT_DESCRIPTOR;
  }

  /**
   * Called from uka.transport.UnmarshalStream to create
   * a transportable object.
   */
  public ModelCluster(uka.transport.UnmarshalStream _stream, int _id)
    throws java.io.IOException, ClassNotFoundException
  {
    super(_stream, _id);
  }

  /** Forwarding constructor. Handle constructors are 'final'. That
      means they need only the functionality of the remote base classes
      constructor. To prevent the execution of application defined super
      constructors, this forwarding constructor is generated in each
      handle class and called from all constructors of subclasses. */
  protected ModelCluster(jp.lang.Marker dummy) {
    super(dummy);
  }

  /** Remote static variable access: get ModelCluster._class */
  public static final ModelCluster_class_intf run_ModelCluster__class_get_()  {
    try {
      return _class.run_ModelCluster__class_get_();
    } catch (uka.karmi.rmi.RemoteException _e) {
      throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster__class_get_()", _e);
    }
  }

  /** Replicated static constant '_class' */
  public static final ModelCluster_class_intf _class = ModelCluster_class_impl._class;

  /** Remote variable access: get ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_elements_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_elements_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_trackers_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_trackers_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_nodes_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_nodes_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_materials_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_materials_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_controls_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_controls_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_constraints_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_constraints_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_loads_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_loads_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.constraintlist */
  public final run.RplVector run_ModelCluster_constraintlist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_constraintlist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.constraintlist */
  public final run.RplVector run_ModelCluster_constraintlist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_constraintlist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.loadlist */
  public final run.RplVector run_ModelCluster_loadlist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_loadlist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.loadlist */
  public final run.RplVector run_ModelCluster_loadlist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_loadlist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.nodelist */
  public final run.RplVector run_ModelCluster_nodelist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodelist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.nodelist */
  public final run.RplVector run_ModelCluster_nodelist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodelist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.nodetable */
  public final java.util.Hashtable run_ModelCluster_nodetable_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodetable_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.nodetable */
  public final java.util.Hashtable run_ModelCluster_nodetable_set_(java.util.Hashtable _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodetable_set_(java.util.Hashtable _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.elementlist */
  public final run.RplVector run_ModelCluster_elementlist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementlist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.elementlist */
  public final run.RplVector run_ModelCluster_elementlist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementlist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.trackerlist */
  public final run.RplVector run_ModelCluster_trackerlist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_trackerlist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.trackerlist */
  public final run.RplVector run_ModelCluster_trackerlist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_trackerlist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.materiallist */
  public final run.RplVector run_ModelCluster_materiallist_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_materiallist_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.materiallist */
  public final run.RplVector run_ModelCluster_materiallist_set_(run.RplVector _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_materiallist_set_(run.RplVector _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.shareddata */
  public final run.SharedData run_ModelCluster_shareddata_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_shareddata_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.shareddata */
  public final run.SharedData run_ModelCluster_shareddata_set_(run.SharedData _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_shareddata_set_(run.SharedData _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.time */
  public final double run_ModelCluster_time_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_time_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.time */
  public final double run_ModelCluster_time_set_(double _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_time_set_(double _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.time */
  public final double run_ModelCluster_time_inc_(double _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_time_inc_(double _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_ttemp_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_set_(double _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_ttemp_set_(double _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_inc_(double _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_ttemp_inc_(double _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_exported_ttemp_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_set_(double _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_exported_ttemp_set_(double _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.i */
  public final int run_ModelCluster_i_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_i_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.i */
  public final int run_ModelCluster_i_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_i_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.i */
  public final int run_ModelCluster_i_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_i_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.controlset */
  public final run.Controlset run_ModelCluster_controlset_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_controlset_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.controlset */
  public final run.Controlset run_ModelCluster_controlset_set_(run.Controlset _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_controlset_set_(run.Controlset _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.temporary_element */
  public final run.Element run_ModelCluster_temporary_element_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_element_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.temporary_element */
  public final run.Element run_ModelCluster_temporary_element_set_(run.Element _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_element_set_(run.Element _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.temporary_tracker */
  public final run.Tracker run_ModelCluster_temporary_tracker_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_tracker_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.temporary_tracker */
  public final run.Tracker run_ModelCluster_temporary_tracker_set_(run.Tracker _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_tracker_set_(run.Tracker _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.temporary_constraint */
  public final run.Constraint run_ModelCluster_temporary_constraint_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_constraint_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.temporary_constraint */
  public final run.Constraint run_ModelCluster_temporary_constraint_set_(run.Constraint _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_constraint_set_(run.Constraint _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.temporary_node */
  public final run.Node run_ModelCluster_temporary_node_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_node_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.temporary_node */
  public final run.Node run_ModelCluster_temporary_node_set_(run.Node _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_temporary_node_set_(run.Node _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.resultwriter */
  public final run.Writer run_ModelCluster_resultwriter_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_resultwriter_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.resultwriter */
  public final run.Writer run_ModelCluster_resultwriter_set_(run.Writer _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_resultwriter_set_(run.Writer _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.trackwriter */
  public final run.TrackWriter run_ModelCluster_trackwriter_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_trackwriter_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.trackwriter */
  public final run.TrackWriter run_ModelCluster_trackwriter_set_(run.TrackWriter _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_trackwriter_set_(run.TrackWriter _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.filename */
  public final java.lang.String run_ModelCluster_filename_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_filename_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.filename */
  public final java.lang.String run_ModelCluster_filename_set_(java.lang.String _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_filename_set_(java.lang.String _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.timestep */
  public final double run_ModelCluster_timestep_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_timestep_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.timestep */
  public final double run_ModelCluster_timestep_set_(double _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_timestep_set_(double _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.timestep */
  public final double run_ModelCluster_timestep_inc_(double _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_timestep_inc_(double _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.failure_is_set */
  public final boolean run_ModelCluster_failure_is_set_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_failure_is_set_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.failure_is_set */
  public final boolean run_ModelCluster_failure_is_set_set_(boolean _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_failure_is_set_set_(boolean _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.autostep */
  public final boolean run_ModelCluster_autostep_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_autostep_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.autostep */
  public final boolean run_ModelCluster_autostep_set_(boolean _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_autostep_set_(boolean _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nr_of_CPUs_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nr_of_CPUs_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_client_nr_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_set_(int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_client_nr_set_(int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_inc_(int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_client_nr_inc_(int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.cluster_nodes */
  public final run.ModelCluster[] run_ModelCluster_cluster_nodes_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_cluster_nodes_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.cluster_nodes */
  public final run.ModelCluster[] run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.cluster_nodes[p0] */
  public final run.ModelCluster run_ModelCluster_cluster_nodes_get_(int p0)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_cluster_nodes_get_(int p0)", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.cluster_nodes[p0] */
  public final run.ModelCluster run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.nodeindicies */
  public final int[] run_ModelCluster_nodeindicies_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodeindicies_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.nodeindicies */
  public final int[] run_ModelCluster_nodeindicies_set_(int[] _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodeindicies_set_(int[] _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_get_(int p0)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodeindicies_get_(int p0)", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_set_(int p0, int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodeindicies_set_(int p0, int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.elementindicies */
  public final int[] run_ModelCluster_elementindicies_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementindicies_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.elementindicies */
  public final int[] run_ModelCluster_elementindicies_set_(int[] _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementindicies_set_(int[] _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_get_(int p0)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementindicies_get_(int p0)", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_set_(int p0, int _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementindicies_set_(int p0, int _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_benchmark_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_set_(long _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_benchmark_set_(long _value_)", _e);
      }
    }
  }

  /** Remote variable access: increment ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_inc_(long _value_, boolean _post_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_benchmark_inc_(long _value_, boolean _post_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.barrier */
  public final jp.sync.Barrier run_ModelCluster_barrier_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_barrier_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.barrier */
  public final jp.sync.Barrier run_ModelCluster_barrier_set_(jp.sync.Barrier _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_barrier_set_(jp.sync.Barrier _value_)", _e);
      }
    }
  }

  /** Remote variable access: get ModelCluster.exception_listeners */
  public final java.util.Set run_ModelCluster_exception_listeners_get_()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_exception_listeners_get_()", _e);
      }
    }
  }

  /** Remote variable access: set ModelCluster.exception_listeners */
  public final java.util.Set run_ModelCluster_exception_listeners_set_(java.util.Set _value_)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run_ModelCluster_exception_listeners_set_(java.util.Set _value_)", _e);
      }
    }
  }

  /** Handle constructor of class 'ModelCluster'. This constructor
      initiates Remote object instantiation. It uses the
      RuntimeEnvironment to decide about the remote node, on
      which the object will be allocated. */
  public ModelCluster(int nr_of_CPUs, int client_nr, String path, Barrier barrier)  {
    super((jp.lang.Marker) null);
    try {
      // look up the remote constructor object
      ModelCluster_class_intf constr = (ModelCluster_class_intf)
        jp.lang.RuntimeEnvironment.getConstrObj("run.ModelCluster");

      // create the remote implementation
      java.lang.Object _ref = constr._new(nr_of_CPUs, client_nr, path, barrier);

      // assign the remote reference
      _KARMI_setRemoteClientRef((uka.karmi.rmi.RemoteClientRef) _ref);
    } catch (uka.karmi.rmi.RemoteException _e) {
      throw new jp.lang.RemoteError("ModelCluster(int nr_of_CPUs, int client_nr, String path, Barrier barrier)", _e);
    }
  }

  /** Handle constructor of class 'ModelCluster'. This constructor
      initiates Remote object instantiation. It uses the
      RuntimeEnvironment to decide about the remote node, on
      which the object will be allocated. */
  public ModelCluster(jp.lang.Node _node, int nr_of_CPUs, int client_nr, String path, Barrier barrier)  {
    super((jp.lang.Marker) null);
    try {
      // look up the remote constructor object
      ModelCluster_class_intf constr = (ModelCluster_class_intf)
        jp.lang.RuntimeEnvironment.getConstrObj("run.ModelCluster", _node.getMachineID());

      // create the remote implementation
      java.lang.Object _ref = constr._new(nr_of_CPUs, client_nr, path, barrier);

      // assign the remote reference
      _KARMI_setRemoteClientRef((uka.karmi.rmi.RemoteClientRef) _ref);
    } catch (uka.karmi.rmi.RemoteException _e) {
      throw new jp.lang.RemoteError("ModelCluster(int nr_of_CPUs, int client_nr, String path, Barrier barrier)", _e);
    }
  }

  /** Application method of class ModelCluster */
  public void assembleMassMatrix() throws java.lang.Exception {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.assembleMassMatrix()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void initialize() throws java.lang.Exception {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.initialize()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void post()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.post()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void print()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.print()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void setInitialConditions()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.setInitialConditions()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void solve(jp.sync.Barrier barrier) throws java.lang.Exception {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.solve(jp.sync.Barrier barrier)", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void passReferences() throws uka.karmi.rmi.RemoteException {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.passReferences()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void setReferences(run.SharedData sd)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.setReferences(run.SharedData sd)", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public double getTtemp()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.getTtemp()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void determineDistribution()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.determineDistribution()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void referenceNodes()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.referenceNodes()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void optimize()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.optimize()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public long getBenchmark()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.getBenchmark()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void run()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.run()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void stopThreads()  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.stopThreads()", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void sendException(java.lang.Exception e)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.sendException(java.lang.Exception e)", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void addExceptionListener(run.ExceptionListener l)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.addExceptionListener(run.ExceptionListener l)", _e);
      }
    }
  }

  /** Application method of class ModelCluster */
  public void setCluster_nodes(run.ModelCluster[] cluster_nodes)  {
    while (true) {
      try {
        // KaRMI inlined stub code 
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
      } catch (jp.lang.MovedException _e) {
        _adaptRef(_e);
      } catch (uka.karmi.rmi.RemoteException _e) {
        throw new jp.lang.RemoteError("ModelCluster.setCluster_nodes(run.ModelCluster[] cluster_nodes)", _e);
      }
    }
  }

}
