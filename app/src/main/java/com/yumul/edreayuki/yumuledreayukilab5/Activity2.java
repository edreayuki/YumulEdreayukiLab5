package com.yumul.edreayuki.yumuledreayukilab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process2 (View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct1){
            i = new Intent (this, MainActivity.class);
            startActivity(i);
        }
    }
}
