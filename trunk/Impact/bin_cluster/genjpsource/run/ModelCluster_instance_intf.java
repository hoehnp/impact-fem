package run;

import java.text.ParseException;

import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import uka.karmi.rmi.RemoteException;

import jp.sync.*;

import jp.lang.*;



public interface ModelCluster_instance_intf extends jp.lang.RemoteObject_instance_intf {

  public int run_ModelCluster_number_of_elements_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_elements_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_trackers_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_trackers_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_nodes_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_nodes_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_materials_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_materials_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_controls_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_controls_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_constraints_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_constraints_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_loads_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_loads_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_constraintlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_constraintlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_loadlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_loadlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_nodelist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_nodelist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.util.Hashtable run_ModelCluster_nodetable_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.util.Hashtable run_ModelCluster_nodetable_set_(java.util.Hashtable _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_elementlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_elementlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_trackerlist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_trackerlist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_materiallist_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.RplVector run_ModelCluster_materiallist_set_(run.RplVector _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.SharedData run_ModelCluster_shareddata_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.SharedData run_ModelCluster_shareddata_set_(run.SharedData _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_time_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_time_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_time_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_ttemp_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_ttemp_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_exported_ttemp_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_exported_ttemp_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_i_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_i_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_i_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Controlset run_ModelCluster_controlset_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Controlset run_ModelCluster_controlset_set_(run.Controlset _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Element run_ModelCluster_temporary_element_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Element run_ModelCluster_temporary_element_set_(run.Element _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Tracker run_ModelCluster_temporary_tracker_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Tracker run_ModelCluster_temporary_tracker_set_(run.Tracker _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Constraint run_ModelCluster_temporary_constraint_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Constraint run_ModelCluster_temporary_constraint_set_(run.Constraint _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Node run_ModelCluster_temporary_node_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Node run_ModelCluster_temporary_node_set_(run.Node _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Writer run_ModelCluster_resultwriter_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.Writer run_ModelCluster_resultwriter_set_(run.Writer _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.TrackWriter run_ModelCluster_trackwriter_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.TrackWriter run_ModelCluster_trackwriter_set_(run.TrackWriter _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.lang.String run_ModelCluster_filename_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.lang.String run_ModelCluster_filename_set_(java.lang.String _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_timestep_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_timestep_set_(double _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double run_ModelCluster_timestep_inc_(double _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public boolean run_ModelCluster_failure_is_set_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public boolean run_ModelCluster_failure_is_set_set_(boolean _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public boolean run_ModelCluster_autostep_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public boolean run_ModelCluster_autostep_set_(boolean _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nr_of_CPUs_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nr_of_CPUs_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_client_nr_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_client_nr_set_(int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_client_nr_inc_(int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.ModelCluster[] run_ModelCluster_cluster_nodes_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.ModelCluster[] run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.ModelCluster run_ModelCluster_cluster_nodes_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public run.ModelCluster run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int[] run_ModelCluster_nodeindicies_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int[] run_ModelCluster_nodeindicies_set_(int[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nodeindicies_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nodeindicies_set_(int p0, int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int[] run_ModelCluster_elementindicies_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int[] run_ModelCluster_elementindicies_set_(int[] _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_elementindicies_get_(int p0) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_elementindicies_set_(int p0, int _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public int run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public long run_ModelCluster_benchmark_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public long run_ModelCluster_benchmark_set_(long _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public long run_ModelCluster_benchmark_inc_(long _value_, boolean _post_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public jp.sync.Barrier run_ModelCluster_barrier_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public jp.sync.Barrier run_ModelCluster_barrier_set_(jp.sync.Barrier _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.util.Set run_ModelCluster_exception_listeners_get_() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public java.util.Set run_ModelCluster_exception_listeners_set_(java.util.Set _value_) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void assembleMassMatrix() throws java.lang.Exception;

  public void initialize() throws java.lang.Exception;

  public void post() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void print() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void setInitialConditions() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void solve(jp.sync.Barrier barrier) throws java.lang.Exception;

  public void passReferences() throws uka.karmi.rmi.RemoteException, jp.lang.MovedException;

  public void setReferences(run.SharedData sd) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public double getTtemp() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void determineDistribution() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void referenceNodes() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void optimize() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public long getBenchmark() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void run() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void stopThreads() throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void sendException(java.lang.Exception e) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void addExceptionListener(run.ExceptionListener l) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

  public void setCluster_nodes(run.ModelCluster[] cluster_nodes) throws jp.lang.MovedException, uka.karmi.rmi.RemoteException;

}
