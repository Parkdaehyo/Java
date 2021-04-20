package Day7;

import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		/*
		 * 1. 두 수의 더하기를 맞추는 문제를 지속적으로 
		 *    출제하는 프로그램입니다.
		 * 2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 
		 *    지속적으로 문제를  출제한 후 정답을 맞추면 
		 *    반복문을 탈출시키세요.
		 * 3. 27 + 84 = ?
		 */		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			int rn1 = (int)(Math.random() * 100) + 1;
			int rn2 = (int)(Math.random() * 100) + 1;
			
			System.out.println("--------------");
			System.out.println(rn1 + " + " + rn2 + " = ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			
			int answer = scan.nextInt();
			int correct = rn1 + rn2; //correct=정답 변수
			
			if(answer == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(answer == correct) {
				System.out.println("정답입니다!!");
				okCount++;
			}else {
				System.out.println("틀렸는데요??");
				noCount++;
			}
		}
		System.out.println("----------------------------");
		System.out.println("정답 횟수: " + okCount + "회");
		System.out.println("틀린 횟수: " + noCount + "회");
		
		scan.close();

	}

}
