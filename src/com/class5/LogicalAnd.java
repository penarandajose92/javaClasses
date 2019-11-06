package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// if number is between 1-10 ---> this number is small
		int num=200;
		//true AND False-->false
		if (num>1 && num<10) {
			System.out.println("this number is small");
			//true AND false-->false
		}else if (num>=10 && num<100) {
			System.out.println("this number is medium");
			//true AND ture -->true
		}else if (num>=100 && num<1000) {
			System.out.println("this number is large");
		}else {
			System.out.println("number is out of your range");
		}
				
				
		
		

	}

}
