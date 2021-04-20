package exception.throw_;

public class practice {
	
	public static int calcSum(int n) throws Exception {
		
	if (n<=0) {
		//System.out.println("매개값을 양수로 주세요.");
		throw new Exception();//강제로 에러를 발생시키는 구문
		//return -1; //n이 int가 들어갔으므로, return문으로 나오려면 int값을 주어야 나올 수 있다.
	}
	
	int sum = 0;
	for(int i=1; i<=n; i++) {
		sum += i;
	}
	return sum;
	}
	
	public static void main(String[] args) {
		
	try {	
		int result1 = calcSum(100);
		System.out.println("1~100까지의 누적합: " + result1);
		
		int result2 = calcSum(-100);
		System.out.println("1~ -100까지의 누적합: " + result2);
	} catch(Exception e) {
		System.out.println("매개값을 양수로 주세요.");
	}
	}
}

