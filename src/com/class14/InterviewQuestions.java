package com.class14;

public class InterviewQuestions {

	public static void main(String[] args) {
		  String str = "syntax12345";
		    int counter = 0;
		    for (int i = 0; i < str.length(); i++) {
		      if (Character.isLetter(str.charAt(i)))
		        counter++;
		    }
		    System.out.println(counter + " letters.");
		  }
		}
	
	