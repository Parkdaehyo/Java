package poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		//Person이 부모 클래스
		printPersonInfo(new Person("닭강정", 22)); //new Person("닭강정", 22)을 통해서 객체 생성이 가능.
		printPersonInfo(new Student("김말이", 24, "44"));
		printPersonInfo(new Teacher("볶음밥", 33, "요리"));
		printPersonInfo(new Employee("떡볶이", 21, "주방"));

	}
	
	// 이게 최초 실행할때 new Person("닭강정",22)가 호출이 되잖아요?
	/*
	 * p == new Person("닭강정", 22)란 얘긴데,
	 * 
	 * 이게 Person p = new Person("닭강정", 22)를 안했는데 (객체 생성을 안했는데)
	 * 
	 * 이게 어떻게 new Person("닭강정",22)가 참조변수 p가 될 수 있는거에요??
	 * 
	 * 오랜만에 다형성 공부를 했더니 까먹었습니다.. 
	 * 
	 */									//다형성은 부모타입에 자식 객체를 쓸 수 있다.
										//결국 p라는게 객체를 생성했을때 대명사격으로 받는 변수네요.
	public static void printPersonInfo(Person p) { //최초 실행시 8번 메서드 호출, Person p = new Person("닭강정", 22) 생성된, new Person("닭강정", 22) 객체가 참조변수 p를 통해서 진입
		
		//비교연산자
		if(p instanceof Student) { //너 Student의 객체니? 맞으면 true
			System.out.println("******** 학생의 정보 *********");
		} else if(p instanceof Teacher) {
			System.out.println("******** 선생님의 정보 *********");			
		} else if(p instanceof Employee) {
			System.out.println("******** 직원의 정보 *********");			
		} else {
			System.out.println("******** 사람의 정보 *********");			
		}
		System.out.println(p.info()); // p == new Person("닭강정", 22)
		
	}

}
 		/*
 		 * instanceof
 		 * -자바의 키워드 중에서 instanceof는 객체가 지정한 클래스의 인스턴스인지 아닌지
 		 * 검사 할때 사용하는 연산자 입니다.
 		 * -instanceof 연산자의 왼쪽 항의 객체가 오른쪽 항 클래스의 인스턴스 
 		 * 즉, 오른쪽 항의 객체가 생성되었다면 true를 리턴하고, 그렇지 않으면 false를 리턴합니다.
 		 * ex) Person p=new Student();
 		 * 		p instanceof Student->true
 		 */



