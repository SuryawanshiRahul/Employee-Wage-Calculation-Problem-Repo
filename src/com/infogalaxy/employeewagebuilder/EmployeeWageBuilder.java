package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Employee Wage Calculation Problem");

        //UC-1 Employee Attendance
        Random random = new Random();
        int empAttendance = random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
        }
    }
}