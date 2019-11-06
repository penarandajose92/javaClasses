package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		//ask user to enter boolean value for sale
		//if no sale --> I am not shopping
		//if sale ---> check the price of the item
		//based on the amount we will have to calculate the price after discount 
		//if price <20 --> apply 10%
		//if price between 20-100--->20%
		//if between 100-500-->30%
		//anything --->50%
		
		//after disoucnt __the price of the item reduce from __to__
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter True for sale or False for no sale");
		
		boolean sale=scan.nextBoolean();
		System.out.println("What is the price");
		
		int price=scan.nextInt();
		double finalPrice=scan.nextDouble();
		
		if (sale) {
			if (price<20) {
				finalPrice=price*0.1
			}
		}
		
		
		
		
		
	}

}
