package static_.init;

public class Computer {

	public static String company="LG";
	public static String model="gram"; 
	public static String info;
	public int price;
	
	public Computer() { //ctrl+space
		System.out.println("생성자가 호출됨!");
		this.price=100000;
		this.info=company+"-"+model;
		
	}
	
	// 정적 변수의 초기화를 위해서는 정적 초기화자를 사용해야 합니다.
	static { //static 블록: static,변수,메소드만 사용가능.
		System.out.println("정적 초기화자 호출!");
		info=company+"-"+model;
//		price=1000000;(x) non-static은 참조불가.
		
		
	}
}
