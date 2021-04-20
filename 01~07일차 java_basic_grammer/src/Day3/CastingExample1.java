package Day3;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터의 타입의 데이터를 큰 데이터타입으로 
		 * 변환 할 때는 자바 가상머신(JVM)이 데이터 타입을
		 * 자동으로 올려서 변환해줍니다.(Promotion/Upcasting)
		 * 
		 */
		
		byte b=10;
		int i=b; //int에 byte를 넣었는데, 아무런 문제가 없는 이유는 자바는 자동으로 형변환을 시켜준다.
		
		char c='가';
		int j=c; //char->int 자동 형 변환 2바이트는 4바이트로 자동변환.
		System.out.println("가의 유니코드:"+j); // 문자열과 변수의 덧셈
		
		int k=500;
		double d=k; // int-> double 자동 형 변환
		System.out.println(d);
		
		
		

	}

}
