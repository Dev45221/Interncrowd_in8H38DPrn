package com.example.yummyfoods;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<ItemSlider> itemSliderList;
    private ViewPager2 viewPager2;

    public SliderAdapter(List<ItemSlider> itemSliderList, ViewPager2 viewPager2) {
        this.itemSliderList = itemSliderList;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(itemSliderList.get(position));
        if (position == itemSliderList.size() - 2) {
            viewPager2.post(runnable);
        }
    }

    @Override
    public int getItemCount() {
        return itemSliderList.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView imageView;

        public SliderViewHolder(@Nullable View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSlide);
        }
        void setImage(ItemSlider itemSlider) {
            imageView.setImageResource(itemSlider.getImage());
        }
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            itemSliderList.addAll(itemSliderList);
            notifyDataSetChanged();
        }
    };

}
