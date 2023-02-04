package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Topic extends AppCompatActivity {

    TextView current_affair, geography, programming_language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        getSupportActionBar().setTitle("Welcome To Quiz");

        current_affair = findViewById(R.id.current_affair);
        geography = findViewById(R.id.geography);
        programming_language = findViewById(R.id.programming_language);

        current_affair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Topic.this, Current_Affair.class));
            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Topic.this, Geography.class));
            }
        });

        programming_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Topic.this, Programming_Language.class));
            }
        });
    }
}