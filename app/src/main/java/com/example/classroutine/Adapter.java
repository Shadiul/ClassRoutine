package com.example.classroutine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View day_view = layoutInflater.inflate(R.layout.item, container, false);

        TextView class_1, time_1, room_1, class_2, time_2, room_2, class_3, time_3, room_3;

        class_1 = day_view.findViewById(R.id.class_1);
        time_1 = day_view.findViewById(R.id.time_1);
        room_1 = day_view.findViewById(R.id.room_1);
        class_2 = day_view.findViewById(R.id.class_2);
        time_2 = day_view.findViewById(R.id.time_2);
        room_2 = day_view.findViewById(R.id.room_2);
        class_3 = day_view.findViewById(R.id.class_3);
        time_3 = day_view.findViewById(R.id.time_3);
        room_3 = day_view.findViewById(R.id.room_3);

        class_1.setText(models.get(position).getClass_1());
        time_1.setText(models.get(position).getTime_1());
        room_1.setText(models.get(position).getRoom_1());
        class_2.setText(models.get(position).getClass_2());
        time_2.setText(models.get(position).getTime_2());
        room_2.setText(models.get(position).getRoom_2());
        class_3.setText(models.get(position).getClass_3());
        time_3.setText(models.get(position).getTime_3());
        room_3.setText(models.get(position).getRoom_3());

        container.addView(day_view, 0);

        return day_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
