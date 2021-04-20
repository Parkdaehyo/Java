package modi.protec.pac2;

import modi.protec.pac1.*;

//A(pac1)와 D(pac2)는 다른 패키지에 있지만 상속관계
public class D extends A{
	
	public D() {
		
		// 직접적인 허용x
//		A a=new A();
//		a.s="hi";
//		a.method();
		
		/*
		 * protected 제한자는 패키지가 다를 경우
		 * 두 클래스 사이에 상속관계가 있다면
		 * super를 통한 참조를 허용합니다.
		 * 
		 * 클래스 A타입이 p.f거나 prviate면 되지않지만,
		 * public이거나 protected일 경우는 super로 참조가능.
		 */
		
		super(); //생성자 호출
		super.s="hi";
		super.method();
		
		
	}

}
