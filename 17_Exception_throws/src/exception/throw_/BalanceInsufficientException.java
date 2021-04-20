package exception.throw_;

/*
 - 사용자 정의 예외 클래스를 만드려면 Exception클래스나 
   RuntimeException 클래스를 상속받습니다.
 */

public class BalanceInsufficientException extends Exception {
	
	/*
	 - 일반적으로 사용자 정의 예외클래스를 만들 때는 
	   기본생성자와 예외 원인 메시지를 매개값으로 받는 생성자를
	   선언합니다.
	 */
	public BalanceInsufficientException() {}
	
	public BalanceInsufficientException(String message) { //여기에 잔고가 부족합니다.가 전달됨.
		super(message); //"잔고가 부족합니다" 를 Exception 부모에게 올려보냄. 그리하여, Exception 내부에 getMessage()메서드를 호출한다.
		
		//getMessage()라는 메서드가 없는데 어떻게 호출하였는가? Exception 클래스가 상속 내려준 메서드 이다.
	}
}









