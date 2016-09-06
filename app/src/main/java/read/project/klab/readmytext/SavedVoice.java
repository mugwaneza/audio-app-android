package read.project.klab.readmytext;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Alexis on 6/10/2016.
 */
public class SavedVoice extends Activity implements TextToSpeech.OnInitListener {

    SQLiteDatabase db;

    TextView tv1,tv2;
    private TextToSpeech tts;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_voice);
        tv1 = (TextView) findViewById(R.id.favo);
        tv2 = (TextView) findViewById(R.id.favo_pro);
        db = openOrCreateDatabase("evoice", MODE_PRIVATE, null);
        tv2.setVisibility(View.INVISIBLE);
        tts = new TextToSpeech(this, this);
        //use cursor to keep all data
        //cursor can keep data of any data type
        Cursor c = db.rawQuery("select favorite,favorite_pro from evoicetable ORDER BY _id DESC", null);

        tv1.setText("");
        tv2.setText("");

        tv1.setTextColor(Color.parseColor("#00008B"));

        //move cursor to first position
        c.moveToFirst();

        //fetch all data one by one
        do {
            //we can use c.getString(0) here
            //or we can get data using column index
            String favorite = c.getString(c.getColumnIndex("favorite"));
            String favorite_pro = c.getString(c.getColumnIndex("favorite_pro"));

            //display on text view
            tv1.append("" + favorite + "\n");
            tv1.append("\n");
            tv2.append("" + favorite_pro + "\n");
            tv2.append("\n");
            tv2.append("------------------");
            tv2.append("\n");
            tv1.append("\n");


            //move next position until end of the data
        } while (c.moveToNext());


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOut();
            }
        });
    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {
        // TODO Auto-generated method stub

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.ENGLISH);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "Language is not supported");
            } else {
                tv1.setEnabled(true);
                speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed");
        }

    }

    private void speakOut() {

        String text = tv1.getText().toString();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
