package com.class8;

public class Task2 {

	public static void main(String[] args) {
		
		int sumOdd=0;
		int sumEven=0;
		
		for (int i=1; i<=20; i++) {
		
			if (i%2==0) {
			sumEven=sumEven+i;
			}else {
			sumOdd=sumOdd+i;
			
			}
		}
		
	
		System.out.println("The total of all even numbers = "+ sumEven);
		System.out.println("The total of all even numbers = "+ sumOdd);
	
	
	
	
	
	
	
	
	
	
	}

}
