package Day3;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 데이터를 작은 데이터 타입으로 변환하려면
		 * 반드시 캐스트 연산자 변활할 타입 연산자 (type)를 사용하여
		 * 명시적으로 형 변환 해야합니다. (Downcasting)
		 * 
		 */
		
	
		int i=72; //int는 4바이트
//		char c=i; //char는 2바이트 작은것->큰것은 되나 큰것->작은것 형 변환은 안됨
		char c=(char)i; // int->char 강제 형 변환
		System.out.println("72의 유니코드 문자:"+c);
		// char가 표현할 수 있는 2바이트 범위 내에서는 
		// int가 커도 출력이 가능하다. 그러나 char가 수용할 수 없는 범위일 경우, 알 수 없는 문자가 나온다.(에러)
		
		
		/*
		 *  강제 형 변환의 경우 데이터 손실이 일어날 가능성이
		 *  있기 때문에 명시적으로 타입을 변환 합니다.
		 */
		double d=4.83123;
		int j=(int)d;
		System.out.println(j); 
		// double은 실수 범위를 가지고 int에 접근했지만,
		// int는 정수만 표현할 수 있기 때문에 int가 수용할 수 있는 범위인 4만 출력이 되었다.
		// 나머지는 데이터가 날라가버렸다고 표현해도 된다.
		
		/*
		 * 강제 형 변환시 주의점은 해당 데이터 타입이
		 * 받아들일 수 있는 범위가 아닌 데이터가 들어오면
		 * 오버플로,언더플로가 일어납니다.
		 * 
		 */
		int k=1000; 
		byte b=(byte)k; 
		System.out.println(b);
		// byte는 127까지만 받을 수 있는데
		// k=1000이라는 over된 데이터가 들어가버리니,
		// 데이터가 꼬여서 자기 맘대로 출력이 된 것이다.
		
		

	}

}
