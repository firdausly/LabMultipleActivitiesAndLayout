package com.example.labmultipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class gridlayout extends AppCompatActivity {
 public int int1;
    public int int2;
    public String finalresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        Button[] buttonarray={
                (Button) findViewById(R.id.no),
                (Button) findViewById(R.id.no1),
                (Button) findViewById(R.id.no2),
                (Button) findViewById(R.id.no3),
                (Button) findViewById(R.id.no4),
                (Button) findViewById(R.id.no5),
                (Button) findViewById(R.id.no6),
                (Button) findViewById(R.id.no7),
                (Button) findViewById(R.id.no8),
                (Button) findViewById(R.id.no9),


        };

        Button[] operationarray={
                (Button) findViewById(R.id.operationplus),
                (Button) findViewById(R.id.operationminus),
                (Button) findViewById(R.id.operationmultiply),
                (Button) findViewById(R.id.operationdivide),

        };





        CheckBox setinteger1=(CheckBox) findViewById(R.id.setinteger1);
        CheckBox setinteger2=(CheckBox) findViewById(R.id.setinteger2);
        TextView integer1=(TextView) findViewById(R.id.integer1);
        TextView operation=(TextView) findViewById(R.id.operation);
        TextView integer2=(TextView) findViewById(R.id.integer2);

        TextView result=(TextView) findViewById(R.id.result);


        for(int i=0;i<operationarray.length;i++){
            Button operationindex=operationarray[i];

            operationindex.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    operation.setText(operationindex.getText().toString());
                }
            });
        }

        setinteger1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                integer1.setText("");
                setInteger(buttonarray,integer1);

            }
        });

        setinteger2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                integer2.setText("");
                setInteger(buttonarray,integer2);
            }
        });

        Button equals=(Button) findViewById(R.id.equal);









            equals.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String integer1value=integer1.getText().toString();
                    String integer2value=integer2.getText().toString();
                    String operations=operation.getText().toString();

                    if (!(integer1value.equals("")) && !(integer2value.equals(""))) {
                        int1 = Integer.parseInt(integer1value);
                        int2 = Integer.parseInt(integer2value);
                        finalresult=calculate(int1,int2,operations);
                        result.setText(finalresult);
                    }


                }
            });
















    }

    private void setInteger(Button[] button, TextView textview){

        for(int i=0;i<button.length;i++){
            Button buttonindex=button[i];
            buttonindex.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textview.append(buttonindex.getText());
                }
            });
        }


    }

    public String calculate(int int1,int int2,String operations){


        int resultofoperation=0;
        if(operations.equals("+")){
            resultofoperation=int1+int2;
        } else if(operations.equals("-")){
            resultofoperation=int1-int2;

        } else if(operations.equals("x")){
            resultofoperation=int1*int2;

        } else if(operations.equals("÷")){
            resultofoperation=int1/int2;
        }

       return "Result="+resultofoperation;

    }
}