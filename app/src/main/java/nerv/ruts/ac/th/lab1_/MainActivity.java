package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //MediaPlayer p1;
    Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //p1 = MediaPlayer.create(this,R.raw.beach);
              //  p1.start();
        //p1.setLooping(true);

//
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(button1);
            }
        });
    }
}
