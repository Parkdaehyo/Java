package Day3;

public class TextualExample {

	public static void main(String[] args) {
		
		// 단일 문자를 저장하는 데이터 타입 char
		
		char c1='A'; // ' '을 써서 표현한다.
		char c2=66; // char 저장했기 때문에 B로 저장된다.
		/*
		 * 한글'가'에 해당하는 유니코드 AC00
		 * 직접 16진수 형태로 저장하려면 탈출문자 \\u를(주석달때는 \더써준다)
		 * 적어주어야 합니다.
		 */
		char c3='\uAC00';
		System.out.printf("%c %c %c\n",c1,c2,c3); // 포맷팅할때는 printf
		
		//문자열을 저장 할 수 있는 데이터 타입 String
		String s1="my dream";
		String s2="is a scientist";
		System.out.println("--------------");
		System.out.println(s1);
		System.out.println(s2);

		//자바에서는 문자열의 +연산을 진행 할 수 있습니다.
		//연산결과로 문자열을 이어붙인 결과를 도출 합니다.
		System.out.println(s1 + s2);
		
		System.out.println("------------------");
		
		//문자와 다른 데이터 타입의 +연산
		System.out.println(100+200);
		System.out.println(100+"200"); //자바에서만 됨.
		System.out.println(10+20+"hello"); //10+20이 우선 순위 (왼쪽부터)
		System.out.println("hello"+10+20); //곱하기는 먼저 함. 10*20
		System.out.println("hello"+(10+20)); // ()에 의해서 10+20을 먼저 연산
		//기본 데이터 타입의 연산시 바이트가 큰쪽에 맞추어 연산.
		System.out.println('A'+10); // A의 유니코드는 65
		//char는 2바이트 int는 4바이트 따라서 작은쪽을 큰쪽으로 타입을 변경함, char->int
		
		
		
		
		
		
		
		
		
		

	}

}
