package com.yumul.edreayuki.yumuledreayukilab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("4ITF", "onCreate has executed");
    }

    public void process2 (View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct1){
            i = new Intent (this, MainActivity.class);
            startActivity(i);
            Log.d("4ITF", "Act1 (process2) has executed");
        }
    }

    public void map2 (View v){
        Uri location = Uri.parse("geo:14.583709,121.057225");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        String title = "Select application";
        Intent chooser = Intent.createChooser(mapIntent, title);
        startActivity(chooser);
        Log.d("4ITF", "Chooser has executed");
    }
}
