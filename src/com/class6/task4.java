package com.class6;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	      
	      System.out.println("Please enter number");
	      int num=input.nextInt();
	      
	      if (num<400){
	        System.out.println("Calculate commission");
	      }else{
	        System.out.println("Value is too large");
	        if(num<=600){
	          System.out.println("Don't calculate commission");
	        }
	        
	        
	      }
	      
	      
	      
	      
	     
	      
	}

}
