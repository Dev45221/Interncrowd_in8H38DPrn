package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Programming_Language extends AppCompatActivity {

    TextView c_lang, cpp_lang, python_lang, php_lang, java_lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_language);

        getSupportActionBar().setTitle("Programming Language");

        c_lang = findViewById(R.id.c_lang);
        cpp_lang = findViewById(R.id.cpp_lang);
        python_lang = findViewById(R.id.python_lang);
        php_lang = findViewById(R.id.php_lang);
        java_lang = findViewById(R.id.java_lang);

        c_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Programming_Language.this, C_Language.class));
            }
        });
        cpp_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Programming_Language.this, CPP_Language.class));
            }
        });
        python_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Programming_Language.this, Python_Language.class));
            }
        });
        php_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Programming_Language.this, PHP_Language.class));
            }
        });
        java_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Programming_Language.this, Java_Language.class));
            }
        });
    }
}