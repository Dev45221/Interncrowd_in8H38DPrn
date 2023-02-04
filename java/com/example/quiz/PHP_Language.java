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

public class PHP_Language extends AppCompatActivity {

    RadioGroup phprg1, phprg2, phprg3, phprg4, phprg5;
    RadioButton phprb11,phprb12,phprb13,phprb14;
    RadioButton phprb21,phprb22,phprb23,phprb24;
    RadioButton phprb31,phprb32,phprb33,phprb34;
    RadioButton phprb41,phprb42,phprb43,phprb44;
    RadioButton phprb51,phprb52,phprb53,phprb54;

    AlertDialog.Builder builder;

    TextView php_result1, php_clear_all, php_result2;
    Button php_submit;
    ProgressBar php_progress_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_language);

        getSupportActionBar().setTitle("PHP Language Quiz");

        builder = new AlertDialog.Builder(this);

        php_result1 = findViewById(R.id.php_result1);
        php_result2 = findViewById(R.id.php_result2);
        php_result1.setVisibility(View.INVISIBLE);
        php_result2.setVisibility(View.INVISIBLE);

        phprg1 = findViewById(R.id.phprg1); phprg2 = findViewById(R.id.phprg2); phprg3 = findViewById(R.id.phprg3); phprg4 = findViewById(R.id.phprg4); phprg5 = findViewById(R.id.phprg5);
        phprb11 = findViewById(R.id.phprb11); phprb12 = findViewById(R.id.phprb12); phprb13 = findViewById(R.id.phprb13); phprb14 = findViewById(R.id.phprb14);
        phprb21 = findViewById(R.id.phprb21); phprb22 = findViewById(R.id.phprb22); phprb23 = findViewById(R.id.phprb23); phprb24 = findViewById(R.id.phprb24);
        phprb31 = findViewById(R.id.phprb31); phprb32 = findViewById(R.id.phprb32); phprb33 = findViewById(R.id.phprb33); phprb34 = findViewById(R.id.phprb34);
        phprb41 = findViewById(R.id.phprb41); phprb42 = findViewById(R.id.phprb42); phprb43 = findViewById(R.id.phprb43); phprb44 = findViewById(R.id.phprb44);
        phprb51 = findViewById(R.id.phprb51); phprb52 = findViewById(R.id.phprb52); phprb53 = findViewById(R.id.phprb53); phprb54 = findViewById(R.id.phprb54);

        php_submit = findViewById(R.id.php_submit);
        php_clear_all = findViewById(R.id.php_clear_all);
        php_progress_bar = findViewById(R.id.php_progress_bar);
        php_progress_bar.setVisibility(View.INVISIBLE);

        php_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Are you want to sure to submit quiz?").setCancelable(false).
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                int id1 = phprg1.getCheckedRadioButtonId(), id2 = phprg2.getCheckedRadioButtonId(),
                                        id3 = phprg3.getCheckedRadioButtonId(), id4 = phprg4.getCheckedRadioButtonId(),
                                        id5 = phprg5.getCheckedRadioButtonId();
                                //                                Ques 1 ans 4
                                int num = 0;
                                int ans;
                                if (phprb14.getId() == id1) {
                                    phprb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 5;
                                    phprb11.setEnabled(false);
                                    phprb12.setEnabled(false);
                                    phprb13.setEnabled(false);
                                    phprb14.setEnabled(false);
                                }else {
                                    phprb11.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb12.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb13.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb14.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    num += 0;
                                    phprb11.setEnabled(false);
                                    phprb12.setEnabled(false);
                                    phprb13.setEnabled(false);
                                    phprb14.setEnabled(false);
                                }

                                //                                Ques 2 ans 2
                                if (phprb22.getId() == id2) {
                                    phprb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb22.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    phprb21.setEnabled(false);
                                    phprb22.setEnabled(false);
                                    phprb23.setEnabled(false);
                                    phprb24.setEnabled(false);
                                }else {
                                    phprb21.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb22.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb23.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb24.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num +=0;
                                    phprb21.setEnabled(false);
                                    phprb22.setEnabled(false);
                                    phprb23.setEnabled(false);
                                    phprb24.setEnabled(false);
                                }

                                //                                Ques 3 ans 3
                                if (phprb33.getId() == id3) {
                                    phprb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    phprb31.setEnabled(false);
                                    phprb32.setEnabled(false);
                                    phprb33.setEnabled(false);
                                    phprb34.setEnabled(false);
                                }else {
                                    phprb31.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb32.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb33.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb34.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    phprb31.setEnabled(false);
                                    phprb32.setEnabled(false);
                                    phprb33.setEnabled(false);
                                    phprb34.setEnabled(false);
                                }

                                //                                Ques 4 ans 1
                                if (phprb41.getId() == id4) {
                                    phprb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    phprb41.setEnabled(false);
                                    phprb42.setEnabled(false);
                                    phprb43.setEnabled(false);
                                    phprb44.setEnabled(false);
                                }else {
                                    phprb41.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb42.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb43.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb44.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    phprb41.setEnabled(false);
                                    phprb42.setEnabled(false);
                                    phprb43.setEnabled(false);
                                    phprb44.setEnabled(false);
                                }

                                //                                Ques 5 ans 3
                                if (phprb53.getId() == id5) {
                                    phprb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb53.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 5;
                                    phprb51.setEnabled(false);
                                    phprb52.setEnabled(false);
                                    phprb53.setEnabled(false);
                                    phprb54.setEnabled(false);
                                }else {
                                    phprb51.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb52.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    phprb53.setBackgroundColor(Color.parseColor("#A1A5DF00"));
                                    phprb54.setBackgroundColor(Color.parseColor("#A3DF0101"));
                                    num += 0;
                                    phprb51.setEnabled(false);
                                    phprb52.setEnabled(false);
                                    phprb53.setEnabled(false);
                                    phprb54.setEnabled(false);
                                }
                                php_progress_bar.setVisibility(View.VISIBLE);
                                php_result1.setVisibility(View.VISIBLE);
                                php_result2.setVisibility(View.VISIBLE);
