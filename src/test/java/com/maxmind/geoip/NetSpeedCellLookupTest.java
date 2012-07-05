package com.maxmind.geoip;

/* OrgLookupTest.java */

import java.io.IOException;
import java.net.URL;

/* sample of how to use the GeoIP Java API with GeoIP Organization and ISP databases */
/* This example can also be used with the GeoIP Domain and ASNum databases */
/* Usage: java OrgLookupTest 64.4.4.4 */

class NetSpeedCellLookupTest {
    public static void main(String[] args) {
	try {
		URL location = NetSpeedCellLookupTest.class.getClassLoader().getResource("GeoIPNetSpeedCell.dat");
	    LookupService ns = new LookupService( location.getFile() );
	    System.out.println("XX: " + ns.getOrg(args[0]));
	    ns.close();
	}
	catch (IOException e) {
	    System.out.println("IO Exception");
	}
    }
}
