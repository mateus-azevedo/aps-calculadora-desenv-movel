package br.edu.unicarioca.calculator_aps_da_moveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /**
                 * Este método será executado após o timer
                 * Iniciando a activity principal
                 * */
                Intent calculatorActivity = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calculatorActivity);

                /**
                 * Encerra a MainActivity
                 * */
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}