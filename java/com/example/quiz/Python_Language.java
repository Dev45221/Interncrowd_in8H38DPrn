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

public class Python_Language extends AppCompatActivity {

    RadioGroup pyrg1, pyrg2, pyrg3, pyrg4, pyrg5;
    RadioButton pyrb11,pyrb12,pyrb13,pyrb14;
    RadioButton pyrb21,pyrb22,pyrb23,pyrb24;
    RadioButton pyrb31,pyrb32,pyrb33,pyrb34;
    RadioButton pyrb41,pyrb42,pyrb43,pyrb44;
    RadioButton pyrb51,pyrb52,pyrb53,pyrb54;

    AlertDialog.Builder builder;

    TextView py_result1, py_clear_all, py_result2;
    Button py_submit;
    ProgressBar py_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_language);

        getSupportActionBar().setTitle("Python Language Quiz");

        builder = new AlertDialog.Builder(this);

        py_result1 = findViewById(R.id.py_result1);
        py_result2 = findViewById(R.id.py_result2);
        py_result1.setVisibility(View.INVISIBLE);
        py_result2.setVisibility(View.INVISIBLE);

        pyrg1 = findViewById(R.id.pyrg1); pyrg2 = findViewById(R.id.pyrg2); pyrg3 = findViewById(R.id.pyrg3); pyrg4 = findViewById(R.id.pyrg4); pyrg5 = findViewById(R.id.pyrg5);
        pyrb11 = findViewById(R.id.pyrb11); pyrb12 = findViewById(R.id.pyrb12); pyrb13 = findViewById(R.id.pyrb13); pyrb14 = findViewById(R.id.pyrb14);
        pyrb21 = findViewById(R.id.pyrb21); pyrb22 = findViewById(R.id.pyrb22); pyrb23 = findViewById(R.id.pyrb23); pyrb24 = findViewById(R.id.pyrb24);
        pyrb31 = findViewById(R.id.pyrb31); pyrb32 = findViewById(R.id.pyrb32); pyrb33 = findViewById(R.id.pyrb33); pyrb34 = findViewById(R.id.pyrb34);
        pyrb41 = findViewById(R.id.pyrb41); pyrb42 = findViewById(R.id.pyrb42); pyrb43 = findViewById(R.id.pyrb43); pyrb44 = findViewById(R.id.pyrb44);
        pyrb51 = findViewById(R.id.pyrb51); pyrb52 = findViewById(R.id.pyrb52); pyrb53 = findViewById(R.id.pyrb53); pyrb54 = findViewById(R.id.pyrb54);

        py_submit = findViewById(R.id.py_submit);
        py_clear_all = findViewById(R.id.py_clear_all);
        py_progress_bar = findViewById(R.id.py_progress_bar);
        py_progress_bar.setVisibility(View.INVISIBLE);

        py_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = pyrg1.getCheckedRadioButtonId(), id2 = pyrg2.getCheckedRadioButtonId(),
                                        id3 = pyrg3.getCheckedRadioButtonId(), id4 = pyrg4.getCheckedRadioButtonId(),
                                        id5 = pyrg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 3
                                int num = 0;
                                int ans;
                                if (pyrb13.getId() == id1) {
                                    pyrb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb13.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    pyrb11.setEnabled(false);
                                    pyrb12.setEnabled(false);
                                    pyrb13.setEnabled(false);
                                    pyrb14.setEnabled(false);
                                }else {
                                    pyrb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb13.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    pyrb11.setEnabled(false);
                                    pyrb12.setEnabled(false);
                                    pyrb13.setEnabled(false);
                                    pyrb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 4
                                if (pyrb24.getId() == id2) {
                                    pyrb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    pyrb21.setEnabled(false);
                                    pyrb22.setEnabled(false);
                                    pyrb23.setEnabled(false);
                                    pyrb24.setEnabled(false);
                                }else {
                                    pyrb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num +=0;
                                    pyrb21.setEnabled(false);
                                    pyrb22.setEnabled(false);
                                    pyrb23.setEnabled(false);
                                    pyrb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 3
                                if (pyrb33.getId() == id3) {
                                    pyrb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    pyrb31.setEnabled(false);
                                    pyrb32.setEnabled(false);
                                    pyrb33.setEnabled(false);
                                    pyrb34.setEnabled(false);
                                }else {
                                    pyrb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    pyrb31.setEnabled(false);
                                    pyrb32.setEnabled(false);
                                    pyrb33.setEnabled(false);
                                    pyrb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 1
                                if (pyrb41.getId() == id4) {
                                    pyrb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    pyrb41.setEnabled(false);
                                    pyrb42.setEnabled(false);
                                    pyrb43.setEnabled(false);
                                    pyrb44.setEnabled(false);
                                }else {
                                    pyrb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    pyrb41.setEnabled(false);
                                    pyrb42.setEnabled(false);
                                    pyrb43.setEnabled(false);
                                    pyrb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 1
                                if (pyrb51.getId() == id5) {
                                    pyrb51.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    pyrb51.setEnabled(false);
                                    pyrb52.setEnabled(false);
                                    pyrb53.setEnabled(false);
                                    pyrb54.setEnabled(false);
                                }else {
                                    pyrb51.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    pyrb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    pyrb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    pyrb51.setEnabled(false);
                                    pyrb52.setEnabled(false);
                                    pyrb53.setEnabled(false);
                                    pyrb54.setEnabled(false);
                                }
                                py_progress_bar.setVisibility(View.VISIBLE);
                                py_result1.setVisibility(View.VISIBLE);
                                py_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                py_progress_bar.setMax(100);
                                py_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    py_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    py_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    py_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    py_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    py_result2.setText(ans + "%\n🤩");
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

        py_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                py_result1.setVisibility(View.INVISIBLE);
                py_result2.setVisibility(View.INVISIBLE);
                py_progress_bar.setVisibility(View.INVISIBLE);
                pyrg1.clearCheck();
                pyrg2.clearCheck();
                pyrg3.clearCheck();
                pyrg4.clearCheck();
                pyrg5.clearCheck();
//                Ques 1
                pyrb11.setEnabled(true);
                pyrb12.setEnabled(true);
                pyrb13.setEnabled(true);
                pyrb14.setEnabled(true);
                pyrb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                pyrb21.setEnabled(true);
                pyrb22.setEnabled(true);
                pyrb23.setEnabled(true);
                pyrb24.setEnabled(true);
                pyrb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                pyrb31.setEnabled(true);
                pyrb32.setEnabled(true);
                pyrb33.setEnabled(true);
                pyrb34.setEnabled(true);
                pyrb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                pyrb41.setEnabled(true);
                pyrb42.setEnabled(true);
                pyrb43.setEnabled(true);
                pyrb44.setEnabled(true);
                pyrb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                pyrb51.setEnabled(true);
                pyrb52.setEnabled(true);
                pyrb53.setEnabled(true);
                pyrb54.setEnabled(true);
                pyrb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                pyrb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}