package com.example.fruitskiller;


//import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.ImageView;

 

public class Fruits extends Activity implements OnClickListener { 
	
	
	ImageView im1;
	ImageView im2;
	ImageView im33;
	ImageView im4;
	ImageView im5;
	ImageView im6;
	ImageView im7;
	ImageView im8;
	ImageView im9;
	ImageView im10;
	ImageView im11;
	ImageView im12;
	ImageView im13;
	ImageView im14;
	ImageView im15;
	ImageView im16;
	ImageView im17;
	ImageView im18;
	ImageView im19;
	ImageView im20;
	ImageView im21;
	ImageView im22;
	ImageView im23;
	ImageView im24;
	ImageView im25;
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main);
		
		ImageView[][] x={{im1,imageView2,imageView3,imageView4,imageView5},{imageView6,imageView7,imageView8,imageView9,imageView10}, {imageView11,imageView12,imageView13,imageView14,imageView15},{imageView16,imageView17,imageView18,imageView19,imageView20}, {imageView21,imageView22,imageView23,imageView24,imageView25}};
		
		
		
		
		
		
		im1 = (ImageView) findViewById(R.id.imageView1);
		im1.set
		imageView2= (ImageView) findViewById(R.id.imageView2);
		imageView3 = (ImageView) findViewById(R.id.imageView3);
		imageView4= (ImageView) findViewById(R.id.imageView4); 
		imageView5= (ImageView) findViewById(R.id.imageView5);
		imageView6= (ImageView) findViewById(R.id.imageView6); 
		imageView7= (ImageView) findViewById(R.id.imageView7); 
		imageView8 = (ImageView) findViewById(R.id.imageView8);
		
		imageView9[2][4] = (ImageView) findViewById(R.id.imageView9);
		imageView10[2][5] = (ImageView) findViewById(R.id.imageView10);
		imageView11[3][1]= (ImageView) findViewById(R.id.imageView11);
		imageView12[3][2]= (ImageView) findViewById(R.id.imageView12); 
		imageView13[3][3] = (ImageView) findViewById(R.id.imageView13);
		imageView14[3][4]= (ImageView) findViewById(R.id.imageView14);
		imageView15[3][5]= (ImageView) findViewById(R.id.imageView15);
		imageView16[4][1] = (ImageView) findViewById(R.id.imageView16); 
		imageView17[4][2]= (ImageView) findViewById(R.id.imageView17); 
		imageView18[4][3]= (ImageView) findViewById(R.id.imageView18);
		imageView19[4][4]= (ImageView) findViewById(R.id.imageView19); 
		imageView20[4][5]= (ImageView) findViewById(R.id.imageView20);
		imageView21[5][1]= (ImageView) findViewById(R.id.imageView21); 
		imageView22[5][2] = (ImageView) findViewById(R.id.imageView22); 
		imageView23[5][3]= (ImageView) findViewById(R.id.imageView23);
		imageView24[5][4]= (ImageView) findViewById(R.id.imageView24); 
		imageView25[5][5]= (ImageView) findViewById(R.id.imageView25); 
		
		
		btnAdd1.setOnClickListener(this);
		btnAdd2.setOnClickListener(this);
		btnAdd3.setOnClickListener(this); 
		btnAdd4.setOnClickListener(this);
		
	double[][] array = {{btn[1][1],btn2,btn3},{btn5,btn6,btn7},{btn1,btn2,btn3}};
	}

}



