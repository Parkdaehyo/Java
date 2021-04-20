package static_;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * -static이 붙은 메서드는 객체 생성없이 클래스 이름으로
		 * 직접 참조가 가능하다.
		 * 
		 */
		
		System.out.println(Count.method2());
		Count.b+=50; //static 변수 b는 모든 객체들이 공유하는 공유 변수이다. 
		System.out.println(Count.method2());
		Count.b-=20;
		System.out.println(Count.method2());
	
		//System.out.println(Count.method1()); (x)
		System.out.println("---------------------");
		Count c1 = new Count();
		//c1.a += 30;
		System.out.println(c1.method1());
		
	
	}
}
