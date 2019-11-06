package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;//
		a=10;//declare and initialize 
		
		int a1=10;//declare and initialize another way
		//1way
		int[] b;// declare an array---> preferred way
		int c[];//----> another way
		
		b=new int[4]; //4 elements and 4 values holding.
		
		int[] d=new int[4];//2nd way declare and init in one line
		d[0]=10;
		d[1]=20;
		d[2]=30;
		d[3]=40;
		//access value from an array
		System.out.println(d[2]);
	
	//lets create an array that will store classes
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have Java class
		System.out.println("Today we have " +classes[0]+ " class");
	
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1-100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);// 100+3
		//THe size of an array ;s fixed.
		
		
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";	
		names[2]="Jaime";
		//names[3]="Olga"; during run time we will get an exception
		//ArrayIndexOutOfBoundsException
		
		System.out.println(names[0]);
		
		//we are putting less elements inside 
		//compiler will give default values
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[2]);		
		
	
	}

}
