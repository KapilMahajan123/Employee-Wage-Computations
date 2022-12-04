package com.empWage.java;

import java.util.Random;

/**
 * 
 * @author Kapil
 *
 */
public class EmployeeWage {
	
	/*
	 * Add Part time Employee & Wage by assuming part time hours is 8
	 */
	 public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();   //random object
		//input
		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		
		/*
		 * will give 0,1,2 random number
		 */
		int randomNum = random.nextInt(3);
		
		/*
		 * condition for present or absent
		 * Calculate and getting this salary 
		 */
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
			System.out.println("Monthly salary for Full Day is: ");
		}else if (randomNum == 2) {
			salary = halfDayHours * wagePerHour;
			System.out.println("Monthly salary for Half Day is: ");
		}
		else
			System.out.println("Employee  is Absent");
			System.out.println("salary is: "+salary);

	}

}
