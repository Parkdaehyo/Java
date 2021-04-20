
public class PhoneMain {

	public static void main(String[] args) {

		
		Phone basic=new Phone(); // Phone()이라는 생성자를 Phone.java에 만들지 않아도 자바 객체지향은 기본생성자를 있다고 생각하고 자동으로 만들어 준다.
		basic.info(); //생성자는 객체를 생성할때 1회만 호출 가능.

		Phone bluePhone=new Phone("사파이어"); //Phone(String 변수)가 출력.
		bluePhone.info();

		Phone galaxyS9=new Phone("코발트 블루","갤럭시s9");
		galaxyS9.info();

		//3가지의 멤버변수를 초기화하는 생성자를 선언하시고
		//main메서드 내부에서 해당 객체를 만들어
		//info를 출력하세요. 객체 변수 이름은 shaomi
		Phone shaomi = new Phone("옐로우", "샤오미", 200000);
		shaomi.info();

		
//  	phone 클래스에서 phone()을 불러와서
//		변수 이름을 임의적으로 지은 후, .color와 .price에 접근하여 임의적으로 
//		색상,모델,가격을 바꿀 수 있음. 
//		/*
		Phone bluePhone2= new Phone(); //phone() 박스에서 가져오겠다.
		bluePhone2.color="사파이어"; //color는 원래 회색인데,사파이어로 변경하겠다.
		bluePhone2.price=100;
		bluePhone2.info();
//		 */
	}

}
