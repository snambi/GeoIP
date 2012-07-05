package com.maxmind.geoip;
/* OrgLookupTest.java */

import java.io.IOException;
import java.net.URL;

/* sample of how to use the GeoIP Java API with GeoIP Organization and ISP databases */
/* This example can also be used with the GeoIP Domain and ASNum databases */
/* Usage: java OrgLookupTest 64.4.4.4 */

class ASNumLookupTestV6 {
    public static void main(String[] args) {
	try {
		
		URL location = ASNumLookupTestV6.class.getClassLoader().getResource("GeoIPASNumv6.dat");
	    LookupService asnl = new LookupService( location.getFile());
	    System.out.println("ASNum V6: " + asnl.getOrgV6(args[0]));
	    asnl.close();
	}
	catch (IOException e) {
	    System.out.println("IO Exception");
	}
    }
}
