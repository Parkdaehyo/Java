package poly.basic;

/*
 * 하나의 클래스 파일안에 여러 클래스들을 선언할 수 있습니다.
 * 단, 파일명과 동일한 이름을 가진 클래스가 반드시 존재해야 하며
 * 해당 클래스만 public 제한자를 가질 수 있습니다.
 */

class A {}
class B extends A {} //형제 이하는 관련x ex) b,c
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	/*
	 * 다향성이란 자식객체가 부모의 타입을 가질 수 있는 특성을 의미합니다.
	 * 즉, 부모 타입 변수에 자식 객체의 주소값을 언제든지 저장시킬 수 있습니다.
	 */

	A a=new A();
	B b=new B();
	C c=new C();
	D d=new D();
	E e=new E();
	
	A a1=b;//(b는 B의주소) // B타입->A타입 자동 형 변환(promotion)
	A a2=new B(); //B는 A의 자식관계
	A a3=c;
	A a4=d;
	B b1=new D(); // 자식객체는 부모클래스의 타입을 사용할 수 있다.
	A a5=e;
	C c1=new E();
	
//	B b2=new E(); // 상속관계까 없다면 다형성 적용이 불가능.
//	C c2=new D();
	
	Object o1=new A(); //A가 Object의 상속관계.
	Object o2="안녕";
	Object o3=new E();
	
	
}
