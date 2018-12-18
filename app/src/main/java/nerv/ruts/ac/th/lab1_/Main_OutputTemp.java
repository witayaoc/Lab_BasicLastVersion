package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_OutputTemp extends AppCompatActivity {

    private Button pcagian,btnMenu,btimg;
    private TextView inputnum1,inputdata2,resultTemp3;
    private String x,y,z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__output_temp);

        pcagian=(Button)findViewById(R.id.pcagain);
        btnMenu=(Button)findViewById(R.id.btnMenu);
        btimg=(Button)findViewById(R.id.btimg2);

        Intent intent=getIntent();

        x = intent.getExtras().getString("temp");
        y = intent.getExtras().getString("Unit");
        z = intent.getExtras().getString("Answer");

        inputnum1=(TextView)findViewById(R.id.inputnum);
        inputdata2=(TextView)findViewById(R.id.inputdata);
        resultTemp3=(TextView)findViewById(R.id.resultTemp);





        inputnum1.setText(x);
        inputdata2.setText(y);
        resultTemp3.setText(y);



        pcagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_OutputTemp.this,Main6Temp.class);
                startActivity(intent);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_OutputTemp.this,Main6Menucal.class);
                startActivity(intent);
            }
        });
        btimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_OutputTemp.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //inputnum.setText(getIntent().getStringExtra("numtemp"));


    }
}
