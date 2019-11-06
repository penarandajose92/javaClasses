package com.class8;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Do you want to apply for credit card?");
			String card = scan.nextLine();
			if (card.equals("yes")) {
				break;
	
			}
		}
	
	}

}
