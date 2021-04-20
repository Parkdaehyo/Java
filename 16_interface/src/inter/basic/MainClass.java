package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없습니다.
//		Inter1 i1 = new Inter1();
		
		InterClass ic = new InterClass(); //InterClass는 그냥 일반 클래스
		
		System.out.println(Inter1.INCH); //inter1을 상속받았기 때문에 사용 가능
		System.out.println(Inter2.ABC);
		ic.method1();
		ic.method2();
		ic.method3();
		System.out.println("------------------------------");
		
		/*
		 - 인터페이스 이름도 하나의 타입으로 취급할 수 있습니다.
		 - 인터페이스를 통해 상속 없이도 다형성을 구현할 수 있습니다.
		 */
		Inter1 i1 = ic; //Promotion: InterClass -> Inter1 // 일반클래스 ic를 인터페이스 타입인 i1에 저장. (가능한 이유는 ic는 i1의 자식클래스 ) 다형성이란, 자식 객체가 부모의타입을 가질 수 있는 특성이다.
		Inter2 i2 = new InterClass(); //InterClass -> Inter2 //23번과 같은 이유 
		
//		i1.method3(); (x)
//		i2.method3(); (x)
		
		InterClass icc = (InterClass)i1; // 부모 타입의 변수 i1이 자식타입의 변수에 저장 할려면 부모타입이 크기 때문에 자식타입으로 낮추어서 형변환을 해야함.
		InterClass icc2 = (InterClass)i2;
		icc.method3();
		icc2.method3();
		
	}

}




