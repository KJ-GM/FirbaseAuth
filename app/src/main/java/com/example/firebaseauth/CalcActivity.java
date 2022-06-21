package com.example.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    private TextView resultTextView;

    private double operand = 0.0;
    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        resultTextView = findViewById(R.id.resultTextView);

    }

    public void numberClick(View clickedView) {

        TextView resTextView = (TextView) clickedView;

        String number = resTextView.getText().toString();
        String text = resultTextView.getText().toString();

        String result = text + number;

        resultTextView.setText(result);

    }

    public void operationClick(View clickedView) {

        TextView textView = (TextView) clickedView;

        String text = resultTextView.getText().toString();

        if (!TextUtils.isEmpty(text)) {
            operand = Double.parseDouble(text);
        }

        resultTextView.setText("");

        operation = textView.getText().toString();

    }

    public void equalsClick(View clickedView) {

        String secOperandText = resultTextView.getText().toString();
        double secOperand = 0.0;

        if (!TextUtils.isEmpty(secOperandText)) {
            secOperand = Double.parseDouble(secOperandText);
        }

        switch (operation) {
            case "+":
                resultTextView.setText(String.valueOf(operand + secOperand));
                break;
            case "-":
                resultTextView.setText(String.valueOf(operand - secOperand));
                break;
            case "*":
                resultTextView.setText(String.valueOf(operand * secOperand));
                break;
            case "/":
                resultTextView.setText(String.valueOf(operand / secOperand));
                break;
        }

        operand = 0.0;
    }

    public void clearClick(View clickedView) {
        operation = "";
        operand = 0.0;
        resultTextView.setText("");
    }


}