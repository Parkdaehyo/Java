package inherit.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong= new Person();
		hong.name="홍길동";
		hong.age=45;
		System.out.println(hong.info());

		Student lee=new Student();
		lee.stuID="2018110033";
		lee.name="이순신"; // student에는 분명히 name과 gender,age 변수가 없는데 어떻게 쓸 수 있을까? student class에 person을 불러왔고 그 불러온 변수들을 활용 할 수 있는 자바의 객체 자동 기능이다.
		lee.gender="남자";
		lee.age=23;
		System.out.println(lee.info());
		
		Teacher kang=new Teacher();
		kang.subject="수학";
		kang.name="강감찬";
		kang.age=44;
		kang.gender="남자";
		System.out.println(kang.info());
		
		Employee shin=new Employee();
		shin.department="구매부";
		shin.age=33;
		shin.name="신사임당";
		shin.gender="여자";
		System.out.println(shin.info());
		
	}

}
