package com.maxmind.geoip;

/* RegionLookupTest.java */

/* Requires subscription to MaxMind GeoIP Region database */

import java.io.IOException;
import java.net.URL;

class RegionLookupTest {
    public static void main(String[] args) {
        try {
        	
        	URL location = RegionLookupTest.class.getClassLoader().getResource("GeoIPRegion.dat");
            LookupService cl = new LookupService(location.getFile() );
            Region l = cl.getRegion(args[0]);
            System.out.println("Country Code: " + l.countryCode);
            System.out.println("Country Name: " + l.countryName);
            System.out.println("Region Code: " + l.region);
            System.out.println("Region Name: " + regionName.regionNameByCode(l.countryCode,l.region));
            cl.close();
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
