package com.example.assignment3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity3 extends AppCompatActivity{
    private Button Activity1 = null;
    private Button Activity2 = null;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity3);

         this.Activity1 = (Button) findViewById(R.id.buttonActivity1);
         this.Activity2 = (Button) findViewById(R.id.buttonActivity2);
         this.Activity1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Activity3.this,
                         com.example.assignment3.MainActivity.class);
                 startActivity(intent);
             }
         });
         this.Activity2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Activity3.this,
                         com.example.assignment3.Activity2.class);
                 startActivity(intent);
             }
         });
     }
     }




