package br.edu.unicarioca.calculator_aps_da_moveis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_zero, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven,
            btn_eight, btn_nine, btn_sum, btn_sub, btn_multi, btn_div, btn_equal, btn_clear,btn_dot;
    private TextView txt_expression, txt_result;
    private ImageView btn_backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        initialize();

        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_div.setOnClickListener(this);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_expression.setText("");
                txt_result.setText("");
            }
        });

        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt_expression = findViewById(R.id.txt_expression);
                String string = txt_expression.getText().toString();

                if (!string.isEmpty()) {

                    byte var0 = 0;
                    int var1 = string.length() - 1;
                    String expression = string.substring(var0, var1);
                    txt_expression.setText(expression);;
                }

                txt_result.setText("");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Expression expression = new ExpressionBuilder(txt_expression.getText().toString()).build();

                    double result = expression.evaluate();
                    long longResult = (long) result;

                    if (result == (double) longResult) {
                        txt_result.setText((CharSequence) String.valueOf(longResult));
                    } else {
                        txt_result.setText((CharSequence) String.valueOf(result));
                    }
                } catch (Exception e) {
                    Log.d("Try equal", e.toString());
                }
            }
        });
    }

    private void initialize() {
        btn_zero = findViewById(R.id.btn_zero);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_sum = findViewById(R.id.btnSum);
        btn_sub = findViewById(R.id.btnSub);
        btn_multi = findViewById(R.id.btnMulti);
        btn_div = findViewById(R.id.btnDiv);
        btn_equal = findViewById(R.id.btnEqual);
        btn_clear = findViewById(R.id.btn_clear);
        btn_dot = findViewById(R.id.btn_dot);
        txt_expression = findViewById(R.id.txt_expression);
        txt_result = findViewById(R.id.txt_result);
        btn_backspace = findViewById(R.id.btn_backspace);
    }

    public void changeTextExpression(String string, boolean clear) {

        if (txt_result.getText().equals("")) {
            txt_expression.setText(" ");
        }

        if (clear) {
            txt_result.setText(" ");
            txt_expression.append(string);
        } else {
            txt_expression.append(txt_result.getText());
            txt_expression.append(string);
            txt_result.setText(" ");
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                changeTextExpression("0", true);
                break;
            case R.id.btn_one:
                changeTextExpression("1", true);
                break;
            case R.id.btn_two:
                changeTextExpression("2", true);
                break;
            case R.id.btn_three:
                changeTextExpression("3", true);
                break;
            case R.id.btn_four:
                changeTextExpression("4", true);
                break;
            case R.id.btn_five:
                changeTextExpression("5", true);
                break;
            case R.id.btn_six:
                changeTextExpression("6", true);
                break;
            case R.id.btn_seven:
                changeTextExpression("7", true);
                break;
            case R.id.btn_eight:
                changeTextExpression("8", true);
                break;
            case R.id.btn_nine:
                changeTextExpression("9", true);
                break;
            case R.id.btn_dot:
                changeTextExpression(".", true);
                break;

            case R.id.btnSum:
                changeTextExpression("+", false);
                break;
            case R.id.btnSub:
                changeTextExpression("-", false);
                break;
            case R.id.btnDiv:
                changeTextExpression("/", false);
                break;
            case R.id.btnMulti:
                changeTextExpression("*", false);
        }
    }
/*
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

 */
}