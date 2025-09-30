package edu.univ.erp.domain;

public class Student {
    private int userId;
    private int rollNo;
    private String programName;
    private int year;

    public Student(int userId, int rollNo, String programName, int year) {
        this.userId = userId;
        this.rollNo = rollNo;
        this.programName = programName;
        this.year = year;
    }

    public int getUserId() {
        return userId;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getProgramName() {
        return programName;
    }

    public int getYear() {
        return year;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
