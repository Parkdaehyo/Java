package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		Animal da=d; //Dog자식객체의 변수 d를 Animal 부모 클래스 타입 변수 da에 대입.
		d = (Dog)da; //그리고 다시 부모 타입의 변수의 da를 다시 Dog 자식객체 변수에 대입.
		System.out.println("타입 변환 성공!Animal->Dog"); //위 11~13코드가 문제가 없으므로 출력이된다.
		
		Animal c= new Cat(); //c는 Animal타입 이기는 하지만 내부 객체는 Cat에 의해 움직인다.
		Dog d2=(Dog)c; // Cat과 Dog는 아무 관계가 없음. 
		System.out.println("타입변환성공!Cat->Dog");
	}

}
