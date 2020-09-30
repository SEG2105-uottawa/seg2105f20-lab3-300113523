package com.example.lab3_simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, minus, multiply, divide};
    private double input1=0, input2=0;
    private Operator optr=Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void btn0click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }

    public void btn1click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }

    public void btn2click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }

    public void btn3click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }

    public void btn4click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }

    public void btn5click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }

    public void btn6click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }

    public void btn7click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }

    public void btn8click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }

    public void btn9click (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }

    public void btnDOTclick (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void btnCLRclick(View view) {
        EditText eText=findViewById(R.id.resultEdit);
        eText.setText("");
        optr=Operator.none;
    }

    public void btnADDclick(View view) {
        EditText eText=findViewById(R.id.resultEdit);
        optr=Operator.add;
        input1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMINclick(View view) {
        EditText eText=findViewById(R.id.resultEdit);
        optr=Operator.minus;
        input1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMULclick (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        optr=Operator.multiply;
        input1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDIVclick (View view) {
        EditText eText=findViewById(R.id.resultEdit);
        optr=Operator.divide;
        input1=Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnEQclick (View view) {
        if (optr!=Operator.none) {
            EditText eText=findViewById(R.id.resultEdit);
            double result=0;

            input2=Double.parseDouble(eText.getText().toString());
            if (optr==Operator.add) {
                result=input1+input2;
            }
            else if (optr==Operator.minus) {
                result=input1-input2;
            }
            else if (optr==Operator.multiply) {
                result=input1*input2;
            }
            else if (optr==Operator.divide) {
                result=input1/input2;
            }

            optr= Operator.none;
            input1=result;

            if (result-(int)result!=0) {
                eText.setText(String.valueOf(result));
            }
            else {
                eText.setText((String.valueOf((int)result)));
            }

        }

    }

}