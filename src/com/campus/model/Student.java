package com.campus.model;

public class Student {
    //Encapsulation - Hiding the data
    //Instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    //static variables
    static int studentCount=0;

    //Default constructor
    public Student(){
        studentCount++;
    }
    //parameterized constuctor
    public Student(int[] studentid, String studentname, int age,
    String department, int[] marks){
        this.studentid=studentid;
        this.studentname=studentname;
        this.age=age;
        this.department=department;
        this.marks=marks;
        studentCount++;
    }
    //getters
    public int getStudentid(){
        return studentid; 
    }
    public String getStudentname(){
        return studentname;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return marks;
    }
    //setters
    public void setStudentid(int studentid){
        this.studentid=studentid;   
    }
    public void setStudentname(String studentname){
        this.studentname=studentname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setMarks(int[] marks){
        this.marks=marks;
    }

    //Instances methods -belongs to object
    public void displaysstudendInfo(){
        System.out.println("Student Id:"+studentid);
        System.out.println("Student Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Department:"+department);
    }
    
    public void displayStudentInfo(Boolean showMarks){
        displayStudentInfo();
    }
    If (showMarks){
        System.out.println("Marks:"+java.util.Array.toString(marks));
    }
    //static method -belongs to class,not to object
        public static void displaysstudendInfo

