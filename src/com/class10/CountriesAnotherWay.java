package com.class10;

public class CountriesAnotherWay {

	public static void main(String[] args) {
		
		String[] countries={"USA", "Russia","Turkey","Afghanistan","Colombia"};
		
		
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			
			case "Afghanistan":
				System.out.println("Kabul");
			break;
			case "Colombia":
			System.out.println("Bogota");
			break;
			case "USA":
			System.out.println("Washington DC");
			break;
			case "Turkey":
			System.out.println("Ankara");
			break;
			case"Russia":
				System.out.println("Moscow");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
