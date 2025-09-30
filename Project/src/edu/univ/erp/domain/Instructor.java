package edu.univ.erp.domain;

public class Instructor {
    public int userId;
    public int instructorId;
    public String department;

    public Instructor(int userId, int instructorId, String department) {
        this.userId = userId;
        this.instructorId = instructorId;
        this.department = department;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
