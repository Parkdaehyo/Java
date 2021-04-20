package super_.person;

public class MainClass {

	public static void main(String[] args) {
		
		Student hong = new Student("홍길동", 13, "34");
		System.out.println(hong.info());
		
		Teacher lim = new Teacher("임창정", 50, "음악");
		System.out.println(lim.info());
		
		Student noname = new Student(); //Student의 소스코드 18번 실행.
		System.out.println(noname.info());
		
		
		/*
		 * 설명: Person()을 불렀는데 왜 나이가 1이지?
		 * Person()은 
		 * this("이름없음")이 출력되고 이것은 소스코드 16번을 호출한다.
		 * 왜냐면 16번이 Person(String name)이기 때문에.
		 * 그리고 이 16번은 다시 this(name,1)을 호출한다.
		 * 그리고 이 16번은 다시 소스코드 9번을 호출한다.
		 *
		 */
		
		

	}

}

