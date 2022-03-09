package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Employee Wage Calculation Problem");
        //UC-2 Calculate Daily Wage
        final int WAGE_PER_HR = 20;
        final int PART_TIME_HR = 4;
        final int FULL_TIME_HR =  8;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int empAttendance = random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            int empType = random.nextInt() % 2;
            if( empType == 0) {
                System.out.println("Employee is Part Time");
                total_wage = WAGE_PER_HR * PART_TIME_HR;
            } else {
                System.out.println("Employee is Full Time");
                total_wage = WAGE_PER_HR * FULL_TIME_HR;
            }
        }
        System.out.println("Total Wage = "+ total_wage);
    }
}
