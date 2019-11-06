package com.class5;

import java.util.Scanner;

public class task2 {

	public static void main (String [] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter heights");
		double height=input.nextDouble();
		
		if (height<5) {
			System.out.println("short");
		}else if(height==5 || height==6) {
			System.out.println("medium");
		}else {
			System.out.println("tall");
		}
		
		
		
	}
	
}
