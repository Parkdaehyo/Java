package Day7;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 두 수의 더하기를 맞추는 문제를 지속적으로 
		 *    출제하는 프로그램입니다.
		 * 2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 
		 *    지속적으로 문제를  출제한 후 정답을 맞추면 
		 *    반복문을 탈출시키세요.
		 * 3. 27 + 84 = ?
		 */		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
		System.out.print(">");
		
		int answer = sc.nextInt();
		double r = Math.random();
		int rn= (int)r*100+1;
		
		while(true) {
			
		}
		
	}

}
