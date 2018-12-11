package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    Button button6,button7,image1,start;
    EditText num1,num2,OP;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        num1 =(EditText)findViewById(R.id.Num1);
        num2 =(EditText)findViewById(R.id.Num2);
        OP=(EditText)findViewById(R.id.Op);
        result=(TextView)findViewById(R.id.result);


        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button6= new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(button6);
            }
        });


        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button7 = new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(button7);
            }
        });

        image1 = (Button) findViewById(R.id.btimg1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img3= new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(img3);
            }
        });
        start=(Button)findViewById(R.id.btstart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(Main4Activity.this,Main5Activity.class);
                int x = Integer.parseInt(num1.getText().toString());
                int y = Integer.parseInt(num2.getText().toString());
                int Plus = x+y;
                int sub = x-y;
                int mul = x*y;
                int divi = x/y;
                start.putExtra("num1",num1.getText().toString());
                start.putExtra("num2",num2.getText().toString());
                start.putExtra("opa",OP.getText().toString());
                startActivity(start);
            }
        });

    }

}
