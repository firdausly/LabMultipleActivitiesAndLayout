package com.example.labmultipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class relativelayout extends AppCompatActivity {

    TextView textviewrelative;
    Button buttonrelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);

        textviewrelative=(TextView) findViewById(R.id.textviewbuttonrelative);
        buttonrelative=(Button) findViewById(R.id.buttonrelative);

        Intent intent=new Intent(this,MainActivity.class);
        EditText editText=(EditText) findViewById(R.id.inputname);

        buttonrelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message=editText.getText().toString();
                intent.putExtra("ExtraMessage",message);
                startActivity(intent);
            }
        });

    }


}