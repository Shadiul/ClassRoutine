package com.example.classroutine;

import androidx.cardview.widget.CardView;

public class Model {

    private String class_1;
    private String time_1;
    private String room_1;
    private String class_2;
    private String time_2;
    private String room_2;

    public Model( String class_1, String time_1, String room_1, String class_2, String time_2, String room_2) {
        this.class_1 = class_1;
        this.time_1 = time_1;
        this.room_1 = room_1;
        this.class_2 = class_2;
        this.time_2 = time_2;
        this.room_2 = room_2;
    }


    public String getClass_1() {
        return class_1;
    }

    public void setClass_1(String class_1) {
        this.class_1 = class_1;
    }

    public String getTime_1() {
        return time_1;
    }

    public void setTime_1(String time_1) {
        this.time_1 = time_1;
    }

    public String getRoom_1() {
        return room_1;
    }

    public void setRoom_1(String room_1) {
        this.room_1 = room_1;
    }

    public String getClass_2() {
        return class_2;
    }

    public void setClass_2(String class_2) {
        this.class_2 = class_2;
    }

    public String getTime_2() {
        return time_2;
    }

    public void setTime_2(String time_2) {
        this.time_2 = time_2;
    }

    public String getRoom_2() {
        return room_2;
    }

    public void setRoom_2(String room_2) {
        this.room_2 = room_2;
    }
}
