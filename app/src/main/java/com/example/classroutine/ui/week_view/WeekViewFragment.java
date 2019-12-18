package com.example.classroutine.ui.week_view;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.classroutine.Adapter;
import com.example.classroutine.Model;
import com.example.classroutine.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WeekViewFragment extends Fragment {

    private WeekViewViewModel weekViewViewModel;

    ViewPager viewPager;
    Adapter adapter_days;
    List<Model> days;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        weekViewViewModel =
                ViewModelProviders.of(this).get(WeekViewViewModel.class);
        View root = inflater.inflate(R.layout.fragment_week_view, container, false);
        final TextView textView = root.findViewById(R.id.text_title);

        days = new ArrayList<>();

        days.add(new Model(
                null, null, null,
                null, null, null
        ));
        days.add(new Model(
                "Compiler Design", "1:00 PM - 2:30 PM", "AB4 515",
                "Wireless Programming", "4:00 PM - 5:30 PM", "AB1 303"
        ));
        days.add(new Model(
                "Compiler Design Lab", "11:30 AM - 2:30 PM", "AB4 515",
                null, null, null
        ));
        days.add(new Model(
                "Software Engineering", "1:00 PM - 2:30 PM", "AB4 514",
                "Financial & Managerial Accountig", "2:30 PM - 4:00 PM", "AB4 203"
        ));
        days.add(new Model(
                "Software Engineering", "10:00 AM - 11:30 AM", "AB4 514",
                "Compiler Design", "2:30 PM - 4:00 PM", "AB1 306"
        ));
        days.add(new Model(
                "Wireless Programming", "10:00 AM - 11:30 AM", "AB1 303",
                null, null, null
        ));
        days.add(new Model(
                null, null, null,
                null, null, null
        ));

        adapter_days = new Adapter(days, getActivity());
        viewPager = root.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter_days);
        viewPager.setPadding(130, 0, 130, 0);


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        viewPager.setCurrentItem(day);


        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position == 0) {
                    textView.setText("Satarday");
                } else if (position == 1) {
                    textView.setText("Sunday");
                } else if (position == 2) {
                    textView.setText("Monday");
                } else if (position == 3) {
                    textView.setText("Tuesday");
                } else if (position == 4) {
                    textView.setText("Wednessday");
                } else if (position == 5) {
                    textView.setText("Thursday");
                } else if (position == 6) {
                    textView.setText("Friday");
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        weekViewViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }


}