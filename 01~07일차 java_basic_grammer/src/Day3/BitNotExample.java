package Day3;

public class BitNotExample {

	public static void main(String[] args) {
		// 비트반전 연산자(~)
		// 정수의 2진수 값의 각 자리수를 반전 시킵니다.
		// 0 ->1, 1->0 
		byte b= 8; // 0000 1000
		System.out.println(~b); // 1111 0111 자릿수 반전
		
		//논리 반전연산자(!)
		//true->false, false->true
		boolean bool=false;
		System.out.println(!bool);
		
		/*
		// 1111 0111
		 * 1의 보수 치환 (자리 반전)
		 * 0000 1000
		 * 2의 보수 치환
		 * 		  +1
		 * 0000 1001
		 *
		*/
	}

}
