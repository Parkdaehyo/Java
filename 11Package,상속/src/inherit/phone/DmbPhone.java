package inherit.phone;

public class DmbPhone extends Phone { 
	int channel;

	DmbPhone(String pModel, String pColor, int pChannel) {
		model = pModel;
		color = pColor;
		channel = pChannel;
	}
	void turnOnDmb() {
		System.out.println("방송 수신을 시작합니다.");
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 종료합니다.");
	}
	void changeChannel(int pChannel) {
		channel = pChannel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");		
	}
}
