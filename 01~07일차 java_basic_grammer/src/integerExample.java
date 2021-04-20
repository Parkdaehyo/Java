
public class integerExample {

	public static void main(String[] args) {
		
		byte a=127; // 127이 이미 저장되어있어야한다? 127은 상수(변경할 수 없는 수) a는 변수
		short b=32767;
		int c=2147483647; //int의 저장 범위
		long d=2147483648L; // 2147483648도 int 형태지만 int의 저장 범위를 넘어선 수.(int가 표현할 수 있는 범위를 초과한 수)
		// 따라서 int의 저장 범위를 넘어섰기 때문에, L을 써서 표현한다.
		System.out.println(d);
		// 127은 모두 int형태다.
		
		//2진수 저장시 정수앞에 접두어로 0b를 붙임.
		int bin=0b1010; //10
		System.out.println("2진수 1010:" + bin); //문자열(" ")와 변수는 연결해서 출력 가능
		
		//8진수 저장시에 정수 앞에 접두어로 0을 붙임.
		int octa=064; //6은 8^1승,4는 8^0(=1)승=48+4=52
		System.out.println("8진수 64:" + octa);
		
		//16진수 저장시에 정수 앞에 접두어로 0x을 붙임.
		int hexa=0x3a4c;
		System.out.println("16진수 3a4c:"+ hexa);//a=10, c=12
		
		
		
	}
}
