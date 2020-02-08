package com.example.classroutine.ui.today;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.classroutine.Classes;
import com.example.classroutine.ClassesAdapter;
import com.example.classroutine.R;

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
                        "10:00 AM - 1:00 PM", "Web Engineering Lab", "PC-C",
                        "Zakia Sultana", "AB4 513"
                ));
                classesList.add(new Classes(
                        "4:00 PM - 5:30 PM", "Artificial Intelligence", "PC-C",
                        "Hasin Rehana", "AB4 305"
                ));

                break;

            case Calendar.MONDAY:

                day_name.setText("Monday");
                classesList.add(new Classes(
                        "1:00 PM - 2:30 PM", "Simulation and Modeling", "PC-C",
                        "Zarin Tasnim Shejuti", "AB4 201"
                ));
                classesList.add(new Classes(
                        "2:30 PM - 4:00 PM", "Web Engineering", "PC-C",
                        "Zakia Sultana", "AB4 305"
                ));

                break;

            case Calendar.TUESDAY:

                day_name.setText("Tuesday");
                classesList.add(new Classes(
                        "10:00 AM - 11:30 AM", "Artificial Intelligence", "PC-C",
                        "Hasin Rehana", "AB4 304"
                ));
                classesList.add(new Classes(
                        "11:30 AM - 1:00 PM", "Web Engineering", "PC-C",
                        "Zakia Sultana", "AB4 305"
                ));
                classesList.add(new Classes(
                        "1:00 PM - 4:00 PM", "Simulation and Modeling", "PC-C",
                        "Zarin Tasnim Shejuti", "AB4 305"
                ));

                break;

            case Calendar.WEDNESDAY:

                day_name.setText("Wednessday");
                break;

            case Calendar.THURSDAY:

                day_name.setText("Thursday");
                classesList.add(new Classes(
                        "11:30 AM - 2:30 PM", "Artificial Intelligence Lab", "PC-C",
                        "Hasin Rehana", "AB4 519"
                ));
                classesList.add(new Classes(
                        "2:30 PM - 5:30 PM", "Simulation and Modeling Lab", "PC-C",
                        "FH", "AB4 518"
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