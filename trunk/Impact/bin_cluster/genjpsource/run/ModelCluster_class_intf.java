package run;

import java.text.ParseException;

import java.util.*;

import java.io.*;

import run.readers.FembicReader;

import uka.karmi.rmi.RemoteException;

import jp.sync.*;

import jp.lang.*;



import jp.lang.*;

public interface ModelCluster_class_intf extends jp.lang.RemoteObject_class_intf {

  public ModelCluster_class_intf run_ModelCluster__class_get_() throws uka.karmi.rmi.RemoteException;

  public java.lang.Object _new(int nr_of_CPUs, int client_nr, String path, Barrier barrier) throws uka.karmi.rmi.RemoteException;

}
