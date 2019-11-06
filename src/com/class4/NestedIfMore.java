package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
	 
		/* check age, if age is less than 16 ---> you are too young to drive
		 * otherwise --> eligible to drive and we will check if you are older than 18 --> you can get
		 *  driver license
		 * if not you can get learner permit
		 * 
		 */
		
		int age=17;
		
		if (age<16) {
			System.out.println("you are too yound to drive");
		}else {
			System.out.println("you are eligible to drive");
			if (age>=18) {
				System.out.println("you can drive alone");
			}else {
				System.out.println("you need your parents you drive");
			}
		
		
		}
		System.out.println("---------------------");
		//we need to check if student completed the quiz
		//if yes --> good job, if not --> not good
		//if they completed we will check score:
		//if more than 90 --> you got an A
		//if more than 80 --> you got a B
		// anything below --> you should study more
		
		boolean quiz=true;
		int score=60;
		
		if (quiz) {
			System.out.println("good job for completion!!");
			if(score>=90) {
				System.out.println("you got an A");
			}else if (score>=80) {
			System.out.println("you got a B");
			}else {
				System.out.println("study more");
			}
			
			
			
		}else {
			System.out.println("not good!!");
			}
		
		
		
		

	}

}
