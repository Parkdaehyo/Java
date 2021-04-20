package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		
//		Computer com=new Computer();
//		System.out.println(com.info); info는 static 변수이지만 객체생성으로 쓸 수는 있다.
		
		/*
		 * 정적 초기화자를 호출하려면 클래스를 로딩해야합니다.
		 -클래스 로딩방법:
		 1. 객체를 생성
		 2. 클래스 이름을 통해 정적 멤버에 접근.
		 
		 */
		//computer.info()를 하는 순간 정적초기화자 static {} 이 바로 호출됨.
		System.out.println(Computer.info); // static 변수는 바로 클래스.으로 접근 가능하다. 다만, 생성자를 넣어주지 않을 경우 null값이 출력된다.
		System.out.println(Computer.info);
		System.out.println(Computer.info);
		
		Computer com=new Computer();
		Computer com2=new Computer();
		Computer com3=new Computer();
		
		/*
		 * 정적 초기화자는 클래스가 로딩될 때 생성자와 main()메서드에  앞서
		 * 오직 단 한번만 실행되기 때문에 어플리케이션 실행 중 반드시 한번만
		 * 실행되어야 할 로직이 있다면 이곳에 기술하여 사용할 수 있습니다.
		 */
		
		
		
	}

}
