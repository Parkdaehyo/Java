package static_.method;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * -static이 붙은 멤버는 객체생성 없이 클래스 이름으로
		 * 직접 참조가 가능합니다.
		 *  
		 */
		
		System.out.println(Count.method2());
		Count.b +=50;
		System.out.println(Count.method2());
		Count.b -=20;
		System.out.println(Count.method2());
		
		System.out.println("-----------------");
//		System.out.println(Count.method1()); static이 아니라 안됨.
		Count c1=new Count();
		c1.a+=30;
		System.out.println(c1.method1());
		
		Math.random(); //Math도 정적메서드이기 때문에 객체 생성 없이 클래스에서 바로 참조해서 부를 수 있는 것이다.
		System.out.println(Math.PI); //PI도 static 변수
	} 

}
