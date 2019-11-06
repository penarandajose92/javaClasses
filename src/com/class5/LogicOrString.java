package com.class5;

public class LogicOrString {

	public static void main(String[] args) {
		
		
		
		String weekDay="Friday";
		
		if (weekDay.equals("Tuesday")|| weekDay.equals("Thrusday")) {
			System.out.println("sdlc class");
		
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("java class");
			
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("no class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("not a valid day");
		}
		
		
		
	}

}
