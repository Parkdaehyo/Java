package poly.person;

public class Student extends Person {
	
//	String name;
//	String age;
	String stuID;
	
	
	
	Student(String name, int age, String stuID) {
		super(name, age); //super 누르고 F3 의미: 엄마의 생성자중에 name과 age를 처리해줄수 있는 생성자가 있나요? Person클래스의 1번 생성자.
//		this.name = name; --> 상속을 받지 않을시에는 이렇게 작성해야함.	
//		this.age = age;
		this.stuID = stuID;
	}
	
	Student() {
		this("이름없음", 1, "학번없음"); // 이 this()는 소스코드 11번을 호출한다.
	}
	
	String info() {
		return super.info() + ", 학번: " + stuID;
	} //부모님의 info
}

/*
 * 설명: super.을 사용하면 부모클래스의 멤버를 참조할 수 있습니다.
 * super()는 생성자 내부에서만 사용이 가능하며, 부모 클래스의 생성자를 호출하는데 사용합니다.
 * 생성자의 첫라인에는 반드시 this(),super()가 있어야 하는데 이를 기술하지 않으면
 * 묵시적으로 super()가 삽입되어 부모클래스의 기본생성자를 자동으로 호출합니다.
 */



