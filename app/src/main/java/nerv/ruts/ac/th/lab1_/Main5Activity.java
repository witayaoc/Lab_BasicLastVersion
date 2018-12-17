package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView textnum1,textnum2,textop,Answer;
    Button Add,Sub,Mul,Div,image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textnum1=(TextView)findViewById(R.id.textnum1);
        textnum2=(TextView)findViewById(R.id.textnum2);
        //textop=(TextView)findViewById(R.id.textop);
        Answer=(TextView)findViewById(R.id.Answer);
        //
        Add=(Button)findViewById(R.id.Add);
        Sub=(Button)findViewById(R.id.Sub);
        Mul=(Button)findViewById(R.id.Mul);
        Div=(Button)findViewById(R.id.Div);

        //
        textnum1.setText(getIntent().getStringExtra("num1"));
        textnum2.setText(getIntent().getStringExtra("num2"));
        //textop.setText(getIntent().getStringExtra("opa"));
        //
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(textnum1.getText().toString());
                int y = Integer.parseInt(textnum2.getText().toString());

                int result = (x+y);

                Answer.setText(String.valueOf(result));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(textnum1.getText().toString());
                int y = Integer.parseInt(textnum2.getText().toString());

                int result = (x-y);

                Answer.setText(String.valueOf(result));
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(textnum1.getText().toString());
                int y = Integer.parseInt(textnum2.getText().toString());

                int result = (x*y);

                Answer.setText(String.valueOf(result));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(textnum1.getText().toString());
                int y = Integer.parseInt(textnum2.getText().toString());

                int result = (x/y);

                Answer.setText(String.valueOf(result));
            }
        });
        image1=(Button)findViewById(R.id.btimg);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(Main5Activity.this,MainActivity.class);
                        finish();
            }
        });



    }
}
