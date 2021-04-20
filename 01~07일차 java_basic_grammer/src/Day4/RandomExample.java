package Day4;

public class RandomExample {

	public static void main(String[] args) {
		
		//난수(랜덤값)을 발생시키는 메서드 random()
		//0.0이상 1.0미만의 랜덤 실수값을 가져옴.
		
//		double r = Math.random()*10; .은 함수를 부를때 사용.
		double r = Math.random(); // Math.random은 double value 이다. double 값 변수에 적용해서 사용한다.
//		System.out.println("랜덤값:" + r);
		
		//정수 난수 생성하기
		int rn=(int)(r*10)+1; 
		
		/*
		//r은 double인데 int에 저장하려고하니, (int) 를 넣어서 저장시킨다.
		// (int)r*10은 (int)*r이 먼저 실행된다. 따라서 (r*10)을 해주면 이것을 먼저 처리한다.
		//r의 데이터타입:double을 int형에 저장하려고 하니까 에러가 나는것이다.
		// r은 0부터 1까지인데 강제로 정수로 반환하려하니 0.xxxxx에서의 소수점이 모두 탈락되고 0만 들어가게되는 것이다.
		*/
		
		System.out.println("정수 난수값: " + rn);
		
		
		System.out.println("--------------------");
		System.out.println("*** 신년 여행지 선정! ***");
		if(r>0.66) {
			System.out.println("모로코로 갑시다!!!");
		}else if(r>0.33) {
			System.out.println("상하이로 갑시다!!!");
		}else {
			 System.out.println("집에서 놉시다!!!");
		 }
		 
		}

	

}
