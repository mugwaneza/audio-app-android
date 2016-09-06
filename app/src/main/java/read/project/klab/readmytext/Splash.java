package read.project.klab.readmytext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alexis on 6/10/2016.
 */
public class Splash extends Activity {

private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
       next = (Button) findViewById(R.id.button);
       next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i =new Intent(getApplication(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}