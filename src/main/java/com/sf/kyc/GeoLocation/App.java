package com.sf.kyc.GeoLocation;

import clocation.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println("-- Init! --");
        
        try {
        	Response resp = Locator.getLocation();
        	System.out.println(resp.getDescription());
        	System.out.println(resp.getCoordinate().getLatitude() + "," + resp.getCoordinate().getLongitude());
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
