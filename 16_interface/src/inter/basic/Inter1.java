package inter.basic;

public interface Inter1 {
	
	//인터페이스에 변수를 선언하면 자동으로 상수(초기값을 넣어야함)로 취급합니다.
	static final double INCH = 2.54;
	
	//인터페이스에 메서드를 선언하면 추상메서드로 취급됩니다. abstract가 숨어있음. 안써도 되는데 숨어있음.
	abstract void method1();
	
}
