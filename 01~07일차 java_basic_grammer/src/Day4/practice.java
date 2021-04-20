package Day4;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		
		int nabi[];
		//동적할당: new: 큰방을 빌린다는 의미
		int[] nabi2 = new int[5];  //int 배열 타입.- 참조타입: 변수 내부에 주소를 저장해놓는 타입
		
		//배열의 선언
		String[] pokemon;
		
		//배열의 생성
		pokemon = new String[5];
		
		System.out.println(pokemon); //배열의 주소값이 출력됨.
		
		pokemon[0] = "꼬렛";
		pokemon[1] = "구구";
		pokemon[2] = "캐터피";
		pokemon[3] = "잉어킹";
		pokemon[4] = "꼬마돌";
		//pokemon[5] = "꼬마돌"; //ArrayIndexOfBoundsException
		
		System.out.println(pokemon[0]);
		System.out.println(Arrays.toString(pokemon));
		System.out.println(pokemon.length);
		
		//배열의 선언과 생성을 동시에
		//왼쪽이 선언, 오른쪽이 생성
		byte[] bArr = new byte[5];
		
		//원래 문법
		//String[] type = new String[] {"노말","비행","벌레","물","바위"};
		String[] type = {"노말","비행","벌레","물","바위"};
		System.out.println(type);
		System.out.println(Arrays.toString(type)); //일차원 배열을 String으로
		System.out.println(Arrays.toString(bArr));//자동 초기값 설정.
		pokemon[4] = pokemon[3];
		System.out.println(Arrays.deepToString(pokemon)); //다차원의 배열을 String으로
		
		
		
		
		
		
	}
}
	