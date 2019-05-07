package com.example.androiddayone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    private TextView username;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_second);
        username = (TextView) findViewById(R.id.username);
        username.setText(getIntent().getStringExtra("username"));
    }
}
