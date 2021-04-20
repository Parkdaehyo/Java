
public class return_practice2 {

	public static void main(String[] args) {
		
	System.out.println(calcSum());	
		
	}
	
	public static int calcSum() { //매개변수값이 없죠?
		int sum=0;
		for (int i =1; i<=333; i++) {
			sum+=i;
		}
		return sum;
	}
	
	
}
