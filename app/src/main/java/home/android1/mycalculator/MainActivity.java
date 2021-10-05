package home.android1.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultTv;
    private Button digitOneButton;
    private Button digitTwoButton;
    private Button digitThreeButton;
    private Button digitFiveButton;
    private Button digitFourButton;
    private Button digitSixButton;
    private Button digitSevenButton;
    private Button digitEightButton;
    private Button digitNineButton;
    private Button digitZeroButton;
    private Button decimalDotButton;
    private Button addOperationButton;
    private Button subtractionOperationButton;
    private Button multiplyOperationButton;
    private Button divideOperationButton;
    private Button calculateResultButton;
    private Button calculateSquareRootButton;
    private Button addToMemoryButton;
    private Button getFromMemoryButton;
    private Button clearButton;
    private Calculator calculator;


    private double calculateResult(double startNumber, double lastNumber, char operation) {
        double result = 0;
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setupListeners();
        initCalculator();
    }

    private void initView() {
// Получить пользовательские элементы по идентификатору
        resultTv = findViewById(R.id.result_textview);
        digitOneButton = findViewById(R.id.digit_one_button);
        digitTwoButton = findViewById(R.id.digit_two_button);
        digitThreeButton = findViewById(R.id.digit_three_button);
        digitFourButton = findViewById(R.id.digit_four_button);
        digitFiveButton = findViewById(R.id.digit_five_button);
        digitSixButton = findViewById(R.id.digit_six_button);
        digitSevenButton = findViewById(R.id.digit_seven_button);
        digitEightButton = findViewById(R.id.digit_eight_button);
        digitNineButton = findViewById(R.id.digit_nine_button);
        digitZeroButton = findViewById(R.id.digit_zero_button);
        decimalDotButton = findViewById(R.id.decimal_dot_button);
        addOperationButton = findViewById(R.id.add_operation_button);
        multiplyOperationButton = findViewById(R.id.multiply_operation_button);
        divideOperationButton = findViewById(R.id.divide_operation_button);
        subtractionOperationButton = findViewById(R.id.subtraction_operation_button);
        calculateResultButton = findViewById(R.id.calculate_result_button);
        clearButton = findViewById(R.id.operation_clear_button);
        calculateSquareRootButton = findViewById(R.id.operation_sqrt_button);
        addToMemoryButton = findViewById(R.id.memory_button);
        getFromMemoryButton = findViewById(R.id.memory_restore_button);
    }

    private void initCalculator() {
        resultTv.setText("0");
        calculator = new Calculator(0, 0, 0, "", 'N', 0, false, "None", "", 0);
    }

    private void setupListeners() {
        digitOneButton.setOnClickListener(this::onClickDigitButton);
        digitTwoButton.setOnClickListener(this::onClickDigitButton);
        digitThreeButton.setOnClickListener(this::onClickDigitButton);
        digitFourButton.setOnClickListener(this::onClickDigitButton);
        digitFiveButton.setOnClickListener(this::onClickDigitButton);
        digitSixButton.setOnClickListener(this::onClickDigitButton);
        digitSevenButton.setOnClickListener(this::onClickDigitButton);
        digitEightButton.setOnClickListener(this::onClickDigitButton);
        digitNineButton.setOnClickListener(this::onClickDigitButton);
        digitZeroButton.setOnClickListener(this::onClickDigitButton);
        decimalDotButton.setOnClickListener(this::onClickDotButton);
        addOperationButton.setOnClickListener(this::onClickOperationButton);
        subtractionOperationButton.setOnClickListener(this::onClickOperationButton);
        multiplyOperationButton.setOnClickListener(this::onClickOperationButton);
        divideOperationButton.setOnClickListener(this::onClickOperationButton);
        calculateResultButton.setOnClickListener(this::onClickCalculateResultButton);
        clearButton.setOnClickListener(this::onClickClearButton);
        calculateSquareRootButton.setOnClickListener(this::onClickSquareRootButton);
        addToMemoryButton.setOnClickListener(this::onClickMemoryButton);
        getFromMemoryButton.setOnClickListener(this::onClickMemoryButton);


    }

    private void onClickClearButton(View view) {
        initCalculator();
    }

    private void onClickMemoryButton(View v) {
        if (getCurrentButtonText(v).equals("M+")) {
            calculator.memoryNumber += calculator.intermediateResult;
        } else {
            calculator.intermediateResult = calculator.memoryNumber;
            calculator.isDotInCurrentNumber = true;
            calculator.currentResultString = String.valueOf(calculator.intermediateResult);
            displayResult(resultTv, calculator.currentResultString);

        }
    }


    @Override
    public void onClick(View v) {

    }

    public String getCurrentButtonText(View v) {
        return ((Button) v).getText().toString();
    }

    // Эта штука должна прицеплять введенный символ(строка) к числу(строка) и выдавать в TextView
    private void displayResult(TextView resultTv, String currentResultString) {
        resultTv.setText(currentResultString);
    }

    public String addLastChar(String currentResultString, String lastChar) {
        return (currentResultString + lastChar);
    }

    public String addFirstChar(String currentResultString, String firstChar) {
        return (firstChar + currentResultString);
    }

    public String removeLastChar(String s) {
        if (s == null || s.length() == 0)
            return "0";
        else
            return (s.substring(0, s.length() - 1));
    }

    public String removeFirstChar(String s) {
        if (s == null || s.length() == 0)
            return "0";
        else
            return (s.substring(1, s.length()));
    }


    private void onClickCalculateResultButton(View v) {
        if (calculator.lastPressedButtonType.equals("None") || calculator.operationCounter == 0)
            Toast.makeText(MainActivity.this, "Нечего считать ", Toast.LENGTH_SHORT).show();
        else {
            calculator.operationCounter = 0;
            calculator.isDotInCurrentNumber = true;
            if (calculator.lastPressedButtonType.equals("operation") || calculator.lastPressedButtonType.equals("dot")) {
                calculator.currentResultString = removeLastChar(calculator.currentResultString);
                displayResult(resultTv, calculator.currentResultString);
            } else {
                calculator.lastPressedButtonType = "equal";
                calculator.secondNumber = calculator.intermediateResult;
                calculator.firstNumber = calculator.calculate(calculator.firstNumber, calculator.secondNumber, calculator.operation);
                calculator.currentResultString = String.valueOf(calculator.firstNumber);
                displayResult(resultTv, calculator.currentResultString);
                calculator.intermediateResult = calculator.firstNumber;
            }

        }

    }


    public void onClickDigitButton(View v) {
        if (calculator.lastPressedButtonType.equals("operation")) {
            calculator.currentResultString = "";
        }
        calculator.lastPressedButtonType = "digit";
        calculator.lastPressedButton = getCurrentButtonText(v);
        calculator.currentResultString = addLastChar(calculator.currentResultString, calculator.lastPressedButton);
        calculator.intermediateResult = Double.parseDouble(calculator.currentResultString);
        displayResult(resultTv, calculator.currentResultString);
    }


    public void onClickDotButton(View v) {
        if (calculator.isDotInCurrentNumber)
            Toast.makeText(MainActivity.this, "В числе уже есть 1 разделитель", Toast.LENGTH_SHORT).show();
        else {
            calculator.lastPressedButtonType = "dot";
            calculator.isDotInCurrentNumber = true;
            calculator.lastPressedButton = ".";
            if (calculator.lastPressedButtonType.equals("None") || calculator.lastPressedButtonType.equals("operation")) {
                calculator.lastPressedButton = ".";
                calculator.currentResultString = addFirstChar(calculator.currentResultString, "0.");
            } else
                calculator.currentResultString = addLastChar(calculator.currentResultString, ".");
        }
    }

    public void onClickSquareRootButton(View v) {
        if (calculator.intermediateResult >= 0) {
            calculator.isDotInCurrentNumber = true;
            calculator.intermediateResult = Math.sqrt(calculator.intermediateResult);
            calculator.currentResultString = String.valueOf(calculator.intermediateResult);
            displayResult(resultTv, calculator.currentResultString);
        } else Toast.makeText(MainActivity.this, "Нельзя извлечь корень из отрицательного числа", Toast.LENGTH_SHORT).show();
    }

    public void onClickOperationButton(View v) {

        if (calculator.lastPressedButtonType.equals("operation"))
            Toast.makeText(MainActivity.this, "Операция сейчас неуместна", Toast.LENGTH_SHORT).show();
        else {
            if (calculator.lastPressedButtonType.equals("digit") || calculator.lastPressedButtonType.equals("equal")) {
                calculator.lastPressedButtonType = "operation";
                calculator.operationCounter++;
                calculator.isDotInCurrentNumber = false;
                calculator.lastPressedButton = getCurrentButtonText(v);
                calculator.operation = calculator.lastPressedButton.charAt(0);
                if (calculator.operationCounter == 1) {
                    calculator.firstNumber = calculator.intermediateResult;
                    calculator.intermediateResult = 0;
                    calculator.currentResultString = addLastChar(calculator.currentResultString, calculator.lastPressedButton);
                } else {
                    calculator.isDotInCurrentNumber = true;
                    calculator.secondNumber = calculator.intermediateResult;
                    calculator.firstNumber = calculator.calculate(calculator.firstNumber, calculator.secondNumber, calculator.operation);
                    calculator.currentResultString = String.valueOf(calculator.firstNumber);
                }
                resultTv.setText(calculator.currentResultString);

            }

        }
    }
}