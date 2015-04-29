package com.example.webp_example;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
  static {
    System.loadLibrary("webp");
  }
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    //Read a webp
    Bitmap bitmap = WebpUtil.loadBitmapFromFile("/storage/sdcard0/test.webp");
    ImageView imageView1 = (ImageView) this.findViewById(R.id.imageView1);
    imageView1.setImageBitmap(bitmap);

  }
  





  

  
	
	
  
}
