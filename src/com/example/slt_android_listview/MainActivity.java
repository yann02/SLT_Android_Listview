package com.example.slt_android_listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;

	private Button btn5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		btn5 = (Button) findViewById(R.id.button5);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						ListView1Activity.class));
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						ListView2Activity.class));
			}
		});
		btn3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						ListView3Activity.class));
			}
		});
		btn4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						ListView4Activity.class));
			}
		});
		btn5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						GridViewActivity.class));
			}
		});
	}
}
