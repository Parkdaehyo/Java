package modi.constructor.pac1;

public class A {
	
	//멤버 변수 선언
	
	//객체 타입도 멤버변수의 타입으로 쓸 수 있다.
	//같은 클래스 내에서는 접근제한자의 의미 없이 모두 쓸 수 있다.
	A a1=new A(true); //public 생성자 호출
	A a2=new A(3); // p.f 생성자 호출
	A a3=new A("hi"); // private 생성자 호출
	
	//생성자 선언
	public A(boolean b) {} //public 제한 생성자
	
	A(int i) {} //package friendly 제한 생성자
	
	private A(String s) {} //private 제한 생성자
}
