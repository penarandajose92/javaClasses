package com.class3;

public class RealationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("**************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b5=d>d1;
		System.out.println(b5);

		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int a =20;
		int b=30;
		//if number is bigger than number b
		// i want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
		}
		
		int expectedHours=15;
		int actualHours=2;
		
		//if expected hours are more than actual -> you will succeed 
		//otherwise,please study more
		if (actualHours>expectedHours) {
			System.out.println("you will succeed");
			
		}else {
			System.out.println("pleae study more");		
			}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;//2.99=4.99-2
		
		//if price is more that i can afford i will not buy
		// if price is less or matches what i can afford then i will buy tea
		
		if(allowedPrice>=teaPrice) {
		System.out.println("i will buy tea");
		System.out.println("and i will enjoy my tea");
		}else {
			System.out.println("i cannot afford, i need to study more");
			System.out.println("i will go back to study more");
			
		}
		
	System.out.println("i keep writting some code");
	
	boolean val =true;
	
	if (val) {//if vall==true
		System.out.println("hello");
	}else {
		System.out.println("bye");
	}
	
	boolean isRain=false;
	//if it is raining i will take umbrella,otherwise i go for a walk
	if(isRain) {//isRain==ture
		System.out.println("i will take umbrella");
	}else {
		System.out.println("i go for a walk");
	}

	
	
	
	
	}
}