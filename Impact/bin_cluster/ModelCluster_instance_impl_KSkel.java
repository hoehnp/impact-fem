// Generated code, do not modify

package run;


/** Skeleton class for remote class 'run.ModelCluster_instance_impl' */
public final class ModelCluster_instance_impl_KSkel extends uka.karmi.rmi.RemoteSkeleton {
  /** reference to the implementation object */
  run.ModelCluster_instance_impl impl;

  /** Set the implementation object of this skeleton */
  public final void setRemoteObject(uka.karmi.rmi.Remote object) {
    this.impl = (run.ModelCluster_instance_impl) object;
  }

  protected final uka.karmi.rmi.Remote getRemoteObject() {
    return this.impl;
  }

  /** Direct marshaling protocol: Generic invocation */
  public final void doApplicationCall(uka.karmi.rmi.ServerConnection c) 
    throws java.io.IOException, ClassNotFoundException
  {
    switch(c.mid) {
      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_elements_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_elements_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_elements_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_elements_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_trackers_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_trackers_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_trackers_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_trackers_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_nodes_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_nodes_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_nodes_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_nodes_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_materials_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_materials_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_materials_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_materials_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_controls_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_controls_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_controls_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_controls_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_constraints_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_constraints_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_constraints_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_constraints_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_loads_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_loads_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_number_of_loads_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_number_of_loads_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_constraintlist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_constraintlist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_constraintlist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_constraintlist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_loadlist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_loadlist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_loadlist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_loadlist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodelist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodelist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodelist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodelist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodetable_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        java.util.Hashtable result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodetable_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodetable_set_$java_util_Hashtable: {
        // unmarshal parameters
        java.util.Hashtable p0 = (java.util.Hashtable) c.receiveObject();
        c.closeReceiveCall();

        java.util.Hashtable result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodetable_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementlist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementlist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementlist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementlist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackerlist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_trackerlist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackerlist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_trackerlist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_materiallist_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_materiallist_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_materiallist_set_$run_RplVector: {
        // unmarshal parameters
        run.RplVector p0 = (run.RplVector) c.receiveObject();
        c.closeReceiveCall();

        run.RplVector result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_materiallist_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_shareddata_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.SharedData result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_shareddata_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_shareddata_set_$run_SharedData: {
        // unmarshal parameters
        run.SharedData p0 = (run.SharedData) c.receiveObject();
        c.closeReceiveCall();

        run.SharedData result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_shareddata_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_time_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_set_$double: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        double p0 = c.receiveDouble();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_time_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_time_inc_$double$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        double p0 = c.receiveDouble();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_time_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_ttemp_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_set_$double: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        double p0 = c.receiveDouble();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_ttemp_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_ttemp_inc_$double$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        double p0 = c.receiveDouble();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_ttemp_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_exported_ttemp_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_set_$double: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        double p0 = c.receiveDouble();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_exported_ttemp_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exported_ttemp_inc_$double$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        double p0 = c.receiveDouble();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_exported_ttemp_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_i_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_i_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_i_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_i_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_controlset_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Controlset result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_controlset_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_controlset_set_$run_Controlset: {
        // unmarshal parameters
        run.Controlset p0 = (run.Controlset) c.receiveObject();
        c.closeReceiveCall();

        run.Controlset result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_controlset_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_element_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Element result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_element_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_element_set_$run_Element: {
        // unmarshal parameters
        run.Element p0 = (run.Element) c.receiveObject();
        c.closeReceiveCall();

        run.Element result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_element_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_tracker_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Tracker result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_tracker_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_tracker_set_$run_Tracker: {
        // unmarshal parameters
        run.Tracker p0 = (run.Tracker) c.receiveObject();
        c.closeReceiveCall();

        run.Tracker result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_tracker_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_constraint_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Constraint result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_constraint_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_constraint_set_$run_Constraint: {
        // unmarshal parameters
        run.Constraint p0 = (run.Constraint) c.receiveObject();
        c.closeReceiveCall();

        run.Constraint result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_constraint_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_node_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Node result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_node_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_temporary_node_set_$run_Node: {
        // unmarshal parameters
        run.Node p0 = (run.Node) c.receiveObject();
        c.closeReceiveCall();

        run.Node result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_temporary_node_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_resultwriter_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.Writer result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_resultwriter_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_resultwriter_set_$run_Writer: {
        // unmarshal parameters
        run.Writer p0 = (run.Writer) c.receiveObject();
        c.closeReceiveCall();

        run.Writer result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_resultwriter_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackwriter_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.TrackWriter result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_trackwriter_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_trackwriter_set_$run_TrackWriter: {
        // unmarshal parameters
        run.TrackWriter p0 = (run.TrackWriter) c.receiveObject();
        c.closeReceiveCall();

        run.TrackWriter result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_trackwriter_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_filename_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        java.lang.String result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_filename_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_filename_set_$java_lang_String: {
        // unmarshal parameters
        java.lang.String p0 = (java.lang.String) c.receiveObject();
        c.closeReceiveCall();

        java.lang.String result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_filename_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_timestep_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_set_$double: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        double p0 = c.receiveDouble();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_timestep_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_timestep_inc_$double$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        double p0 = c.receiveDouble();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_timestep_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_failure_is_set_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        boolean result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_failure_is_set_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleBoolean(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_failure_is_set_set_$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(1);
        boolean p0 = c.receiveBoolean();
        c.closeReceivePrimitive(1);
        c.closeReceiveCall();

        boolean result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_failure_is_set_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleBoolean(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_autostep_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        boolean result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_autostep_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleBoolean(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_autostep_set_$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(1);
        boolean p0 = c.receiveBoolean();
        c.closeReceivePrimitive(1);
        c.closeReceiveCall();

        boolean result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_autostep_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleBoolean(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nr_of_CPUs_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nr_of_CPUs_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nr_of_CPUs_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nr_of_CPUs_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_client_nr_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_set_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_client_nr_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_client_nr_inc_$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(5);
        int p0 = c.receiveInt();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(5);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_client_nr_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        run.ModelCluster[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_cluster_nodes_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_set_$_run_ModelCluster: {
        // unmarshal parameters
        run.ModelCluster[] p0 = (run.ModelCluster[]) c.receiveObject();
        c.closeReceiveCall();

        run.ModelCluster[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_cluster_nodes_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_get_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        run.ModelCluster result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_cluster_nodes_get_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_cluster_nodes_set_$int$run_ModelCluster: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        run.ModelCluster p1 = (run.ModelCluster) c.receiveObject();
        c.closeReceiveCall();

        run.ModelCluster result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_cluster_nodes_set_(p0, p1);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodeindicies_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_set_$_int: {
        // unmarshal parameters
        int[] p0 = (int[]) c.receiveObject();
        c.closeReceiveCall();

        int[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodeindicies_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_get_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodeindicies_get_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_set_$int$int: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        int p0 = c.receiveInt();
        int p1 = c.receiveInt();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodeindicies_set_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_nodeindicies_inc_$int$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        int p0 = c.receiveInt();
        int p1 = c.receiveInt();
        boolean p2 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_nodeindicies_inc_(p0, p1, p2);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementindicies_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_set_$_int: {
        // unmarshal parameters
        int[] p0 = (int[]) c.receiveObject();
        c.closeReceiveCall();

        int[] result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementindicies_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_get_$int: {
        // unmarshal parameters
        c.openReceivePrimitive(4);
        int p0 = c.receiveInt();
        c.closeReceivePrimitive(4);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementindicies_get_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_set_$int$int: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        int p0 = c.receiveInt();
        int p1 = c.receiveInt();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementindicies_set_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_elementindicies_inc_$int$int$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        int p0 = c.receiveInt();
        int p1 = c.receiveInt();
        boolean p2 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_elementindicies_inc_(p0, p1, p2);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        long result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_benchmark_get_();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleLong(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_set_$long: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        long p0 = c.receiveLong();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        long result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_benchmark_set_(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleLong(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_benchmark_inc_$long$boolean: {
        // unmarshal parameters
        c.openReceivePrimitive(9);
        long p0 = c.receiveLong();
        boolean p1 = c.receiveBoolean();
        c.closeReceivePrimitive(9);
        c.closeReceiveCall();

        long result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_benchmark_inc_(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleLong(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_barrier_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        jp.sync.Barrier result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_barrier_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_barrier_set_$jp_sync_Barrier: {
        // unmarshal parameters
        jp.sync.Barrier p0 = (jp.sync.Barrier) c.receiveObject();
        c.closeReceiveCall();

        jp.sync.Barrier result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_barrier_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exception_listeners_get_$: {
        // unmarshal parameters
        c.closeReceiveCall();

        java.util.Set result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_exception_listeners_get_();
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

      case run.ModelCluster_instance_impl_KStub.ID_run_ModelCluster_exception_listeners_set_$java_util_Set: {
        // unmarshal parameters
        java.util.Set p0 = (java.util.Set) c.receiveObject();
        c.closeReceiveCall();

        java.util.Set result;
        try {
          // call the implementation
          result = impl.run_ModelCluster_exception_listeners_set_(p0);
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

      case run.ModelCluster_instance_impl_KStub.ID_assembleMassMatrix$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.assembleMassMatrix();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_initialize$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.initialize();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_post$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.post();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_print$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.print();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_setInitialConditions$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.setInitialConditions();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_solve$jp_sync_Barrier: {
        // unmarshal parameters
        jp.sync.Barrier p0 = (jp.sync.Barrier) c.receiveObject();
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.solve(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_passReferences$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.passReferences();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_setReferences$run_SharedData: {
        // unmarshal parameters
        run.SharedData p0 = (run.SharedData) c.receiveObject();
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.setReferences(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_getTtemp$: {
        // unmarshal parameters
        c.closeReceiveCall();

        double result;
        try {
          // call the implementation
          result = impl.getTtemp();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleDouble(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_determineDistribution$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.determineDistribution();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_referenceNodes$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.referenceNodes();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_optimize$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.optimize();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_getBenchmark$: {
        // unmarshal parameters
        c.closeReceiveCall();

        long result;
        try {
          // call the implementation
          result = impl.getBenchmark();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleLong(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_run$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.run();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_stopThreads$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.stopThreads();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_sendException$java_lang_Exception: {
        // unmarshal parameters
        java.lang.Exception p0 = (java.lang.Exception) c.receiveObject();
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.sendException(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_addExceptionListener$run_ExceptionListener: {
        // unmarshal parameters
        run.ExceptionListener p0 = (run.ExceptionListener) c.receiveObject();
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.addExceptionListener(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID_setCluster_nodes$_run_ModelCluster: {
        // unmarshal parameters
        run.ModelCluster[] p0 = (run.ModelCluster[]) c.receiveObject();
        c.closeReceiveCall();

        try {
          // call the implementation
          impl.setCluster_nodes(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__wait$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl._wait();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__wait$long: {
        // unmarshal parameters
        c.openReceivePrimitive(8);
        long p0 = c.receiveLong();
        c.closeReceivePrimitive(8);
        c.closeReceiveCall();

        try {
          // call the implementation
          impl._wait(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__wait$long$int: {
        // unmarshal parameters
        c.openReceivePrimitive(12);
        long p0 = c.receiveLong();
        int p1 = c.receiveInt();
        c.closeReceivePrimitive(12);
        c.closeReceiveCall();

        try {
          // call the implementation
          impl._wait(p0, p1);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__notify$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl._notify();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__notifyAll$: {
        // unmarshal parameters
        c.closeReceiveCall();

        try {
          // call the implementation
          impl._notifyAll();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__equals$java_lang_Object: {
        // unmarshal parameters
        java.lang.Object p0 = (java.lang.Object) c.receiveObject();
        c.closeReceiveCall();

        boolean result;
        try {
          // call the implementation
          result = impl._equals(p0);
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleBoolean(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__location$: {
        // unmarshal parameters
        c.closeReceiveCall();

        int result;
        try {
          // call the implementation
          result = impl._location();
        } catch (Throwable ex) {
          // marshal the server-side exception
          c.openSendResult(false);
          c.sendObject(ex);
          return;
        }

        // marshal the return value
        c.openSendResult(true);
        c.sendSingleInt(result);
        return;
      }

      case run.ModelCluster_instance_impl_KStub.ID__migrateTo$jp_lang_VirtualMachine: {
        // unmarshal parameters
        jp.lang.VirtualMachine p0 = (jp.lang.VirtualMachine) c.receiveObject();
        c.closeReceiveCall();

        java.lang.Object result;
        try {
          // call the implementation
          result = impl._migrateTo(p0);
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
