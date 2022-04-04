package br.edu.unicarioca.calculator_aps_da_moveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvResult;
    private TextView tvOperationSignal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


    }

    public void sumOperation(View view) {
        etNum1 = (EditText) findViewById(R.id.firstNumber);
        etNum2 = (EditText) findViewById(R.id.secondNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvOperationSignal = (TextView) findViewById(R.id.tvOperationSignal);

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resultSum = num1 + num2;

        tvResult.setText(String.valueOf(resultSum));
        tvOperationSignal.setText("+");
    }

    public void subOperation(View view) {
        etNum1 = (EditText) findViewById(R.id.firstNumber);
        etNum2 = (EditText) findViewById(R.id.secondNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvOperationSignal = (TextView) findViewById(R.id.tvOperationSignal);

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resultSum = num1 - num2;

        tvResult.setText(String.valueOf(resultSum));
        tvOperationSignal.setText("-");
    }

    public void multiOperation(View view) {
        etNum1 = (EditText) findViewById(R.id.firstNumber);
        etNum2 = (EditText) findViewById(R.id.secondNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvOperationSignal = (TextView) findViewById(R.id.tvOperationSignal);

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resultSum = num1 * num2;

        tvResult.setText(String.valueOf(resultSum));
        tvOperationSignal.setText("*");
    }

    public void divOperation(View view) {
        etNum1 = (EditText) findViewById(R.id.firstNumber);
        etNum2 = (EditText) findViewById(R.id.secondNumber);
        tvResult = (TextView) findViewById(R.id.tvResult);
        tvOperationSignal = (TextView) findViewById(R.id.tvOperationSignal);

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resultSum = num1 / num2;

        tvResult.setText(String.valueOf(resultSum));
        tvOperationSignal.setText("/");
    }
}