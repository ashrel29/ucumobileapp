package edu.ccs.mobileappsucu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GraduateProgramActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graduate_program_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.graduate_program, menu);
		return true;
	}

}
