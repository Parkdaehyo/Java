package Day4;

public class LogicalOperating {

	public static void main(String[] args) {
		// 논리연산자 (&,&&,|,||)
		
		int x=10, y=20;
		
		//if뒤에 조건식의 결과가 true이면 if블록 내부코드를
		//실행하고 false면 else블록의 내부코드를 실행한다.
		
		if((x!=10) & (++y==21)) { //좌항 먼저. false / ++y= y의 값을 1올려라. 즉 21==21
			System.out.println("연산결과가 참입니다.");
		}else {
			System.out.println("연산결과가 거짓입니다."); // &은 둘다 True일 경우에만 True가 출력됨.
			
		}
		System.out.println("x:"+x+",y:"+y); 
		
		if((x==10) | (++y==21)) {// y는 위 연산에서 이미 21이 되었으므로, 이 상테에서 ++y를 하면 y는 22
			System.out.println("연산결과가 참입니다.");  
	   }else {
			System.out.println("연산결과가 거짓입니다.");
	   }	
		System.out.println("x:"+x+",y:"+y);	 // | 은 한쪽이 True여도 결과는 True.
		
		System.out.println("-----------------");
		
		int a=10,b=20;
		
		if((a!=10) && (++b==21)) {//좌항이 false이므로 우항은 무시하겠다.(우항 연산 안함)
			System.out.println("연산결과가 참입니다.");
		}else {
			System.out.println("연산결과가 거짓입니다.");
			
		}
		System.out.println("a:"+ a +",b:"+b);
		

		if((a==10) || (++b==21)) { //좌항이 true이므로 우항은 무시하겠다.(우항 연산 안함)
			System.out.println("연산결과가 참입니다.");
	   }else {
			System.out.println("연산결과가 거짓입니다.");
	   }	
		System.out.println("a:"+a+",b:"+b);	
	   }
}
	













