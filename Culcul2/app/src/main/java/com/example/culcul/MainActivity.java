package com.example.culcul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView nameApp, resultText;
    private EditText firstNumberInput, secondNumberInput;
    private Button buttonPlus, buttonMinus, buttonMul, buttonDif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nameApp = findViewById(R.id.nameApp);
        resultText = findViewById(R.id.resultText);
        firstNumberInput = findViewById(R.id.firstNumberInput);
        secondNumberInput = findViewById(R.id.secondNumberInput);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat(firstNumberInput.getText().toString());
                float number2 = Float.parseFloat(secondNumberInput.getText().toString());

                float numberResult = number1 + number2;

                resultText.setText(String.valueOf(numberResult));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat(firstNumberInput.getText().toString());
                float number2 = Float.parseFloat(secondNumberInput.getText().toString());

                float numberResult = number1 - number2;

                resultText.setText(String.valueOf(numberResult));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat(firstNumberInput.getText().toString());
                float number2 = Float.parseFloat(secondNumberInput.getText().toString());

                float numberResult = number1 * number2;

                resultText.setText(String.valueOf(numberResult));
            }
        });

        buttonDif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat(firstNumberInput.getText().toString());
                float number2 = Float.parseFloat(secondNumberInput.getText().toString());

                float numberResult = number1 * number2;

                resultText.setText(String.valueOf(numberResult));
            }
        });
    }
}