package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView pant;
    public double operan1,operan2,res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pant=  (TextView)findViewById(R.id.caja1);


    }

    public void bt1(View v){
        String cap=pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }
    public void bt2(View v){
        String cap=pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }
    public void bt3(View v){
        String cap=pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }
    public void bt4(View v){
        String cap=pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }
    public void bt5(View v){
        String cap=pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }
    public void bt6(View v){
        String cap=pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }

    public void bt7(View v){
        String cap=pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }
    public void bt8(View v){
        String cap=pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }
    public void bt9(View v){
        String cap=pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }
    public void bt0(View v){
        String cap=pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }
    public void bt00(View v){
        String cap=pant.getText().toString();
        cap=cap+"00";
        pant.setText(cap);
    }
    public void btpunt(View v){
        String cap=pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }

    public void btsuma(View v){
        try {

            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=1;
    }

    public void btmenos(View v){
        try {

            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=2;
    }

    public void btmult(View v){
        try {

            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=3;
    }

    public void btdiv (View v){
        try {

            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=4;
    }

    public void btigual (View v){

        try {

            String aux2=pant.getText().toString();
            operan2=Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){}
        pant.setText("");

        if (ope==1){
            res=operan1 + operan2;
        }
        else if (ope==2){
            res=operan1 - operan2;
        }

        else if (ope==3){
            res=operan1 * operan2;
        }

        else if (ope==4 ){
            if(operan2==0){
                pant.setText("Error");
            }else {
                res = operan1 / operan2;
            }

        }

        pant.setText("" + res);
        operan1=res;
    }

    public void btclear (View v){

        pant.setText("");
        operan1=0.0;
        operan2=0.0;
        res=0.0;
    }

    public void btborrar (View v){
        if(!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }
    }


}
