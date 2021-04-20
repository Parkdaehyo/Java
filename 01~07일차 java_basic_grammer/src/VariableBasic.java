
public class VariableBasic {

	public static void main(String[] args) {
		/*
		 * 변수의 선언
		 * ex) [자료형] [변수 식별자 이름];
		 * 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 * -int는 정수를 저장하는 대표적인 자료형입니다.
		 * -string은 문자열을 저장하는 대표적인 자료형입니다.
		 * 
		 */
		int score;
		// 변수의 초기화(Initialization),값을 저장하는행위=초기화
		score = 50; // score가 50이라는게 아니라 50이라는 데이터를 score에 저장해달라는 개념.
		System.out.println(score);
		
		// 변수의 선언과 초기화를 동시에 할 수 있습니다.
		int life=3;
		// 변수에는 다른 변수의 값을 저장 할 수도 있습니다.
		int result=score+life;
		System.out.println(result);
		
		System.out.println("-----------");
		int abc=3;
		System.out.println(abc);
		int abc_sum=abc*2;
		System.out.println(abc_sum);
		abc=7; // 코드는 다시 위로 올라가지 않는다. abc_sum=abc*2; 할 시점에서 abc의 값은 3이였고 그 이후에 abc=7;로 변경 한것이다.
		System.out.println(abc);
		System.out.println("---------------");
		
		//변수에 저장된 값은 언제든지 변경이 가능합니다.
		life=7; // 기존에 있던 int life=3; result=score+life;의 계산후에 life=7;로 다시변경됨.
		System.out.println(life);
		// 변수는 자료형이 다르더라도 동일 이름으로 중복선언 할 수 없습니다.
//		String score; (x) 윗줄에서 int score로 이미 선언을 했는데
//      score="abc"; (x) 자료형이 다르다고 이미 쓴 선언을 중복선언 할 수 없다.
	
		String a="바보";
		System.out.println(a);
	}

}
