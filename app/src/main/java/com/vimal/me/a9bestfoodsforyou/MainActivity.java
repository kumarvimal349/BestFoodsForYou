package com.vimal.me.a9bestfoodsforyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn13 = (Button) findViewById(R.id.btn13);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);

        btn10.setOnClickListener(new View.OnClickListener()

        {
            @Override

            public void onClick(View view) {
                Intent int8 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(int8);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(int9);
            }
        });


        btn12.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(int10);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(int11);
            }
        });


        btn14.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(int12);
            }

        });

        btn15.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(int13);
            }
        });
    }
}