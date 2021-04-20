package api.lang.string;

public class StringValueOf {

	public static void main(String[] args) {
		
		int a = 10;
		double b = 8.79;
		System.out.println(a + b);
		
		String str1 = String.valueOf(a); //문자열로 바꾸는 메서드 
		String str2 = String.valueOf(b);
		System.out.println(str1 + str2); 

	}

}



