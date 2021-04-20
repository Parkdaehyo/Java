package Day5;
import java.util.Scanner;
/*
		 * 1. 양의 정수를 입력받아서 그 수가 홀수라면
		 *    "x는 홀수입니다.", 짝수라면 "x는 짝수입니다."가
		 *    출력되도록 조건문을 활용하여 코드를 만들어보세요.
		 *    힌트) 짝수는 2로 나누면 나머지가 0이다.
		 * 2. 만약 사용자가 0을 입력하면 "0입니다.", 음수를
		 *    입력하면 "음의 정수입니다."를 출력하도록 조건문을
		 *    수정해보세요.   
		 */		
public class IfQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int i = scan.nextInt();

		if(i >= 0) {
			if(i==0) {
				System.out.println("입력한 정수는 0입니다.");
			}else if(i%2 == 0){
				System.out.println(i + "은(는) 짝수입니다.");
			}else {
				System.out.println(i + "은(는) 홀수입니다.");				
			}
			System.out.println(i + "은(는) 음의 정수입니다.");
		}

		scan.close();

	}

}
