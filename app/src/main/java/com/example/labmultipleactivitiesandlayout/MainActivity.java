package com.example.labmultipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_relativelayout);

        Intent mainintent = getIntent();
        String message = "Welcome back, "+mainintent.getStringExtra("ExtraMessage");

        if(mainintent.hasExtra("ExtraMessage")){
            Toast toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
            toast.show();
        }


        Button rlayout=(Button) findViewById(R.id.rlayoutbutton);
        Button clayout=(Button) findViewById(R.id.clayoutbutton);
        Button gridlayoutbutton=(Button) findViewById(R.id.gridlayoutbutton);



        Intent rintent=new Intent(getApplicationContext(),relativelayout.class);
        Intent cintent=new Intent(getApplicationContext(),constraintlayout.class);
        Intent gridintent=new Intent(getApplicationContext(),gridlayout.class);

        rlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(rintent);
            }
        });

        clayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cintent);
            }
        });

        gridlayoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(gridintent);
            }
        });

    }



}