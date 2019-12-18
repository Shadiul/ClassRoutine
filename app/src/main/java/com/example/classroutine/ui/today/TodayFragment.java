package com.example.classroutine.ui.today;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.classroutine.Classes;
import com.example.classroutine.ClassesAdapter;
import com.example.classroutine.R;
import com.example.classroutine.ui.slideshow.SlideshowViewModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TodayFragment extends Fragment {

    RecyclerView recyclerView;
    ClassesAdapter adapter_classes;
    List<Classes> classesList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_today, container, false);
        TextView day_name = root.findViewById(R.id.today);

        classesList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SATURDAY:
                day_name.setText("Saturday");
                break;

            case Calendar.SUNDAY:

                day_name.setText("Sunday");
                classesList.add(new Classes(
                        "1:00 PM - 2:30 PM", "Compiler Design", "PC-D",
                        "Mushfiqur Rahaman", "AB4 515"
                ));
                classesList.add(new Classes(
                        "4:00 PM - 5:30 PM", "Wireless Programming", "PC-D",
                        "Abdullah Mamud Ibn Ubaidullah", "AB1 303"
                ));

                break;

            case Calendar.MONDAY:

                day_name.setText("Monday");
                classesList.add(new Classes(
                        "11:30 AM - 2:30 PM", "Compiler Desig Lab", "PC-D",
                        "Mushfiqur Rahaman", "AB1 302"
                ));

                break;

            case Calendar.TUESDAY:

                day_name.setText("Tuesday");
                classesList.add(new Classes(
                        "1:00 PM - 2:30 PM", "Software Engineering", "PC-D",
                        "Fatema Tuj Johora", "AB4 514"
                ));
                classesList.add(new Classes(
                        "2:30 PM - 4:00 PM", "Financial & Managerial Accounting", "PC-D",
                        "Md. Muktadir Hossain", "AB4 203"
                ));

                break;

            case Calendar.WEDNESDAY:

                day_name.setText("Wednessday");
                classesList.add(new Classes(
                        "10:00 AM - 11:30 AM", "Software Engineering", "PC-D",
                        "Fatema Tuj Johora", "AB4 514"
                ));
                classesList.add(new Classes(
                        "2:30 PM - 4:00 PM", "Compiler Design", "PC-D",
                        "Mushfiqur Rahaman", "AB1 306"
                ));

                break;

            case Calendar.THURSDAY:

                day_name.setText("Thursday");
                classesList.add(new Classes(
                        "10:00 AM - 11:30 AM", "Wireless Programming", "PC-D",
                        "Abdullah Mamud Ibn Ubaidullah", "AB1 303"
                ));

                break;
            case Calendar.FRIDAY:
                day_name.setText("Friday");
                break;
        }

        adapter_classes = new ClassesAdapter(getActivity(), classesList);
        recyclerView.setAdapter(adapter_classes);

        return root;
    }

}