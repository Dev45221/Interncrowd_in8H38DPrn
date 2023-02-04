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

public class Current_Affair extends AppCompatActivity {

    RadioGroup carg1, carg2, carg3, carg4, carg5;
    RadioButton carb11,carb12,carb13,carb14;
    RadioButton carb21,carb22,carb23,carb24;
    RadioButton carb31,carb32,carb33,carb34;
    RadioButton carb41,carb42,carb43,carb44;
    RadioButton carb51,carb52,carb53,carb54;

    AlertDialog.Builder builder;

    TextView ca_result1, ca_clear_all, ca_result2;
    Button ca_submit;
    ProgressBar ca_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_affair);

        getSupportActionBar().setTitle("Current Affair Quiz");

        builder = new AlertDialog.Builder(this);

        ca_result1 = findViewById(R.id.ca_result1);
        ca_result2 = findViewById(R.id.ca_result2);
        ca_result1.setVisibility(View.INVISIBLE);
        ca_result2.setVisibility(View.INVISIBLE);

        carg1 = findViewById(R.id.carg1); carg2 = findViewById(R.id.carg2); carg3 = findViewById(R.id.carg3); carg4 = findViewById(R.id.carg4); carg5 = findViewById(R.id.carg5);
        carb11 = findViewById(R.id.carb11); carb12 = findViewById(R.id.carb12); carb13 = findViewById(R.id.carb13); carb14 = findViewById(R.id.carb14);
        carb21 = findViewById(R.id.carb21); carb22 = findViewById(R.id.carb22); carb23 = findViewById(R.id.carb23); carb24 = findViewById(R.id.carb24);
        carb31 = findViewById(R.id.carb31); carb32 = findViewById(R.id.carb32); carb33 = findViewById(R.id.carb33); carb34 = findViewById(R.id.carb34);
        carb41 = findViewById(R.id.carb41); carb42 = findViewById(R.id.carb42); carb43 = findViewById(R.id.carb43); carb44 = findViewById(R.id.carb44);
        carb51 = findViewById(R.id.carb51); carb52 = findViewById(R.id.carb52); carb53 = findViewById(R.id.carb53); carb54 = findViewById(R.id.carb54);

        ca_submit = findViewById(R.id.ca_submit);
        ca_clear_all = findViewById(R.id.ca_clear_all);
        ca_progress_bar = findViewById(R.id.ca_progress_bar);
        ca_progress_bar.setVisibility(View.INVISIBLE);

        ca_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = carg1.getCheckedRadioButtonId(), id2 = carg2.getCheckedRadioButtonId(),
                                        id3 = carg3.getCheckedRadioButtonId(), id4 = carg4.getCheckedRadioButtonId(),
                                        id5 = carg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 2
                                int num = 0;
                                int ans;
                                if (carb12.getId() == id1) {
                                    carb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    carb11.setEnabled(false);
                                    carb12.setEnabled(false);
                                    carb13.setEnabled(false);
                                    carb14.setEnabled(false);
                                }else {
                                    carb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb12.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb14.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    carb11.setEnabled(false);
                                    carb12.setEnabled(false);
                                    carb13.setEnabled(false);
                                    carb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 1
                                if (carb21.getId() == id2) {
                                    carb21.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    carb21.setEnabled(false);
                                    carb22.setEnabled(false);
                                    carb23.setEnabled(false);
                                    carb24.setEnabled(false);
                                }else {
                                    carb21.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb22.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num +=0;
                                    carb21.setEnabled(false);
                                    carb22.setEnabled(false);
                                    carb23.setEnabled(false);
                                    carb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 2
                                if (carb32.getId() == id3) {
                                    carb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb32.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb33.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    carb31.setEnabled(false);
                                    carb32.setEnabled(false);
                                    carb33.setEnabled(false);
                                    carb34.setEnabled(false);
                                }else {
                                    carb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb32.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb33.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    carb31.setEnabled(false);
                                    carb32.setEnabled(false);
                                    carb33.setEnabled(false);
                                    carb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 2
                                if (carb42.getId() == id4) {
                                    carb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb42.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    carb41.setEnabled(false);
                                    carb42.setEnabled(false);
                                    carb43.setEnabled(false);
                                    carb44.setEnabled(false);
                                }else {
                                    carb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb42.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    carb41.setEnabled(false);
                                    carb42.setEnabled(false);
                                    carb43.setEnabled(false);
                                    carb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 2
                                if (carb52.getId() == id5) {
                                    carb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb52.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    carb51.setEnabled(false);
                                    carb52.setEnabled(false);
                                    carb53.setEnabled(false);
                                    carb54.setEnabled(false);
                                }else {
                                    carb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb52.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    carb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    carb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    carb51.setEnabled(false);
                                    carb52.setEnabled(false);
                                    carb53.setEnabled(false);
                                    carb54.setEnabled(false);
                                }
                                ca_progress_bar.setVisibility(View.VISIBLE);
                                ca_result1.setVisibility(View.VISIBLE);
                                ca_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                ca_progress_bar.setMax(100);
                                ca_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    ca_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    ca_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    ca_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    ca_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    ca_result2.setText(ans + "%\n🤩");
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

        ca_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ca_result1.setVisibility(View.INVISIBLE);
                ca_result2.setVisibility(View.INVISIBLE);
                ca_progress_bar.setVisibility(View.INVISIBLE);
                carg1.clearCheck();
                carg2.clearCheck();
                carg3.clearCheck();
                carg4.clearCheck();
                carg5.clearCheck();
//                Ques 1
                carb11.setEnabled(true);
                carb12.setEnabled(true);
                carb13.setEnabled(true);
                carb14.setEnabled(true);
                carb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                carb21.setEnabled(true);
                carb22.setEnabled(true);
                carb23.setEnabled(true);
                carb24.setEnabled(true);
                carb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                carb31.setEnabled(true);
                carb32.setEnabled(true);
                carb33.setEnabled(true);
                carb34.setEnabled(true);
                carb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                carb41.setEnabled(true);
                carb42.setEnabled(true);
                carb43.setEnabled(true);
                carb44.setEnabled(true);
                carb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                carb51.setEnabled(true);
                carb52.setEnabled(true);
                carb53.setEnabled(true);
                carb54.setEnabled(true);
                carb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                carb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}