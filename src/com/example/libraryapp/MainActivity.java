package com.example.libraryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private ImageView picture1 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		picture1 =(ImageView) findViewById(R.id.arrow_s);
		initView();
	}

	private void initView() {
		Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.splush_loading);
		loadAnimation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				openAcitvity(tabActivity.class);
				overridePendingTransition(R.anim.in, R.anim.out);
				finish();
			}
		});
		picture1.startAnimation(loadAnimation);
	}
	
	private void openAcitvity(Class<tabActivity> class1) {
		Intent intent = new Intent(this,class1);
		startActivity(intent);
		
	}
	
	
}
