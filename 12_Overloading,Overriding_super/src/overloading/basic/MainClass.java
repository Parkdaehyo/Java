package overloading.basic;


public class MainClass {

	public static void main(String[] args) {
		
		
		Basic b = new Basic(); // 실행 클라스
		b.input(5);
		b.input("하이");
		b.input(5, 10);
		b.input(3.14, "하하");
		b.input("바이", 5.5);
		
		
		

	}

}
