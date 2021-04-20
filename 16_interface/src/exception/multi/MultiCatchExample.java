package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("1번째 데이터: ");
			String data1 = sc.next();
			System.out.print("2번째 데이터: ");
			String data2 = sc.next();
			
			//NumberFormat 발생 가능!
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			//Arithmetic 발생 가능!
			int result = val1 / val2;
			System.out.println(val1 + " / " 
						+ val2 + " = " + result);
			
			String str = null;
			str.charAt(0);
		
		//Exception클래스는 모든 예외를 일괄처리할 수 있습니다.
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외 발생!");
			System.out.println("확인 후 신속히 처리하겠습니다.");
		} finally {
			sc.close();
		}
		System.out.println("프로그램 정상 종료!");

	}

}




