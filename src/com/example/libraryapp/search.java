package com.example.libraryapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class search extends Fragment {
	private Button search;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	    super.onCreate(savedInstanceState);
	}

	@Override
	// @Nullable : the parameter could be null
	public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.search, null);
		search = (Button) view.findViewById(R.id.search);
		search.setOnClickListener(new searchbtn());
	    return view;
	}
}
