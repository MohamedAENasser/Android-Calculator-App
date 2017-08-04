package com.example.fm.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.button2);
        Button sub = (Button) findViewById(R.id.button);
        Button mul = (Button) findViewById(R.id.button3);
        Button dev = (Button) findViewById(R.id.button4);

        final EditText res = (EditText) findViewById(R.id.editText3);
        final EditText n1 = (EditText) findViewById(R.id.editText2);
        final EditText n2 = (EditText) findViewById(R.id.editText);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().length() != 0 && n2.getText().toString().length() != 0)
                res.setText(String.valueOf(Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString())));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().length() != 0 && n2.getText().toString().length() != 0)
                res.setText(String.valueOf(Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString())));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().length() != 0 && n2.getText().toString().length() != 0)
                res.setText(String.valueOf(Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString())));
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().length() != 0 && n2.getText().toString().length() != 0) {
                    if (Float.parseFloat(n2.getText().toString()) != 0)
                        res.setText((String.valueOf(Float.parseFloat(n1.getText().toString()) / Float.parseFloat(n2.getText().toString()))));
                    else
                        res.setText("You Try To Divide By Zero!!!");
                }
            }
        });


    }

}
