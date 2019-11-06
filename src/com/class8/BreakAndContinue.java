onpackage com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i==2) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("I am outside of the loop");
	
	//continue- it will skip CURRENT iteration
		for (int i=1; i<=5; i++) {
			if (i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
	
	
	
	
	}
		
}	
		
		


