package exception.throw_;

public class ThrowExample {
	
	public static int calcSum(int n) throws Exception { //throws Exception이 붙었다는 얘기는 에러가 날 수 있다는 가능성을 암시한다.
		
		/*
		 - 프로그램이 throw구문을 만나는 순간 즉시 예외를 강제로 
		   발생시키게 되며 해당 예외를 처리해줄 catch블록을 검색합니다.
		 */
		if (n <= 0) { // n이 0이하라면, 
			throw new Exception(); //에러를  발생시키도록 설정. --> catch구문으로 이동시킨다.
		}
		
		int sum = 0;
		for (int i=1; i<=n; i++) {
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
		}catch(Exception e) { //11~12코드의 throw new Exception() 객체에 대해서 이 구문을 실행시킨다.
			System.out.println("매개값을 양수로 전달해주세요. ");
		}
	}
	
}




