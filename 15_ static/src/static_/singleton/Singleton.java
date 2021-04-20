package static_.singleton;

public class Singleton {
	
	/*
	  # 싱글톤 패턴- 객체의 생성을 1개로 제한하기 위한 디자인 패턴.
	  
	  1. 외부에서 이 클래스의 객체를 생성할 수 없도록 
	  생성자를 단 1개만 선언하고, private 제한을 붙임,
	 */
	
	private Singleton() {}
	//우리의 목적.
	
	/*
	 2. 자신의 클래스 내부에서 스스로의 객체를 1개 생성합니다.
	 */
	//instance는 변수
	//static으로 설정함으로써 객체 생성없이 메소드를 부를 수 있다.
	private static Singleton instance=new Singleton();
	
	/*
	 * 3. 외부에서 이 클래스의 객체 생성을 요구할 경우,
	 * 	2번에서 미리 만들어 둔 단 하나의 객체를 공개된 메서드를 통해
	 * 	제공합니다.
	 */
	
	//getInstance() 메소드를 통해서 접근
	public static Singleton getInstance() {
		return instance;
	}
	

}
