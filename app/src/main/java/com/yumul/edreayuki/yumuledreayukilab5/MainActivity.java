package com.yumul.edreayuki.yumuledreayukilab5;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct2){
            i = new Intent (this, Activity2.class);
            startActivity(i);
        }
    }

    public void map1 (View v){
        Uri location = Uri.parse("geo:14.583709,121.057225");
        Intent mapIntent = new Intent(Intent.ACTION_SEND, location);
        String title = "Select application";
        Intent chooser = Intent.createChooser(mapIntent, title);
        startActivity(chooser);
    }
}
