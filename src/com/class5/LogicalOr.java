package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		//7 days a week
		//if days is 2 or 4 --> sdlc class
		//if day 6 or 7 --> java class
		//if day 1 or 5 ---> no class
		//if day =3---> review class
		
		int day=1;
			//false or false --> false
		if (day==2 || day == 4) {
			System.out.println("sdlc class");
			//true or false --a. true
		}else if (day==6 || day==7) {
			System.out.println("java class");
			//false or false-->false
		}else if (day==1 || day==5) {
			System.out.println("no class");
		}else if (day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("not a valid day");
		}
		
		
		
	}

}
