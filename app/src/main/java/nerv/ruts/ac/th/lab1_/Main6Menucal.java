package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Menucal extends AppCompatActivity {

    Button btncal,btntemp,btnremote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_menucal);

        btncal=(Button)findViewById(R.id.btncal);
        btntemp=(Button)findViewById(R.id.btntemp);
        btnremote=(Button)findViewById(R.id.btnremote);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main6Menucal.this,Main4Activity.class);
                startActivity(intent);
            }
        });

        btntemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Main6Menucal.this,Main6Temp.class);
                startActivity(intent);
            }
        });
        btnremote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main6Menucal.this,Main_control.class);
                startActivity(intent);
            }
        });
    }
}
