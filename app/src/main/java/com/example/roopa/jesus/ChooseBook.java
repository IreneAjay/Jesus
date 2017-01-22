package com.example.roopa.jesus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ChooseBook extends AppCompatActivity {
    Button books;
    bibleDbHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_book);
        books = (Button) findViewById(R.id.genesis);
        dbHandler = new bibleDbHandler(this, null, null, 1);


    }
}

        //cursor.close();
        //String query="SELECT * FROM"+TABLE_OLDTESTAMENT;
        //return data;



    /*@Override
    public void onClick(View v) {
        dbHandler.openDataBase();
        //dbHandler.printDatabase();
        String text = dbHandler.getYourData();
        dbHandler.close();
    }*/
