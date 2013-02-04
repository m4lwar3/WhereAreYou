package com.example.whereareyou;

import com.google.android.maps.MapActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	@Override
	protected boolean isRouteDisplayed() {
	    return false;
	}

}
