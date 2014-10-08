package com.ubicom.ruta;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;




public class MainActivity extends Activity 
{
    private GoogleMap mMap; 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mMap =   ((MapFragment)  getFragmentManager().findFragmentById(R.id.map)).getMap();
                
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		mMap.addMarker(new MarkerOptions().position(new LatLng(10,10)).title("Hello"));
		mMap.setMyLocationEnabled(true);
        
        mMap.setOnMarkerClickListener(new OnMarkerClickListener(){
            
            @Override
            public boolean onMarkerClick(Marker marker){
             mMap.clear();
             return true;  
            }
        });


        

    }
}
