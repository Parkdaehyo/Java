package str_equals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String객체를 생성할 시 같은 주소값을 공유하게 됩니다.
		 * 
		 */
			String s1="홍길동";
			String s2="홍길동";
			System.out.println(s1==s2); //같은주소라서 true가 나오는것임.
			
			Scanner scan=new Scanner(System.in);
			User u=new User("abc1234"); //user에서 불러온 패스워드
			System.out.println("비밀번호를 입력: ");
			String password=scan.next();
			u.pw="abc1234"; //mainclass에서 만든 패스워드
			
			//if(password==u.pw) ==은 주소값을 비교한다. (101호냐 102호냐..)
			if(password.equals(u.pw)) { //문자열을 비교시에는 ==말고 equals로 비교한다.
				System.out.println("비밀번호가 일치합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}//주소값이 달라서 else가 나옴.
			
			
			
			
	}

}
