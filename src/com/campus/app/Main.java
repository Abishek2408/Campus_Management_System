package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //inputs from users
        System.out.println("Enter the student Id ");
        int studentId= sc.nextInt();
        System
        .out.println("Enter the student name");  
        String studentName=sc.nextLine();
        System.out.println("Enter the student age");
        int studentAge=sc.nextInt();
        System.out.println("Enter the student department");
        String studentDepartment=sc.nextLine();
        System.out.println("number of subjects");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter the marks of "+n+"subjects");
        for(int i=0;i<n;i++){
            System.out.println("Enter the marks of subject "+(i+1));
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        Student student=new Student(studentId,studentName,studentAge,studentDepartment,marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService service=new StudentService();
        service.displayReportCard(student);
        sc.close();
    }
} 

