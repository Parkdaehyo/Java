package poly.person;

public class Teacher extends Person {
	
	String subject;
	
	
	 // 생성자의 자동생성
	    Teacher() { // 자식 클래스는 부모 클래스의 기본생성자가 없으면 이것도 에러남.
	  	super();
	     }
	 
	
	Teacher(String name, int age, String subject) {
		super(name, age);//엄마 두개만 처리해줘 나머지는 내가 할게. 라는 뜻. --> Person의 소스코드 09번 호출.
		this.subject = subject;
	}
	
	String info() {
		return super.info()
				+ ", 과목: " + subject;
	}
}
