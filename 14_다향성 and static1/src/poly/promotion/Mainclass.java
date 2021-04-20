package poly.promotion;

public class Mainclass {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		p1.method1();
		p1.method2();
//		p1.method3(); child꺼는 쓸수가 없음.
		
		System.out.println("--------------");
		System.out.println("--------------");
		Child c1=new Child();
		c1.method1(); // 1~2번은 엄마꺼
		c1.method2(); // 2번은 오버라이딩 하여 재정의함.
		c1.method3(); //3번은 child꺼
		
		System.out.println("======다형성 적용=======");
		
		//c1(child타입)을 p2(parent 타입)에 저장시키겠다. c1->parent타입으로 바꿈.
		Parent p2=c1; // Child->Parent: Promotion (타입 변환)
		System.out.println(c1==p2); //주소값 동일 true --> 의미:똑같은 개체
		System.out.println(p2); // p2의 객체정보는 Child 데이터형만 parent이다.
		
		p2.method1();
		p2.method2(); // p2는 Child 객체라서 재정의된 2번 호출! 이 출력됨. p2는 child 객체
//		p2.method3(); // Parent 타입으로 바뀌어서 c1.method3();을 쓸수가 없음.
		
		/*
		 * 다형성을 적용하여 자식 객체를 부모 타입으로 
		 * 형 변환 했을 시에 자식이 가지고 있는 본래의 멤버
		 * (멤버변수,메서드)에 접근 할 수 없는 문제가 발생합니다.
		 * 다만, 재정의된 메서드는 정상적으로 호출 할 수 있습니다.
		 * 
		 */
	}	
}

	    
