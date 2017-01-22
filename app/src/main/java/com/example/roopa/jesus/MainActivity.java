package com.example.roopa.jesus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(android.R.id.button1);

    }

    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, choosingTestament.class);
        startActivity(i);


    }
    }



   /* Intent i = new Intent(FromActivity.this, ToActivity.class);
    startActivity(i);*/


