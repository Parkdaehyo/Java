package poly.instanceof_;

public class Person {
	
	String name;
	int age;
	
	//생성자 선언
	Person(String name, int age) { //1번 생성자. 썼으므로
		super(); //묵시적으로 생성 Person 클래스의 부모는 object. 없어도 실행된다.
		this.name = name;
		this.age = age;
//		System.out.println(this.info());
	}
	
	Person(String name) { // 2번 생성자.
		this(name, 1); 
//		this.name = name;
//		this.age = 1;
	}
	
	Person() { //부모의 기본 생성자.
		this("이름없음"); // 이 this();는 소스코드 16번 호출
//		this.name = "이름없음";
//		this.age = 1;
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
	
}
