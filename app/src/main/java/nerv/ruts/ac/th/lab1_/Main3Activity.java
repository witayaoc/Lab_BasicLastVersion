package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

Button button4,button5,image1,btncal;
TextView textView5,textView6,textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btncal=(Button)findViewById(R.id.buttoncal);
        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncal= new Intent(Main3Activity.this,Main6Menucal.class);
                startActivity(btncal);
            }
        });

        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3 = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(button3);
            }
        });


        button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button4 = new Intent(Main3Activity.this,Main4Activity.class);
               startActivity(button4);
             }
        });


        image1=(Button) findViewById(R.id.btimg1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img2= new Intent(Main3Activity.this,MainActivity.class);
                startActivity(img2);
            }
        });

        textView5= (TextView)findViewById(R.id.textView5);
        textView6= (TextView)findViewById(R.id.textView6);
        textView7= (TextView)findViewById(R.id.textView7);

        textView5.setText(getIntent().getStringExtra("name"));
        textView6.setText(getIntent().getStringExtra("pass"));
        textView7.setText(getIntent().getStringExtra("phone"));

//
    }
}