package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    // calculate total marks
    public int calculateTotal(Student student) {
        int[] marks = student.getMarks();
        if (marks == null) {
            return 0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    

    // calculate average marks
    public double calculateAverage(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = calculateTotal(student);
        return (double) total / marks.length;
    }

    

    // find maximum marks
    public int findMax(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    

    // find minimum marks
    public int findMin(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    

   

    // grade based on marks
    public char grade(Student student) {
        if (student == null) {
            return 'F';
        }
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        double average = calculateAverage(student);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else if (average >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // pass or fail
    public String passOrfail(Student student) {
        if (student == null) {
            return "Fail";
        }
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        double average = calculateAverage(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String passOrFail(Student student) {
        return passOrfail(student);
    }

    public void displayReportCard(Student student) {
        if (student == null) {
            return;
        }
        System.out.println("Student Id:" + student.getStudentId());
        System.out.println("Student Name:" + student.getStudentName());
        System.out.println("Age:" + student.getAge());
        System.out.println("Department:" + student.getDepartment());
        System.out.println("Total Marks:" + calculateTotal(student));
        System.out.println("Average Marks:" + calculateAverage(student));
        System.out.println("Max Marks:" + findMax(student));
        System.out.println("Min Marks:" + findMin(student));
        System.out.println("Grade:" + grade(student));
        System.out.println("Pass/Fail:" + passOrfail(student));
    }
}