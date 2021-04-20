package Day5;

public class WhileExample1 {

	public static void main(String[] args) {
		
		//1~10까지의 누적합계를 구하는 로직
		int sum = 0; //합계를 저장할 변수
		int n = 1; //제어변수: 반복문의 횟수를 제어할 변수.
		
		while(n <= 10) {
			sum += n;
			n++; //제어변수 조작을 통해 반복문이 언젠가 false가 나오게 해야함.
		}		
		
		System.out.println("1부터 10까지의 누적합: " + sum);

	}

}
