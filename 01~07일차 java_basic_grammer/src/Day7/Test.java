package Day7;

public class Test {

	public static void main(String[] args) {
		
		int n = 10;
		int count = 0;
		
		for(int i=1; i*i <=n; i++) {
			if(10%i == 0) {
				count ++; //i가 1일때 count +1
				if(i*i < n) { // 1<10
					count ++; // +1 +1 count 2
					
				}
			}
		}
		
		System.out.println(count);
	}
}
