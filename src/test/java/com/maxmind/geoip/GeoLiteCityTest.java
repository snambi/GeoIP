package com.maxmind.geoip;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

public class GeoLiteCityTest {
	
	static URL location;
	static HashMap<String,String> nameip = new HashMap<String,String>();
	static{
		location = GeoLiteCityTest.class.getClassLoader().getResource("GeoLiteCity.dat");
		
		nameip.put("home", "76.126.242.196");
		nameip.put("google.com", "74.125.224.133");
		nameip.put("etrade.com", "12.153.224.22");
		nameip.put("ebay.com", "66.135.205.13");
		nameip.put("whitehouse.gov", "72.247.136.110");
		nameip.put("bbc.co.uk","212.58.241.131");
		nameip.put("tcs.in", "202.71.129.225");
	}
	
	@Test
	public void getCoordinatesForIp(){
		
		try {
			//LookupService cl = new LookupService("/usr/local/share/GeoIP/GeoIPCity.dat",LookupService.GEOIP_MEMORY_CACHE );
			LookupService cl = new LookupService( location.getFile(),
													LookupService.GEOIP_MEMORY_CACHE );
			
			Set<String> keys = nameip.keySet();
			for( String key : keys ){
				Location l1 = cl.getLocation( nameip.get(key));
				System.out.println( key +": " + nameip.get(key) + " : " + l1.toString());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


}
