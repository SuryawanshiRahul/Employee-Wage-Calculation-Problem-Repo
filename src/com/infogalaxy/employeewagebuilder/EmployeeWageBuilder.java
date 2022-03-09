package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Employee Wage Calculation Problem");
        //UC-2 Calculate Daily Wage
        //UC-1 Employee Attendance
        int working_days = 0;
        int working_hrs = 0;
        Random random = new Random();
        while(working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS) {
            int total_wage = 0;
            working_days++;
            System.out.println("Day : "+working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");
                int empType = random.nextInt() % 2;
                if(empType < 0) {
                    empType = -empType;
                }
                switch (empType) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time");
                        total_wage = Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time");
                        total_wage = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
            System.out.println("Total Wage = " + total_wage);
            System.out.println("Total Working Hrs = "+ working_hrs);
        }
    }
}
