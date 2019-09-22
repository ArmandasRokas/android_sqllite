package dk.rokas.test_sqllite.sqllite;

import android.content.Context;
import android.database.sqlite.*;


public class FeedReaderDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "fha.db";

    public FeedReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}