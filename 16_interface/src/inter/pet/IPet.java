package inter.pet;

public interface IPet {
	/*
	 * interface는 객체의 사용방법을 정의한 타입으로 객체의 교환성을 높여주기 때문에
	 * 다형성을 구현하는 매우 중요한 역할을 합니다.
	 * 상수와 메서드만을 구성멤버로 가집니다
	 * 데이터를 저장할 수 없기 때문에, 데이터를 저장할 객체 또는 정적변수를 선언 할 수 없습니다.
	 * public static final을 생략하더라도 자동으로 붙습니다
	 * 추상메서드 이므로 abstract를 붙이지 않아도 자동으로 붙습니다.
	 * 다중 상속도 가능합니다.
	 * 
	 */
	void play();
}
