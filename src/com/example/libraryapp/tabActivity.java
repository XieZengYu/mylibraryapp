package com.example.libraryapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;



public class tabActivity extends FragmentActivity {
	
	private homepage homepage;
	private search search;
	private me me;
	private RadioGroup myTabRg;
	private long exitTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.tab);
		initView();
        }
	
	public void initView() {
	    homepage = new homepage();
	    getSupportFragmentManager().beginTransaction().replace(R.id.main_content, homepage).commit();
	    myTabRg = (RadioGroup) findViewById(R.id.tab_menu);
	    myTabRg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
					case R.id.rbhome:
						homepage = new homepage();
						getSupportFragmentManager().beginTransaction().replace(R.id.main_content, homepage).commit();
						break;
					case R.id.rbsearch:
						search = new search();
						getSupportFragmentManager().beginTransaction().replace(R.id.main_content, search).commit();
						break;
					case R.id.rbMe:
						me = new me();
						getSupportFragmentManager().beginTransaction().replace(R.id.main_content, me).commit();
						break;
					default:
						break;
				}
			}
		});
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK){
			exit();
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}

	private void exit() {
		if((System.currentTimeMillis()-exitTime) > 2000){
			Toast.makeText(getBaseContext(), "再按一次退出程序", Toast.LENGTH_LONG).show();
			exitTime = System.currentTimeMillis();
		}else{
			finish();
			System.exit(0);
		}
	}
}

