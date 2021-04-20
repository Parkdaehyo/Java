package exception.throw_;

public class Account {
	
	private long balance; //잔액을 저장할 변수
	
	public long getBalance() { //은닉된 변수라서 getter메서드 설정.
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//throws가 붙으면 무조건 try ~ catch문을 실행시켜야한다.
	public void withDraw(int money) throws BalanceInsufficientException {
		
		if (balance < money) { // 10000원 < 11000원 이므로 (if문이 트루)
			//사용아 정의(임의) 클래스를 만드는것.
			throw new BalanceInsufficientException("잔고가 부족합니다."); //생성자 호출
			//BalanceInsufficientException(String)의 생성자가 호출됨. F3
			
		}		
		balance -= money; // balance = balance - money
	}
	
}



