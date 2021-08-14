package com.example.uas_10118328;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

/*      TANGGAL PENGERJAAN : JUMAT, 8 AGUSTUS 2021
        NIM : 10118328
        NAMA : MUHAMMAD RAFI AVISINA
        KELAS : IF-8*/

public class SlidePagerAdapter extends PagerAdapter {
    private Context context;
    private int[]images = new int[]{R.drawable.tantang_uas, R.drawable.bandung, R.drawable.bandung2, R.drawable.bandung3};
    SlidePagerAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(images[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}

