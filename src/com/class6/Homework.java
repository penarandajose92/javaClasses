package com.class6;
import java.util.Scanner;
public class Homework {
public static void main (String [] args) {
	
	Scanner scan = new Scanner(System.in);
	
	   
    // TASK 2 find the largest number using nested if
    
    System.out.println("Please enter 3 distinct numbers for Nested If Task");
    
    double no1 = scan.nextDouble();
    double no2 = scan.nextDouble();
    double no3 = scan.nextDouble();
    
    if (no1>no2) {
        if(no1>no3) {
            System.out.println("Largest number is first - " + no1);
        } else {
            System.out.println("Largest number is third - " + no3);
        }
    }else {
        if(no2>no3) {
        System.out.println("Largest number is second - "+ no2);
        } else {
            System.out.println("Largest number is third - " + no3);
        }
    }
}
}
