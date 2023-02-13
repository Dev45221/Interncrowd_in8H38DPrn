package com.example.yummyfoods.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.yummyfoods.R;
import com.example.yummyfoods.databinding.ActivityDashboardBinding;
import com.example.yummyfoods.fragments.CartFragment;
import com.example.yummyfoods.fragments.HomeFragment;
import com.example.yummyfoods.fragments.MealFragment;
import com.google.android.material.navigation.NavigationBarView;

public class Dashboard extends AppCompatActivity {

    ActivityDashboardBinding binding;

    HomeFragment homeFragment = new HomeFragment();
    MealFragment mealFragment = new MealFragment();
    CartFragment cartFragment = new CartFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,homeFragment).commit();

        binding.navmenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,homeFragment).commit();
                        return true;
                    case R.id.nav_meal:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,mealFragment).commit();
                        return true;
                    case R.id.nav_cart:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,cartFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}