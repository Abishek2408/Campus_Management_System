package com.campus.model;

public class SchorlarshipStudent extends Student{
    private double scholarshipPercentage;

    public SchorlarshipStudent(int studentId, String studentName, 
         int age, String department, int[] marks,double scholarshipPercentage) {
           super(studentId,studentName,age,department,marks);
           this.scholarshipPercentage=scholarshipPercentage;

    }
    //getters and setters
    public double getScholarshipPercentage(){
        return scholarshipPercentage;
    }
    public void setScholarshipPercentage(double scholarshipPercentage){
        this.scholarshipPercentage=scholarshipPercentage;
    }
    @override
    public void StudentType(){
        System.out.println("Scholarship Student");
    }
    @override
    public void displayStudentInfo(){
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage:"+
        scholarshipPercentage);
    }
    @override       
    public void displayStudentInfo(boolean showMarks){
        super.displayStudentInfo(showMarks);
    }
}   


