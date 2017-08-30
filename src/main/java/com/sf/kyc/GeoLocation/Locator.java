/**
 * 
 */
package com.sf.kyc.GeoLocation;

import java.io.File;

import clocation.Location;
import clocation.Response;
import net.sf.jni4net.Bridge;

/**
 * @author Charles
 *
 */
public class Locator {
	
	public static Response getLocation() throws Exception {
    	Bridge.setVerbose(false);
    	Bridge.init();
    	
    	File proxyFile = new File("lib\\CLocation.j4n.dll");
    	Bridge.LoadAndRegisterAssemblyFrom(proxyFile);
    	
    	Location location = new Location();
    	return location.GetCurrentLocation();        	
	}
}

