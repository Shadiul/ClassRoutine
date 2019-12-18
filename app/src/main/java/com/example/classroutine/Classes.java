package com.example.classroutine;

public class Classes {
    private String time;
    private String subject;
    private String section;
    private String teacher;
    private String room_number;

    public Classes(String time, String subject, String section, String teacher, String room_number) {
        this.time = time;
        this.subject = subject;
        this.section = section;
        this.teacher = teacher;
        this.room_number = room_number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


}
