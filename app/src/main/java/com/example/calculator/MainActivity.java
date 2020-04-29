package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {

    Boolean  summa=false, otnim=false, umnozh=false, delen=false ,stepen=false, vozvstepen =false, procent=false, log=false;
;

    Boolean first_get=false, sec_get = false;


    double firstArg=0, secArg=0, result;
    String value1, value2;


    Button zero,one,two,three,four,five,six,seven,eight,nine,minus,plus,multiply,division,res,clear,clearAll,coma,sin,cos,tan,percent,pi,exp,root,degree,factor,abs;
    TextView text, textoper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        multiply=findViewById(R.id.multiplication);
        division=findViewById(R.id.division);
        res=findViewById(R.id.res);
        clear=findViewById(R.id.clear);
        clearAll=findViewById(R.id.clearall);
        coma=findViewById(R.id.coma);
        text=findViewById(R.id.text);
        sin=findViewById(R.id.sin);
        cos=findViewById(R.id.cos);
        tan=findViewById(R.id.tan);
        percent=findViewById(R.id.percent);
        pi=findViewById(R.id.pi);
        exp=findViewById(R.id.exp);
        root=findViewById(R.id.root);
        degree=findViewById(R.id.degree);
        factor=findViewById(R.id.factor);
        abs=findViewById(R.id.abs);
        textoper=findViewById(R.id.textoper);

        if(savedInstanceState!=null){
            text.setText(savedInstanceState.getString("first_value"));
            textoper.setText(savedInstanceState.getString("operation"));
            first_get=savedInstanceState.getBoolean("firstget");
            otnim=savedInstanceState.getBoolean("otnim");
            summa=savedInstanceState.getBoolean("summa");
            umnozh=savedInstanceState.getBoolean("umnozh");
            delen=savedInstanceState.getBoolean("delen");
            vozvstepen=savedInstanceState.getBoolean("vozvstepen");
            log=savedInstanceState.getBoolean("log");
            value1=savedInstanceState.getString("value1");
        }


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("0");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
            if(text.getText().toString().equals("0")){
                text.append(".");
            }
                text.append("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("1");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("2");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("3");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("4");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("5");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("6");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("7");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("8");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("9");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().equals("0")){
                    text.append(".");
                }
                text.append("9");
            }
        });


        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().isEmpty()){
                    text.setText("0.");
                }
                else
                    if(!text.getText().toString().contains(".")){
                        text.append(".");
                    }
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                String s=text.getText().toString();
                if(s.equals("Math Error")){
                    text.setText("");
                }
                if(s.equals(""))
                {

                }
                else {
                    int t = s.length();
                    String s1 = s.substring(0, t - 1);
                    text.setText(s1 + "");
                }
            }
        });
        clearAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text.setText("");
                textoper.setText("");
                first_get=false;
                sec_get=false;
                delen=false;
                umnozh=false;
                summa=false;
                otnim=false;
                vozvstepen=false;
                log=false;
                procent=false;



            }
        });


        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().isEmpty() && first_get==false){
                    return;
                }
                if(first_get==false){
                    value1 = text.getText().toString();
                }
                first_get=true;
                text.setText("");
                summa=true;
                textoper.setText("+");
                delen=false;
                umnozh=false;
                otnim=false;
                vozvstepen=false;
                log=false;
                procent=false;
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().isEmpty() && first_get==false){
                    return;
                }
                if(first_get==false){
                    value1 = text.getText().toString();
                }
                first_get=true;
                text.setText("");
                textoper.setText("-");
                otnim=true;
                delen=false;
                umnozh=false;
                vozvstepen=false;
                summa=false;
                log=false;
                procent=false;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().isEmpty() && first_get==false){
                    return;
                }
                if(first_get==false){
                    value1 = text.getText().toString();
                }
                first_get=true;
                text.setText("");
                textoper.setText("x");
                umnozh=true;
                delen=false;
                otnim=false;
                summa=false;
                vozvstepen=false;
                procent=false;
                log=false;
            }
        });
        division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
                    text.setText("");
                    textoper.setText("");
                    first_get=false;
                    sec_get=false;
                    return;
                }
                if(text.getText().toString().isEmpty() && first_get==false){
                   return;
                }
                if(first_get==false){
                    value1 = text.getText().toString();
                }
                first_get=true;
                text.setText("");
                textoper.setText("/");
                delen=true;
                umnozh=false;
                otnim=false;
                vozvstepen=false;
                summa=false;
                procent=false;
                log=false;
            }
        });



        res.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!text.getText().toString().isEmpty()){
                    textoper.setText("");
                    if(first_get==false){
                        return;
                    }
                    value2=text.getText().toString();
                    firstArg=Double.parseDouble(value1);
                    secArg=Double.parseDouble(value2);
                    sec_get=true;
                    if(summa==true){
                        result=firstArg+secArg;
                        text.setText(result+"");
                    }
                    if(otnim==true){
                        result=firstArg-secArg;
                        text.setText(result+"");
                    }
                    if(umnozh==true){
                        result=firstArg*secArg;
                        text.setText(result+"");
                    }
                    if(delen==true){
                        if(secArg==0){
                            text.setText("Math Error");
                        }
                        else{
                            result=firstArg/secArg;
                            text.setText(result+"");
                        }
                    }
                    if(vozvstepen == true){
                        result=Math.pow(firstArg,secArg);
                        text.setText(result+"");
                    }
                    if (procent == true){
                        result = (firstArg*secArg)/100;
                        text.setText(result+"");
                    }
                    if (log ==true){
                        if(firstArg<=0){
                            text.setText("Math Error");
                            return;
                        }
                        result = Math.log(firstArg)/Math.log(secArg);
                        text.setText(result+"");
                    }
                    first_get=false;
                    summa=false;
                    otnim=false;
                    delen=false;
                    umnozh=false;
                    vozvstepen=false;
                    procent=false;
                    log=false;
                }
                else{
                    return;
                }

            }
        });
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("first_value", text.getText().toString());
        outState.putString("number1",value1);
        outState.putString("operation", textoper.getText().toString());
        outState.putString("number2", value2);
        outState.putBoolean("firstget", first_get);
        outState.putBoolean("otnim", otnim);
        outState.putBoolean("summa", summa);
        outState.putBoolean("umnozh", umnozh);
        outState.putBoolean("delen", delen);
        outState.putBoolean("vozvstepen", vozvstepen);
        outState.putBoolean("log", log);
        outState.putString("value1", value1);



    }

    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("fist_value");
        savedInstanceState.getString("number1");
        savedInstanceState.getString("operation");
        savedInstanceState.getString("number2");
        savedInstanceState.getBoolean("firstget");
        savedInstanceState.getBoolean("otnim");
        savedInstanceState.getBoolean("summa");
        savedInstanceState.getBoolean("umnozh");
        savedInstanceState.getBoolean("delen");
        savedInstanceState.getBoolean("vozvstepen");
        savedInstanceState.getBoolean("log");
        savedInstanceState.getString("value1");


    }

    public void rootis(View view) {
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        if(Double.parseDouble(text.getText().toString())<0){
            text.setText("Math Error");
        }
        else{
            result= Math.sqrt(Double.parseDouble(text.getText().toString()));
            text.setText(result+"");
        }
    }

    public  void sinus(View view) {
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        else{
            result= Math.sin(Math.toRadians(Double.parseDouble(text.getText().toString())));
            text.setText(result+"");
        }
    }
    public void cosin(View view) {
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        else{
            result= Math.cos(Math.toRadians(Double.parseDouble(text.getText().toString())));
            text.setText(result+"");
        }
    }

    public void tangen(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        else{
            if(Double.parseDouble(text.getText().toString()) % 180 == 0){
                text.setText("0");
                return;
            }
            if(Double.parseDouble(text.getText().toString()) % 90 == 0){
                text.setText("Math Error");
                return;
            }
            result= Math.tan(Math.toRadians(Double.parseDouble(text.getText().toString())));
            text.setText(result+"");
        }
    }

    public void stepen(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty() && first_get==false){
            return;
        }
        if(first_get==false){
            value1 = text.getText().toString();
        }
        first_get=true;
        text.setText("");
        textoper.setText("^");
        otnim=false;
        delen=false;
        umnozh=false;
        summa=false;
        vozvstepen = true;
        log=false;
    }
    public void factorial(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        else{
            if(Double.parseDouble(text.getText().toString())>60){
                text.setText("Infinity");
                return;
            }
            double limit = Double.parseDouble(text.getText().toString());
            result=1;
            for (int i=1; i<=limit; i++){
                result*=i;
            }
            text.setText(result+"");

        }
    }
    public void percent(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty() && first_get==false){
            return;
        }
        if(first_get==false){
            value1 = text.getText().toString();
        }
        first_get=true;
        text.setText("");
        textoper.setText("%");
        otnim=false;
        delen=false;
        umnozh=false;
        summa=false;
        vozvstepen = false;
        log=false;
        procent=true;
    }
    public void log(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity")){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty() && first_get==false){
            return;
        }
        if(first_get==false){
            value1 = text.getText().toString();
        }
        first_get=true;
        text.setText("");
        textoper.setText("log");
        otnim=false;
        delen=false;
        umnozh=false;
        summa=false;
        vozvstepen = false;
        procent=false;
        log=true;
    }
    public void ln(View view){
        if(text.getText().toString().equals("Math Error") || text.getText().toString().equals("Infinity") ){
            text.setText("");
            textoper.setText("");
            first_get=false;
            sec_get=false;
            return;
        }
        if(text.getText().toString().isEmpty()){
            return;
        }
        else{
            if(Double.parseDouble(text.getText().toString())<=0){
                text.setText("Math Error");
                return;
            }
            result=Math.log(Double.parseDouble(text.getText().toString()));
            text.setText(result+"");
        }

    }
}





