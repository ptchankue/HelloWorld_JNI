package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class HelloWorld extends Activity {
	TextView txtHello;

	static 
	{
		System.loadLibrary("HelloWorld");
	}

	/** Called when the activity is first created. */

	@Override

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_hello_world);
		txtHello=(TextView)findViewById(R.id.txtHello);
		txtHello.setText(messageFromNativeCode());
	}

	public native String messageFromNativeCode();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}

}
