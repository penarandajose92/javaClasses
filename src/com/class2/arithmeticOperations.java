package com.class2;

public class arithmeticOperations {

	public static void main (String[] args) {
	
	int num1, num2;
	
	num1=20;
	num2=10;
	
	System.out.println(num1+num2);	
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	
	//how can we print value of num1 and num2 together
	System.out.println(num1+","+num2);
	
	int sum=num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int div=num1/num2;
	
	//the addition of 2 numbers is __
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	System.out.println("the addition of 2 numbers is "+ sum);
	System.out.println("the subtraction of 2 numbers is "+ sub);
	System.out.println("the multiplication of 2 numers is "+mult);
	System.out.println("the division of 2 numers is "+div);
	

	
	}
}
