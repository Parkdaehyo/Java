package modi.member.pac2;

import modi.member.pac1.A;
public class C {
	
	public C() {
		A a=new A();
		
		a.a=1; //public(0)
//		a.b=2; //p.f(x) -->다른 패키지
//		a.c=3; // private(x): a에서만 사용 가능.
		
		a.method1(); //public(0)
//		a.method2();// p.f(x)
//		a.method3();// private(x)
		
	}

}
