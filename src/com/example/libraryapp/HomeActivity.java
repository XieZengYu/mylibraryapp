package com.example.libraryapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;


public class HomeActivity extends Activity {
	
	private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.homepage);
		btn1 = (ImageButton) findViewById(R.id.btn1);
		btn2 = (ImageButton) findViewById(R.id.btn2);
		btn3 = (ImageButton) findViewById(R.id.btn3);
		btn4 = (ImageButton) findViewById(R.id.btn4);
		btn5 = (ImageButton) findViewById(R.id.btn5);
		btn6 = (ImageButton) findViewById(R.id.btn6);
		btn7 = (ImageButton) findViewById(R.id.btn7);
		btn8 = (ImageButton) findViewById(R.id.btn8);
		btn9 = (ImageButton) findViewById(R.id.btn9);
		btn10 = (ImageButton) findViewById(R.id.btn10);
		btn1.setOnClickListener(new onclicklistener());
		btn2.setOnClickListener(new onclicklistener());
		btn3.setOnClickListener(new onclicklistener());
		btn4.setOnClickListener(new onclicklistener());
		btn5.setOnClickListener(new onclicklistener());
		btn6.setOnClickListener(new onclicklistener());
		btn7.setOnClickListener(new onclicklistener());
		btn8.setOnClickListener(new onclicklistener());
		btn9.setOnClickListener(new onclicklistener());
		btn10.setOnClickListener(new onclicklistener());
	}
}
