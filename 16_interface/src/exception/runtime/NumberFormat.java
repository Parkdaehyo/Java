package exception.runtime;

public class NumberFormat {

	public static void main(String[] args) {
		
		//문자열의 수치변환
		String a = "15";
		String b = "13";
		
		System.out.println(a + b);
		
		//Str -> int변환
		//Integer.parseInt(문자열)
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i + j);
		
		//parseInt는 문자열내부에 순수한 정수가 들어있어야만
		//변환을 실행하며 정수값이 아닐 경우 NumberFormatException
		//이 발생합니다.
		String str = "hello";
		System.out.println(Integer.parseInt(str));

	}

}




