package com.example.whereareyou;

import com.example.whereareyou.R;
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
		return true;
	}
	@Override
	protected boolean isRouteDisplayed() {
	    return false;
	}

}
