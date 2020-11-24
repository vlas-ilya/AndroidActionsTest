package com.tease.androidactionstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.tease.androidlibraryactionstest.HelloMessageFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView message = findViewById(R.id.message);
        message.setText(new MessageFactory("Hello!").message());
    }
}