package this_.person;

public class MainClass {

	public static void main(String[] args) {
		
		
		Person kim = new Person("김철수", 25);
//		kim.name = "김철수";
//		kim.age = 25;
		
		Person park = new Person("박영희");
//		System.out.println(park.info());
		
		Person noname = new Person(); // class person의 21번 호출.
//		System.out.println(noname.info());

	}	

} 		
		
