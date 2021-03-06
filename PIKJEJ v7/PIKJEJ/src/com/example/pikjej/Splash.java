package com.example.pikjej;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.Window;


public class Splash extends Activity {
	// Set the display time, in milliseconds (or extract it out as a configurable parameter)
    private final int SPLASH_DISPLAY_LENGTH =3500;
 
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // hide the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
		//set to Portrait mode
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
 
    @Override
    protected void onResume()
    {
        super.onResume();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        // Obtain the sharedPreference, default to true if not available
        boolean isSplashEnabled = sp.getBoolean("isSplashEnabled", true);
 
        if (isSplashEnabled)
        {
            new Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    //Finish the splash activity so it can't be returned to.
                    Splash.this.finish();
                    // Create an Intent that will start the main activity.
                    Intent mainIntent = new Intent(Splash.this, Home.class);
                    Splash.this.startActivity(mainIntent);
                }
            }, SPLASH_DISPLAY_LENGTH);
        }
        else
        {
            // if the splash is not enabled, then finish the activity immediately and go to main.
            finish();
            Intent mainIntent = new Intent(Splash.this, Home.class);
            Splash.this.startActivity(mainIntent);
        }
    }
} 
