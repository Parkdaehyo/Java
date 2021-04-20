package static_;

public class Count {

	public int a;
	public static int b;
	
	//일반 메서드 선언
	//일반 메서드 안에서는 일반멤버변수와 정적멤버변수를 모두 참조 할 수 있다.
	public int method1() { 
		a=100;
		return a+b;
	}
	
	//정적메서드 선언.
	public static int method2() {
		
		/*
		 *static 메서드 내부에는 static이 붙은 변수나 메서드만 참조할 수 있습니다
		 *static 블록 내부에서 non-static 멤버변수를 참조하려면
		 *객체 생성을 통해 참조해야 합니다. 
		 * 
		 */
		
		//a=10; 일반멤버변수 선언 불가 
		Count c = new Count(); 
		
		c.a=10; //non-static 변수라서 객체를 생성해야한다.
		
		return c.a+b;
	}
	
	
}
