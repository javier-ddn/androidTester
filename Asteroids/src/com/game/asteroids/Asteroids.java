package com.game.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroids extends Activity {

	private Button aboutButton;
	private Button preferencesButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("Main", "Starting Asteroids app ActivityMain...");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		aboutButton = (Button) findViewById(R.id.action_about);
		aboutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				runAbout(null);
			}
		});
		preferencesButton = (Button) findViewById(R.id.action_settings);
		preferencesButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				runPreferences(null);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_about:
			runAbout(null);
			break;

		default:
			break;
		}
		return true;
	}

	public void runPreferences(View view) {
		Intent intent = new Intent(this, Preferences.class);
		startActivity(intent);
	}

	public void runAbout(View view) {
		Intent intent = new Intent(this, About.class);
		startActivity(intent);
	}

	public void exit(View view) {
		finish();
	}

}
