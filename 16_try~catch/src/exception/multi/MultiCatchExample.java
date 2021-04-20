package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 
	 //try catch문은 생성자 내부나 메서드 내부에서만 사용가능하다.
	 try  { //try라고 쓰고 ctrl enter
		System.out.println("1번째 데이터: ");
		String data1=sc.next();
		System.out.println("2번째 데이터: ");
		String data2=sc.next();
		
		//NumberFormat 발생가능!
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		
		//Arithmetic 발생 가능!
		int result = val1 / val2;
		System.out.println(val1+ " / " 
		+ val2 + " = " + result);
		
		//의도적으로 nullpointerException이 발생하도록 설정.
		String str = null;
		str.charAt(0);
		
		
		 //Exception 클래스는 모든 예의를 일괄처리 할 수 있다.	
		 //Unreachable catch block for NumberFormatException. It is already handled by the catch block for E
		 //exception: Exception을 하나로 받을 경우 NumberFormatException,ArithmeticException 등 사용 불가
	} catch (NumberFormatException e) {
		System.out.println("숫자만 입력해주세요.. "); //NumberFormat 발생 했을 경우 실행.
	} catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다.");  //Arithmetic 발생 했을 경우 실행.
		//결론: 어떤 에러가 발생했는가에 따라서 catch를 걸어서 그 에러가 발생된 곳으로 catch문 실행이 가능하다.
	} catch (Exception e) {
		System.out.println("알 수 없는 예외 발생!");
		System.out.println("확인 후 신속히 처리하겠습니다.");
		
	} finally {
		sc.close();
	}
		System.out.println("프로그램 정상 종료!");
	 }

	}


