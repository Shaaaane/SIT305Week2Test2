package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);
        mTextView = findViewById(R.id.textView);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputValue =mEditText.getText().toString();
                //string convert to int
                //int newValue = Integer.parseInt(String.valueOf(inputValue));

                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_LONG).show();

                mTextView.setText("Welcome\n"+inputValue);
            }
        });
    }
}