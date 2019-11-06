package com.class4;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
	
		System.out.println("what is the amount of loan needed?");
		int amount=keyboard.nextInt();
	
		if (amount<200000) {
			System.out.println("loan accepted");
		}else {
			System.out.println("rejected");
		}
	
	System.out.println("-----------------");
	
	
	System.out.println("enter age");
	int age=keyboard.nextInt();
	
	if (age>18) {
		System.out.println("you qualified for drivers licence");
	}else {
		System.out.println("you qualify for a lerners permit");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
