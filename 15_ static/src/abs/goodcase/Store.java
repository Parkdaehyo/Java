package abs.goodcase;

public class Store extends HeadStore {
	
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 2000원 입니다.");
	}
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 4800원 입니다.");
	}
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 3000원 입니다.");
	}
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3000원 입니다.");
	}
	@Override 
	public void orderWaterMelon() {
		System.out.println("수박 쥬스의 가격은 4500원 입니다.");
	}
	
//	public void orderPeach() { //final은 안됨.
//		System.out.println("복숭아 쥬스의 가격은 2500원 입니다.");
//	}

}
