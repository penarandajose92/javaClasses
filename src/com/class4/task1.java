package com.class4;

public class task1 {
	public static void main(String[] args) {
	
		boolean diploma=true;
		double gpa=2.0;
		
		if (diploma) {
			System.out.println("congratulations");
			if (gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else if (gpa<3.5) {
				System.out.println("you should have studied harder ");
		}
		
		
		}else {
			System.out.println("get a degree");
		}
		
		//task1 part 2
		
		double mortgageRate=2.0;
		double mortgagePrice=300000;
		
			if (mortgageRate>4.5) {
				System.out.println("will not buy a house");
				
			}else if (mortgageRate<4.5) {
				System.out.println("will consider buying ");
				
				if (mortgagePrice>200000) {
					System.out.println("will take a loan");
				} else if (mortgagePrice<20000) {
					System.out.println("will pay cash");
				}
				
			}
	
	
	
	
	
	}
}
