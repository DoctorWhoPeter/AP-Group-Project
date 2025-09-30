package edu.univ.erp.domain;

public class Course {
    private String code;
    private String title;
    private int credits;
    private int capacity;

    public Course(String code, String title, int credits, int capacity, String instructorName) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
