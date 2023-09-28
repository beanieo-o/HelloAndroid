package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    private int clickCount = 0;//计数器

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        TextView ClickTextView = findViewById(R.id.textView);
        Button AddBtn = findViewById(R.id.button);
        Button ReduceBtn = findViewById(R.id.button2);
        Button ClearBtn = findViewById(R.id.button3);

        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                ClickTextView.setText("The current number is:" + clickCount);
            }
        });

        ReduceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount--;
                ClickTextView.setText("The current number is:" +clickCount);
            }
        });

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = 0;
                ClickTextView.setText("The current number is:" + clickCount);
            }
        });
    }

}