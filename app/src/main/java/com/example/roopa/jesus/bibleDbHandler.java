package com.example.roopa.jesus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//import android.content.ContentValues;﻿
public class bibleDbHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "oldtestament.db";
    public static final String TABLE_OLDTESTAMENT = "_oldtestament";
    public static final String COLUMN_BOOK = "_oldtestbook";
    public static final String COLUMN_CHAPTER = "_oldtestchapter";
    public static final String COLUMN_VERSE = "_oldtestverse";
    public static final String COLUMN_WORDING = "_oldtestwordings";

    public bibleDbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryoldtest = "CREATE TABLE" + TABLE_OLDTESTAMENT + "(" +
                COLUMN_BOOK + " TEXT PRIMARY KEY, " +
                COLUMN_CHAPTER + "INTEGER AUTOINCREMENT,  " +
                COLUMN_VERSE + "INTEGER AUTOINCREMENT, " +
                COLUMN_WORDING + "TEXT " +
                ");";
        db.execSQL(queryoldtest);
        db.execSQL("INSERT INTO TABLE_OLDTESTAMENT [(COLUMN_BOOK, COLUMN_CHAPTER,COLUMN_VERSE,COLUMN_WORDING)]" +
                "VALUES('GENESIS','1','1','In the beginning God created heaven, and earth.')");
        db.execSQL("INSERT INTO TABLE_OLDTESTAMENT [(COLUMN_BOOK, COLUMN_CHAPTER,COLUMN_VERSE,COLUMN_WORDING)]" +
                "VALUES('GENESIS','1','2','And the earth was void and empty, and darkness was upon the face of the deep; and the spirit of God moved over the waters.')");
        db.execSQL("INSERT INTO TABLE_OLDTESTAMENT [(COLUMN_BOOK, COLUMN_CHAPTER,COLUMN_VERSE,COLUMN_WORDING)]" +
                "VALUES('GENESIS','1','3','And God said: Be light made. And light was made')");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_OLDTESTAMENT);
        onCreate(db);
    }

    public String getYourData() {
        String dbString = " ";
        SQLiteDatabase db = getReadableDatabase();
        //final String TABLE_NAME = "TABLE_OLDTESTAMENT";
        String dispQuery = "SELECT * FROM" + TABLE_OLDTESTAMENT + "WHERE 1";

        Cursor cursor = db.rawQuery(dispQuery, null);
        //books.setText("");
        //String[] data = new String[cursor.getCount()];
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            if (cursor.getString(cursor.getColumnIndex("COLUMN_CHAPTER")) != null) {
                dbString += cursor.getString(cursor.getColumnIndex("COLUMN_CHAPTER"));
                dbString += "\n";
            }

        }

        db.close();
        return dbString;
    }
}