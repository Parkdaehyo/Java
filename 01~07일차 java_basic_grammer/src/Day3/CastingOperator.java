package Day3;

public class CastingOperator {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		//4바이트 int를 char에 넣을 수 없으니, (char)로 변경 된 것.
		char cc=(char)(c+i); // char+int는 결국 형타입은 큰쪽인 int로 치환됨.
		// 유니코드 B의 값은 66이다. i는 2 이므로, 66+2=68 68을 다시 char타입으로 바꾸니 
		// char cc는 유니코드 D의값인 68이 되었다.
		
		int ii=c+i;
		System.out.println(cc);
		System.out.println(ii);
		// int ii는 c+i에서, 작은 형태인 char c는 큰값인 int의 계산과정에서
		// 자동으로 66(B의 유니코드)로 바꿔지기 떄문에 66+2=68 값이 나온다.
		
		int j=10;
		double d=j/4.0; 
		System.out.println(d);
		
		// j/4로 할경우: j는 10이라서 2.5가 출력 되는것이 맞지만
		// int/int이기 때문에 소수를 버리고 2.0만 출력 된다. 
		// j/4.0일 경우 2.5가 출력되는 이유:
		// 4.0이라는 것은 double이 수용할 수 있는 범위의 수다.
		// 이때 , j에 10이 들어갔으므로 결국, int/double 형태가 되므로,
		// 큰쪽을 따라가는 연산이므로, 결국 값은 2.5(double 형태)로 출력이 되고,
		// 이것이 double에 대입되었으므로 출력값은 2.5다.
		
		// int j=10;
//		double d=(double)j/4;
		// 이 경우에도 된다. 이 경우는 int j를 그저 double의 형태로 바꾼 것이다. 4는 int 형태이므로 둘의 연산시 double/int 이므로, 오른쪽 연산 결과 형태는 double이 된다.
		// (double)(j/4)일 경우는 (j/4)가 먼저 실행이 되어서 이미 int 형태가 되었고 이미 int형태가 된 시점에서 앞 double은 효력을 발생하지 못하여 그저 2가 double이 된 형태가 되어서 2.0이 출력된다.
		
		
		
		/*
		 * int형보다 작은 데이터 타입의 연산을 진행 할 경우
		 * 자동으로 int형으로 변환이 이루어집니다.
		 *  
		 */
		
		byte b1=100;
		byte b2=10;
//		byte b3=b1+b2; // 에러 가나옴. (int형으로 변환이 됬기 때문)
		//예컨데 b1=100 b2=70이면 개별적으로는 byte가 받을 수 있으나, b1+b2는 127밖에 받지 못하는 byte의 범위를 초과하기 때문에 
		//애초에 하지 못하도록 강제한것임.
		
		int b3 = b1+b2; //방법 1
//		byte b3= (byte) (b1+b2); 방법2
		// 방법2
		// byte+byte의 연상 결과 형태가 int 이기로 설정했으므로,
		// 다시 (byte)의 형태로 바꿔줌으로써, byte의 형태를 유지할 수 있다.	
		System.out.println(b3);
		
		
		
	}	
		

}
