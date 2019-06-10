package black.kr.hs.mirim.sosimtapaxml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class testMid extends AppCompatActivity {
    private String signUpID;
    private String userID;
    int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mid);

        Intent intent = getIntent();
        signUpID = intent.getStringExtra("signUpID");



        Button t2 = (Button) findViewById(R.id.btn_testNext);
        final CheckBox cb1 = findViewById(R.id.checkBox1);
        final CheckBox cb2 = findViewById(R.id.checkBox2);
        final CheckBox cb3 = findViewById(R.id.checkBox3);
        final CheckBox cb4 = findViewById(R.id.checkBox4);


        Intent gi = getIntent();
        userID = gi.getStringExtra("userID");

        if(userID == null) {
            Intent it = getIntent();
            userID = it.getStringExtra("usrID");
        }

        t2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()) {
                    sum+=1;
                }
                if(cb2.isChecked()){
                    sum+=1;
                }
                if(cb3.isChecked()) {
                    sum+=1;
                }
                if(cb4.isChecked()){
                    sum+=1;
                }

                Intent intent = new Intent(getApplicationContext(), TestActivity.class);
                intent.putExtra("hap",sum);
                intent.putExtra("userID",userID);
                intent.putExtra("signUpID", signUpID);

                startActivity(intent);
            }
        });
    }
}
