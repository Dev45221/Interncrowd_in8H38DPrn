package com.example.yummyfoods.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yummyfoods.ItemSlider;
import com.example.yummyfoods.R;
import com.example.yummyfoods.SliderAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager2 homeViewPager;
    Handler sliderHandler = new Handler();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        homeViewPager = view.findViewById(R.id.homeViewPager);

        //preparing list of images
        List<ItemSlider> itemSliderList = new ArrayList<>();
        itemSliderList.add(new ItemSlider(R.drawable.burger));
        itemSliderList.add(new ItemSlider(R.drawable.chinese));
        itemSliderList.add(new ItemSlider(R.drawable.thali));
        itemSliderList.add(new ItemSlider(R.drawable.deesert));
        itemSliderList.add(new ItemSlider(R.drawable.burger));
        itemSliderList.add(new ItemSlider(R.drawable.chinese));
        itemSliderList.add(new ItemSlider(R.drawable.thali));
        itemSliderList.add(new ItemSlider(R.drawable.deesert));

        homeViewPager.setAdapter(new SliderAdapter(itemSliderList,homeViewPager));

        homeViewPager.setClipToPadding(false);
        homeViewPager.setClipChildren(false);
        homeViewPager.setOffscreenPageLimit(3);
        homeViewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        homeViewPager.setPageTransformer(compositePageTransformer);

        homeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable,1000);
            }
        });

        return view;
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            homeViewPager.setCurrentItem(homeViewPager.getCurrentItem() + 1);
        }
    };

}