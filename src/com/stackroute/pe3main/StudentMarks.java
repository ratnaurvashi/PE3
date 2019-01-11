package com.stackroute.pe3main;

public class StudentMarks {
    public String checkGrade(int[] studentGrades){
        //getting number of students by calling length method
        int numOfStud = studentGrades.length;
        //checking for null case
        if((numOfStud==0))
            return null;
        //flag value for checking if the marks go out of range
        int flag=1;
        for(int i=0;i<numOfStud;i++){
            if(studentGrades[i]>=0 && studentGrades[i]<=100)
                continue;
            else{
                //if any marks are out of range the break
                flag=0;
                break;
            }
        }
        if(flag==1)
            return "Marks are in range 0-100.";
        else
            return "Error!";
    }
}
