package com.class4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		
		
		System.out.println("enter temperature in fahrenheit?");
		int tempFah=keyboard.nextInt();
		
		System.out.println("enter city?");
		String cityName=keyboard.next();
		//String cityName=scan.nextLine();
		
		int convertedTemp=(tempFah-32)*5/9;
		
		System.out.println("the temperature in city "+ cityName+" is "+convertedTemp);
		
		
		
	
		

	}

}
