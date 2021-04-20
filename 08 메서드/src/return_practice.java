
public class return_practice {
	
	public static int calcSum(int x) {
	
	int sum=0;
	for(int i=1; i<=x; i++) {
		sum+=i; //sum=sum+i 
	}
		return sum; //위에 로직을 실행 하고 그 값을 반환하는것이다.
	}
	
	public static int calcSum2(int begin, int end) {
		int sum=0;
		for (int i= begin; i <= end; i++) {
			sum=sum+i;
		}
		return sum; //caclSum2 메서드를 부른 곳으로 반환한다.
	}
	
	
	
	public static void main(String[] args) {
	
		System.out.println("1부터 10까지의 누적합: " + calcSum(10)); //   
		System.out.println("1부터 10까지의 누적합: " + calcSum(123)); //   
		
		System.out.println(calcSum2(4,7));
		
		int result = calcSum(100);
		System.out.println(result);
	}
}
