
public class CalMain {

	public static void main(String[] args) {
		
		//class에서 Calculator를 불러와서 자동 계산기 만들기.
		
		//1번 계산기 생성.
		Calculator c1= new Calculator();
		
		//2번 계산기 생성.
		Calculator c2= new Calculator();
		Calculator c3= new Calculator();
		
		c1.add(14);
		c1.sub(7);
		c1.mul(6);
		c2.add(9);
		c2.add(15);
		c2.sub(10);
		c3.add(15);
		System.out.println("1번계산기 결과값:"+ c1.result);
		System.out.println("2번계산기 결과값:"+ c2.result);
		System.out.println("3번계산기 결과값:"+ c3.result);
		
	}

}
