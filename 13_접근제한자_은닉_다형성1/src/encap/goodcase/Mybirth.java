package encap.goodcase;

public class Mybirth {
	
	/*
	 * 은닉(캡슐화)을 사용하려면 데이터 참조를 제한할 멤버변수의
	 * 앞에 private제한자를 붙입니다.
	 * 
	 */

	private int year;
	private int month;
	private int day;
	
	/*
	 * 은닉된 멤버변수에 접근하기 위해서는
	 * 클래스 설계자가 미리 만들어놓은 setter/getter메서드를
	 * 사용하여 데이터에 접근해야 합니다.
	 * 
	 * -setter메서드 선언
	 * 1.setter메서드는 은닉변수에 값을 저장시키기 위한 메서드 입니다.
	 * 2.메서드의 접근제한자를 public으로 설정하여 이름은 일반적으로
	 * set+멤버변수이름으로 지정합니다.
	 * 
	 */
	
	public void setDay(int day) {
		if (day<1 || day>31) {
			System.out.println("잘못된 일수 입력 입니다.");
			
		}else {
			this.day=day;
			
		}
	}
	
	/*
	 * getter 메서드 선언.
	 * 1. getter메서드는 은닉변수의 값을 얻어 낼 때 사용하는 메서드입니다.
	 * 2. setter와 마찬가지로 public제한으로 외부에 메서드를 공개하고
	 * 이름은 일반적으로 get+멤버변수이름으로 지정합니다.
	 * 
	 */
	public int getDay() {
		return this.day; 
	}
	

	public Mybirth(int year, int month, int day) {
//		super(); 생략가능
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Mybirth() {} // 
	
	/*
	 * month와 year의 setter/getter메서드를 선언하세요.
	 * month: 1~12
	 * year: 0~3000
	 */
	
	// alt + shift + S or 마우스 우클릭 Source ~using fields
	// 소스코드 48~52번이 생성자가 만들어짐 
	// Generate Getters and Setters
	// --> 메서드 선언의 틀을 만들어줌.
	// Override implement methods

	public int getYear() {
		return year;
	}
 
	public void setYear(int year) {
		if(year> 3000 || year<0) {
			System.out.println("잘못된 연도 입력입니다.");			
		}else {
		this.year = year;
	}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 12 || month<1) {
			System.out.println("잘못된 월수 입력입니다.");
		}else { 
		this.month = month;
		}
	}
 
	
	
	
}
