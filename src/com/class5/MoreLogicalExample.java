package com.class5;

import java.util.Scanner;

//to import short cut is ctr+shift+0---.windows
// mac is cmd+shift+0

public class MoreLogicalExample {

	public static void main(String[] args) {
		
		/*ask user to enter daily sales
		 * based on the sales range we want to give commission to the person
		 * if sales <100 ---> commission is 10%
		 * if sales if between 100-200 ---> commission of 20%
		 */
		
		

	
	//declare variables
		Scanner scan;
		double salesAmount;
		double commission;
		
	scan=new Scanner(System.in);
	System.out.println("Please enter your sales amount");
	salesAmount=scan.nextDouble();
	
		if (salesAmount>=1 && salesAmount<100) {
			//lets give user 10% commission of a sale
			commission=salesAmount*0.1;
			
		}else if (salesAmount >=100 && salesAmount <200) {
			//lets give user 20% comminon of sale
			commission=salesAmount*0.2;
			
		}else if (salesAmount>=200 && salesAmount<500) {
			//lets give user 30% comminon of sale
			commission=salesAmount*0.3;
			
		}else if (salesAmount>=500) {
			//lets give user 50% comminon of sale
			commission=salesAmount*0.5;
		}else {
			commission=0;
		}
		System.out.println("Based on the sales your comission is " +commission);
	
	
	
	
	}

}
