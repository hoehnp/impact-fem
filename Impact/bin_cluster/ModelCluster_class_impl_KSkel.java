// Generated code, do not modify

package run;


/** Skeleton class for remote class 'run.ModelCluster_class_impl' */
public final class ModelCluster_class_impl_KSkel extends uka.karmi.rmi.RemoteSkeleton {
  /** reference to the implementation object */
  run.ModelCluster_class_impl impl;

  /** Set the implementation object of this skeleton */
  public final void setRemoteObject(uka.karmi.rmi.Remote object) {
    this.impl = (run.ModelCluster_class_impl) object;
  }

  protected final uka.karmi.rmi.Remote getRemoteObject() {
    return this.impl;
  }

  /** Direct marshaling protocol: Generic invocation */
  public final void doApplicationCall(uka.karmi.rmi.ServerConnection c) 
    throws java.io.IOException, ClassNotFoundException
  {
    switch(c.mid) {
      case run.ModelCluster_class_impl_KStub.ID_run_ModelCluster__class_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.ModelCluster_class_intf result;
        try {
          // call the implementation
          result = impl.run_ModelCluster__class_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendObject(result);
        return;
      }

      case run.ModelCluster_class_impl_KStub.ID__new$int$int$java_lang_String$jp_sync_Barrier: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        int p0 = c.receiveInt();
        int p1 = c.receiveInt();
        c.closeReceivePrimitive(8);
        java.lang.String p2 = (java.lang.String) c.receiveObject();
        jp.sync.Barrier p3 = (jp.sync.Barrier) c.receiveObject();
        c.closeReceiveCall();

        java.lang.Object result;
        try {
          // call the implementation
          result = impl._new(p0, p1, p2, p3);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendObject(result);
        return;
      }

      case run.ModelCluster_class_impl_KStub.ID__new$jp_lang_Marker: {
        // unmarshal parameters
        jp.lang.Marker p0 = (jp.lang.Marker) c.receiveObject();
        c.closeReceiveCall();

        java.lang.Object result;
        try {
          // call the implementation
          result = impl._new(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendObject(result);
        return;
      }

      default:
        throw new InternalError("illegal method number (" + c.mid + ")");
      }
  }
}
