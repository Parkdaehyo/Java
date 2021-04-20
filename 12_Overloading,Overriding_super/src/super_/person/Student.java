package super_.person;

public class Student extends Person {
	
	String stuID;
	
	
	
	Student(String name, int age, String stuID) {
		super(name, age); //super는 부모의 생성자를 불러서 그곳에서 로직을 실행한다.

		this.stuID = stuID;
	}
	 
	Student() {
		this("이름없음", 1, "학번없음");
	}
	
	String info() {
		return super.info() + ", 학번: " + stuID; //super.info() 부모의 메서드를 쓴다.
	} 
}

/*
 * 설명: super.을 사용하면 부모클래스의 멤버를 참조할 수 있습니다.
 * super()는 생성자 내부에서만 사용이 가능하며, 부모 클래스의 생성자를 호출하는데 사용합니다.
 * 생성자의 첫라인에는 반드시 this(),super()가 있어야 하는데 이를 기술하지 않으면
 * 묵시적으로 super()가 삽입되어 부모클래스의 기본생성자를 자동으로 호출합니다.
 */



