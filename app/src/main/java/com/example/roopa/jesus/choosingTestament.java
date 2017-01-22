package com.example.roopa.jesus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class choosingTestament extends AppCompatActivity {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_testament);
       // View view = findViewById(android.R.id.button1);
       //view = findViewById(android.R.id.button2);
    }

    public void onClickOldTestament(View v) {
        Intent i = new Intent(choosingTestament.this, ChooseBook.class);
        startActivity(i);


    }
   public void onClickNewTestament(View v){
       Intent i2 = new Intent(choosingTestament.this, choosingNewTestamentBook.class);
        startActivity(i2);
    }



    }

