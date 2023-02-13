package com.example.yummyfoods.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.yummyfoods.R;

public class MealFragment extends Fragment {

    CheckBox checkBurger, checkPizza, checkChinese, checkThali, checkDeesert;
    Button placeOrder;

    CartFragment cartFragment = new CartFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meal, container, false);

        checkBurger = view.findViewById(R.id.checkBurger);
        checkPizza = view.findViewById(R.id.checkPizza);
        checkChinese = view.findViewById(R.id.checkChinese);
        checkThali = view.findViewById(R.id.checkThali);
        checkDeesert = view.findViewById(R.id.checkDeesert);
        placeOrder = view.findViewById(R.id.placeOrder);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                int t = 0;

                if (checkBurger.isChecked()) {
                    s += "Veg Burger\n";
                    t += 30;
                }
                if (checkPizza.isChecked()) {
                    s += "Veg Pizza\n";
                    t += 89;
                }
                if (checkChinese.isChecked()) {
                    s += "Veg Chinese\n";
                    t += 60;
                }
                if (checkThali.isChecked()) {
                    s += "Veg Thali\n";
                    t += 250;
                }
                if (checkDeesert.isChecked()) {
                    s += "Deesert\n";
                    t += 50;
                }
                Toast.makeText(getContext(), "Your order has been placed.\nYou can track your order from 'My Cart'", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}