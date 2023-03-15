package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private TextView answer;

    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMult;
    private  Button buttonDiv;


    StringBuilder sb = new StringBuilder();
    int purpleNew = Color.parseColor("#FFBB86FC");
    int purple = Color.parseColor("#FF6200EE");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.editNum2);
        input2 = findViewById(R.id.editNum1);
        answer = findViewById(R.id.textAns);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonNeg);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);




    }
    public void color(Button button) {
        buttonAdd.setBackgroundColor(purple);
        buttonSub.setBackgroundColor(purple);
        buttonMult.setBackgroundColor(purple);
        buttonDiv.setBackgroundColor(purple);
        button.setBackgroundColor(purpleNew);
    }

    public void adding(View view) {
        color(buttonAdd);
        int n1 = 0;
        int n2 = 0;
        int ans = 0;

        n1 = Integer.parseInt(input1.getText().toString());
        n2 = Integer.parseInt(input2.getText().toString());

        ans = n1 + n2;

        answer.setText("");
        answer.append(Integer.toString(ans));
        //buttonAdd.setBackgroundColor(purple);

    }
    public void subtraction(View view) {
        color(buttonSub);
        int n1 = 0;
        int n2 = 0;
        int ans = 0;

        n1 = Integer.parseInt(input1.getText().toString());
        n2 = Integer.parseInt(input2.getText().toString());

        ans = n1 - n2;

        answer.setText("");
        answer.append(Integer.toString(ans));

    }
    public void multiplication(View view) {
        color(buttonMult);
        int n1 = 0;
        int n2 = 0;
        int ans = 0;

        n1 = Integer.parseInt(input1.getText().toString());
        n2 = Integer.parseInt(input2.getText().toString());

        ans = n1 * n2;

        answer.setText("");
        answer.append(Integer.toString(ans));

    }

    public void division(View view) {
        color(buttonDiv);
        int n1 = 0;
        int n2 = 0;
        int ans = 0;
        String error = "ERROR";

        n1 = Integer.parseInt(input1.getText().toString());
        n2 = Integer.parseInt(input2.getText().toString());

        if (n2 == 0) {
            answer.setText(error);
        } else {
            ans = n1 / n2;

            answer.setText("");
            answer.append(Integer.toString(ans));
        }
    }



}