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

public class CPP_Language extends AppCompatActivity {

    RadioGroup cpprg1, cpprg2, cpprg3, cpprg4, cpprg5;
    RadioButton cpprb11,cpprb12,cpprb13,cpprb14;
    RadioButton cpprb21,cpprb22,cpprb23,cpprb24;
    RadioButton cpprb31,cpprb32,cpprb33,cpprb34;
    RadioButton cpprb41,cpprb42,cpprb43,cpprb44;
    RadioButton cpprb51,cpprb52,cpprb53,cpprb54;

    AlertDialog.Builder builder;

    TextView cpp_result1, cpp_clear_all, cpp_result2;
    Button cpp_submit;
    ProgressBar cpp_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_language);

        getSupportActionBar().setTitle("C++ Language Quiz");

        builder = new AlertDialog.Builder(this);

        cpp_result1 = findViewById(R.id.cpp_result1);
        cpp_result2 = findViewById(R.id.cpp_result2);
        cpp_result1.setVisibility(View.INVISIBLE);
        cpp_result2.setVisibility(View.INVISIBLE);

        cpprg1 = findViewById(R.id.cpprg1); cpprg2 = findViewById(R.id.cpprg2); cpprg3 = findViewById(R.id.cpprg3); cpprg4 = findViewById(R.id.cpprg4); cpprg5 = findViewById(R.id.cpprg5);
        cpprb11 = findViewById(R.id.cpprb11); cpprb12 = findViewById(R.id.cpprb12); cpprb13 = findViewById(R.id.cpprb13); cpprb14 = findViewById(R.id.cpprb14);
        cpprb21 = findViewById(R.id.cpprb21); cpprb22 = findViewById(R.id.cpprb22); cpprb23 = findViewById(R.id.cpprb23); cpprb24 = findViewById(R.id.cpprb24);
        cpprb31 = findViewById(R.id.cpprb31); cpprb32 = findViewById(R.id.cpprb32); cpprb33 = findViewById(R.id.cpprb33); cpprb34 = findViewById(R.id.cpprb34);
        cpprb41 = findViewById(R.id.cpprb41); cpprb42 = findViewById(R.id.cpprb42); cpprb43 = findViewById(R.id.cpprb43); cpprb44 = findViewById(R.id.cpprb44);
        cpprb51 = findViewById(R.id.cpprb51); cpprb52 = findViewById(R.id.cpprb52); cpprb53 = findViewById(R.id.cpprb53); cpprb54 = findViewById(R.id.cpprb54);

        cpp_submit = findViewById(R.id.cpp_submit);
        cpp_clear_all = findViewById(R.id.cpp_clear_all);
        cpp_progress_bar = findViewById(R.id.cpp_progress_bar);
        cpp_progress_bar.setVisibility(View.INVISIBLE);

        cpp_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = cpprg1.getCheckedRadioButtonId(), id2 = cpprg2.getCheckedRadioButtonId(),
                                        id3 = cpprg3.getCheckedRadioButtonId(), id4 = cpprg4.getCheckedRadioButtonId(),
                                        id5 = cpprg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 4
                                int num = 0;
                                int ans;
                                if (cpprb14.getId() == id1) {
                                    cpprb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    cpprb11.setEnabled(false);
                                    cpprb12.setEnabled(false);
                                    cpprb13.setEnabled(false);
                                    cpprb14.setEnabled(false);
                                }else {
                                    cpprb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    cpprb11.setEnabled(false);
                                    cpprb12.setEnabled(false);
                                    cpprb13.setEnabled(false);
                                    cpprb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 3
                                if (cpprb23.getId() == id2) {
                                    cpprb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb23.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    cpprb21.setEnabled(false);
                                    cpprb22.setEnabled(false);
                                    cpprb23.setEnabled(false);
                                    cpprb24.setEnabled(false);
                                }else {
                                    cpprb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb23.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num +=0;
                                    cpprb21.setEnabled(false);
                                    cpprb22.setEnabled(false);
                                    cpprb23.setEnabled(false);
                                    cpprb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 3
                                if (cpprb33.getId() == id3) {
                                    cpprb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    cpprb31.setEnabled(false);
                                    cpprb32.setEnabled(false);
                                    cpprb33.setEnabled(false);
                                    cpprb34.setEnabled(false);
                                }else {
                                    cpprb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    cpprb31.setEnabled(false);
                                    cpprb32.setEnabled(false);
                                    cpprb33.setEnabled(false);
                                    cpprb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 1
                                if (cpprb41.getId() == id4) {
                                    cpprb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    cpprb41.setEnabled(false);
                                    cpprb42.setEnabled(false);
                                    cpprb43.setEnabled(false);
                                    cpprb44.setEnabled(false);
                                }else {
                                    cpprb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    cpprb41.setEnabled(false);
                                    cpprb42.setEnabled(false);
                                    cpprb43.setEnabled(false);
                                    cpprb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 1
                                if (cpprb51.getId() == id5) {
                                    cpprb51.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    cpprb51.setEnabled(false);
                                    cpprb52.setEnabled(false);
                                    cpprb53.setEnabled(false);
                                    cpprb54.setEnabled(false);
                                }else {
                                    cpprb51.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    cpprb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    cpprb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    cpprb51.setEnabled(false);
                                    cpprb52.setEnabled(false);
                                    cpprb53.setEnabled(false);
                                    cpprb54.setEnabled(false);
                                }
                                cpp_progress_bar.setVisibility(View.VISIBLE);
                                cpp_result1.setVisibility(View.VISIBLE);
                                cpp_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                cpp_progress_bar.setMax(100);
                                cpp_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    cpp_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    cpp_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    cpp_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    cpp_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    cpp_result2.setText(ans + "%\n🤩");
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

        cpp_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpp_result1.setVisibility(View.INVISIBLE);
                cpp_result2.setVisibility(View.INVISIBLE);
                cpp_progress_bar.setVisibility(View.INVISIBLE);
                cpprg1.clearCheck();
                cpprg2.clearCheck();
                cpprg3.clearCheck();
                cpprg4.clearCheck();
                cpprg5.clearCheck();
//                Ques 1
                cpprb11.setEnabled(true);
                cpprb12.setEnabled(true);
                cpprb13.setEnabled(true);
                cpprb14.setEnabled(true);
                cpprb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                cpprb21.setEnabled(true);
                cpprb22.setEnabled(true);
                cpprb23.setEnabled(true);
                cpprb24.setEnabled(true);
                cpprb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                cpprb31.setEnabled(true);
                cpprb32.setEnabled(true);
                cpprb33.setEnabled(true);
                cpprb34.setEnabled(true);
                cpprb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                cpprb41.setEnabled(true);
                cpprb42.setEnabled(true);
                cpprb43.setEnabled(true);
                cpprb44.setEnabled(true);
                cpprb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                cpprb51.setEnabled(true);
                cpprb52.setEnabled(true);
                cpprb53.setEnabled(true);
                cpprb54.setEnabled(true);
                cpprb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                cpprb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}