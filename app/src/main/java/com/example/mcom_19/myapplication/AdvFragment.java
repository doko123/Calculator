package com.example.mcom_19.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.regex.Pattern;

/**
 * Created by domik_000 on 2015-03-23.
 */
public class AdvFragment extends Fragment {

    public IActivity iActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iActivity = (IActivity) activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.adv_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button bksp = (Button)view.findViewById(R.id.bksp);
        Button clear = (Button)view.findViewById(R.id.clear);
        Button plus_minus = (Button)view.findViewById(R.id.plus_minus);
        Button seven = (Button)view.findViewById(R.id.seven);
        Button eight = (Button)view.findViewById(R.id.eight);
        Button nine = (Button)view.findViewById(R.id.nine);
        Button four = (Button)view.findViewById(R.id.four);
        Button five = (Button)view.findViewById(R.id.five);
        Button six = (Button)view.findViewById(R.id.six);
        Button one = (Button)view.findViewById(R.id.one);
        Button two = (Button)view.findViewById(R.id.two);
        Button three = (Button)view.findViewById(R.id.three);
        Button zero = (Button)view.findViewById(R.id.zero);
        Button multiplication = (Button)view.findViewById(R.id.multiplication);
        Button division = (Button)view.findViewById(R.id.division);
        Button addition = (Button)view.findViewById(R.id.addition);
        Button subtraction = (Button)view.findViewById(R.id.subtraction);
        Button dot = (Button)view.findViewById(R.id.dot);
        Button sin = (Button)view.findViewById(R.id.sin);
        Button cos = (Button)view.findViewById(R.id.cos);
        Button tan = (Button)view.findViewById(R.id.tan);
        Button ln = (Button)view.findViewById(R.id.ln);
        Button sqrt = (Button)view.findViewById(R.id.sqrt);
        Button sqr = (Button)view.findViewById(R.id.sqr);
        Button xy = (Button)view.findViewById(R.id.xy);
        Button log = (Button)view.findViewById(R.id.log);
        final Button equal = (Button)view.findViewById(R.id.equal);
        final EditText display = (EditText)view.findViewById(R.id.display);
        final int[] index = new int[1];
        index[0]= 0;
        final int[] len = new int[1];
        len[0] = 0;
        bksp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if(display.getText().length()!=0){
                    display.setText(display.getText().subSequence(0,display.getText().length()-1));
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText("");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s1", display.getText()));
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s2", display.getText()));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s3", display.getText()));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s4", display.getText()));
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s5", display.getText()));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s6", display.getText()));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s7", display.getText()));
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s8", display.getText()));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                display.setText(String.format("%s9", display.getText()));
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((index[0] == display.getText().toString().length() - 1) && (display.getText().charAt(index[0]) == '/')) {
                    numberFormatExc("Division by zero is illegal!");
                } else if("0".equals(display.getText().toString())) {
                    numberFormatExc("Wrong format!");
                }
                else{
                    display.setText(String.format("%s0", display.getText()));
                }
            }
        });

        sin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    display.setText(String.format("%s", String.valueOf(Math.sin(number))));
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    display.setText(String.format("%s", String.valueOf(Math.cos(number))));
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    display.setText(String.format("%s", String.valueOf(Math.tan(number))));
                }
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else if (display.getText().toString().contains("-")) {
                    numberFormatExc("Wrong format of number!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    number = (float) Math.log1p(number);
                    display.setText(String.format("%s", String.valueOf(number)));
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else if (display.getText().toString().contains("-")) {
                    numberFormatExc("Wrong format of number!");
                } else {
                    float number = Float.valueOf(display.getText().toString());
                    number = (float) Math.log10(number);
                    display.setText(String.format("%s", String.valueOf(number)));
                }
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    display.setText(String.format("%s", String.valueOf(Math.sqrt(number))));
                }
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float number = Float.valueOf(display.getText().toString());
                    display.setText(String.format("%s", String.valueOf(Math.pow(number, 2))));
                }
            }
        });

        xy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                numberFormatExc("Invalid argument!");
                }
                else {
                    display.setText(String.format("%s^", display.getText()));
                    if (index[0] == 0) {
                        index[0] = display.getText().length() - 1;
                    } else {
                        len[0] = -1;
                        equal.callOnClick();
                    }
                }
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    display.setText(String.format("%s+", display.getText()));
                    if (index[0] == 0) {
                        index[0] = display.getText().length() - 1;
                    } else {
                        len[0] = -1;
                        equal.callOnClick();
                    }
                }

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    display.setText(String.format("%s*", display.getText()));
                    if (index[0] == 0) {
                        index[0] = display.getText().length() - 1;
                    } else {
                        len[0] = -1;
                        equal.callOnClick();
                    }
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    display.setText(String.format("%s/", display.getText()));
                    if (index[0] == 0) {
                        index[0] = display.getText().length() - 1;
                    } else {
                        len[0] = -1;
                        equal.callOnClick();
                    }
                }
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    display.setText(String.format("%s-", display.getText()));
                    if (index[0] == 0) {
                        index[0] = display.getText().length() - 1;
                    } else {
                        len[0] = -1;
                        equal.callOnClick();
                    }
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    if ((index[0] == 0) && (display.getText().toString().contains("."))) {
                        numberFormatExc("Cannot resolve number with two dots!");

                    } else {
                        display.setText(String.format("%s.", display.getText()));
                    }
                }
            }
        });
        plus_minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(display.getText().toString().length() == 0){
                    numberFormatExc("Invalid argument!");
                }
                else {
                    float num = Float.valueOf(display.getText().toString());
                    display.setText(String.valueOf(num * (-1)));
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((index[0] > 0) && (index[0] < display.getText().length())) {
                    float first_number = Float.valueOf(display.getText().subSequence(0, index[0]).toString());
                    float second_number = Float.valueOf(display.getText().subSequence(index[0] + 1, display.getText().length() + len[0]).toString());
                    float result = 0;
                    char sign = '\0';

                    if (display.getText().charAt(index[0]) == '-') {

                        result = first_number - second_number;
                    } else if (display.getText().charAt(index[0]) == '+') {
                        result = first_number + second_number;
                    } else if (display.getText().charAt(index[0]) == '*') {
                        result = first_number * second_number;
                    } else if (display.getText().charAt(index[0]) == '/') {
                        result = first_number / second_number;

                    } else if (display.getText().charAt(index[0]) == '^') {
                        result = (float) Math.pow(first_number, second_number);
                    }
                    index[0] = 0;

                    if (len[0] != 0) {
                        sign = display.getText().charAt(display.getText().length() - 1);

                    }
                    display.setText(String.valueOf(result) + sign);
                    if (len[0] != 0) {
                        index[0] = display.getText().length() - 1;
                    }
                    len[0] = 0;

                }
            }
        });
    }

        public void numberFormatExc(CharSequence text){
        Context context = iActivity.getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        }

}
