
package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class CourseEnrollment {
    private LocalDate date;
    private LocalTime time;
    private int courseCode;
    private int studentId;

    public CourseEnrollment(LocalDate date, LocalTime time, int courseCode, int studentId) {
        this.date = date;
        this.time = time;
        this.courseCode = courseCode;
        this.studentId = studentId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
