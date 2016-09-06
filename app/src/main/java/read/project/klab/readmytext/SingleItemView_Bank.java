package read.project.klab.readmytext;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class SingleItemView_Bank extends Activity {
    // Declare Variables

    ImageView imgImage;
    TextView txtlistContent;
    ListView lv;
    int resId;
    SimpleCursorAdapter mAdapter;
    private TextToSpeech tts;
    DatabaseHelper mHelper;
    String prgmImages;
    String listContent;
    private MediaPlayer mp;
    private ImageView IMGToSpeech, like;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.singleitemview);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mHelper = new DatabaseHelper(this);


        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();

        mp = new MediaPlayer();

        IMGToSpeech = (ImageView) findViewById(R.id.imageView);

        // Get the results of country
        listContent = i.getStringExtra("text");


        txtlistContent = (TextView) findViewById(R.id.word);


        txtlistContent.setText(listContent);

        //final int sharedFact = txtlistContent.getText().toString();

        // ListView Item Click Listener
        IMGToSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String mytitle= txtlistContent.getText().toString();

                if(mytitle.equals("kubikuza")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.kubikuza);// create's
                    mp.start(); // starting mediaplayer

                }  else if(mytitle.equals("kubitsa")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.kubitsa);// create's
                    mp.start(); // starting mediaplayer

                }  else if(mytitle.equals("murakoze")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.murakoze);// create's
                    mp.start(); // starting mediaplayer

                } else  if(mytitle.equals("mwiriwe")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.mwiriwe);// create's
                    mp.start(); // starting mediaplayer

                }  else if(mytitle.equals("oya")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.oya);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("yego")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.yego);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("ndasaba inguzanyo")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ndasabainguzanyo);// create's
                    mp.start(); // starting mediaplayer

                }else if(mytitle.equals("nta konegisiyo ihari ?")) {
                    // Play song
                    mp.reset();// stops any current playing song
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.ntakonegisiyoihari);// create's
                    mp.start(); // starting mediaplayer

                }

 }

         });

    }





}

