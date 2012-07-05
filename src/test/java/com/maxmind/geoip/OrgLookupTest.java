package com.maxmind.geoip;

/* OrgLookupTest.java */

import java.io.IOException;
import java.net.URL;

/* sample of how to use the GeoIP Java API with GeoIP Organization and ISP databases */
/* This example can also be used with the GeoIP Domain and ASNum databases */
/* Usage: java OrgLookupTest 64.4.4.4 */

class OrgLookupTest {
    public static void main(String[] args) {
	try {
		
		URL location1 = OrgLookupTest.class.getClassLoader().getResource("GeoIPOrg.dat");
		URL location2 = OrgLookupTest.class.getClassLoader().getResource("GeoIPISP.dat");
		
	    LookupService orgl = new LookupService( location1.getFile());
	    LookupService ispl = new LookupService( location2.getFile());
	    System.out.println("Organization: " + orgl.getOrg(args[0]) +
			       "\tISP: " + ispl.getOrg(args[0]));
	    orgl.close();
	    ispl.close();
	}
	catch (IOException e) {
	    System.out.println("IO Exception");
	}
    }
}
