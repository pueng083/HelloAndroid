package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = (Button) findViewById(R.id.button_1);
        a.setOnClickListener(this);
        Button b = (Button) findViewById(R.id.button_2);
        b.setOnClickListener(this);
        Button c = (Button) findViewById(R.id.button_3);
        c.setOnClickListener(this);
        Button d = (Button) findViewById(R.id.button_4);
        d.setOnClickListener(this);
        Button e = (Button) findViewById(R.id.button_5);
        e.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        int id = v.getId();
        String a = tv.getText().toString();
        int LeOfString = tv.length();

        if(id == R.id.clear_button){
            tv.setText(" ");
        }else if(id == R.id.button_1){
            tv.setText(a+"1");
        }else if(id == R.id.button_2){
            tv.setText(a+"2");
        }else if(id == R.id.button_3){
            tv.setText(a+"3");
        }else if(id == R.id.button_4){
            tv.setText(a+"4");
        }else if(id == R.id.button_5){
            tv.setText(a+"5");
        }else if(id == R.id.button_6){
            tv.setText(a+"6");
        }else if(id == R.id.button_7){
            tv.setText(a+"7");
        }else if(id == R.id.button_8){
            tv.setText(a+"8");
        }else if(id == R.id.button_9){
            tv.setText(a+"9");
        }else if(id == R.id.button_0){
            tv.setText(a+"0");
        }

    }
}
