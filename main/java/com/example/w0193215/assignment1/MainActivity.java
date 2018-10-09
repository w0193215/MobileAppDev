package com.example.w0193215.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.*;



// add NAN when not a number

public class MainActivity extends AppCompatActivity {

    float Leftnum = 0.0f;
    float Rightnum = 0.0f;
    char operator;
    String CCAnswer;

    TextView tvDisplay, tvvarnumadd;
    Button btnclear,btndelete,btndecimal,btndivide,btn1,btn2,btn3,btnmultiply,btn4,
     btn5,btn6,btnsubtract,btn7,btn8,btn9,btnadd,btnnegitive,btn0,btnequals;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tvrolling = findViewById(R.id.tvrolling);
        tvDisplay = findViewById(R.id.tvDisplay);
        tvvarnumadd = findViewById(R.id.tvvarnumadd);
        btnclear = findViewById(R.id.btnclear);
        btndelete = findViewById(R.id.btndelete);
        btndecimal = findViewById(R.id.btndecimal);
        btndivide = findViewById(R.id.btndivide);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnmultiply = findViewById(R.id.btnmultiply);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnsubtract = findViewById(R.id.btnsubtract);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 =findViewById(R.id.btn9);
        btnadd = findViewById(R.id.btnadd);
        btnnegitive = findViewById(R.id.btnnegitive);
        btn0 = findViewById(R.id.btn0);
        btnequals = findViewById(R.id.btnequals);

        final CalcClass calcsobj = new CalcClass();

