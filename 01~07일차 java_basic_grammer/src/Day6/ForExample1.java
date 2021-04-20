package Day6;
public class ForExample1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int n=5; n <= 35; n++) { //= n+=1
			sum += n;
		}
		System.out.println("누적합: " + sum);

	}

}
