package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		String[] greetings= {"안녕","헬로","니하오"};
		
		int i=0;
		while (i<4) { // 0,1,2,3(4회차)을 반복해야 하는데, 3번인덱스가 없어서 안녕,헬로,니하오만 출력되고 에러 발생.
			try {
			System.out.println(greetings[i]); //0,1,2번 인덱스까지는 정상적으로 출력이되다가, 인덱스가 3이 들어가는 순간 에러가 발생을 해서,
			}catch(Exception e) { //catch문을 실행을 하고
				System.out.println("배열의 참조범위를 벗어남."); //이것을 출력.
			}
			finally { //에러가 나든 안나든 항상 실행
				System.out.println("이 문장은 항상 실행됨!");
			}
			i++;
		
		}
		System.out.println("프로그램이 정상적으로 종료됬습니다."); //14번 코드 출력후 바로 여기로 떨어져서 실행.

	}

}
