package poly.person;

public class MainClass2 {

	public static void main(String[] args) {
		
		//다형성은 (상속받은)부모타입으로 형변환이 가능하다.
		Person hong=new Student("홍길동",15,"32");
		Person lee=new Student("이순신",17,"영웅");
		Person park=new Student("박찬호",19,"응가");
	
		Person kim=new Teacher("라라라" ,28, "야야야");
		
		Person lim =new Employee(); 
		
	
		//자식 클래스의 모든 클래스는 다형성에 의해서 Perosn의 배열이 될 수 있다.
		Person[] people = {hong,lee,park,kim,lim};
		
		for (Person p:people) {
			System.out.println(p.info());
		}
	}
}
