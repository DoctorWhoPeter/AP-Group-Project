package edu.univ.erp.domain;

public class Section {
    private int courseId;
    private int instructorId;
    private String dayTime;
    private String room;
    private int capacity;
    private String semester;
    private int year;

    public Section(int courseId,  int instructorId, String dayTime, String room, int capacity, String semester, int year) {
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.dayTime = dayTime;
        this.room = room;
        this.capacity = capacity;
        this.semester = semester;
        this.year = year;
    }

    public int getCourse_id() {
        return courseId;
    }

    public int getInstructor_id() {
        return instructorId;
    }

    public String getDay_time() {
        return dayTime;
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

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
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
