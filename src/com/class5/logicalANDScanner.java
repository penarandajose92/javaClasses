package com.class5;

import java.util.Scanner;

public class logicalANDScanner {

	public static void main(String[] args) {
	
		//ask user to enter age
		//if age is from 1-3 --> you are a baby
		//if age from 3-5 --> you are a toddler
		//if age from 5-12 --> you are a kid
		//if age from 12-19 --> teenager
		// if age > 20 --> you are an adult
		
		int age;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("enter age");
		age=scan.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println("you are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("you are a toddler");
		}else if (age>5 && age <=12) {
			System.out.println("you are a kid");
		}else if (age>12 && age<=19) {
			System.out.println("you are a teenager");
		}else if (age>20) {
			System.out.println("you are an adult");
		}else {
			System.out.println("invalid age");
		}
			
			
	
		
		
		
		
		

	}

}
