
package models;

public class StudentModel {
    private String studentName, studentAddress, studentEmail, studentPhoneNumber;
    private int studentId;

    public StudentModel() {
        this("", "", "", "", 0);
    }

    public StudentModel(String studentName, String studentAddress, String studentEmail, String studentPhoneNumber, int studentId) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
