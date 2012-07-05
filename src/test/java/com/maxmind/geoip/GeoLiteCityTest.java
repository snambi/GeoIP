package com.maxmind.geoip;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;

public class GeoLiteCityTest {
	
	@Test
	public void getCoordinatesForIp(){
		URL location = this.getClass().getClassLoader().getResource("GeoLiteCity.dat");
		
		try {
			//LookupService cl = new LookupService("/usr/local/share/GeoIP/GeoIPCity.dat",LookupService.GEOIP_MEMORY_CACHE );
			LookupService cl = new LookupService( location.getFile(),
													LookupService.GEOIP_MEMORY_CACHE );
			
			Location l1 = cl.getLocation("76.126.242.196");
			
			System.out.println( l1.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
