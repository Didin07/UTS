
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		tampilan_1
	 *	@date 		Tuesday 14th of November 2023 07:33:03 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import iam.pam.uts.R;

	public class tampilan_1_activity extends Activity {

	
	private View _bg___tampilan_1_ek2;
	private ImageView rectangle_1;
	private ImageView polygon_1;
	private TextView store;
	private TextView cihampelas;
	private ImageView rectangle_3;
	private TextView your_name;
	private ImageView rectangle_4;
	private ImageView _rectangle_5;
	private TextView submit;
	private TextView please_fill_your_name;
	private TextView cibiru;
	private ImageView rm_pizza_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan_1);

		
		_bg___tampilan_1_ek2 = (View) findViewById(R.id._bg___tampilan_1_ek2);
		rectangle_1 = (ImageView) findViewById(R.id.rectangle_1);
		polygon_1 = (ImageView) findViewById(R.id.polygon_1);
		store = (TextView) findViewById(R.id.store);
		cihampelas = (TextView) findViewById(R.id.cihampelas);
		rectangle_3 = (ImageView) findViewById(R.id.rectangle_3);
		your_name = (TextView) findViewById(R.id.your_name);
		rectangle_4 = (ImageView) findViewById(R.id.rectangle_4);
		_rectangle_5 = (ImageView) findViewById(R.id._rectangle_5);
		submit = (TextView) findViewById(R.id.submit);
		please_fill_your_name = (TextView) findViewById(R.id.please_fill_your_name);
		cibiru = (TextView) findViewById(R.id.cibiru);
		rm_pizza_1 = (ImageView) findViewById(R.id.rm_pizza_1);
	
		
		_rectangle_5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), tampilan_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	