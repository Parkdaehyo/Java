package Day6;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		//정수를 입력받아 1부터 입력받은 숫자까지의 누적합을 구하는 로직
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수: ");
		int target = scan.nextInt(); // 정수:에 입력받고 target이라는 변수에 저장한것.
		int sum = 0;
		int n = 1;
		
		//시작조건 target에 0을 대입했지만 반복문이 1회 실행되기는 함. 
		do {
			sum += n; //그냥 반복실행할코드, 증감식을 do 안에 넣은것.
			n++;
		} while(n <= target); //n은 target 이하일때 까지.
		// 
		
		
//		while로 실행 시켰을 경우.
		
//		while(n <= target) { // target값에 0을 입력할 경우, n은 1부터 시작하는데, target이 0이므로 false가 발생하여 반복문을 1회도 실행시키지 않는다.
//			sum += n;
//			n++;
//		}
		
		System.out.println("1부터 " + target 
				+ "까지의 누적합계: " + sum);	
		scan.close();

	}

}

/*
 * 
 * 제어변수 선언(begin) 1.
 * while (논리형 조건식(end)) 2. 5.
 * 		 반복실행할코드 3.
 * 		증감식(step) 4.
 * 
 * 
 * int sum=0;
 * 
 * for (int n=1; n<=10; n++1;){
 * 		sum+=n;
 * 
 * 
 * for 제어변수선언(begin);논리형 조건식(end);증감식(Step){
 *		1.				2.	5.	8.		4. 7.
 *	반복실행할 코드 3. 6.
 *
 *}
 * 
 *
 * 
 * 
 * 
 * 
 * 
 */




















