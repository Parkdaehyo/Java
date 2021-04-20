package exception.runtime;

public class NumberFormat {

	public static void main(String[] args) {
		
		//문자열의 수치변환
		String a="15";
		String b="13";
		
		System.out.println(a+b); //1513

		//Str->int 변환
		//Integer.parseInt(문자열)
		int i=Integer.parseInt(a); // 문자열을 정수로 변환.
		int j=Integer.parseInt(b);
		System.out.println(i+j);
		
		//parseInt는 문자열 내부에 순수한 정수가 들어있어야만
		//변환을 실행하며 정수값이 아닐 경우 NumberformatException
		//이 발생합니다.
		String str="hello";
		System.out.println(Integer.parseInt(str));
		//아까도 봤듯이, Integer.parseInt()는 String문자열 값을 정수로 변환해주는건데,
		//hello라는 걸 어떻게 정수로 바꾸겠는가? 바꿀수 없으므로, NumberformatException이 뜨는것이다.
	}

}