//                                c_result2.setText(num + "/15");
                                ans = (num*100)/25;
                                php_progress_bar.setMax(100);
                                php_progress_bar.setProgress(ans);
                                if(ans==0 || ans<=15) {
                                    php_result2.setText(ans + "%\n😔");
                                }else if(ans>=16 || ans<=32) {
                                    php_result2.setText(ans + "%\n😊");
                                }else if(ans>=33 || ans<=65) {
                                    php_result2.setText(ans + "%\n😁");
                                }else if(ans>=66 || ans<=90) {
                                    php_result2.setText(ans + "%\n😉");
                                }else if(ans>=91 || ans<=100) {
                                    php_result2.setText(ans + "%\n🤩");
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

        php_clear_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                php_result1.setVisibility(View.INVISIBLE);
                php_result2.setVisibility(View.INVISIBLE);
                php_progress_bar.setVisibility(View.INVISIBLE);
                phprg1.clearCheck();
                phprg2.clearCheck();
                phprg3.clearCheck();
                phprg4.clearCheck();
                phprg5.clearCheck();
//                Ques 1
                phprb11.setEnabled(true);
                phprb12.setEnabled(true);
                phprb13.setEnabled(true);
                phprb14.setEnabled(true);
                phprb11.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb12.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb13.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb14.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 2
                phprb21.setEnabled(true);
                phprb22.setEnabled(true);
                phprb23.setEnabled(true);
                phprb24.setEnabled(true);
                phprb21.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb22.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb23.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb24.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 3
                phprb31.setEnabled(true);
                phprb32.setEnabled(true);
                phprb33.setEnabled(true);
                phprb34.setEnabled(true);
                phprb31.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb32.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb33.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb34.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 4
                phprb41.setEnabled(true);
                phprb42.setEnabled(true);
                phprb43.setEnabled(true);
                phprb44.setEnabled(true);
                phprb41.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb42.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb43.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb44.setBackgroundColor(Color.parseColor("#002B4B5C"));
//                Ques 5
                phprb51.setEnabled(true);
                phprb52.setEnabled(true);
                phprb53.setEnabled(true);
                phprb54.setEnabled(true);
                phprb51.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb52.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb53.setBackgroundColor(Color.parseColor("#002B4B5C"));
                phprb54.setBackgroundColor(Color.parseColor("#002B4B5C"));
            }
        });

    }
}