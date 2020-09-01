package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Because of your message of \"" + message + "\", I have inquired that you are indeed a man of great culture, " +
                "and should be awarded with the highest honor I can bestow.");

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Take this and go forth, wise and humble as ever, knowing that " +
                "your magnificence and grandeur go not unnoticed by this great court. Amen.");
    }
}