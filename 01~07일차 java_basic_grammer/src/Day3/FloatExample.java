package Day3;

public class FloatExample {

	public static void main(String[] args) {

		float f1= 7.12345F; //float의 범위이기는 하지만,  형태가 달라서 x 표시됨. 
		double d1=7.12345;
		System.out.println(f1);
		
		float f2=1.23456789123F; // 아무리 숫자를 길게써도 뒤에 F를 붙이면, 소수 7째 자리 숫자 까지만 표현된다.
		double d2=1.234567891234;
		System.out.println("--------------");
		System.out.println(f2);		
		System.out.println(d2);
		
		float f3=3.1415e6F; // 3.1415 x 10^6
		double d3=2.213e-3; // 2.213 x 10^-3
		System.out.println("---------------");
		System.out.println(f3);
		System.out.println(d3);
		
	}
}
