package Day6;

public class Practice {

	public static void main(String[] args) {

		int floor = 5;
		
	for (int i = 0; i < floor; i++) {
		for (int j = 0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	System.out.println("-------------------------");
	
	for (int i = 0; i < floor; i++) {
		for (int j = 0; j<5-i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	System.out.println("------------------");
	
	for (int i = 0; i<floor; i++) {
		for (int j=0; j<4-i; j++) {
			System.out.print(" ");
		}
		for (int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	
	}
	
	System.out.println("-----------------------");
	
	int incVal =10;
	incVal++;
	System.out.println("incVal의 값: " + incVal);
	if (incVal < 0) {
		incVal++;
		if(incVal > 0)
			incVal++;
	}
	System.out.println("incVal의 값: " + incVal);
	
	}	
	}

		
