package com.class2;

public class Variables {

	public static void main(String[] args) {
		
	String name="Jose";
	String lastName="Penaranda";
	char grade='A';
	String city="FairFax";
	String state="VA";
	long phoneNumber=7038635145l;
	
	System.out.println(name);
	System.out.println(lastName);
	System.out.println(grade);
	System.out.println(city);	
	System.out.println(state);	
	System.out.println(phoneNumber);
	
	//we do not need to declare variable again
	
	city="lorton";
	state="NY";
	grade='F';
	phoneNumber=703876453434l;
	System.out.println(city);
	System.out.println(state);
	System.out.println(grade);
	System.out.println(phoneNumber);
	
	System.out.println("My name is "+ name);
	System.out.println("I live in city of "+ city);
	System.out.println("My phone number is "+ phoneNumber);
	
	int num1=12;
	int num2=13;
	
	System.out.println("The value of num1="+num1+" and the value of num2="+num2);
	
	String fruit="banana";
	char dollar='$';
	double price=1.99;
	
	//The price of banana is $1.99
	
	System.out.println("The price of "+fruit+ " is "+ dollar+ price+"!!!");
	
	
	
	
	
	
	}
}
