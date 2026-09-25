package com.campus.model;

import java.util.Arrays;

public abstract  class Student {
    // Encapsulation - Hiding the data
    // Instance variables
    private int studentId;
    private String studentName;
    private int age;
    private String department;
    private int[] marks;

    // Static variables
    static int studentCount = 0;

    // Default constructor
    public Student() {
        studentCount++;
    }

    // Parameterized constructor
    public Student(int studentId, String studentName, int age,
                   String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    // Getters
    public int getStudentId() {
        return studentId; 
    }

    public int getStudentid() {
        return studentId; 
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentname() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    public int[] getmarks() {
        return marks;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;   
    }

    public void setStudentid(int studentid) {
        this.studentId = studentid;   
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentname(String studentname) {
        this.studentName = studentname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Instance methods - belongs to object
    public void displayStudentInfo() {
        System.out.println("Student Id:" + studentId);
        System.out.println("Student Name:" + studentName);
        System.out.println("Age:" + age);
        System.out.println("Department:" + department);
    }

    public void displaysstudendInfo() {
        displayStudentInfo();
    }
    
    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();
        if (showMarks && marks != null) {
            System.out.println("Marks:" + Arrays.toString(marks));
        }
    }
    abstract void studentType();

  

    // Static method - belongs to class, not to object
    public static void displayStudentCount() {
        System.out.println("total number of students:" + studentCount);
    }


    
}
