
//설계용 클래스(라이브러리 클래스)는 메인메서드를 작성하지 않습니다. 클래스가 도면 작업실이라면 메인클래스는 공장.
public class Pen { //설계도 작성

	//객체의 속성을 나타내는 것을 필드(멤버변수)라고 부릅니다.
	String color;
	int price;
	
//	Pen () {} //기본 생성자. -->이게 없어도 New pen();에 의해 자동적으로 삽입된것처럼 표현됨.
//	Pen(String c) {
//		
//	}
	
	//객체의 기능을 나타내는 것을 메서드(멤버 함수)라고 부릅니다.
	void write() {
		System.out.println(color+ "색 글을 씁니다.");
	}
	void info() {
		System.out.println("-------Pen's Info---------");
		System.out.println("색상:"+color);
		System.out.println("가격:"+price);
	}
	
}
