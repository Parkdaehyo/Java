package final_.field;

public class Person {
	
	/*
	 -final 변수는 한번 값이 대입되면, 값을 변경 할 수 없는
	 특징이 있기 때문에 선언시에 직접 초기화 하거나 생성자를 통한
	 초기화 로직을 작성하여 데이터가 반드시 한번 저장 될 수 있게 
	 해야 합니다.
	 */
	public final String nation="대한민국";
	public final String name;
	public int age;
	
	public Person(String name) {
//		this.nation="중국"; fianl이라 값변경이 안됨.
		this.name=name;		
	}
	
	

}
