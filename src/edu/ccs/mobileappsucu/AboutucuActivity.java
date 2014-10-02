package edu.ccs.mobileappsucu;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AboutucuActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutucu_layout);

		TabHost tabHost = getTabHost();

		TabSpec historyspec = tabHost.newTabSpec("Histry");
		historyspec.setIndicator("Histry",
				getResources().getDrawable(R.drawable.icon_history_tab));
		Intent historyIntent = new Intent(this, HistoryActivity.class);
		historyspec.setContent(historyIntent);

		TabSpec missionspec = tabHost.newTabSpec("Mision");
		missionspec.setIndicator("Mision",
				getResources().getDrawable(R.drawable.icon_mission_tab));
		Intent missionIntent = new Intent(this, MissionActivity.class);
		missionspec.setContent(missionIntent);

		TabSpec visionspec = tabHost.newTabSpec("Vision");
		visionspec.setIndicator("Vision",
				getResources().getDrawable(R.drawable.icon_vision_tab));
		Intent visionIntent = new Intent(this, VisionActivity.class);
		visionspec.setContent(visionIntent);

		TabSpec goalspec = tabHost.newTabSpec("Goal");
		goalspec.setIndicator("Goal",
				getResources().getDrawable(R.drawable.icon_goal_tab));
		Intent goalIntent = new Intent(this, GoalActivity.class);
		goalspec.setContent(goalIntent);

		tabHost.addTab(historyspec);
		tabHost.addTab(missionspec);
		tabHost.addTab(visionspec);
		tabHost.addTab(goalspec);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aboutucu, menu);
		return true;
	}

}
