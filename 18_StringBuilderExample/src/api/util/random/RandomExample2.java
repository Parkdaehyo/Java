package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample2 {

	public static void main(String[] args) {
		
		Random r = new Random();
	
		//0.0이상  1.0미만의 실수 난수를 리턴
		double d = r.nextDouble();
		System.out.println("실수 랜덤값: " + d);
		
		//논리 랜덤값을 리턴하는 nextBoolean() true or false를 리턴
		boolean b = r.nextBoolean();
		System.out.println("논리 랜덤값: " + b);
		
		//정수 랜덤값을 리턴하는 nextInt()
		//정수 int가 [저장될수있는, 수용할 수 있는] 모든 범위 내에서 난수가 발생.
		
		int i = r.nextInt();
		System.out.println("정수 랜덤값: " + i);
		
		//정수 0이상 20미만의 난수를 발생.
		i = r.nextInt(20);
		System.out.println("정수  0이상 20미만: " + i);
		
		i = r.nextInt(100)+1;
		System.out.println("정수: 1~100 까지: " + i);
		
		
		
	}
}
