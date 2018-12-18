package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.security.acl.Group;

public class Main6Temp extends AppCompatActivity {

    private Button btnTemp;


    private EditText editTemp;
    private RadioGroup radiogroup;
    private String strTemp,strTemRadio = "Celsius",Answer;
    private double douAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_temp);


        editTemp = (EditText) findViewById(R.id.editTemp);
        radiogroup = (RadioGroup) findViewById(R.id.radioTemp);


        btnTemp = (Button) findViewById(R.id.btntemp);
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    strTemp = editTemp.getText().toString().trim();
                    if (strTemp.equals("")) {
                        Log.d("Space", "It Have space in Blank");
                    } else if (strTemRadio == "Celsius") {
                        radiocel();
                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);
                        intent.putExtra("temp",strTemp);
                        intent.putExtra("Unit",strTemRadio);
                        intent.putExtra("Answer",Answer);
                        startActivity(intent);

                        Log.d("Pass", "It Have space in Celsius");
                    } else if (strTemRadio == "Fahrenheit") {
                        radioFah();
                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);
                        intent.putExtra("temp",strTemp);
                        intent.putExtra("Unit",strTemRadio);
                        intent.putExtra("Answer",Answer);
                        startActivity(intent);

                        Log.d("Pass", "It Have space in Fahrenheit");
                    } else if (strTemRadio == "Kalvin") {
                        radioKa();
                        Intent intent = new Intent(Main6Temp.this, Main_OutputTemp.class);
                        intent.putExtra("temp",strTemp);
                        intent.putExtra("Unit",strTemRadio);
                        intent.putExtra("Answer",Answer);
                        startActivity(intent);

                        Log.d("Pass", "It Have space in Kalvin");
                    }

                } catch (Exception e) {
                }


            }
        });

        //set Radio Button

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radiocel:
                        strTemRadio = "Celsius";
                        break;
                    case R.id.radioFah:
                        strTemRadio = "Fahrenheit";
                        break;
                    case R.id.radioKa:
                        strTemRadio = "Kalvin";
                        break;

                }
            }
        });

    }

    //การคำนวน
    private void radiocel() {
        douAnswer = Double.parseDouble(strTemp);
        Answer = Double.toString(douAnswer);

    }

    private void radioFah() {
        douAnswer = Double.parseDouble(strTemp)*1.8+32;
        Answer = Double.toString(douAnswer);
    }

    private void radioKa() {
        douAnswer = Double.parseDouble(strTemp)+273.15;
        Answer = Double.toString(douAnswer);
    }
}