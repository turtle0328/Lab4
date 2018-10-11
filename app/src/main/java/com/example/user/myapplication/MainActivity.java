package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView t_drink;
    TextView t_suger;
    TextView t_ice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.sent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i =new Intent();
               i.setClass(MainActivity.this,Main2Activity.class);
               startActivityForResult(i,0);




            }
        });


    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode ==0){
            if(resultCode ==101){
                Bundle b = data.getExtras();
                String str1 =b.getString("drink_level");
                String str2=b.getString("suger_level");
                CharSequence str3=b.getString("ice_level");

                t_drink=(TextView)findViewById(R.id.drink);
                t_suger=(TextView)findViewById(R.id.suger);
                t_ice=(TextView)findViewById(R.id.ice);

                t_drink.setText(str1);
                t_suger.setText(str2);
                t_ice.setText(str3);
            }
        }

    }
}
