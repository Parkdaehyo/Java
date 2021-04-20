package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		//Dmb폰 객체 생성
		DmbPhone dp = 
				new DmbPhone("햅틱", "메탈그레이", 10);
		//Phone클래스에서 상속받은 멤버 변수에 접근
		System.out.println("모델: " + dp.model);
		System.out.println("색상: " + dp.color);
		//DmbPhone에서 선언한 멤버 변수에 접근
		System.out.println("채널: " + dp.channel);
		//Phone에서 상속받은 메서드 호출
		dp.powerOn();
		dp.ring();
		dp.hangup();
		//DmbPhone에서 선언한 메서드 호출
		dp.turnOnDmb();
		dp.changeChannel(7);
		dp.turnOffDmb();
		dp.powerOff();


	}

}
