package poly.param;

public class Driver { //일반 클래스
	
	public void drive(Car c) { //특징 부모 클래스 매개변수로 자식들 Ferrari와 Sonata의 변수들을 모두 해결할 수 있음.
		c.run();
		
		//Car c = f; 가능
	}
}
	/*
	 * public void drive(Ferrari f) {
	 * f.run();
	 * } 
	 * 	//오버로딩
     *	public void drive(Sonata s) {
	 *	s.run();
	   }

		원래는 이런식으로 해야되는데 부모 매개 클라스로 퉁침?
	 */


 