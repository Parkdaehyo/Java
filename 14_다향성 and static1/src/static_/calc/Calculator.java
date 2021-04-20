package static_.calc;

public class Calculator {
	
	/*
	 - 계산기별로 색깔이 다를 수 있기 때문에 color같은 변수는
	 데이터를 공유시켜서는 안됩니다.
	 - 하지만 pi같은 원주율값은 계산기마다 동일하기 때문에
	 공유해서 사용하는것이 더 바람직합니다. (static)
	 
	 */
	private String color; // 컬러는 다를 수 있지만
	public static double pi; // 원주율은 달라지면 안된다.
	
	/*
	 * 일반 멤버변수를 사용하고 있는 메서드는 정적메서드로 선언하면 안됩니다.
	 * 
	 */
	public void setColor(String color) {
		this.color=color; // 알려줘야하는 메서드는 정적메서드 선언(x)
	}
	public String getColor() {
		return color;		
	}
	
	/*
	 -메서드 내부에서 일반 멤버변수를 참조하지않고, 범용성 있게
	 사용되는 메서드는 static키워드를 사용하여 정적메서드로 선언하는것이
	 좋습니다.
	 
	 Static 메서드 안에서는 non-static 멤버 직접 참조못함
	 (단, 객체 생성을 통해 참조가능함)
	 */
	public static double areaCircle(int r) { //원주율은 공유해야되기 때문에 빠르게 공유 메서드를 사용하도록함
		return r*r*pi;
	}
}

	