package com.kodelogger.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonDecimal, buttonPlus, buttonMinus,
            buttonAdd, buttonMultiply, buttonDivide, buttonResult, buttonClear, buttonBackSpace, buttonPercentage;

    TextView userInput, userOutput;

    String currentQuery;

    public static float evaluate(String expression) {
        float result = 0;
        String[] tokens = expression.split(" ");
        int i = 0;
        while (i < tokens.length) {
            switch (tokens[i]) {
                case "+":
                    result += Float.parseFloat(tokens[i + 1]);
                    i += 2;
                    break;
                case "-":
                    result -= Float.parseFloat(tokens[i + 1]);
                    i += 2;
                    break;
                case "×":
                    result *= Float.parseFloat(tokens[i + 1]);
                    i += 2;
                    break;
                case "÷":
                    result /= Float.parseFloat(tokens[i + 1]);
                    i += 2;
                    break;

                case "%":
                    result /= Float.parseFloat(tokens[i + 1]);
                    result *= 100;
                    i += 2;
                    break;
                default:
                    result = Float.parseFloat(tokens[i]);
                    i++;
                    break;
            }
        }
        return result;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Utility Buttons
        buttonClear = findViewById(R.id.buttonClear);
        buttonBackSpace = findViewById(R.id.buttonBackSpace);
        buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonResult = findViewById(R.id.buttonResult);

        // Operator Buttons
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonMinus = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonPercentage = findViewById(R.id.buttonPercentage);

        // Number Buttons
        buttonZero = findViewById(R.id.numberZero);
        buttonOne = findViewById(R.id.numberOne);
        buttonTwo = findViewById(R.id.numberTwo);
        buttonThree = findViewById(R.id.numberThree);
        buttonFour = findViewById(R.id.numberFour);
        buttonFive = findViewById(R.id.numberFive);
        buttonSix = findViewById(R.id.numberSix);
        buttonSeven = findViewById(R.id.numberSeven);
        buttonEight = findViewById(R.id.numberEight);
        buttonNine = findViewById(R.id.numberNine);

        userInput = findViewById(R.id.userInput);
        userOutput = findViewById(R.id.userOutput);


        // Clear button click event ...
        buttonClear.setOnClickListener(v -> {
            userInput.setText("0");
            userOutput.setText("");
        });

        // BackSpace button click event ...
        buttonBackSpace.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            if (currentQuery.equals("0"))
                userInput.setText(currentQuery);
            else
                userInput.setText(currentQuery.substring(0, currentQuery.length() - 1));
        });

        buttonZero.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "0";

            if (!currentQuery.equals("0"))
                userInput.setText(updatedQuery);
        });

        buttonOne.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "1";

            if (currentQuery.equals("0"))
                userInput.setText("1");
            else
                userInput.setText(updatedQuery);
        });

        buttonTwo.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "2";

            if (currentQuery.equals("0"))
                userInput.setText("2");
            else
                userInput.setText(updatedQuery);
        });

        buttonThree.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "3";

            if (currentQuery.equals("0"))
                userInput.setText("3");
            else
                userInput.setText(updatedQuery);
        });

        buttonFour.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "4";

            if (currentQuery.equals("0"))
                userInput.setText("4");
            else
                userInput.setText(updatedQuery);
        });

        buttonFive.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "5";

            if (currentQuery.equals("0"))
                userInput.setText("5");
            else
                userInput.setText(updatedQuery);
        });

        buttonSix.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "6";

            if (currentQuery.equals("0"))
                userInput.setText("6");
            else
                userInput.setText(updatedQuery);
        });

        buttonSeven.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "7";

            if (currentQuery.equals("0"))
                userInput.setText("7");
            else
                userInput.setText(updatedQuery);
        });

        buttonEight.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "8";

            if (currentQuery.equals("0"))
                userInput.setText("8");
            else
                userInput.setText(updatedQuery);
        });

        buttonNine.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + "9";

            if (currentQuery.equals("0"))
                userInput.setText("9");
            else
                userInput.setText(updatedQuery);
        });

        buttonAdd.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + " + ";
            userInput.setText(updatedQuery);
        });

        buttonMinus.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + " - ";
            userInput.setText(updatedQuery);
        });

        buttonMultiply.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + " × ";
            userInput.setText(updatedQuery);
        });

        buttonDivide.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + " ÷ ";
            userInput.setText(updatedQuery);
        });

        buttonPercentage.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + " % ";
            userInput.setText(updatedQuery);
        });

        buttonDecimal.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            String updatedQuery = currentQuery + ".";
            userInput.setText(updatedQuery);
        });

        buttonResult.setOnClickListener(v -> {
            currentQuery = userInput.getText().toString();
            float result = 0.0f;
            String resultMessage = "";
            try {
                result = evaluate(currentQuery);
                resultMessage = String.valueOf(result);
            } catch (Exception error) {
                resultMessage = "ERROR";
            }
            String finalResult = "= " + resultMessage;
            userOutput.setText(finalResult);
        });
    }
}