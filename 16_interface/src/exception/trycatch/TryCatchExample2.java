package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕", "헬로", "니하오"};
		
		int i = 0;
		while(i < 4) {
			try {
				System.out.println(greetings[i]);
			} catch(Exception e) {
				System.out.println("배열의 참조 범위를 벗어남!");
			} finally {
				System.out.println("이 문장은 항상 실행됨!");
			}
			i++;
		}
		System.out.println("프로그램 정상 종료!");

	}

}
