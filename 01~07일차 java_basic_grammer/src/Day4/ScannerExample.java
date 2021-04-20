package Day4;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		/*
		 * 입력 받을 데이터 타입에 따른 메서드 호출
		 * scan.next(),scan nextLine(),scan nextint(), scan.nextDouble()
		 * next(): 공백을 포함하지 않는 문자열을 입력 받을 때
		 * nextLine(): 공백을 포함한 문자열을 입력 받을 때 
		 * nextInt(): 정수를 입력받을 때
		 * nextDouble(): 실수를 입력 받을 때
		 * 
		 * scan.close(); 스캐너 객체 종료.
		 */
		
		//1. 스캐너 객체생성
		Scanner scan=new Scanner(System.in);
		
		//2. 스캐너 클래스가 가지고 있는 입력 메서드들을
		//사용하여 데이터를 입력받음.
		System.out.println("이름을 입력하세요.");
		System.out.print(">");
		String name=scan.next(); //scan.next에 의해서 입력받은 타이핑을 String name에 저장하겠다. 그냥 name=은 안됨. 이것은 변수가 아니라 메서드 자체이기 때문에 String name을 써서, 이것은 변수가 아니라 함수를 name에 저장하는 메서드로서 사용하게 한다.
		System.out.println("나이를 입력하세요.");
		System.out.print(">");
		int age=scan.nextInt(); // int 변수
		System.out.println("----------------");
		System.out.println("당신의 이름은 " + name
				+"이고 나이는 "+ age +"세입니다.");
		
		//3. 스캐너의 메모리 자원을 반납한다.
		scan.close();
		
	}
}
	
	
	
	
