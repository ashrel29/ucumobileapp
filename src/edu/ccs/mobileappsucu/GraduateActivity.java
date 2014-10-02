package edu.ccs.mobileappsucu;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class GraduateActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graduate_layout);

		TabHost tabHost = getTabHost();

		TabSpec pgradspec = tabHost.newTabSpec("Grad");
		pgradspec.setIndicator("Grad",
				getResources().getDrawable(R.drawable.icon_post_graduate_tab));
		Intent gradIntent = new Intent(this, PostGraduateActivity.class);
		pgradspec.setContent(gradIntent);

		TabSpec grdprogspec = tabHost.newTabSpec("Grdprog");
		grdprogspec.setIndicator("Grdprog",
				getResources()
						.getDrawable(R.drawable.icon_graduate_program_tab));
		Intent grdprogIntent = new Intent(this, GraduateProgramActivity.class);
		grdprogspec.setContent(grdprogIntent);

		TabSpec degrepec = tabHost.newTabSpec("Degre");
		degrepec.setIndicator("Degre",
				getResources().getDrawable(R.drawable.icon_degree_program_tab));
		Intent degreIntent = new Intent(this, DegreeProgramsActivity.class);
		degrepec.setContent(degreIntent);

		tabHost.addTab(pgradspec);
		tabHost.addTab(grdprogspec);
		tabHost.addTab(degrepec);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.graduate, menu);
		return true;
	}

}
