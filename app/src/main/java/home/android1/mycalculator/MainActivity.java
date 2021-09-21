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
    }

    private void setupListeners() {
        digitOneButton.setOnClickListener(this::onClickDigit);
        digitTwoButton.setOnClickListener(this::onClickDigit);
        digitThreeButton.setOnClickListener(this::onClickDigit);
        digitFourButton.setOnClickListener(this::onClickDigit);
        digitSixButton.setOnClickListener(this::onClickDigit);
        digitSevenButton.setOnClickListener(this::onClickDigit);
        digitSevenButton.setOnClickListener(this::onClickDigit);
        digitEightButton.setOnClickListener(this::onClickDigit);
        digitNineButton.setOnClickListener(this::onClickDigit);
        digitZeroButton.setOnClickListener(this::onClickDigit);
        decimalDotButton.setOnClickListener(this);
        addOperationButton.setOnClickListener(this::onClickOperation);
        subtractionOperationButton.setOnClickListener(this::onClickOperation);
        multiplyOperationButton.setOnClickListener(this::onClickOperation);
        divideOperationButton.setOnClickListener(this::onClickOperation);

    }

    @Override
    public void onClick(View v) {


    }

    public void onClickDigit(View v) {
        Toast.makeText(MainActivity.this, "Нажата цифра", Toast.LENGTH_LONG).show();

    }


    public void onClickOperation(View v) {
        Toast.makeText(MainActivity.this, "Нажата операция", Toast.LENGTH_LONG).show();


    }
}