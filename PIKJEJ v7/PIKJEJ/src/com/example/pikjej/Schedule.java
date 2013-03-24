package com.example.pikjej;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class Schedule extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        // hide the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_schedule);
		//set to Portrait mode
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule, menu);
		return true;
	}
	
	public void About(View arg0){
		Intent intent = new Intent(Schedule.this, About.class);
		startActivity(intent);

	}
    
    public void Settings(View arg0){
		Intent intent = new Intent(Schedule.this, Settings.class);
		startActivity(intent);

	}
    
    public void Home(View arg0){
		Intent intent = new Intent(Schedule.this, Home.class);
		startActivity(intent);

	}
    
    public void Schedule(View arg0){
		Intent intent = new Intent(Schedule.this, Schedule.class);
		startActivity(intent);

	}
    public void Terms(View arg0){
		Intent intent = new Intent(Schedule.this, Terms.class);
		startActivity(intent);

	}public void AltTravel(View arg0){
		Intent intent = new Intent(Schedule.this, AltTravel.class);
		startActivity(intent);

	}
	public void Predictor(View arg0){
		Intent intent = new Intent(Schedule.this, Predictor.class);
		startActivity(intent);

	}
	public void Userguide(View arg0){
		Intent intent = new Intent(Schedule.this, Userguide.class);
		startActivity(intent);

	}

}
