package models;

public class Teacher {
    private String teacherName, teacherDepartment, teacherEmail, teacherAddress, teacherPhoneNumber;
    private double salary;
    private int empCode;
    public Teacher()
    {
        this("", "", "", "","",0, 0);
    }
    public Teacher(String teacherName, String teacherDepartment, String teacherEmail, String teacherAddress, String teacherPhoneNumber, double salary, int empCode) {
        this.teacherName = teacherName;
        this.teacherDepartment = teacherDepartment;
        this.teacherEmail = teacherEmail;
        this.teacherAddress = teacherAddress;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.salary = salary;
        this.empCode = empCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDepartment() {
        return teacherDepartment;
    }

    public void setTeacherDepartment(String teacherDepartment) {
        this.teacherDepartment = teacherDepartment;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public void setTeacherPhoneNumber(String teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }
    
}
