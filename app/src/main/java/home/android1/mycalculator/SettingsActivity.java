package home.android1.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {
    static final String CALCULATOR_RESULT_STRING_KEY = "calculator_key_result_string";
    private Button closeAppButton;
    private TextView SettingsResultTextView;
    private Intent intent;

    static void start(Context context, String currentResultString){
        Intent intent = new Intent(context, SettingsActivity.class);
        intent.putExtra(SettingsActivity.CALCULATOR_RESULT_STRING_KEY, currentResultString);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        intent = getIntent();
        SettingsResultTextView = findViewById(R.id.result_textview_settings);
        SettingsResultTextView.setText(intent.getStringExtra(CALCULATOR_RESULT_STRING_KEY));


    }
}