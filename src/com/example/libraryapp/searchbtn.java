package com.example.libraryapp;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class searchbtn implements OnClickListener{

	@Override
	public void onClick(View v) {
		Context context = v.getContext();
		Toast.makeText(context, "亲，你搜索的书籍不存在呦~~", Toast.LENGTH_LONG).show();
	}

}
