package models;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Enrollment {
    private Long id;
    private String studentName;
    private DateTimeAtCreation enrollmentDate;
    private boolean state;


    public Enrollment(Long id, String studentName, DateTimeAtCreation enrollmentDate, boolean state) {
        this.id = id;
        this.studentName = studentName;
        this.enrollmentDate = enrollmentDate;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public DateTimeAtCreation getEnrollmentDate() {
        return enrollmentDate;
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

    public void setEnrollmentDate(DateTimeAtCreation enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", state=" + state +
                '}';
    }
}
