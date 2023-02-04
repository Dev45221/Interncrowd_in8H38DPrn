package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Java_Language extends AppCompatActivity {

    RadioGroup javarg1, javarg2, javarg3, javarg4, javarg5;
    RadioButton javarb11,javarb12,javarb13,javarb14;
    RadioButton javarb21,javarb22,javarb23,javarb24;
    RadioButton javarb31,javarb32,javarb33,javarb34;
    RadioButton javarb41,javarb42,javarb43,javarb44;
    RadioButton javarb51,javarb52,javarb53,javarb54;

    AlertDialog.Builder builder;

    TextView java_result1, java_clear_all, java_result2;
    Button java_submit;
    ProgressBar java_progress_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_language);

        getSupportActionBar().setTitle("JAVA Language Quiz");

        builder = new AlertDialog.Builder(this);

        java_result1 = findViewById(R.id.java_result1);
        java_result2 = findViewById(R.id.java_result2);
        java_result1.setVisibility(View.INVISIBLE);
        java_result2.setVisibility(View.INVISIBLE);

        javarg1 = findViewById(R.id.javarg1); javarg2 = findViewById(R.id.javarg2); javarg3 = findViewById(R.id.javarg3); javarg4 = findViewById(R.id.javarg4); javarg5 = findViewById(R.id.javarg5);
        javarb11 = findViewById(R.id.javarb11); javarb12 = findViewById(R.id.javarb12); javarb13 = findViewById(R.id.javarb13); javarb14 = findViewById(R.id.javarb14);
        javarb21 = findViewById(R.id.javarb21); javarb22 = findViewById(R.id.javarb22); javarb23 = findViewById(R.id.javarb23); javarb24 = findViewById(R.id.javarb24);
        javarb31 = findViewById(R.id.javarb31); javarb32 = findViewById(R.id.javarb32); javarb33 = findViewById(R.id.javarb33); javarb34 = findViewById(R.id.javarb34);
        javarb41 = findViewById(R.id.javarb41); javarb42 = findViewById(R.id.javarb42); javarb43 = findViewById(R.id.javarb43); javarb44 = findViewById(R.id.javarb44);
        javarb51 = findViewById(R.id.javarb51); javarb52 = findViewById(R.id.javarb52); javarb53 = findViewById(R.id.javarb53); javarb54 = findViewById(R.id.javarb54);

        java_submit = findViewById(R.id.java_submit);
        java_clear_all = findViewById(R.id.java_clear_all);
        java_progress_bar = findViewById(R.id.java_progress_bar);
        java_progress_bar.setVisibility(View.INVISIBLE);

        java_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = javarg1.getCheckedRadioButtonId(), id2 = javarg2.getCheckedRadioButtonId(),
                                        id3 = javarg3.getCheckedRadioButtonId(), id4 = javarg4.getCheckedRadioButtonId(),
                                        id5 = javarg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 2
                                int num = 0;
                                int ans;
                                if (javarb12.getId() == id1) {
                                    javarb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    javarb11.setEnabled(false);
                                    javarb12.setEnabled(false);
                                    javarb13.setEnabled(false);
                                    javarb14.setEnabled(false);
                                }else {
                                    javarb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    javarb11.setEnabled(false);
                                    javarb12.setEnabled(false);
                                    javarb13.setEnabled(false);
                                    javarb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 4
                                if (javarb24.getId() == id2) {
                                    javarb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    javarb21.setEnabled(false);
                                    javarb22.setEnabled(false);
                                    javarb23.setEnabled(false);
                                    javarb24.setEnabled(false);
                                }else {
                                    javarb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num +=0;
                                    javarb21.setEnabled(false);
                                    javarb22.setEnabled(false);
                                    javarb23.setEnabled(false);
                                    javarb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 3
                                if (javarb33.getId() == id3) {
                                    javarb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    javarb31.setEnabled(false);
                                    javarb32.setEnabled(false);
                                    javarb33.setEnabled(false);
                                    javarb34.setEnabled(false);
                                }else {
                                    javarb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    javarb31.setEnabled(false);
                                    javarb32.setEnabled(false);
                                    javarb33.setEnabled(false);
                                    javarb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 4
                                if (javarb44.getId() == id4) {
                                    javarb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb44.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    javarb41.setEnabled(false);
                                    javarb42.setEnabled(false);
                                    javarb43.setEnabled(false);
                                    javarb44.setEnabled(false);
                                }else {
                                    javarb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb44.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    javarb41.setEnabled(false);
                                    javarb42.setEnabled(false);
                                    javarb43.setEnabled(false);
                                    javarb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 3
                                if (javarb53.getId() == id5) {
                                    javarb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb53.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    javarb51.setEnabled(false);
                                    javarb52.setEnabled(false);
                                    javarb53.setEnabled(false);
                                    javarb54.setEnabled(false);
                                }else {
                                    javarb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    javarb53.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    javarb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    javarb51.setEnabled(false);
                                    javarb52.setEnabled(false);
                                    javarb53.setEnabled(false);
                                    javarb54.setEnabled(false);
                                }
                                java_progress_bar.setVisibility(View.VISIBLE);
                                java_result1.setVisibility(View.VISIBLE);
                                java_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                java_progress_bar.setMax(100);
                                java_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    java_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    java_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    java_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    java_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    java_result2.setText(ans + "%\n🤩");
                                }
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Submit");
                alertDialog.show();
            }
        });

        java_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                java_result1.setVisibility(View.INVISIBLE);
                java_result2.setVisibility(View.INVISIBLE);
                java_progress_bar.setVisibility(View.INVISIBLE);
                javarg1.clearCheck();
                javarg2.clearCheck();
                javarg3.clearCheck();
                javarg4.clearCheck();
                javarg5.clearCheck();
//                Ques 1
                javarb11.setEnabled(true);
                javarb12.setEnabled(true);
                javarb13.setEnabled(true);
                javarb14.setEnabled(true);
                javarb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                javarb21.setEnabled(true);
                javarb22.setEnabled(true);
                javarb23.setEnabled(true);
                javarb24.setEnabled(true);
                javarb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                javarb31.setEnabled(true);
                javarb32.setEnabled(true);
                javarb33.setEnabled(true);
                javarb34.setEnabled(true);
                javarb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                javarb41.setEnabled(true);
                javarb42.setEnabled(true);
                javarb43.setEnabled(true);
                javarb44.setEnabled(true);
                javarb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                javarb51.setEnabled(true);
                javarb52.setEnabled(true);
                javarb53.setEnabled(true);
                javarb54.setEnabled(true);
                javarb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                javarb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}