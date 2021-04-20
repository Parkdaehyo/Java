package final_.method;

public class Child extends Parent {
	
	public void method1() {}
	public void method2() {}
//	public void method3() {}
	
	public Child() {
		method1();
		method2();
		method3(); // 메서드 호출은 된다.
	}

}
