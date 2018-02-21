package com.example.yurina.calculator_yur2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.widget.EditText.*;

public class SubActivityCalcul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_calcul);


        // EditText edit1 = (EditText) findViewById(R.id.edit1);

        Button onebtn = (Button) findViewById(R.id.onebtn);
        Button twobtn = (Button) findViewById(R.id.twobtn);
        Button threebtn = (Button) findViewById(R.id.threebtn);
        Button plusbtn = (Button) findViewById(R.id.plusbtn);
        Button fourbtn = (Button) findViewById(R.id.fourbtn);
        Button fivebtn = (Button) findViewById(R.id.fivebtn);
        Button sixbtn = (Button) findViewById(R.id.sixbtn);
        Button minusbtn = (Button) findViewById(R.id.minusbtn);
        Button sevenbtn = (Button) findViewById(R.id.sevenbtn);
        Button eightbtn = (Button) findViewById(R.id.eightbtn);
        Button ninebtn = (Button) findViewById(R.id.ninebtn);
        Button multibtn = (Button) findViewById(R.id.multibtn);
        Button zerobtn = (Button) findViewById(R.id.zerobtn);
        Button devidebtn = (Button) findViewById(R.id.dividebtn);
        Button stopbtn = (Button) findViewById(R.id.stopbtn);
        Button resultbtn = (Button) findViewById(R.id.resultbtn);
    }


    public void onClick(View v) {

        //TextView text = new TextView(R.id.text);
        int operate = 0;
        int sum = 0;


        EditText text = (EditText) findViewById(R.id.text);

        TextView text2 = (TextView) findViewById(R.id.text2);


        switch (v.getId()) {

//            if(text.getText().toString() != ""){
//                text.setText("");
//                break;
//            }


            case R.id.onebtn:
                text.setText(text.getText().toString() + "1");
                break;

            case R.id.twobtn:
                text.setText(text.getText().toString() + "2");
                break;

            case R.id.threebtn:
                text.setText(text.getText().toString() + "3");
                break;

            case R.id.fourbtn:
                text.setText(text.getText().toString() + "4");
                break;

            case R.id.fivebtn:
                text.setText(text.getText().toString() + "5");
                break;

            case R.id.sixbtn:
                text.setText(text.getText().toString() + "6");
                break;

            case R.id.sevenbtn:
                text.setText(text.getText().toString() + "7");
                break;

            case R.id.eightbtn:
                text.setText(text.getText().toString() + "8");
                break;

            case R.id.ninebtn:
                text.setText(text.getText().toString() + "9");
                break;
        }

        String num1 = text.getText().toString();

        switch (v.getId()) {

            case R.id.plusbtn:
                text.setText(text.getText().toString() + "+");
                operate = 1;
                break;

            case R.id.minusbtn:
                text.setText(text.getText().toString() + "-");
                operate = 2;
                break;

            case R.id.multibtn:
                text.setText(text.getText().toString() + "*");
                operate = 3;
                break;

            case R.id.dividebtn:
                text.setText(text.getText().toString() + "/");
                operate = 4;
                break;

            case R.id.resultbtn:
                text.setText(text.getText().toString() + "");
                operate = 5;
                break;

            case R.id.stopbtn:
                text.setText(text.getText().toString() + "");
                operate = 6;
                break;
        }
        switch (v.getId()) {


            case R.id.onebtn:
                text.setText(text.getText().toString() + "1");
                break;

            case R.id.twobtn:
                text.setText(text.getText().toString() + "2");
                break;

            case R.id.threebtn:
                text.setText(text.getText().toString() + "3");
                break;

            case R.id.fourbtn:
                text.setText(text.getText().toString() + "4");
                break;

            case R.id.fivebtn:
                text.setText(text.getText().toString() + "5");
                break;

            case R.id.sixbtn:
                text.setText(text.getText().toString() + "6");
                break;

            case R.id.sevenbtn:
                text.setText(text.getText().toString() + "7");
                break;

            case R.id.eightbtn:
                text.setText(text.getText().toString() + "8");
                break;

            case R.id.ninebtn:
                text.setText(text.getText().toString() + "9");
                break;
        }


        String num2 = text.getText().toString();


        switch (operate) {


            case 1:
                if (sum == 0) {
                    sum = Integer.parseInt(num1) + Integer.parseInt(num2);
                    break;

                } else
                    sum = sum + Integer.parseInt(num2);
                break;

            case 2:
                if (sum == 0) {
                    sum = Integer.parseInt(num1) - Integer.parseInt(num2);
                    break;
                } else
                    sum = sum - Integer.parseInt(num2);

            case 3:
                if (sum == 0) {
                    sum = Integer.parseInt(num1) * Integer.parseInt(num2);
                    break;
                } else
                    sum = sum * Integer.parseInt(num2);

            case 4:
                if (sum == 0) {
                    sum = Integer.parseInt(num1) / Integer.parseInt(num2);
                    break;
                } else
                    sum = sum / Integer.parseInt(num2);

            case 5:

                text2.setText("" + sum);


            case 6:


                return;

        }
    }
}


//    public void num(View v) {
//
//        EditText edit1 = (EditText) findViewById(R.id.edit1);
//
//        switch (v.getId()) {
//
//            case R.id.onebtn:
//                edit1.append("1");
//                break;
//            case R.id.twobtn:
//                edit1.append("2");
//                break;
//            case R.id.threebtn:
//                edit1.append("3");
//                break;
//            case R.id.fourbtn:
//                edit1.append("4");
//                break;
//            case R.id.fivebtn:
//                edit1.append("5");
//                break;
//            case R.id.sixbtn:
//                edit1.append("6");
//                break;
//            case R.id.sevenbtn:
//                edit1.append("7");
//                break;
//            case R.id.eightbtn:
//                edit1.append("8");
//                break;
//            case R.id.ninebtn:
//                edit1.append("9");
//                break;
//            case R.id.plusbtn:
//                edit1.append("+");
//                break;
//            case R.id.minusbtn:
//                edit1.append("-");
//                break;
//            case R.id.multibtn:
//                edit1.append("*");
//                break;
//            case R.id.dividebtn:
//                edit1.append("/");
//                break;
//
//
//
//
//
//        }
//
//
//    }


