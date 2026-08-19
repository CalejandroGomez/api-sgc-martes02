package models;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Enrollement {
    private Long id;
    private String studentName;
    private DateTimeAtCreation enrollementDate;
    private boolean state;


    public Enrollement(Long id, String studentName, DateTimeAtCreation enrollementDate, boolean state) {
        this.id = id;
        this.studentName = studentName;
        this.enrollementDate = enrollementDate;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public DateTimeAtCreation getEnrollementDate() {
        return enrollementDate;
    }

    public boolean isState() {
        return state;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEnrollementDate(DateTimeAtCreation enrollementDate) {
        this.enrollementDate = enrollementDate;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
