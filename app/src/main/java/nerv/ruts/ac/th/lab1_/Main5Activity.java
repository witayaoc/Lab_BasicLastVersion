package nerv.ruts.ac.th.lab1_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView textnum1,textnum2,textop,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textnum1=(TextView)findViewById(R.id.textnum1);
        textnum2=(TextView)findViewById(R.id.textnum2);
        textop=(TextView)findViewById(R.id.textop);
        result=(TextView)findViewById(R.id.result);



        textnum1.setText(getIntent().getStringExtra("num1"));
        textnum2.setText(getIntent().getStringExtra("num2"));
        textop.setText(getIntent().getStringExtra("opa"));
        result.setText(String.valueOf(result));



    }
}
