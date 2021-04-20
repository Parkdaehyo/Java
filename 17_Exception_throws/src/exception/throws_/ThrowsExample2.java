package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception {
		System.out.println("aaa 호출!");
		int i = 10 / n;
		System.out.println("계산결과: " + i);
		System.out.println("aaa실행 종료!");//aaa실행 종료! 이후에
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb 호출!");
		aaa(0); //메서드의 결과를 처리한 이후에
		System.out.println("bbb실행 종료!"); //bbb실행종료! 실행.
	}
	
	public void ccc() throws Exception {
		System.out.println("ccc 호출!");
		bbb(); //bbb() 메서드가 완전히 종료 되었으니 
		System.out.println("ccc실행 종료!"); //실행
	}
	
	public ThrowsExample2() throws Exception {
		System.out.println("생성자 호출!!");
		ccc(); //ccc()메서드가 완전히 종료해야만 27번 코드실행.
		System.out.println("생성자 실행 종료!"); //실행.
	}
	
	public static void main(String[] args) {
		
		
		try { //호출부에서 계속 떠넘겨서 main 실행부에서 예외처리를 하게 되었음.
			ThrowsExample2 te = new ThrowsExample2(); //new ThrowsExample2가 최초로 실행.
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("안녕");
		}
		
	}
	
}





