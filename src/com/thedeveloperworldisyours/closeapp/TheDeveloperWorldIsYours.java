package com.thedeveloperworldisyours.closeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class TheDeveloperWorldIsYours extends Activity {

	private Button firstButton;
	private Button destroyButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_the_developer_world_is_yours);
		firstButton = (Button) findViewById(R.id.button1);
		destroyButton = (Button) findViewById(R.id.destroyButton);

		firstButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				onClickFuntion(arg0);

			}
		});

		destroyButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		        UIHelper.killApp(true);
			}
		});
	}

	public void onClickFuntion(View arg0)
	{
		Intent i = new Intent(this, SecondActivity.class);
		startActivityForResult(i, 10);
	}
}
