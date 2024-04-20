package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReplyActivity extends AppCompatActivity {
    public static final String Key = "com.example.android.assign.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);

        // Fetching data from the previous page
        Intent intent = getIntent();
        String str = intent.getStringExtra(Key);
        TextView txtView = findViewById(R.id.textView);
        txtView.setText(str);

        // For Appbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp() {
        // Back Button
        onBackPressed();
        return true;
    }
}