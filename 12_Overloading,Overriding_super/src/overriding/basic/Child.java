package overriding.basic;

public class Child extends Parent { //Parent로 부터 상속
	
	/*
	 * 메서드 재정의(overriding)
	 * 부모클래스가 물려준 메서드를 자식 클래스에서 
	 * 블록 내부만 바꿔서 사용하는 것.
	 * 
	 * 매서드 재정의의 규칙
	 * 1. 반드시 상속을 전제로 해야한다.
	 * 2. 반드시 반환 유형이 같아야 한다. 
	 * 3. 매서드 이름이 같아야한다.
	 * 4. 매개 변수 선언이 정확히 일치해야 한다.
	 * 5. 접근제한자는 같거나 더 제한이 없어야 한다.  (more public)
	 * 
	 * 
	 * 
		다른 무엇보다 더 중요한, 최우선시 되는 
		the overriding factor/consideration/concern  
		다른 무엇보다 더 중요한 요소/고려 사항/우려 사항

	 * 
	 */
	//():매개변수 
	void method2() {
		System.out.println("재정의된 자식의 2번 메서드 호출!");
	}
	
	void method3() {
		System.out.println("자식의 3번 메서드 호출!");
	}
}



