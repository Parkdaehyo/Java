package super_.person;

public class Person {
	
	String name;
	int age;
	
	//생성자 선언
	Person(String name, int age) { 
		super(); //묵시적으로 생성
		this.name = name;
		this.age = age;
//		System.out.println(this.info());
	}
	
	Person(String name) { 
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
