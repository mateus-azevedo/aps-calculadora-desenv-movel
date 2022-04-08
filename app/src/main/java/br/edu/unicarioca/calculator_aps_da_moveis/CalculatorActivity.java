package br.edu.unicarioca.calculator_aps_da_moveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

        if (isLabelBlank(etNum1)) {
            Log.i("isLabelBlank etnum1", "yes, is blank on sumOperation");
            return;
        } else if (isLabelBlank(etNum2)) {
            Log.i("isLabelBlank etnum2", "yes, is blank on sumOperation");
            return;
        }

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

        if (isLabelBlank(etNum1)) {
            Log.i("isLabelBlank etnum1", "yes, is blank on subOperation");
            return;
        } else if (isLabelBlank(etNum2)) {
            Log.i("isLabelBlank etnum2", "yes, is blank on subOperation");
            return;
        }

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

        if (isLabelBlank(etNum1)) {
            Log.i("isLabelBlank etnum1", "yes, is blank on multiOperation");
            return;
        } else if (isLabelBlank(etNum2)) {
            Log.i("isLabelBlank etnum2", "yes, is blank on multiOperation");
            return;
        }

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

        if (isLabelBlank(etNum1)) {
            Log.i("isLabelBlank etnum1", "yes, is blank on divOperation");
            return;
        } else if (isLabelBlank(etNum2)) {
            Log.i("isLabelBlank etnum2", "yes, is blank on divOperation");
            return;
        }

        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resultSum = num1 / num2;

        tvResult.setText(String.valueOf(resultSum));
        tvOperationSignal.setText("/");
    }

    public void clearLabels(View view) {
        etNum1 = (EditText) findViewById(R.id.firstNumber);
        etNum2 = (EditText) findViewById(R.id.secondNumber);
        tvOperationSignal = (TextView) findViewById(R.id.tvOperationSignal);
        tvResult = (TextView) findViewById(R.id.tvResult);

        etNum1.setText("");
        etNum2.setText("");
        tvOperationSignal.setText("");
        tvResult.setText("");
    }

    private Boolean isLabelBlank(EditText input) {
        if (input.getText().toString().length() == 0) {
            input.setError("Por favor insira um número no campo");
            return true;
        }

        return false;
    }
}