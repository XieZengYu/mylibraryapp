package com.example.libraryapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class me extends Fragment {
	private ImageButton shoucang,jieyue,xiugai,yuyue,yijian,lixian,shezhi,huancun,women;
	private ImageView sign;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	    super.onCreate(savedInstanceState);
	}

	@Override
	// @Nullable : the parameter could be null
	public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.me, null);
		shoucang = (ImageButton) view.findViewById(R.id.shoucang);
		jieyue = (ImageButton) view.findViewById(R.id.jieyue);
		xiugai = (ImageButton) view.findViewById(R.id.xiugai);
		yuyue = (ImageButton) view.findViewById(R.id.yuyue);
		yijian = (ImageButton) view.findViewById(R.id.yijian);
		lixian = (ImageButton) view.findViewById(R.id.lixian);
		shezhi = (ImageButton) view.findViewById(R.id.shezhi);
		huancun = (ImageButton) view.findViewById(R.id.huancun);
		women = (ImageButton) view.findViewById(R.id.women);
		sign = (ImageView) view.findViewById(R.id.touxiang1);
		
	    return view;
	}
}
