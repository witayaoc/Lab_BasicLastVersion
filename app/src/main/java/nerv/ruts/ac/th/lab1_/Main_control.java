package nerv.ruts.ac.th.lab1_;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class Main_control extends AppCompatActivity {

    public FirebaseDatabase firebaseDatabase;
    public DatabaseReference Led0,Led1,Led2,Led3,refer,refer1;
    public static  final String TAG ="LEs Control";
    public Button Switch, Switch1,Switch2,Switch3;
    public Integer Valuel, Valuel01,Valuel02,Valuel03,Valuel04;
    public String data;
    public TextView textv1, textv2, textv3, textv4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_control);

        //เรียก datebase ให้ตรงกับที่อยุ่ firebase
        firebaseDatabase = FirebaseDatabase.getInstance();
        Led0 = firebaseDatabase.getReference("dev/switch/Led0");
        Led1 = firebaseDatabase.getReference("dev/switch/Led1");
        Led2 = firebaseDatabase.getReference("dev/switch/Led2");
        Led3 = firebaseDatabase.getReference("dev/switch/Led3");
        refer = firebaseDatabase.getReference();
        refer1 = firebaseDatabase.getReference();


        Switch = (Button) findViewById(R.id.Led0);

        textv1 = (TextView) findViewById(R.id.textv1);
        textv2 = (TextView) findViewById(R.id.textv2);
        textv3 = (TextView) findViewById(R.id.textv3);
        textv4 = (TextView) findViewById(R.id.textv4);
        // https://github.com/SupawadeeMakon/LabFirebase

        //อ่านค่าจากฐานข้อมูล
        refer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map map = (Map) dataSnapshot.getValue();
                data = String.valueOf(map.get("dev/switch/Led0"));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        Led0.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Valuel = dataSnapshot.getValue(Integer.class);

                if (Valuel==1){

                    Switch.setText("LED_NO");
                    Valuel04=0;
                }else {
                    Switch.setText("LED_OFF");
                    Valuel04=1;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
        Switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Led0.setValue(Valuel04);

            }
        });

        Switch1 = (Button) findViewById(R.id.Led1);
        Led1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Valuel = dataSnapshot.getValue(Integer.class);
                if (Valuel==1){
                    Switch1.setText("LED1_NO");
                    Valuel01=0;
                }else {
                    Switch1.setText("LED1_OFF");
                    Valuel01=1;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });

        Switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Led1.setValue(Valuel01);

            }
        });

        Switch2 = (Button) findViewById(R.id.Led2);
        Led2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Valuel = dataSnapshot.getValue(Integer.class);
                if (Valuel==1){
                    Switch2.setText("LED3_NO");
                    Valuel02=0;
                }else {
                    Switch2.setText("LED3_OFF");
                    Valuel02=1;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
        Switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Led2.setValue(Valuel02);

            }
        });

        Switch3 = (Button) findViewById(R.id.Led3);
        Led3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Valuel = dataSnapshot.getValue(Integer.class);
                if (Valuel==1){
                    Switch3.setText("LED3_NO");
                    Valuel03=0;
                }else {
                    Switch3.setText("LED3_OFF");
                    Valuel03=1;
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
        Switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Led3.setValue(Valuel03);

            }
        });
    }
}
