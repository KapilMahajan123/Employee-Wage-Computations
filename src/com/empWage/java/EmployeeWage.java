package com.empWage.java;

import java.util.Random;

/**
 * 
 * @author Kapil
 *
 */
public class EmployeeWage {
	
	/*
	 * Calculate Daily Employee Wage assuming wage per hour is 20 and full day hour is 8
	 */
	 public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();   //random object
		//input
		int wagePerHour = 20;
		int fullDayHours = 8;
		int salary = 0;
		
		/*
		 * will give 0 or 1 random number
		 */
		int randomNum = random.nextInt(2);
		
		/*
		 * condition for present or absent
		 * Calculate and getting this salary 
		 */
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
		}
		else
			System.out.println("Employee  is Absent");
			System.out.println("salary is: "+salary);

	}

}
