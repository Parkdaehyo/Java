package this_.person;

public class Person {
	
	String name; 
	int age;
	
	/*
	 * 기존 생성자처럼 수행할시
	 * Person(String pName(김철수), int pAge(25)) {
	 * 		name = pName;
	 * 		age = pAge;
	 * 
	 * 설명: 1. 지역변수가 멤버변수보다 먼저 실행된다.
	 * 		2. 결국 this가 가리키는 것은, Person 클래스의 멤버변수다.
	 * }
	 */
	
	
	//생성자의 역할: 객체가 생성 될때, 처음에 수행해야할 일을 기술 할 수 있는곳. (로직을 작성할 수 있는곳)
	Person(String name, int age) {  //김철수 ,25 
		this.name = name; // this가 가리키는것은 class Person의 멤버 변수 String name, int age 이다.
		this.age = age;  
		System.out.println(this.info()); // 소스코드 38번을 호출(Person 클래스의 info 메서드) 내 info 메서드!
	}
	
	Person(String name) { 
		this(name, 1); // this(name,1)에 의하여 소스코드 9번 Person 생성자에게 올라간다.
//		this.name = name;
//		this.age = 1;
	}
	 
	Person() { 
		this("이름없음", 1); // 소스코드 9번으로 올라감.
//		this.name = "이름없음";
//		this.age = 1;
	}
	
	String info() { 
		return "이름: " + name + ", 나이: " + age;
	}
	
}
