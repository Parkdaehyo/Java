
public class Variable {

	//필드(멤버변수) 선언.-->클래스가 직접적으로 가지고 있는 변수 // 초기화(=,선언) ex)int a= 3; 하지 않으면 기본값으로 자동 초기화(자동 초기화값:0)
	int a; //a는 객체를 생성하지 않으면 쓸 수가 없는 변수다. 
	
	void printNumber(int c) { //int c값(정수)를 주지 않으면 이 메서드는 실행되지 않는다.
		//메서드블록{}에서 만들어진 변수를 지역변수라고 함.
		//지역변수 b와 매개 변수 c를 선언.
		int b=1; //지역변수는 반드시 값을 초기화해야 합니다.
		// a,b,c는 모두 다른 위치에 저장.
		
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c); 
	}
	
	public static void main(String[] args) {
		
		Variable v= new Variable();
		v.printNumber(5); // class에 있는 void printnumber(int c)를 불러온다.
	}
}
