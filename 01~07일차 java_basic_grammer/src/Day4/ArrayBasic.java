package Day4;
import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// 커서를 맨 앞으로 옮겨서 shift + end를 누르시거나 
		// 맨 뒤로 옮기셔서 shift + home을 누르시면 해당 줄이 전체 블록 설정됩니다. 

		// 1. 배열의 선언 - stack에 배열 변수를 설정.
//		int score[]; (o) C style
//		int score[5]; (x) //자바에서는 선언시 크기 명시불가.
		int[] score; //JAVA Style
		
		/*
		 * int[] score; 
		score=new int[10];
		System.out.println(score); //
		new int[10]; 을 하지않으면, 배열이 선언되지 않았으므로 아무런
		값도 출력되지 않음.
		 */
		// ↑ score 변수의 배열을 선언함.
		
		//2. 배열의 생성-Heap에 실제 데이터가 저장될 공간을 생성(new type[])
						  //배열은 생성시 크기를 명시함. 한번 설정한 크기는 변경 불가.
		score=new int[5]; // score변수의 배열의 크기를 5로 설정함.
						  // new: 동적할당, 메모리 설정 명령
		System.out.println(score); // 배열의 대표주소값이 score에 저장된것임.
								   
		
		//3. 배열의 초기화-배열에 값을 저장하는 과정
		score[0]=87;
		score[2]=99;
		score[3]=score[0];
				
		//4. 배열의 값 참조(사용)
		System.out.println("배열의 3번째 데이터값: "+score[2]);
		System.out.println("배열의 4번째 데이터값: "+score[3]);
		System.out.println("배열의 5번째 데이터값: "+score[4]);
		
		/*
		 * 배열 내부에 저장된 값들을 한눈에 문자열 형태로
		 * 확인해보려면 출력 메서드 println의 매개값으로
		 * Arrays.toString(배열면수명)을 쓰면 됩니다.
		 */
		System.out.println(Arrays.toString(score)); //지금까지 score에 저장된 인덱스 값을 볼 수 있다.
		
		//배열의 길이를 알아보려면 배열변수명.length 명령을 사용.
		System.out.println("배열의길이: "+score.length);
		
		//배열의 선언과 생성을 동시에 하는 방법.
		byte[] bArr=new byte[7];
		
		//배열의 선언과 생성과 초기화를 동시에 하는 방법
		//letters가 stack이라면, {'가','나','다','라'}는 heap 영역 이다.
		char[] letters=new char[] {'가','나','다','라'};
		// char[] 선언 new char[] 생성 {가,나,다,라} 초기화(값 설정)
		
		System.out.println(Arrays.toString(letters));
		
		//원래는 String[] names = new String[] {"홍길동"~}이다. 
		String[] names= {"홍길동","신사임당","강감찬"};
		
		System.out.println(Arrays.toString(names));
		
		//배열의 초기값을 설정하지 않으면 각 데이터타입의 
		//기본값으로 자동초기화됩니다.
		System.out.println(Arrays.toString(bArr));
		// byte에 7개를 설정했는데 아무런 생성을 하지 않았기 때문에 0이 7개가 출력된다.
				
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
