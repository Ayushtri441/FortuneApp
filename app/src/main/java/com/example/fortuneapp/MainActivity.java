package com.example.fortuneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView msg=findViewById(R.id.txt);
        Button b=findViewById(R.id.btn);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] fortune={"your day will be great","beaware of dogs","Do not go outside home","you will win some prize today"};
                Random r=new Random();
                int x=r.nextInt(fortune.length);
                msg.setText(fortune[x]);
            }
        });

    }
}
