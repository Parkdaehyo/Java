package overloading.basic;


/*
 * 오버로딩(중복) - 하나의 클래스 내부에 같은 이름을 가진 메서드를
 * 여러 개 선언할 수 있게 하는 문법
 * 
 * 셋 중 하나는 만족시켜야함. int(클래스 타입 비교x) add(int n1, double n2) 매개변수 타입만 비교.
 * 1. 매개 변수의 데이터 타입이 달라야 함.
 * 2. 매개 변수의 순서가 달라야 함.
 * 3. 매개 변수의 개수가 달라야 함.
 */
public class Basic {
	
	//input(int)
	void input(int a) {
		System.out.println("정수 1개가 입력됨.");
	}
	//input(int) 
//	String input(int x) {} //중복 메서드는 변수가 달라도 안됨. => 매개변수를 확실히 다르게 해야함.
//  당연히, void input(int i) {
//	System.out.println("정수 1개가 입력됨."); 도 안됨.
		
	
	//input(String)
	void input(String s) { // 타입이다르면 허용.
		System.out.println("문자열 1개가 입력됨.");
	}
	//input(int, int)
	void input(int a, int b) { //개수가 다르면 허용
		System.out.println("정수 2개가 입력됨.");
	}
	//input(String, double) //타입이 다르면 허용
	void input(String s, double d) {
		System.out.println("문자열 1개와 실수 1개가 입력됨.");
	}
	//input(double, String) // 순서가 다르면 허용
	void input(double x, String y) {
		System.out.println("실수 1개와 문자열 1개가 입력됨.");
	}
}




