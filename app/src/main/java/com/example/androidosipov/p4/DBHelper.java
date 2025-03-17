package com.example.androidosipov.p4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "matches.db";
    private static final int DATABASE_VERSION = 1;

    DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " +
                DBMatches.TABLE_NAME + " (" +
                DBMatches.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DBMatches.COLUMN_TEAM_1 + " TEXT NOT NULL, " +
                DBMatches.COLUMN_TEAM_2 + " TEXT NOT NULL, " +
                DBMatches.COLUMN_POINT_1 + " INTEGER NOT NULL, " +
                DBMatches.COLUMN_POINT_2 + " INTEGER NOT NULL); ";
        db.execSQL(query);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBMatches.TABLE_NAME);
        onCreate(db);
    }
}
