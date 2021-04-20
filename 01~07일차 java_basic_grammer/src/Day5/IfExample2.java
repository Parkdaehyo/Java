package Day5;
import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("> ");
		int point = sc.nextInt();
		
		if(point >= 90) { // 점프하는게 아니라 위에서부터 차례로 true,false인지를 감별하면서 내려온다.
			if(point > 100) {
				System.out.println("점수를 잘못 입력했습니다.");
			}else if(point >= 95) {
				System.out.println("당신의 학점은 A+입니다.");
			}else {
				System.out.println("당신의 학점은 A입니다.");
			}
		} else if(point >= 80) {
			System.out.println("당신의 학점은 B입니다.");			
		} else if(point >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(point >= 60) {
			System.out.println("당신의 학점은 D입니다.");			
		} else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강대상입니다.");
			
	
		sc.close();
		
		/*
		 * if에서 if 종속문과 else if의 차이.
		 * 만일 if에서 if 종속문으로 처리했을 경우,
		 * 각각의 모든 if가 다 실행된다.
		 * ex) if 아이디
		 * 		if 비밀번호 if와 종속if는 단계적 검사같은 문법이다.
		 * else if로하면 이중에 하나만 선택적으로 사용하겠다는 의미다.
		 * 
		 */
		}
	}

}



