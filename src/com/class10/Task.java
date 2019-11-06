package com.class10;

public class Task {

	public static void main(String[] args) {
		
		//one way
		char[] grades=new char[7];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='C';
		grades[5]='E';
		grades[6]='F';
		
		System.out.println(grades[1]);
	
		
		
		String[] groupName= {"Kevinr", "Jay Ju", "Jose"};
		System.out.println(groupName[2]);
		
		
		
		String[] names=new String[3];
		names[0]="Kevin";
		names[1]="Jay Ju";
		names[2]="Jose";
		
	
		System.out.println(names[2]);
	
	
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
	
		System.out.println(words[1]+ " "+ words[4]+" "+words[0]+ " "+words[3]+" "+words[2]);
	
	
	
	
	
	
	
	
	}

}
