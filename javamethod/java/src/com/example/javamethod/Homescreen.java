package com.example.javamethod;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class Homescreen extends ActionBarActivity implements OnClickListener {
	
	EditText etnumberone,etnumbertwo;
	Button btnadd,btnmultiply,btndivision,btnsubtraction;
	TextView tvresult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		tvresult = (TextView) findViewById(R.id.tvhmresult);
		tvresult.setOnClickListener(this);
		
		etnumberone = (EditText) findViewById(R.id.ethmno1);
		etnumberone.setOnClickListener(this);
		
		etnumbertwo = (EditText) findViewById(R.id.ethmno2);
		etnumbertwo.setOnClickListener(this);
		

	
		}

	@Override
	public void onClick(View v) {
	
		}
		
	}
	}

	