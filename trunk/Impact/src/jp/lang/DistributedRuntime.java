/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOUSE. See the GNU
 * General Public License for more details.
 *
 * You should have recieved a copy of the GNU General Public License
 * along with this program; if not write to the Free Software
 * Foundation, inc., 59 Temple Place, Suite 330, Boston MA 02111-1307
 * USA
 */
package jp.lang;

import uka.karmi.rmi.server.ReplicatedObject;

/**
 * @author pc58410
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DistributedRuntime {

	/**
	 * @return
	 */
	public static int getMachineCnt() {

		// If this method is run, a conventional version of Impact is used and
		// not the cluster version.
		// Signal this by returning a negative value.
		return -1;
	}

	/**
	 * @return
	 */
	public static boolean migrate(RemoteObject o, int machine) {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * @return
	 */
	public static int getMachineID() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return
	 */
	public static void setTarget() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return
	 */
	public static void setTarget(int i) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param nodelist
	 * @param lastload
	 */
	public static void setReadOnly(ReplicatedObject r, Object o) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param nodelist
	 * @return
	 */
	public static Object getDiagnostics(ReplicatedObject r) {
		// TODO Auto-generated method stub
		return null;
	}

}