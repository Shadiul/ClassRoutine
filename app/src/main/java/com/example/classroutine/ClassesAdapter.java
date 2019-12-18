package com.example.classroutine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClassesAdapter extends RecyclerView.Adapter<ClassesAdapter.ClassesViewolder> {

    private Context context;
    private List<Classes> classesList;

    public ClassesAdapter(Context context, List<Classes> classesList) {
        this.context = context;
        this.classesList = classesList;
    }

    @NonNull
    @Override
    public ClassesViewolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.classes, null);
        ClassesViewolder holder = new ClassesViewolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassesViewolder holder, int position) {
        Classes classes = classesList.get(position);

        holder.time.setText(classes.getTime());
        holder.subject.setText(classes.getSubject());
        holder.section.setText(classes.getSection());
        holder.teacer.setText(classes.getTeacher());
        holder.romm_number.setText(classes.getRoom_number());

    }

    @Override
    public int getItemCount() {
        return classesList.size();
    }

    class ClassesViewolder extends RecyclerView.ViewHolder{

        TextView time, subject, section, teacer, romm_number;

        public ClassesViewolder(@NonNull View itemView) {
            super(itemView);

            time = itemView.findViewById(R.id.class_time);
            subject = itemView.findViewById(R.id.subject);
            section = itemView.findViewById(R.id.section);
            teacer = itemView.findViewById(R.id.teacher);
            romm_number = itemView.findViewById(R.id.room_number);
        }
    }
}
