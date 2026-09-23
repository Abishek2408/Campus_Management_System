package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate total marks
    public int calculateTotal(int[] marks) {
        if (marks ==null){
            return 0;
        }
    }
    int total =0;
    for(int mark :marks){
        total+=mark;
    }
    return total;
    //calculate average marks
    public double calculateAverage(int[] marks){
        if (marks ==null)|| marks.length ==0){
            return 0.0;
        }
        int total =calculateTotal(marks.length);
        return (double) total/marks.length;
    }

    //find maximum marks
    public int findMax(int[] marks) {
        if (marks ==null || marks.length ==0){
            return 0;
        }
        int max=marks[0];
        for (int mark:marks){
            if (marks>max){
            }
        }
        return max;
    }
    //find minimum marks
    public int findMin(Student student){
       int[] marks=student.getMarks();
       if (marks== null)
    }
    int min=student.getmarks()[0];
    for(int mark:student.getmarks()){
        if (mark<min){
            min=mark;
        }
    }
    return min;
}
    //grade based on marks
    public char grade(Student student){
        int[] marks=student.getMarks();
        if (marks ==null || marks.length== 0){{
            return 'F';
        }
        int total=calculatetotal(student);
        int average=(int)calculateAverage(student);
        if(average>=90){
            return 'A';
        }else if (average>=80){
            return 'B';
        }else if (average>=70){
            return 'C';
        }else if (average>=60){
            return 'D';
        }else if (average>=50){
            return 'F';
        } 
        //pass or fail
        public String passOrfail(Student student){
            int[] marks=student.getMarks();
            if(marks== null || marks.length==0){
                return "Fail";
            }
            int average=(int) calculateAverage(student);
            if(average>=40){
                return"Pass";
            }
            else{
                return "Fail";
            }

         }public void displayReportCard(Student student){
            System.out.println("Student Id:"+student.getStudentId());
            System.out.println("Student Name:"+student.getStudentName());
            System.out.println("Age:"+student.getAge());
            System.out.println("Department:"+student.getDepartment());
            System.out.println("Marks:");
            if(student.getMarks() !=null){
                for(int mark : student.getmarks()){
                    System.out.println(mark+"");
                }
            }
            
         }
        
        }