        // below buttons are for numbers on calc
            btn0.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"0");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"0");
                    //tvrolling.setText(tvrolling.getText()+"0");
                }
            });

            btn1.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"1");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"1");
                    //tvrolling.setText(tvrolling.getText()+"1");
                }
            });

            btn2.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"2");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"2");
                    //tvrolling.setText(tvrolling.getText()+"2");
                }
            });

            btn3.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"3");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"3");
                    //tvrolling.setText(tvrolling.getText()+"3");
                }
            });

            btn4.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"4");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"4");
                    //tvrolling.setText(tvrolling.getText()+"4");
                }
            });

            btn5.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"5");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"5");
                    //tvrolling.setText(tvrolling.getText()+"5");
                }
            });

            btn6.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"6");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"6");
                    //tvrolling.setText(tvrolling.getText()+"6");
                }
            });

            btn7.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"7");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"7");
                    //tvrolling.setText(tvrolling.getText()+"7");
                }
            });

            btn8.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"8");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"8");
                    //tvrolling.setText(tvrolling.getText()+"8");
                }
            });

            btn9.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"9");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"9");

                }
            });

            //below buttons are for opperators

            btnequals.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {
                        tvvarnumadd.setText("0");
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);
                    }
                    else if(tvvarnumadd.getText().equals(".") || tvvarnumadd.getText().equals("..") || tvvarnumadd.getText().equals("...")){
                        tvvarnumadd.setText("0");
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);
                    }
                    else if(tvvarnumadd.getText().equals("-") || tvvarnumadd.getText().equals("--") || tvvarnumadd.getText().equals("---")){
                        tvvarnumadd.setText("0");
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);
                    }
                    else if(tvvarnumadd.getText().equals(".-") || tvvarnumadd.getText().equals("..-") || tvvarnumadd.getText().equals(".--")
                            || tvvarnumadd.getText().equals(".-.")){
                        tvvarnumadd.setText("0");
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);

                    }
                    else if(tvvarnumadd.getText().equals("-.") || tvvarnumadd.getText().equals("--.") || tvvarnumadd.getText().equals("-..")
                            || tvvarnumadd.getText().equals("-.-")){
                        tvvarnumadd.setText("0");
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);

                    }
                    else{
                        Rightnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        calcsobj.Calculations(Leftnum, operator, Rightnum);
                        CCAnswer = calcsobj.Calculations(Leftnum, operator, Rightnum);
                        tvDisplay.setText(CCAnswer);
                        tvvarnumadd.setText(CCAnswer);
                    }
                }
            });

            btnadd.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".") || tvvarnumadd.getText().equals("..") || tvvarnumadd.getText().equals("...")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-") || tvvarnumadd.getText().equals("--") || tvvarnumadd.getText().equals("---")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".-") || tvvarnumadd.getText().equals("..-") || tvvarnumadd.getText().equals(".--")
                            || tvvarnumadd.getText().equals(".-.")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-.") || tvvarnumadd.getText().equals("--.") || tvvarnumadd.getText().equals("-..")
                            || tvvarnumadd.getText().equals("-.-")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else{
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "+");
                        tvvarnumadd.setText(null);
                        operator = '+';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                }
            });

            btnsubtract.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".") || tvvarnumadd.getText().equals("..") || tvvarnumadd.getText().equals("...")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-") || tvvarnumadd.getText().equals("--") || tvvarnumadd.getText().equals("---")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".-") || tvvarnumadd.getText().equals("..-") || tvvarnumadd.getText().equals(".--")
                            || tvvarnumadd.getText().equals(".-.")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-.") || tvvarnumadd.getText().equals("--.") || tvvarnumadd.getText().equals("-..")
                            || tvvarnumadd.getText().equals("-.-")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else{
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "-");
                        tvvarnumadd.setText(null);
                        operator = '-';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                }
            });

            btnmultiply.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".") || tvvarnumadd.getText().equals("..") || tvvarnumadd.getText().equals("...")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-") || tvvarnumadd.getText().equals("--") || tvvarnumadd.getText().equals("---")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".-") || tvvarnumadd.getText().equals("..-") || tvvarnumadd.getText().equals(".--")
                            || tvvarnumadd.getText().equals(".-.")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-.") || tvvarnumadd.getText().equals("--.") || tvvarnumadd.getText().equals("-..")
                            || tvvarnumadd.getText().equals("-.-")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else{
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "x");
                        tvvarnumadd.setText(null);
                        operator = 'x';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                }
            });

            btndivide.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "/");
                        tvvarnumadd.setText(null);
                        operator = '/';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".") || tvvarnumadd.getText().equals("..") || tvvarnumadd.getText().equals("...")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "/");
                        tvvarnumadd.setText(null);
                        operator = '/';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-") || tvvarnumadd.getText().equals("--") || tvvarnumadd.getText().equals("---")){
                        tvvarnumadd.setText("0");
                            Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                            tvDisplay.setText(Leftnum + "/");
                            tvvarnumadd.setText(null);
                            operator = '/';
                            calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals(".-") || tvvarnumadd.getText().equals("..-") || tvvarnumadd.getText().equals(".--")
                            || tvvarnumadd.getText().equals(".-.")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "/");
                        tvvarnumadd.setText(null);
                        operator = '/';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else if(tvvarnumadd.getText().equals("-.") || tvvarnumadd.getText().equals("--.") || tvvarnumadd.getText().equals("-..")
                            || tvvarnumadd.getText().equals("-.-")){
                        tvvarnumadd.setText("0");
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "/");
                        tvvarnumadd.setText(null);
                        operator = '/';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                    else{
                        Leftnum = Float.parseFloat(tvvarnumadd.getText().toString());
                        tvDisplay.setText(Leftnum + "/");
                        tvvarnumadd.setText(null);
                        operator = '/';
                        calcsobj.Calculations(Leftnum,operator,Rightnum);
                    }
                }
            });

            btnclear.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(null);
                    tvvarnumadd.setText(null);
                }
            });

            btndelete.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(tvvarnumadd.getText().equals("") || tvvarnumadd.getText().equals(" ")) {

                    }
                    else{
                        String DEL = tvDisplay.getText().toString();
                        DEL = DEL.substring(0, DEL.length() - 1);
                        tvDisplay.setText(DEL);

                        String DEL1 = tvvarnumadd.getText().toString();
                        DEL1 = DEL1.substring(0, DEL1.length() - 1);
                        tvvarnumadd.setText(DEL1);
                    }
                }
            });

            btnnegitive.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+"-");
                    tvvarnumadd.setText(tvvarnumadd.getText()+"-");

                }
            });

            btndecimal.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvDisplay.setText(tvDisplay.getText()+".");
                    tvvarnumadd.setText(tvvarnumadd.getText()+".");
                }
            });

    }//end of onCreate
}//end of public class mainactivity
