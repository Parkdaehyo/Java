package static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메서드 선언.
	//일반 메서드 안에서는 일반멤버변수와 정적멤벼변수를 모두 참조할 수 있습니다.
	public int method1() {
		a=10; //this.a=10;
		return a+b; // return this.a+b; 다만 this를 생략 할 수 있음.
	}
	
	//정적 메서드 선언.
	public static int method2() {
		
		/*
		 * static 메서드 내부에서는 static이 붙은 변수나 메서드만
		 * 참조할 수 있습니다.
		 * -static 블록 내부에서 non-static 멤버를 참조하려면
		 * 객체 생성을 통해 참조해야 합니다.
		 * 
		 */
		
//		a=10; 정적 메서드는 어디로 부터 참조하는지 분간을 못하기 때문에(ex) count c1 클래스의 a와 count c2 클래스의 a는 다르기 떄문에, 일반멤버변수를 사용 할 수 없고
		Count c=new Count(); //반드시 객체 생성을 통해서 
		c.a=10; // 일반멤버변수를 써야한다.
		return c.a+b; //method2의 return 이다.
		
	}

}
