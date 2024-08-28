
package models;

import java.util.ArrayList;

public class University {

    private ArrayList teachers,courseEnrollments, attendances, courses;
    private ArrayList<StudentModel> students;
    public University()
    {
        students = new ArrayList();
        courses = new ArrayList();
        teachers = new ArrayList();
        courseEnrollments = new ArrayList();
        attendances = new ArrayList();
    }
    public void addStudent(StudentModel student){
        students.add(student);
    }
    public boolean removeStudent(String studentName)
    {
        return students.removeIf(r->r.getStudentName().equals(studentName));
    }
    public StudentModel searchStudent(StudentModel student)
    {
        return student;
    }
    public ArrayList<StudentModel> displayStudents()
    {
       return students;
    }
    public void addCourse()
    {
        
    }
    public void removeCourse()
    {
        
    }
    public Course searchCourse(Course course)
    {
        return course;
    }
    public void displayCourses()
    {
        
    }
    public void addTeacher()
    {
        
    }
    public void removeTeacher()
    {
        
    }
    public Teacher searchTeacher(Teacher teacher)
    {
        return teacher;
    }
    public void displayTeacher()
    {
        
    }
    public void addCourseEnrollment()
    {
        
    }
    public void removeCourseEnrollment()
    {
      
    }
    public void searchCourseEnrollment()
    {
        
    }
    public void displayCourseEnrollment()
    {
        
    }
    
    public void takeAttendance()
    {
        
    }
    public void removeAttendance()
    {
        
    }
    public void searchAttendance()
    {
        
    }
    public void displayAttendance()
    {
        
    }
}
