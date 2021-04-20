package exception.throws_;

public class ThrowsExample1 {
	
	public static String[] greetings = {"안녕", "니하오", "헬로"};
	
	public static void main(String[] args) {		
		
		
		/*
		 * throws가 붙어있는 메서드나 생성자를 호출 할 때는
		 * 반드시 try 블록 내부에서 호출하여 예외처리를 진행해야 합니다.
		 * 
		 * 또는 또 다시 throws하여 예외처리를 다시 한번 떠넘길 수 있습니다.
		 * 
		 */
		try {
			greet(3);
		} catch (Exception e) {
			
			/*
			 * printStackTrace()는 예외발생 경로를 추적하는
			 * 메세지를 출력해줍니다.
			 * 주로 개발과정에서 예외의 원인을 찾을 때 유용하게 사용합니다.
			 * 
			 * 
			 */
			// TODO Auto-generated catch block
			e.printStackTrace();//스택의 경로를 추적해서 출력한다. 에러가 발생시, 콘솔에 빨간 메세지를 보고 싶을때 작성한다.
		//System.out.println("안녕");
		}
		System.out.println("프로그램 정상종료!!");
}

	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 잇을 경우
	 * 예외처리를 메서드 호출자에게 떠넘기는 방식을 throws라고 합니다.
	 * 
	 * 메서드나 생성자 호출시 예외처리를 강요하고 싶을 때 사용합니다.
	 * 
	 */
	
	public static void greet(int index) throws Exception {
		//throws Exception: 예외가 발생하면 떠넘길게 여기서 처리안한다.

			System.out.println(greetings[index]);
			
	
	}
	
}

