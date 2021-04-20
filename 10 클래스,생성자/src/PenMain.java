
public class PenMain { //설계도 실행문

	public static void main(String[] args) {
		
		//Pen의 기능과 속성을 사용하려면
		//설계용 클래스를 로딩시켜 Pen객체를 생성해야 합니다.
		Pen blackPen=new Pen(); 
		
		//객체의 기능과 속성을 사용하기 위해서는
		//참조연산자(.)를 사용합니다.
		blackPen.color="검정";
		blackPen.price=500;  
		blackPen.write();
		blackPen.info();
		
		Pen redPen=new Pen();
		redPen.color="빨강";
		redPen.write();
		blackPen.write();
		redPen.write();
		
		//클래스 안에 선언된 변수의 주소값 확인.
		System.out.println(redPen); 
		System.out.println(blackPen);
		
		//bluePen 객체를 생성하여 write()를 호출하여
		// 파랑색 글을 씁니다를 출력하세요.
		
		Pen bluePen=new Pen();
		bluePen.color="파랑";
		bluePen.price=500;
		bluePen.write();
		
				
		//클래스가 기능하는것을 객체(클래스로 만들어낸것)라고함
		//지역변수:클래스 배우기전에 배운 모든 변수
		
	}

}
