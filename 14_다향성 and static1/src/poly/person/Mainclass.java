package poly.person;

public class Mainclass {

	public static void main(String[] args) {
		
		// 다향성 적용  Student,Teacher,Employee 클래스를
		// Person 클래스로 바꿔도 괜찮다.
		
		//원래는 Student 타입
		/*
		 * Student hong=new Student("홍길동,15,"32);
		 * Student lee=new Student("이순신,15,"32);
		 * Student park=new Student("박찬호,15,"32);
		 * 
		 * Teacher kim=new Teacher("김철수" ,26,"영어");
		 * Teacher song=new Teacher("송영희", 29, "수학");
		 * 
		 * Employee lim=new Employee("임꺽정",45,"행정");
		 */
		
		Person  hong=new Student("홍길동",15,"32"); //업캐스팅
		Person  lee=new Student("이순신",17,"21");
		Person  park=new Student("박찬호",13,"61");
		
		Person  kim=new Teacher("김철수",26,"영어");
		Person  song=new Teacher("송영희",29,"수학");
		
		Person  lim=new Employee("임꺽정",45,"행정");
		
		//다향성에 의해서 Person 클래스의 배열이 될 수 있음.
		Person[] people= {hong,lee,park,kim,song,lim};
		
		//people에서 하나씩 꺼내서 돌리는 반복문
		for (Person p:people) {
			System.out.println(p.info());
		}
	
		/*
		 * Student[] students={hong,lee,park}; Teacher[] teachers={kim,song}; Employee[]
		 * employees={lim};
		 * 
		 * for (int i=0; i<students.length; i++) {
		 * System.out.println(students[i].info()); }
		 * 
		 * 
		 * int[] arr=new int[5];
		 * 
		 * System.out.println(hong); //주소가 같음. System.out.println(students[0]);
		 * System.out.println(students[0]);		 * 
		 * System.out.println(hong==students[0]); // ==은 변수내부값 주소비교 true
		 */		 
		
//		System.out.println(hong.info());
//		System.out.println(lee.info());
//		System.out.println(park.info());
//		System.out.println(kim.info());
//		System.out.println(song.info());
//		System.out.println(lim.info());

	}

}
