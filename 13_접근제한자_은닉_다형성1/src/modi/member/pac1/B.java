package modi.member.pac1;

public class B {
	
	public B() {
		
		A a=new A();
		
		a.a=1; //public(0)
		a.b=2; //p.f(0)
//		a.c=3; // private(x): a에서만 사용 가능.
		
		a.method1(); //public(0)
		a.method2();// p.f(0)
//		a.method3();// private(x) //같은 패키지라도, 다른 클래스에서 사용불가.
		
	}

}
