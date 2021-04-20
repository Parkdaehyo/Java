package Day7;

public class ContinueExample1 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			}			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) continue; //참이면 출력문을 실행하지않는다.
			System.out.print(i + " ");
		}

	}

}


