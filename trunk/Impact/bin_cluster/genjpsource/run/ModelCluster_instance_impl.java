package run;

import java.text.ParseException;

import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import uka.karmi.rmi.RemoteException;

import jp.sync.*;

import jp.lang.*;



public class ModelCluster_instance_impl extends jp.lang.RemoteObject_instance_impl
  implements ModelCluster_instance_intf
{

  private int number_of_elements;

  /** Remote variable access: get ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_elements;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_elements = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_elements */
  public final int run_ModelCluster_number_of_elements_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_elements;
        this.number_of_elements += _value_;
        return _before_;
      } else {
        return this.number_of_elements += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_trackers;

  /** Remote variable access: get ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_trackers;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_trackers = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_trackers */
  public final int run_ModelCluster_number_of_trackers_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_trackers;
        this.number_of_trackers += _value_;
        return _before_;
      } else {
        return this.number_of_trackers += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_nodes;

  /** Remote variable access: get ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_nodes;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_nodes = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_nodes */
  public final int run_ModelCluster_number_of_nodes_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_nodes;
        this.number_of_nodes += _value_;
        return _before_;
      } else {
        return this.number_of_nodes += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_materials;

  /** Remote variable access: get ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_materials;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_materials = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_materials */
  public final int run_ModelCluster_number_of_materials_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_materials;
        this.number_of_materials += _value_;
        return _before_;
      } else {
        return this.number_of_materials += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_controls;

  /** Remote variable access: get ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_controls;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_controls = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_controls */
  public final int run_ModelCluster_number_of_controls_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_controls;
        this.number_of_controls += _value_;
        return _before_;
      } else {
        return this.number_of_controls += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_constraints;

  /** Remote variable access: get ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_constraints;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_constraints = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_constraints */
  public final int run_ModelCluster_number_of_constraints_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_constraints;
        this.number_of_constraints += _value_;
        return _before_;
      } else {
        return this.number_of_constraints += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int number_of_loads;

  /** Remote variable access: get ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_loads;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.number_of_loads = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.number_of_loads */
  public final int run_ModelCluster_number_of_loads_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.number_of_loads;
        this.number_of_loads += _value_;
        return _before_;
      } else {
        return this.number_of_loads += _value_;
      }
    } finally {
      _dec();
    }
  }

  private run.RplVector constraintlist;

  /** Remote variable access: get ModelCluster.constraintlist */
  public final run.RplVector run_ModelCluster_constraintlist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.constraintlist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.constraintlist */
  public final run.RplVector run_ModelCluster_constraintlist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.constraintlist = _value_;
    } finally {
      _dec();
    }
  }

  private run.RplVector loadlist;

  /** Remote variable access: get ModelCluster.loadlist */
  public final run.RplVector run_ModelCluster_loadlist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.loadlist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.loadlist */
  public final run.RplVector run_ModelCluster_loadlist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.loadlist = _value_;
    } finally {
      _dec();
    }
  }

  private run.RplVector nodelist;

  /** Remote variable access: get ModelCluster.nodelist */
  public final run.RplVector run_ModelCluster_nodelist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodelist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.nodelist */
  public final run.RplVector run_ModelCluster_nodelist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodelist = _value_;
    } finally {
      _dec();
    }
  }

  private java.util.Hashtable nodetable;

  /** Remote variable access: get ModelCluster.nodetable */
  public final java.util.Hashtable run_ModelCluster_nodetable_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodetable;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.nodetable */
  public final java.util.Hashtable run_ModelCluster_nodetable_set_(java.util.Hashtable _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodetable = _value_;
    } finally {
      _dec();
    }
  }

  private run.RplVector elementlist;

  /** Remote variable access: get ModelCluster.elementlist */
  public final run.RplVector run_ModelCluster_elementlist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementlist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.elementlist */
  public final run.RplVector run_ModelCluster_elementlist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementlist = _value_;
    } finally {
      _dec();
    }
  }

  private run.RplVector trackerlist;

  /** Remote variable access: get ModelCluster.trackerlist */
  public final run.RplVector run_ModelCluster_trackerlist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.trackerlist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.trackerlist */
  public final run.RplVector run_ModelCluster_trackerlist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.trackerlist = _value_;
    } finally {
      _dec();
    }
  }

  private run.RplVector materiallist;

  /** Remote variable access: get ModelCluster.materiallist */
  public final run.RplVector run_ModelCluster_materiallist_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.materiallist;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.materiallist */
  public final run.RplVector run_ModelCluster_materiallist_set_(run.RplVector _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.materiallist = _value_;
    } finally {
      _dec();
    }
  }

  private run.SharedData shareddata;

  /** Remote variable access: get ModelCluster.shareddata */
  public final run.SharedData run_ModelCluster_shareddata_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.shareddata;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.shareddata */
  public final run.SharedData run_ModelCluster_shareddata_set_(run.SharedData _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.shareddata = _value_;
    } finally {
      _dec();
    }
  }

  private volatile double time;

  /** Remote variable access: get ModelCluster.time */
  public final double run_ModelCluster_time_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.time;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.time */
  public final double run_ModelCluster_time_set_(double _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.time = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.time */
  public final double run_ModelCluster_time_inc_(double _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        double _before_ = this.time;
        this.time += _value_;
        return _before_;
      } else {
        return this.time += _value_;
      }
    } finally {
      _dec();
    }
  }

  private volatile double ttemp;

  /** Remote variable access: get ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.ttemp;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_set_(double _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.ttemp = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.ttemp */
  public final double run_ModelCluster_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        double _before_ = this.ttemp;
        this.ttemp += _value_;
        return _before_;
      } else {
        return this.ttemp += _value_;
      }
    } finally {
      _dec();
    }
  }

  private volatile double exported_ttemp;

  /** Remote variable access: get ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.exported_ttemp;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_set_(double _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.exported_ttemp = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.exported_ttemp */
  public final double run_ModelCluster_exported_ttemp_inc_(double _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        double _before_ = this.exported_ttemp;
        this.exported_ttemp += _value_;
        return _before_;
      } else {
        return this.exported_ttemp += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int i;

  /** Remote variable access: get ModelCluster.i */
  public final int run_ModelCluster_i_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.i;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.i */
  public final int run_ModelCluster_i_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.i = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.i */
  public final int run_ModelCluster_i_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.i;
        this.i += _value_;
        return _before_;
      } else {
        return this.i += _value_;
      }
    } finally {
      _dec();
    }
  }

  private run.Controlset controlset;

  /** Remote variable access: get ModelCluster.controlset */
  public final run.Controlset run_ModelCluster_controlset_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.controlset;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.controlset */
  public final run.Controlset run_ModelCluster_controlset_set_(run.Controlset _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.controlset = _value_;
    } finally {
      _dec();
    }
  }

  private run.Element temporary_element;

  /** Remote variable access: get ModelCluster.temporary_element */
  public final run.Element run_ModelCluster_temporary_element_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_element;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.temporary_element */
  public final run.Element run_ModelCluster_temporary_element_set_(run.Element _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_element = _value_;
    } finally {
      _dec();
    }
  }

  private run.Tracker temporary_tracker;

  /** Remote variable access: get ModelCluster.temporary_tracker */
  public final run.Tracker run_ModelCluster_temporary_tracker_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_tracker;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.temporary_tracker */
  public final run.Tracker run_ModelCluster_temporary_tracker_set_(run.Tracker _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_tracker = _value_;
    } finally {
      _dec();
    }
  }

  private run.Constraint temporary_constraint;

  /** Remote variable access: get ModelCluster.temporary_constraint */
  public final run.Constraint run_ModelCluster_temporary_constraint_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_constraint;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.temporary_constraint */
  public final run.Constraint run_ModelCluster_temporary_constraint_set_(run.Constraint _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_constraint = _value_;
    } finally {
      _dec();
    }
  }

  private run.Node temporary_node;

  /** Remote variable access: get ModelCluster.temporary_node */
  public final run.Node run_ModelCluster_temporary_node_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_node;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.temporary_node */
  public final run.Node run_ModelCluster_temporary_node_set_(run.Node _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.temporary_node = _value_;
    } finally {
      _dec();
    }
  }

  private run.Writer resultwriter;

  /** Remote variable access: get ModelCluster.resultwriter */
  public final run.Writer run_ModelCluster_resultwriter_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.resultwriter;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.resultwriter */
  public final run.Writer run_ModelCluster_resultwriter_set_(run.Writer _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.resultwriter = _value_;
    } finally {
      _dec();
    }
  }

  private run.TrackWriter trackwriter;

  /** Remote variable access: get ModelCluster.trackwriter */
  public final run.TrackWriter run_ModelCluster_trackwriter_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.trackwriter;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.trackwriter */
  public final run.TrackWriter run_ModelCluster_trackwriter_set_(run.TrackWriter _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.trackwriter = _value_;
    } finally {
      _dec();
    }
  }

  private java.lang.String filename;

  /** Remote variable access: get ModelCluster.filename */
  public final java.lang.String run_ModelCluster_filename_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.filename;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.filename */
  public final java.lang.String run_ModelCluster_filename_set_(java.lang.String _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.filename = _value_;
    } finally {
      _dec();
    }
  }

  private double timestep;

  /** Remote variable access: get ModelCluster.timestep */
  public final double run_ModelCluster_timestep_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.timestep;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.timestep */
  public final double run_ModelCluster_timestep_set_(double _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.timestep = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.timestep */
  public final double run_ModelCluster_timestep_inc_(double _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        double _before_ = this.timestep;
        this.timestep += _value_;
        return _before_;
      } else {
        return this.timestep += _value_;
      }
    } finally {
      _dec();
    }
  }

  private boolean failure_is_set = false;

  /** Remote variable access: get ModelCluster.failure_is_set */
  public final boolean run_ModelCluster_failure_is_set_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.failure_is_set;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.failure_is_set */
  public final boolean run_ModelCluster_failure_is_set_set_(boolean _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.failure_is_set = _value_;
    } finally {
      _dec();
    }
  }

  private boolean autostep;

  /** Remote variable access: get ModelCluster.autostep */
  public final boolean run_ModelCluster_autostep_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.autostep;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.autostep */
  public final boolean run_ModelCluster_autostep_set_(boolean _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.autostep = _value_;
    } finally {
      _dec();
    }
  }

  private int nr_of_CPUs;

  /** Remote variable access: get ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nr_of_CPUs;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nr_of_CPUs = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.nr_of_CPUs */
  public final int run_ModelCluster_nr_of_CPUs_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.nr_of_CPUs;
        this.nr_of_CPUs += _value_;
        return _before_;
      } else {
        return this.nr_of_CPUs += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int client_nr;

  /** Remote variable access: get ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.client_nr;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_set_(int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.client_nr = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.client_nr */
  public final int run_ModelCluster_client_nr_inc_(int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.client_nr;
        this.client_nr += _value_;
        return _before_;
      } else {
        return this.client_nr += _value_;
      }
    } finally {
      _dec();
    }
  }

  private run.ModelCluster[] cluster_nodes;

  /** Remote variable access: get ModelCluster.cluster_nodes */
  public final run.ModelCluster[] run_ModelCluster_cluster_nodes_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.cluster_nodes;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.cluster_nodes */
  public final run.ModelCluster[] run_ModelCluster_cluster_nodes_set_(run.ModelCluster[] _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.cluster_nodes = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: get ModelCluster.cluster_nodes[p0] */
  public final run.ModelCluster run_ModelCluster_cluster_nodes_get_(int p0) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.cluster_nodes[p0];
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.cluster_nodes[p0] */
  public final run.ModelCluster run_ModelCluster_cluster_nodes_set_(int p0, run.ModelCluster _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.cluster_nodes[p0] = _value_;
    } finally {
      _dec();
    }
  }

  private int[] nodeindicies;

  /** Remote variable access: get ModelCluster.nodeindicies */
  public final int[] run_ModelCluster_nodeindicies_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodeindicies;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.nodeindicies */
  public final int[] run_ModelCluster_nodeindicies_set_(int[] _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodeindicies = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: get ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_get_(int p0) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodeindicies[p0];
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_set_(int p0, int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.nodeindicies[p0] = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.nodeindicies[p0] */
  public final int run_ModelCluster_nodeindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.nodeindicies[p0];
        this.nodeindicies[p0] += _value_;
        return _before_;
      } else {
        return this.nodeindicies[p0] += _value_;
      }
    } finally {
      _dec();
    }
  }

  private int[] elementindicies;

  /** Remote variable access: get ModelCluster.elementindicies */
  public final int[] run_ModelCluster_elementindicies_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementindicies;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.elementindicies */
  public final int[] run_ModelCluster_elementindicies_set_(int[] _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementindicies = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: get ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_get_(int p0) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementindicies[p0];
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_set_(int p0, int _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.elementindicies[p0] = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.elementindicies[p0] */
  public final int run_ModelCluster_elementindicies_inc_(int p0, int _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        int _before_ = this.elementindicies[p0];
        this.elementindicies[p0] += _value_;
        return _before_;
      } else {
        return this.elementindicies[p0] += _value_;
      }
    } finally {
      _dec();
    }
  }

  private long benchmark;

  /** Remote variable access: get ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.benchmark;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_set_(long _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.benchmark = _value_;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: increment ModelCluster.benchmark */
  public final long run_ModelCluster_benchmark_inc_(long _value_, boolean _post_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      if (_post_) {
        long _before_ = this.benchmark;
        this.benchmark += _value_;
        return _before_;
      } else {
        return this.benchmark += _value_;
      }
    } finally {
      _dec();
    }
  }

  private jp.sync.Barrier barrier;

  /** Remote variable access: get ModelCluster.barrier */
  public final jp.sync.Barrier run_ModelCluster_barrier_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.barrier;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.barrier */
  public final jp.sync.Barrier run_ModelCluster_barrier_set_(jp.sync.Barrier _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.barrier = _value_;
    } finally {
      _dec();
    }
  }

  private java.util.Set exception_listeners;

  /** Remote variable access: get ModelCluster.exception_listeners */
  public final java.util.Set run_ModelCluster_exception_listeners_get_() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.exception_listeners;
    } finally {
      _dec();
    }
  }

  /** Remote variable access: set ModelCluster.exception_listeners */
  public final java.util.Set run_ModelCluster_exception_listeners_set_(java.util.Set _value_) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      return this.exception_listeners = _value_;
    } finally {
      _dec();
    }
  }

  public ModelCluster_instance_impl(int nr_of_CPUs, int client_nr, String path, Barrier barrier) throws uka.karmi.rmi.RemoteException {
    super();;
    this.nr_of_CPUs = nr_of_CPUs;
    this.client_nr = client_nr;
    this.filename = path;
    this.barrier = barrier;
    this.exception_listeners = Collections.synchronizedSet(new HashSet());
    ;
  }

  /** Application method of class ModelCluster */
  public void assembleMassMatrix() throws java.lang.Exception
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         int i;
         Node temp_node;
         Element temp_element;
         Constraint temp_constraint;
         try {
            System.out.println("Assembling Elements");
            for (i = 0; i < this.number_of_elements; i++) {
               temp_element = (Element)this.elementlist.elementAt(i);
               temp_element.assembleMassMatrix();
            }
         }  catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating *\n " + e);
         } catch (NullPointerException e) {
            throw new NullPointerException("\n* Error during Assembly phase of Element *\n* This error could be the result of a missing (or wrong) parameter in the indata file *\n" + e);
         }
         try {
            System.out.println("Assembling Nodes");
            for (i = 0; i < this.nodelist.size(); i++) {
               temp_node = (Node)this.nodelist.elementAt(i);
               temp_node.determineMassMatrix();
            }
         }  catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating *\n" + e);
         } catch (NullPointerException e) {
            throw new NullPointerException("\n* Error during Assembly phase of Node *\n* This error could be the result of a missing (or wrong) parameter in the indata file *\n" + e);
         }
         try {
            System.out.println("Assembling Constraints");
            for (i = 0; i < this.number_of_constraints; i++) {
               temp_constraint = (Constraint)this.constraintlist.elementAt(i);
               temp_constraint.determineMassMatrix(this.nodelist);
            }
         }  catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("\n* Error during Assembly phase - Terminating *\n" + e);
         } catch (NullPointerException e) {
            throw new NullPointerException("\n* Error during Assembly phase of Constraint *\n* This error could be the result of a missing (or wrong) parameter in the indata file *\n" + e);
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void initialize() throws java.lang.Exception
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         Reader indatafile = new FembicReader(this.filename);
         try {
            this.number_of_elements = indatafile.numberOfElements();
            this.number_of_trackers = indatafile.numberOfTrackers();
            this.number_of_materials = indatafile.numberOfMaterials();
            this.number_of_nodes = indatafile.numberOfNodes();
            this.number_of_constraints = indatafile.numberOfConstraints();
            this.number_of_loads = indatafile.numberOfLoads();
            this.number_of_controls = indatafile.numberOfControls();
         }  catch (ParseException e) {
            throw new ParseException("Error in initialization phase \n" + e, e.getErrorOffset());
         }
         this.elementlist = new RplVector(this.number_of_elements);
         this.trackerlist = new RplVector(this.number_of_trackers);
         this.materiallist = new RplVector(this.number_of_materials);
         this.nodelist = new RplVector(this.number_of_nodes);
         this.nodetable = new Hashtable(this.number_of_nodes);
         this.constraintlist = new RplVector(this.number_of_constraints);
         this.loadlist = new RplVector(this.number_of_loads);
         this.controlset = new Controlset();
         try {
            System.out.println("Reading Constraints");
            indatafile.open();
            for (this.i = 0; this.i < this.number_of_constraints; this.i++) {
               this.constraintlist.addElement(indatafile.getNextConstraint(this.nodelist));
            }
            indatafile.close();
            System.out.println("Filled constraintlist");
            System.out.println("Reading Loads");
            indatafile.open();
            for (this.i = 0; this.i < this.number_of_loads; this.i++) {
               this.loadlist.addElement(indatafile.getNextLoad(this.nodelist));
            }
            indatafile.close();
            System.out.println("Filled loadlist");
            indatafile.open();
            System.out.println("Reading Nodes");
            for (this.i = 0; this.i < this.number_of_nodes; this.i++) {
               this.temporary_node = indatafile.getNextNode(this.constraintlist, this.loadlist);
               this.nodelist.addElement(this.temporary_node);
               this.nodetable.put(new Integer(this.temporary_node.getNumber()), this.temporary_node);
            }
            indatafile.close();
            System.out.println("Filled nodelist");
            indatafile.open();
            System.out.println("Reading Materials");
            Material m;
            for (this.i = 0; this.i < this.number_of_materials; this.i++) {
               m = indatafile.getNextMaterial();
               if (m.failure_strain_is_set || m.failure_stress_is_set) {
                  this.failure_is_set = true;
               }
               this.materiallist.addElement(m);
            }
            indatafile.close();
            System.out.println("Filled materiallist");
            indatafile.open();
            System.out.println("Reading Elements");
            for (this.i = 0; this.i < this.number_of_elements; this.i++) {
               this.elementlist.addElement(indatafile.getNextElement(this.materiallist, this.nodelist, this.loadlist, this.nodetable));
            }
            indatafile.close();
            System.out.println("Filled elementlist");
            indatafile.open();
            System.out.println("Reading Trackers");
            for (this.i = 0; this.i < this.number_of_trackers; this.i++) {
               this.trackerlist.addElement(indatafile.getNextTracker(this.nodelist, this.elementlist));
            }
            indatafile.close();
            System.out.println("Filled trackerlist");
            indatafile.open();
            System.out.println("Reading Controls");
            for (this.i = 0; this.i < this.number_of_controls; this.i++) {
               indatafile.getControlSet(this.controlset);
            }
            indatafile.close();
            System.out.println("Filled controlset");
            this.resultwriter = indatafile.getWriter(this.nodelist, this.elementlist, this.controlset, this.cluster_nodes);
            this.trackwriter = indatafile.getTrackWriter(this.trackerlist, this.controlset, this.cluster_nodes);
         }  catch (ParseException e) {
            throw new ParseException("Parameter error in indata file \n" + e + " in line " + e.getErrorOffset(), e.getErrorOffset());
         }
         try {
            this.resultwriter.initialize();
         }  catch (Exception e) {
            throw new Exception("Initialization error of writer");
         }
         try {
            this.trackwriter.initialize();
         }  catch (Exception e) {
            throw new Exception("Initialization error of trackwriter");
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void post() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void print() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         System.out.println();
         System.out.println();
         System.out.println("Time: " + this.time);
         try {
            this.resultwriter.write(this.filename, this.time);
            this.trackwriter.write(this.time);
         }  catch (IOException ioe) {
            ioe.printStackTrace();
            return;
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void setInitialConditions() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         int i;
         int j;
         Node temp_node;
         Element temp_element;
         Tracker temp_tracker;
         Constraint temp_constraint;
         double total_mass;
         this.benchmark = System.currentTimeMillis();
         System.out.println("Initializing nodes");
         for (i = 0; i < this.nodelist.size(); i++) {
            temp_node = (Node)this.nodelist.elementAt(i);
            temp_node.setInitialConditions();
         }
         System.out.println("Sorting nodes");
         Collections.sort(this.nodelist, new NodeComparator());
         System.out.println("Setting up node neighbour handles");
         for (j = 0; j < this.nodelist.size(); j++) {
            temp_node = (Node)this.nodelist.elementAt(j);
            if (j < this.nodelist.size() - 1) {
               temp_node.setRight_neighbour((Node)this.nodelist.elementAt(j + 1));
            }
            if (j > 0) {
               temp_node.setLeft_neighbour((Node)this.nodelist.elementAt(j - 1));
            }
         }
         System.out.println("Initializing elements");
         for (i = 0; i < this.number_of_elements; i++) {
            temp_element = (Element)this.elementlist.elementAt(i);
            temp_element.setInitialConditions();
         }
         System.out.println("Initializing trackers");
         for (i = 0; i < this.number_of_trackers; i++) {
            temp_tracker = (Tracker)this.trackerlist.elementAt(i);
            temp_tracker.setInitialConditions();
         }
         System.out.println("Initializing constraints");
         for (i = 0; i < this.number_of_constraints; i++) {
            temp_constraint = (Constraint)this.constraintlist.elementAt(i);
            temp_constraint.setInitialConditions();
         }
         this.controlset.setInitialConditions();
         System.out.println("Determining smallest time step size");
         if (this.controlset.getTimestep(0) == 0) {
            this.autostep = true;
            this.timestep = 1.0E10;
            for (i = 0; i < this.number_of_elements; i++) {
               this.timestep = ((Element)this.elementlist.elementAt(i)).checkTimestep(this.timestep);
            }
         } else {
            this.autostep = false;
            this.timestep = this.controlset.getTimestep(0);
         }
         System.out.println("Determined time step: " + this.timestep);
         System.out.println("Calculating total model mass");
         total_mass = 0;
         for (i = 0; i < this.nodelist.size(); i++) {
            temp_node = (Node)this.nodelist.elementAt(i);
            total_mass += temp_node.getMass();
         }
         System.out.println("Total model mass = " + total_mass);
         this.benchmark = System.currentTimeMillis() - this.benchmark;
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void solve(jp.sync.Barrier barrier) throws java.lang.Exception
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         final boolean DEBUG = false;
         int j;
         long time_info;
         long time_info_tmp;
         long time_remained;
         int number_of_integration_points;
         int time_h;
         int time_m;
         int time_s;
         String time_str;
         time_info = new Date().getTime();
         this.ttemp = 1.0E10;
         System.out.println("Calculating " + this.elementindicies.length + " elements");
         for (this.time = this.controlset.getStarttime(); this.time <= this.controlset.getEndtime(); this.time += this.timestep) {
            barrier.sync();
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Loop elements");
            for (this.i = 0; this.i < this.elementindicies.length; this.i++) {
               this.temporary_element = (Element)this.elementlist.elementAt(this.elementindicies[this.i]);
               if (!this.temporary_element.isDeActivated()) {
                  this.temporary_element.updateLocalCoordinateSystem();
                  number_of_integration_points = this.temporary_element.getNumberOfIntegrationPoints();
                  for (j = 0; j < number_of_integration_points; j++) {
                     this.temporary_element.calculateStrain(this.timestep, j);
                     this.temporary_element.calculateStress(j, this.timestep);
                  }
                  for (j = 0; j < number_of_integration_points; j++) {
                     this.temporary_element.calculateNodalForces(j, this.timestep);
                  }
                  this.temporary_element.calculateExternalForces(this.time);
                  this.temporary_element.calculateContactForces();
                  if (this.autostep == true) {
                     this.ttemp = this.temporary_element.checkTimestep(this.ttemp);
                  }
               }
            }
            this.exported_ttemp = this.ttemp;
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Failed elements");
            if (this.failure_is_set) {
               for (this.i = 0; this.i < this.elementindicies.length; this.i++) {
                  this.temporary_element = (Element)this.elementlist.elementAt(this.elementindicies[this.i]);
                  if (!this.temporary_element.isDeActivated()) {
                     this.temporary_element.checkIfFailed();
                     if (this.temporary_element.hasFailed()) this.temporary_element.deActivate();
                  }
               }
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Loop constraints");
            for (this.i = 0; this.i < this.number_of_constraints; this.i++) {
               this.temporary_constraint = (Constraint)this.constraintlist.elementAt(this.i);
               this.temporary_constraint.update();
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Update forces");
            this.shareddata.collectiveUpdate();
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Loop nodes");
            for (this.i = 0; this.i < this.nodelist.size(); this.i++) {
               this.temporary_node = (Node)this.nodelist.elementAt(this.i);
               if (!this.temporary_node.isDeActivated()) {
                  this.temporary_node.calculateNewPosition(this.timestep, this.time);
                  this.temporary_node.checkNeighbours();
               }
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Loop Trackers");
            for (this.i = 0; this.i < this.number_of_trackers; this.i++) {
               this.temporary_tracker = (Tracker)this.trackerlist.elementAt(this.i);
               this.temporary_tracker.collectData();
               this.temporary_tracker.calculate();
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Update timestep");
            if (this.controlset.getTimestep(this.time) == 0) {
               this.autostep = true;
               for (this.i = 0; this.i < this.nr_of_CPUs; this.i++) {
                  if (this.i != this.client_nr) this.ttemp = Math.min(this.ttemp, this.cluster_nodes[this.i].getTtemp());
               }
               this.timestep = this.ttemp;
               this.ttemp = 1.0E10;
            } else {
               this.autostep = false;
               this.timestep = this.controlset.getTimestep(this.time);
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Print Results");
            if (this.controlset.timeToPrint(this.time)) {
               System.out.println();
               System.out.println();
               time_info_tmp = new Date().getTime();
               time_remained = (time_info_tmp - time_info) * (int)((this.controlset.getEndtime() - this.time) / this.controlset.getPrintstep()) / 1000;
               time_h = (int)(time_remained / 3600);
               time_m = (int)(time_remained / 60 - time_h * 60);
               time_s = (int)(time_remained - (int)(time_remained / 60) * 60);
               time_str = "";
               if (time_h < 10) {
                  time_str += "0" + time_h;
               } else {
                  time_str += time_h;
               }
               if (time_m < 10) {
                  time_str += ":0" + time_m;
               } else {
                  time_str += ":" + time_m;
               }
               if (time_s < 10) {
                  time_str += ":0" + time_s;
               } else {
                  time_str += ":" + time_s;
               }
               System.out.println("Cluster node [" + this.client_nr + "] Time: " + ((this.time + "").length() > 16 ? (this.time + "").substring(0, 16) : this.time + "") + "\tRemaining time (hh:mm:ss) " + time_str);
               time_info = time_info_tmp;
               try {
                  this.resultwriter.writeParallel(this.filename, this.time, this.elementindicies, barrier, this.client_nr, this.nr_of_CPUs);
               }  catch (IOException ioe) {
                  System.out.println(ioe);
                  return;
               }
            }
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Print trackers");
            if (this.controlset.timeToPrintTracker(this.time)) {
               if (this.client_nr == 0) {
                  this.trackwriter.write(this.time);
               }
            }
            barrier.sync();
            if (DEBUG) System.out.println("Client: " + this.client_nr + " Clear nodal forces");
            for (this.i = 0; this.i < this.nodeindicies.length; this.i++) {
               this.temporary_node = (Node)this.nodelist.elementAt(this.nodeindicies[this.i]);
               if (!this.temporary_node.isDeActivated()) {
                  this.temporary_node.clearNodalForces();
               }
            }
         }
         this.post();
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void passReferences() throws uka.karmi.rmi.RemoteException, jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         if (this.client_nr == 0) {
            this.shareddata = new SharedData(this.cluster_nodes, this.nodelist.size());
            for (int i = 1; i < this.cluster_nodes.length; i++) this.cluster_nodes[i].setReferences(this.shareddata);
            try {
               this.shareddata.exclusiveUpdate();
            }  catch (java.io.IOException ioe) {
               ioe.printStackTrace();
            } catch (ClassNotFoundException e) {
               e.printStackTrace();
            }
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void setReferences(run.SharedData sd) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         this.shareddata = sd;
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public double getTtemp() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         return this.exported_ttemp;
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void determineDistribution() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         Node tempnode;
         Element tempelement;
         int index = 0;
         long[] benchdata;
         double[] q;
         int c = 0;
         double sum = 0;
         benchdata = new long[this.nr_of_CPUs];
         q = new double[this.nr_of_CPUs];
         for (int i = 0; i < this.nr_of_CPUs; i++) benchdata[i] = this.cluster_nodes[i].getBenchmark();
         for (int i = 0; i < this.nr_of_CPUs; i++) sum += 1 / (double)benchdata[i];
         for (int i = 0; i < this.nr_of_CPUs; i++) q[i] = 1 / ((double)benchdata[i] * sum);
         for (int i = 1; i < this.nr_of_CPUs; i++) {
            q[i] += q[i - 1];
         }
         tempnode = (Node)this.nodelist.firstElement();
         while (tempnode.getLeft_neighbour() != null) tempnode = tempnode.getLeft_neighbour();
         for (int i = 0; i < this.nodelist.size(); i++) {
            if (c == this.client_nr) index++;
            if (i < (double)this.nodelist.size() * q[c]) tempnode.setCpu_number(c); else tempnode.setCpu_number(c++);
            tempnode = tempnode.getRight_neighbour();
         }
         this.nodeindicies = new int[index];
         index = 0;
         for (int i = 0; i < this.nodelist.size(); i++) {
            tempnode = (Node)this.nodelist.elementAt(i);
            if (tempnode.getCpu_number() == this.client_nr) this.nodeindicies[index++] = i;
         }
         index = 0;
         for (int i = 0; i < this.elementlist.size(); i++) {
            tempelement = (Element)this.elementlist.elementAt(i);
            tempelement.determineCpu_number();
            if (tempelement.getCpu_number() == this.client_nr) index++;
         }
         this.elementindicies = new int[index];
         index = 0;
         for (int i = 0; i < this.elementlist.size(); i++) {
            tempelement = (Element)this.elementlist.elementAt(i);
            if (tempelement.getCpu_number() == this.client_nr) this.elementindicies[index++] = i;
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void referenceNodes() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         Node tempnode;
         for (int i = 0; i < this.nodelist.size(); i++) {
            tempnode = (Node)this.nodelist.elementAt(i);
            tempnode.setForceReference(this.shareddata.getForce(i));
            tempnode.setInternalForceReference(this.shareddata.getInternalForce(i));
            tempnode.setContactForceReference(this.shareddata.getContactForce(i));
            tempnode.setExternalForceReference(this.shareddata.getExternalForce(i));
            tempnode.setHourglassForceReference(this.shareddata.getHourglassForce(i));
            tempnode.setForcePositiveReference(this.shareddata.getForcePositive(i));
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void optimize() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         if (this.number_of_trackers == 0) this.shareddata.freeze();
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public long getBenchmark() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         return this.benchmark;
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void run() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         try {
            initialize();
            if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
            assembleMassMatrix();
            if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
            setInitialConditions();
            this.barrier.sync();
            passReferences();
            this.barrier.sync();
            determineDistribution();
            if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
            referenceNodes();
            this.barrier.sync();
            optimize();
            if (Thread.currentThread().isInterrupted()) throw new InterruptedException();
            solve(this.barrier);
         }  catch (Exception e) {
            sendException(e);
            stopThreads();
            return;
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void stopThreads() throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void sendException(java.lang.Exception e) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         if (this.exception_listeners.size() == 0) {
            e.printStackTrace();
            return;
         }
         Iterator iter = this.exception_listeners.iterator();
         while (iter.hasNext()) {
            ExceptionListener l = (ExceptionListener)iter.next();
            l.exceptionOccurred(e, (run.ModelCluster)_this);
         }
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void addExceptionListener(run.ExceptionListener l) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         this.exception_listeners.add(l);
      }
    } finally {
      _dec();
    }
  }

  /** Application method of class ModelCluster */
  public void setCluster_nodes(run.ModelCluster[] cluster_nodes) throws jp.lang.MovedException
  {
    // method counting for migration control
    _inc();
    try {
      // application code
      {
         this.cluster_nodes = cluster_nodes;
      }
    } finally {
      _dec();
    }
  }

  /** @see RemoteObject.__init() */
  protected void __init() {
    _this = new ModelCluster((jp.lang.Marker) null);
    _this._init(_getRef());
  }

  /** Called to free heap space after object migration.
      @see RemoteObject._cleanup() */
  protected void _cleanup() {
    super._cleanup();
    this.constraintlist = null;
    this.loadlist = null;
    this.nodelist = null;
    this.nodetable = null;
    this.elementlist = null;
    this.trackerlist = null;
    this.materiallist = null;
    this.shareddata = null;
    this.controlset = null;
    this.temporary_element = null;
    this.temporary_tracker = null;
    this.temporary_constraint = null;
    this.temporary_node = null;
    this.resultwriter = null;
    this.trackwriter = null;
    this.filename = null;
    this.cluster_nodes = null;
    this.nodeindicies = null;
    this.elementindicies = null;
    this.barrier = null;
    this.exception_listeners = null;
  }

}
