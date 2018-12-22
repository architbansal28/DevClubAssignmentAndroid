package com.example.hp.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countTextView;
    Button increaseButton;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.textView1);
        increaseButton = findViewById(R.id.button1);
        count = 0;
    }

    public void increase(View view){
        count++;
        countTextView.setText("COUNT: "+count);

    }
}
