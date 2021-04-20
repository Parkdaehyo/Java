package Day5;
import java.util.Scanner;

//이해가 안가면 손으로 코드를 쓰는 연습을 하라.

public class WhileExample2 {

	public static void main(String[] args) {

		//정수를 입력받아서 해당 정수가 소수(Prime Number)인지 판별하는 로직.
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		//n은 소수를 판별할 정수값을 저장할 변수. 소수:1과 자기자신과 나누었을때만 나누어지는 수.
		int n = scan.nextInt();

		//i는 소수판별을 위해 입력한 정수 n을 나눠볼 피제수를 저장할 변수.
		int i = 2; //제어변수 i는 2부터가 실행하겠다는 뜻.

		while(n % i != 0) { //조건식 true면 반복문을 계속 지속하고
			i++; //증감식 false이면 반복문을 탈출한다. 
		}
		if(n==i) {
			System.out.println(n + "은(는) 소수입니다.");
		}else {
			System.out.println(n + "은(는) 소수가 아닙니다.");			
		}
		scan.close();

	}

}
