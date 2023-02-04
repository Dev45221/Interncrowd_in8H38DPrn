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

public class Geography extends AppCompatActivity {

    RadioGroup georg1, georg2, georg3, georg4, georg5;
    RadioButton georb11,georb12,georb13,georb14;
    RadioButton georb21,georb22,georb23,georb24;
    RadioButton georb31,georb32,georb33,georb34;
    RadioButton georb41,georb42,georb43,georb44;
    RadioButton georb51,georb52,georb53,georb54;

    AlertDialog.Builder builder;

    TextView geo_result1, geo_clear_all, geo_result2;
    Button geo_submit;
    ProgressBar geo_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        getSupportActionBar().setTitle("Geography Quiz");

        builder = new AlertDialog.Builder(this);

        geo_result1 = findViewById(R.id.geo_result1);
        geo_result2 = findViewById(R.id.geo_result2);
        geo_result1.setVisibility(View.INVISIBLE);
        geo_result2.setVisibility(View.INVISIBLE);

        georg1 = findViewById(R.id.georg1); georg2 = findViewById(R.id.georg2); georg3 = findViewById(R.id.georg3); georg4 = findViewById(R.id.georg4); georg5 = findViewById(R.id.georg5);
        georb11 = findViewById(R.id.grb11); georb12 = findViewById(R.id.grb12); georb13 = findViewById(R.id.grb13); georb14 = findViewById(R.id.grb14);
        georb21 = findViewById(R.id.grb21); georb22 = findViewById(R.id.grb22); georb23 = findViewById(R.id.grb23); georb24 = findViewById(R.id.grb24);
        georb31 = findViewById(R.id.grb31); georb32 = findViewById(R.id.grb32); georb33 = findViewById(R.id.grb33); georb34 = findViewById(R.id.grb34);
        georb41 = findViewById(R.id.grb41); georb42 = findViewById(R.id.grb42); georb43 = findViewById(R.id.grb43); georb44 = findViewById(R.id.grb44);
        georb51 = findViewById(R.id.grb51); georb52 = findViewById(R.id.grb52); georb53 = findViewById(R.id.grb53); georb54 = findViewById(R.id.grb54);

        geo_submit = findViewById(R.id.geo_submit);
        geo_clear_all = findViewById(R.id.geo_clear_all);
        geo_progress_bar = findViewById(R.id.geo_progress_bar);
        geo_progress_bar.setVisibility(View.INVISIBLE);

        geo_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = georg1.getCheckedRadioButtonId(), id2 = georg2.getCheckedRadioButtonId(),
                                        id3 = georg3.getCheckedRadioButtonId(), id4 = georg4.getCheckedRadioButtonId(),
                                        id5 = georg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 4
                                int num = 0;
                                int ans;
                                if (georb14.getId() == id1) {
                                    georb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    georb11.setEnabled(false);
                                    georb12.setEnabled(false);
                                    georb13.setEnabled(false);
                                    georb14.setEnabled(false);
                                }else {
                                    georb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    georb11.setEnabled(false);
                                    georb12.setEnabled(false);
                                    georb13.setEnabled(false);
                                    georb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 2
                                if (georb22.getId() == id2) {
                                    georb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb22.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    georb21.setEnabled(false);
                                    georb22.setEnabled(false);
                                    georb23.setEnabled(false);
                                    georb24.setEnabled(false);
                                }else {
                                    georb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb22.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num +=0;
                                    georb21.setEnabled(false);
                                    georb22.setEnabled(false);
                                    georb23.setEnabled(false);
                                    georb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 3
                                if (georb33.getId() == id3) {
                                    georb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    georb31.setEnabled(false);
                                    georb32.setEnabled(false);
                                    georb33.setEnabled(false);
                                    georb34.setEnabled(false);
                                }else {
                                    georb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    georb31.setEnabled(false);
                                    georb32.setEnabled(false);
                                    georb33.setEnabled(false);
                                    georb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 3
                                if (georb43.getId() == id4) {
                                    georb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb43.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    georb41.setEnabled(false);
                                    georb42.setEnabled(false);
                                    georb43.setEnabled(false);
                                    georb44.setEnabled(false);
                                }else {
                                    georb41.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb43.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    georb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    georb41.setEnabled(false);
                                    georb42.setEnabled(false);
                                    georb43.setEnabled(false);
                                    georb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 4
                                if (georb54.getId() == id5) {
                                    georb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb54.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    georb51.setEnabled(false);
                                    georb52.setEnabled(false);
                                    georb53.setEnabled(false);
                                    georb54.setEnabled(false);
                                }else {
                                    georb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb53.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    georb54.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    georb51.setEnabled(false);
                                    georb52.setEnabled(false);
                                    georb53.setEnabled(false);
                                    georb54.setEnabled(false);
                                }
                                geo_progress_bar.setVisibility(View.VISIBLE);
                                geo_result1.setVisibility(View.VISIBLE);
                                geo_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                geo_progress_bar.setMax(100);
                                geo_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    geo_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    geo_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    geo_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    geo_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    geo_result2.setText(ans + "%\n🤩");
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

        geo_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geo_result1.setVisibility(View.INVISIBLE);
                geo_result2.setVisibility(View.INVISIBLE);
                geo_progress_bar.setVisibility(View.INVISIBLE);
                georg1.clearCheck();
                georg2.clearCheck();
                georg3.clearCheck();
                georg4.clearCheck();
                georg5.clearCheck();
//                Ques 1
                georb11.setEnabled(true);
                georb12.setEnabled(true);
                georb13.setEnabled(true);
                georb14.setEnabled(true);
                georb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                georb21.setEnabled(true);
                georb22.setEnabled(true);
                georb23.setEnabled(true);
                georb24.setEnabled(true);
                georb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                georb31.setEnabled(true);
                georb32.setEnabled(true);
                georb33.setEnabled(true);
                georb34.setEnabled(true);
                georb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                georb41.setEnabled(true);
                georb42.setEnabled(true);
                georb43.setEnabled(true);
                georb44.setEnabled(true);
                georb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                georb51.setEnabled(true);
                georb52.setEnabled(true);
                georb53.setEnabled(true);
                georb54.setEnabled(true);
                georb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                georb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}