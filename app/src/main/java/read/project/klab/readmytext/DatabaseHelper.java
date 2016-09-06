package read.project.klab.readmytext;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alexis on 6/27/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "evoice";
    // Table Name
    public static final String TABLE_NAME = "evoicetable";


    // Column names

    public static final String KEY_FAVORITE= "favorite";
    public static final String KEY_PRONOUNCIATION = "favorite_pro";
    public static final String KEY_CREATED_AT = "DATETIME";


    // Table Create Statements
    private static final String STRING_CREATE = "CREATE TABLE "+TABLE_NAME+" (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            +KEY_FAVORITE+" TEXT, "+KEY_PRONOUNCIATION+" TEXT, "+KEY_CREATED_AT+" DATE);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(STRING_CREATE);


        ContentValues cv = new ContentValues(3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cv.put(KEY_CREATED_AT, dateFormat.format(new Date()));
        db.insert(TABLE_NAME, null, cv);
    }
}