package Day5;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("직급을 입력하세요.");
		System.out.println("[사원,대리,과장,차장,부장]");
		System.out.print("> ");
		String position = scan.next(); //문자열에 입력받기 위해서 String 변수 =scan.next();에 저장 하였다.

		switch(position) {

		case "사원":
			System.out.println(position + "의 급여는 200만원입니다.");
			break;
		case "대리":
			System.out.println(position + "의 급여는 300만원입니다.");
			break;
		case "과장":
			System.out.println(position + "의 급여는 400만원입니다.");
			break;
		case "차장":
			System.out.println(position + "의 급여는 500만원입니다.");
			break;
		case "부장":
			System.out.println(position + "의 급여는 600만원입니다.");
			break;
		default:
			System.out.println(position + "은(는) 없는 직급입니다.");
			System.out.println("직급을 다시 입력해주세요.");
		}
		
		scan.close();

	}

}
