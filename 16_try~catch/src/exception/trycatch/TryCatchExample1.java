package exception.trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int i=10;
		int j=0; //0으로 바꾸면 (i/j) 에러 
		
		//System.out.println(i*j);
		try { //try: 에러가 날 가능성이 있는 코드 작성
		System.out.println(i/j); //에러가 발생하면(Exception 발생) catch로 이동.
		System.out.println("예외 발생 시 이 텍스트는 출력되지 않음");
		}catch (Exception e) { //13번코드를 생략하고 바로 catch문 실행 //Exception은 예외의 최상위 클래스, 다형성에 의해서 이거 하나로 받을 수 있다.
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("i+j: " + i*j);
			
		}
		//System.out.println(i+j);
		//System.out.println(i-j);

	}

}
