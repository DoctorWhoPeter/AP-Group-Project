package edu.univ.erp.domain;

public class Section {
    private int course_id;
    private int instructor_id;
    private String day_time;
    private String room;
    private int capacity;
    private String semester;
    private int year;

    public Section(int course_id,  int instructor_id, String day_time, String room, int capacity, String semester, int year) {
        this.course_id = course_id;
        this.instructor_id = instructor_id;
        this.day_time = day_time;
        this.room = room;
        this.capacity = capacity;
        this.semester = semester;
        this.year = year;
    }

    public int getCourse_id() {
        return course_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public String getDay_time() {
        return day_time;
    }

    public String getRoom() {
        return room;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public void setDay_time(String day_time) {
        this.day_time = day_time;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
