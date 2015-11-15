package com.example.libraryapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class onclicklistener implements OnClickListener {
	
	
	public static void showActivity(Context context,Class<?> cls){
		Intent intent =new Intent(context,cls);
		context.startActivity(intent);
	}
	@Override
	public void onClick(View v) {
		Context context = v.getContext();
		switch(v.getId()){
		case R.id.btn1:
			showActivity(context, btn1.class);
			break;
		case R.id.btn2:
			showActivity(context, btn1.class);
			break;
		case R.id.btn3:
			showActivity(context, btn1.class);
			break;
		case R.id.btn4:
			showActivity(context, btn1.class);
			break;
		case R.id.btn5:
			showActivity(context, btn1.class);
			break;
		case R.id.btn6:
			showActivity(context, btn1.class);
			break;
		case R.id.btn7:
			showActivity(context, btn1.class);
			break;
		case R.id.btn8:
			showActivity(context, btn1.class);
			break;
		case R.id.btn9:
			showActivity(context, btn1.class);
			break;
		case R.id.btn10:
			showActivity(context, btn1.class);
			break;
		}

	}

}
