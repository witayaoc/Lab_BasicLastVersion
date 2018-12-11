package nerv.ruts.ac.th.lab1_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
Button button2,button3,button8,image1;
EditText username,pass,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button2 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(button2);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(button3);
            }
        });
        image1=(Button) findViewById(R.id.btimg1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img1= new Intent(Main2Activity.this,MainActivity.class);
                finish();
            }
        });

        username = (EditText)findViewById(R.id.edituser);
        pass =(EditText)findViewById(R.id.editpassword);
        phone=(EditText)findViewById(R.id.editphone);


        button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("name",username.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                startActivity(intent);
            }
        });


    }
}
