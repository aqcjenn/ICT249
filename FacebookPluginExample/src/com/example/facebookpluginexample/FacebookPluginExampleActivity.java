package com.example.facebookpluginexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.apache.cordova.DroidGap;
import org.apache.cordova.api.CordovaPlugin;

public class FacebookPluginExampleActivity extends DroidGap  {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	
}
