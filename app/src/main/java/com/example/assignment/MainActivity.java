package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText CourseEdit;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CourseEdit = findViewById(R.id.Coursename_edittext);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubmitFeedback(v);
            }
        });
    }
    public void SubmitFeedback(View view) {
        String message = CourseEdit.getText().toString();
        Intent intent = new Intent(this, ReplyActivity.class);
        intent.putExtra(ReplyActivity.Key, message);
        startActivity(intent);
    }
    }