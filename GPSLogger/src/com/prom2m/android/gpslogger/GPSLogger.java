package com.prom2m.android.gpslogger;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.widget.Toast;

public class GPSLogger extends Activity {
	
    private LocationManager lm;
    private LocationListener locationListener;

    /** Called when the activity is first created. */
    public void onCreate(Activity callerActivity) {
        //---use the LocationManager class to obtain GPS locations---
        lm = (LocationManager) 
            callerActivity.getSystemService(Context.LOCATION_SERVICE);    
        
        locationListener = new MyLocationListener();
        
        lm.requestLocationUpdates(
            LocationManager.GPS_PROVIDER, 
            1000, 
            100, 
            locationListener);        
    } 

    public class MyLocationListener implements LocationListener {

		public void onLocationChanged(Location loc) {
            if (loc != null) {
                Toast.makeText(getBaseContext(), 
                    "Location changed : Lat: " + loc.getLatitude() + 
                    " Lng: " + loc.getLongitude(), 
                    Toast.LENGTH_SHORT).show();
            }
		}

		public void onProviderDisabled(String provider) {
            Toast.makeText(getBaseContext(), 
                    "onProviderDisabled: "+provider, 
                    Toast.LENGTH_SHORT).show();
			
		}

		public void onProviderEnabled(String provider) {
            Toast.makeText(getBaseContext(), 
                    "onProviderEnabled: "+provider, 
                    Toast.LENGTH_SHORT).show();
			
		}

		public void onStatusChanged(String provider, int status, Bundle extras) {
			String showStatus = null;
			if (status == LocationProvider.AVAILABLE) showStatus = "Available";
			if (status == LocationProvider.TEMPORARILY_UNAVAILABLE) showStatus = "Temporarily Unavailable";
			if (status == LocationProvider.OUT_OF_SERVICE) showStatus = "Out of Service";
            Toast.makeText(getBaseContext(), 
                    "onStatusChanged: "+provider+" status: "+showStatus, 
                    Toast.LENGTH_SHORT).show();
			
		}
    	
    }
}