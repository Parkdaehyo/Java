package Day3;

public class BitOperating {

	public static void main(String[] args) {
		
		byte a=5; //0000 0101
		byte b=3; //0000 0011 
		
		//비트곱(and)
		System.out.println(a & b); // 0000 0001 =1x1 1*0 =출력값 1
		
		//비트합(or)
		System.out.println(a|b); 
		// 비트를 모두 더한다. 1+1해서 2가 나오면 1로 생각한다.
		// 0000 0111 2^2=4,2^1=2,2^0=1 = 4+2+1=7	
		//배타적 논리합(xor)
		System.out.println(a^b);// 0101 
								// 0011
								// 0110 같으면 0 다르면 1 따라서 4+2=6
		
		//비트 이동 연산자(<<.>>
		int i=192;
		System.out.println(i<<3); //a를 좌측으로 3칸 이동시켜라.
		System.out.println(i>>2); //a를 우측으로 2칸 이동시켜라.
	} 

}
