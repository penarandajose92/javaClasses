package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

		/* ask user to enter the month they were born
		 * based on the month define the season
		 * 
		 * if user is born in Jan,feb dec-->Winter
		 * if mar,apr,may ---> spring
		 * if jun july aug ---> summer
		 * if sep oct nov --> fall
		 * otherwise --->unkown
		 * 
		 * at the end of the program 
		 * 
		 * "you were worn in ______
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Month of born");
		String month = scan.nextLine();
		
		String season;
		
		if (month.equals("January") || month.equals("February") || month.equals("December")){
			season="Winter";
			
		}else if(month.equals("March") || month.equals("April") || month.equals("May")){
			season="Spring";
		
		}else if(month.equals("Jun") || month.equals("July") || month.equals("August")){
				season="Summer";
		}else if(month.equals("September") || month.equals("October") || month.equals("November")){
			season="fall";
		
		}else {
			season="unknown"
		}
		
			System.out.println("You were born in " + season);
			
		
		
		
		
		
		
	}

}
