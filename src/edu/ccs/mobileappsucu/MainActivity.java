package edu.ccs.mobileappsucu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView admission;
	ImageView aboutucu;
	ImageView graduate;
	ImageView universitylife;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admission=(ImageView)findViewById(R.id.imageView1);
        aboutucu=(ImageView)findViewById(R.id.imageView2);
        graduate=(ImageView)findViewById(R.id.imageView3);
        universitylife=(ImageView)findViewById(R.id.imageView4);
        
        admission.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, AdmissionActivity.class);
				startActivity(i);
				
			}        	
        
    });
        aboutucu=(ImageView)findViewById(R.id.imageView2);
        aboutucu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, AboutucuActivity.class);
				startActivity(i);
				
			}
        
        });
        graduate=(ImageView)findViewById(R.id.imageView3);
        graduate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, GraduateActivity.class);
				startActivity(i);
				
				
			}
        	
        
        });
        universitylife=(ImageView)findViewById(R.id.imageView4);
        universitylife.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, UniversitylifeActivity.class);
				startActivity(i);
				
				
			}

               

        
});

        
        
        
        
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
