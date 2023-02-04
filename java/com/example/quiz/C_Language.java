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

public class C_Language extends AppCompatActivity {

    RadioGroup crg1, crg2, crg3, crg4, crg5;
    RadioButton crb11,crb12,crb13,crb14;
    RadioButton crb21,crb22,crb23,crb24;
    RadioButton crb31,crb32,crb33,crb34;
    RadioButton crb41,crb42,crb43,crb44;
    RadioButton crb51,crb52,crb53,crb54;

    AlertDialog.Builder builder;

    TextView c_result1, c_clear_all, c_result2;
    Button c_submit;
    ProgressBar c_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);

        getSupportActionBar().setTitle("C Language Quiz");

        builder = new AlertDialog.Builder(this);

        c_result1 = findViewById(R.id.c_result1);
        c_result2 = findViewById(R.id.c_result2);
        c_result1.setVisibility(View.INVISIBLE);
        c_result2.setVisibility(View.INVISIBLE);

        crg1 = findViewById(R.id.crg1); crg2 = findViewById(R.id.crg2); crg3 = findViewById(R.id.crg3); crg4 = findViewById(R.id.crg4); crg5 = findViewById(R.id.crg5);
        crb11 = findViewById(R.id.crb11); crb12 = findViewById(R.id.crb12); crb13 = findViewById(R.id.crb13); crb14 = findViewById(R.id.crb14);
        crb21 = findViewById(R.id.crb21); crb22 = findViewById(R.id.crb22); crb23 = findViewById(R.id.crb23); crb24 = findViewById(R.id.crb24);
        crb31 = findViewById(R.id.crb31); crb32 = findViewById(R.id.crb32); crb33 = findViewById(R.id.crb33); crb34 = findViewById(R.id.crb34);
        crb41 = findViewById(R.id.crb41); crb42 = findViewById(R.id.crb42); crb43 = findViewById(R.id.crb43); crb44 = findViewById(R.id.crb44);
        crb51 = findViewById(R.id.crb51); crb52 = findViewById(R.id.crb52); crb53 = findViewById(R.id.crb53); crb54 = findViewById(R.id.crb54);

        c_submit = findViewById(R.id.c_submit);
        c_clear_all = findViewById(R.id.c_clear_all);
        c_progress_bar = findViewById(R.id.c_progress_bar);
        c_progress_bar.setVisibility(View.INVISIBLE);

        c_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = crg1.getCheckedRadioButtonId(), id2 = crg2.getCheckedRadioButtonId(),
                                        id3 = crg3.getCheckedRadioButtonId(), id4 = crg4.getCheckedRadioButtonId(),
                                        id5 = crg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 2
                                int num = 0;
                                int ans;
                                if (crb12.getId() == id1) {
                                    crb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    crb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    crb11.setEnabled(false);
                                    crb12.setEnabled(false);
                                    crb13.setEnabled(false);
                                    crb14.setEnabled(false);
                                }else {
                                    crb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    crb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    crb11.setEnabled(false);
                                    crb12.setEnabled(false);
                                    crb13.setEnabled(false);
                                    crb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 4
                                if (crb24.getId() == id2) {
                                    crb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    crb21.setEnabled(false);
                                    crb22.setEnabled(false);
                                    crb23.setEnabled(false);
                                    crb24.setEnabled(false);
                                }else {
                                    crb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb24.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num +=0;
                                    crb21.setEnabled(false);
                                    crb22.setEnabled(false);
                                    crb23.setEnabled(false);
                                    crb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 1
                                if (crb31.getId() == id3) {
                                    crb31.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    crb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb33.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    crb31.setEnabled(false);
                                    crb32.setEnabled(false);
                                    crb33.setEnabled(false);
                                    crb34.setEnabled(false);
                                }else {
                                    crb31.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    crb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb33.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    crb31.setEnabled(false);
                                    crb32.setEnabled(false);
                                    crb33.setEnabled(false);
                                    crb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 4
                                if (crb44.getId() == id4) {
                                    crb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb44.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    crb41.setEnabled(false);
                                    crb42.setEnabled(false);
                                    crb43.setEnabled(false);
                                    crb44.setEnabled(false);
                                }else {
                                    crb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb44.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    crb41.setEnabled(false);
                                    crb42.setEnabled(false);
                                    crb43.setEnabled(false);
                                    crb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 4
                                if (crb54.getId() == id5) {
                                    crb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb54.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    crb51.setEnabled(false);
                                    crb52.setEnabled(false);
                                    crb53.setEnabled(false);
                                    crb54.setEnabled(false);
                                }else {
                                    crb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    crb54.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    crb51.setEnabled(false);
                                    crb52.setEnabled(false);
                                    crb53.setEnabled(false);
                                    crb54.setEnabled(false);
                                }
                                c_progress_bar.setVisibility(View.VISIBLE);
                                c_result1.setVisibility(View.VISIBLE);
                                c_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                c_progress_bar.setMax(100);
                                c_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    c_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    c_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    c_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    c_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    c_result2.setText(ans + "%\n🤩");
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

        c_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c_result1.setVisibility(View.INVISIBLE);
                c_result2.setVisibility(View.INVISIBLE);
                c_progress_bar.setVisibility(View.INVISIBLE);
                crg1.clearCheck();
                crg2.clearCheck();
                crg3.clearCheck();
                crg4.clearCheck();
                crg5.clearCheck();
//                Ques 1
                crb11.setEnabled(true);
                crb12.setEnabled(true);
                crb13.setEnabled(true);
                crb14.setEnabled(true);
                crb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                crb21.setEnabled(true);
                crb22.setEnabled(true);
                crb23.setEnabled(true);
                crb24.setEnabled(true);
                crb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                crb31.setEnabled(true);
                crb32.setEnabled(true);
                crb33.setEnabled(true);
                crb34.setEnabled(true);
                crb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                crb41.setEnabled(true);
                crb42.setEnabled(true);
                crb43.setEnabled(true);
                crb44.setEnabled(true);
                crb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                crb51.setEnabled(true);
                crb52.setEnabled(true);
                crb53.setEnabled(true);
                crb54.setEnabled(true);
                crb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                crb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });
    }
}