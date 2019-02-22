package com.example.assignment3;
 import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;

public class Activity2  extends AppCompatActivity{
    private Button buttonActivity1 = null;
    private Button buttonActivity3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        this.buttonActivity1 = (Button)findViewById(R.id.Activity1);
        this.buttonActivity3 = (Button)findViewById(R.id.Activity3);

        this.buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.assignment3.MainActivity.class);
                startActivity(intent);
            }
            });
        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,
                        com.example.assignment3.Activity3.class);
                startActivity(intent);
            }
            });

        }
    }

