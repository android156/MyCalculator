package home.android1.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultTv;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_point;
    private Button button_add;
    private Button button_sub;
    private Button button_mult;
    private Button button_div;

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
        button_1 = findViewById(R.id.digit_one_button);
        button_2 = findViewById(R.id.digit_two_button);
        button_3 = findViewById(R.id.digit_three_button);
        button_4 = findViewById(R.id.digit_four_button);
        button_5 = findViewById(R.id.digit_five_button);
        button_6 = findViewById(R.id.digit_six_button);
        button_7 = findViewById(R.id.digit_seven_button);
        button_8 = findViewById(R.id.digit_eight_button);
        button_9 = findViewById(R.id.digit_nine_button);
        button_0 = findViewById(R.id.digit_zero_button);
        button_point = findViewById(R.id.decimal_dot_button);
        button_add = findViewById(R.id.add_operation_button);
        button_mult = findViewById(R.id.multiply_operation_button);
        button_div = findViewById(R.id.divide_operation_button);
        button_sub = findViewById(R.id.subtraction_operation_button);
    }

    private void setupListeners() {
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_mult.setOnClickListener(this);
        button_div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


    }
}