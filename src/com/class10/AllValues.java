package com.class10;

public class AllValues {

	public static void main(String[] args) {
		String[] animals= {"Cat", "Cow", "Snake","Dog","Elephant"};
		//i want to print all values from an array
		// when value is Dog--> i love dogs
		
		
		for (int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println("i love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}

	
	
	
	
	
	
	
	
	}

}
