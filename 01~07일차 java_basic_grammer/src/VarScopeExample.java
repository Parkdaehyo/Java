
public class VarScopeExample { //varaiable scope 변수의 범위

	public static void main(String[] args) {
		
		//같은 타입의 변수를 선언할때는 콤마로(,) 나열 가능
		int num1=30,num2=20;
		
		if(num1>5) {
			int num3=num1+num2; 
			System.out.println(num3);
		}//num3는 11번을 넘어가면 메모리에서 삭제됨. 블록구조 주의
//		int num4=num1+num3; (X) --> num3은 삭제됨.
//		int num1; (X) --> num1은 여전히 main{}에 걸려있음.
		int num3=30; // 따라서 다시 num3을 변수로 쓸 수 있음.8ㅑ
		System.out.println(num3);
	}

}
