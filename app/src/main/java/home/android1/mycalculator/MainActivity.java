package home.android1.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

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
    private int typeLastPressedButton;
    private double current_result;
    private String currentResultString;
    private boolean doubleDotChecker;
    private String lastInputNumber;
    private char lastPressedButton;


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
        typeLastPressedButton = 0;
        doubleDotChecker = false;
        currentResultString = "";

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

    }

    @Override
    public void onClick(View v) {


    }

    // Эта штука должна прицеплять введенный символ к числу и выдавать в TextView
    private void getNumber(TextView resultTv, char lastPressedButton){
        currentResultString = String.format(Locale.getDefault(), "%s%c", resultTv.getText(), lastPressedButton);
        resultTv.setText(currentResultString);
    }

    private void onClickCalculateResultButton(View v) {
        if (typeLastPressedButton == 0)
            Toast.makeText(MainActivity.this, "Нечего считать ", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "Нажато =", Toast.LENGTH_SHORT).show();
    }


    public void onClickDigitButton(View v) {
        typeLastPressedButton = 1;
        Toast.makeText(MainActivity.this, "Нажата цифра не могу вытащить какая", Toast.LENGTH_SHORT).show();

    }



    public void onClickDotButton(View v) {
        typeLastPressedButton = 2;
        if (doubleDotChecker)
            Toast.makeText(MainActivity.this, "В числе уже есть 1 разделитель", Toast.LENGTH_SHORT).show();
        else {
            doubleDotChecker = true;
            Toast.makeText(MainActivity.this, "Нажата .", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickOperationButton(View v) {
        if (typeLastPressedButton == 0)
            Toast.makeText(MainActivity.this, "Операция сейчас неуместна", Toast.LENGTH_SHORT).show();
        else {
            typeLastPressedButton = 3;
            Toast.makeText(MainActivity.this, "Нажата операция", Toast.LENGTH_SHORT).show();
        }


    }
}