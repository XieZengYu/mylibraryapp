package com.example.libraryapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class homepage extends Fragment {
	private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	}
	@Override
	// @Nullable : the parameter could be null
	public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.homepage, null);
		btn1 = (ImageButton) view.findViewById(R.id.btn1);
		btn2 = (ImageButton) view.findViewById(R.id.btn2);
		btn3 = (ImageButton) view.findViewById(R.id.btn3);
		btn4 = (ImageButton) view.findViewById(R.id.btn4);
		btn5 = (ImageButton) view.findViewById(R.id.btn5);
		btn6 = (ImageButton) view.findViewById(R.id.btn6);
		btn7 = (ImageButton) view.findViewById(R.id.btn7);
		btn8 = (ImageButton) view.findViewById(R.id.btn8);
		btn9 = (ImageButton) view.findViewById(R.id.btn9);
		btn10 = (ImageButton) view.findViewById(R.id.btn10);
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
	    return view;
	}
}

