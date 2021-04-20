package poly.casting;

public class Mainclass {

	public static void main(String[] args) {
		
		//Promotion이 적용되면 자식 클래스의 본래멤버를 참조할 수 없음.
		Parent p=new Child();
		p.method1();
		p.method2();
//		p.method3(); (x)
	 	System.out.println("----------------------");
		
	 	
		Child c = (Child)p; // 작은거->큰거 그냥, 큰거->작은거 명시적 형변환
		
		c.method3(); //method3을 쓰기위해서 잠시 내린것
		
		Child cc=new Child();
		cc.method3();
		
		System.out.println(c==cc); //주소다름
		/*
		 * 한번 promotion이 일어난 객체를 대상으로만 강제타입변환을
		 * 사용할 수 있습니다.
		 * 
		 */
		
//		Child ccc=(Child)new Parent(); 에러
		
		

	}

}
