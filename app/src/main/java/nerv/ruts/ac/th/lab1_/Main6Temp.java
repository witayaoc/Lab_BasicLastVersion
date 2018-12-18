package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.security.acl.Group;

public class Main6Temp extends AppCompatActivity {

    private Button btnTemp;


    private EditText editTemp;
    private RadioGroup radiogroup;
    private String strTemp, strTemRadio = "Celsius", Answer;
    private double douAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_temp);


        editTemp = (EditText) findViewById(R.id.editTemp);
        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);


        btnTemp = (Button) findViewById(R.id.btntemp);
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    strTemp = editTemp.getText().toString().trim();
                    if (strTemp.equals("")) {
                        Log.d("Space", "It Have space in Blank");
                    } else if (strTemRadio == "Celsius") {

                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);

                        intent.putExtra("numtemp", editTemp.getText().toString());

                        startActivity(intent);

                        Log.d("Pass", "It Have space in Data");
                    } else if (strTemRadio == "Fahrenheit") {

                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);

                        intent.putExtra("numtemp", editTemp.getText().toString());

                        startActivity(intent);

                        Log.d("Pass", "It Have space in Data");
                    } else if (strTemRadio == "Kalvin") {

                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);

                        intent.putExtra("numtemp", editTemp.getText().toString());

                        startActivity(intent);

                        Log.d("Pass", "It Have space in Data");
                    }

                } catch (Exception e) {
                }


            }
        });
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radiocel:
                        strTemRadio = "Celsius";
                    case R.id.radioFah:
                        strTemRadio = "Fahrenheit";
                    case R.id.radioKa:
                        strTemRadio = "Kalvin";

                }
            }
        });

    }

    private void calculateCelsius() {
        douAnswer = Double.parseDouble(strTemRadio);
        Answer = Double.toString(douAnswer);

    }

    private void calculateFahrenheit() {
        douAnswer = Double.parseDouble(strTemRadio)*1.8+32;
        Answer = Double.toString(douAnswer);
    }

    private void calculatKalvin() {
        douAnswer = Double.parseDouble(strTemRadio)+273.15;
        Answer = Double.toString(douAnswer);
    }
}