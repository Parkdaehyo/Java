package poly.person;

public class Employee extends Person {
	
	String department;
	
	public Employee() {
		super(); //중요! 숨겨져있음
	}
	
	//alt+shift+s using fields를 이용한 생성자 자동생성
	//Main class 소스코드 29번에 틀을 만들어 놓았는데
	//생성자가 없어서 그 틀에 맞게 자동으로 생성해줌.
	public Employee(String name, int age, String department) {
		super(name, age); //Person의 생성자
		this.department = department;
	}



	String info() {
		return "이름: " + name + ", 나이: " + age
				+ ", 부서: " + department;
	}
}
