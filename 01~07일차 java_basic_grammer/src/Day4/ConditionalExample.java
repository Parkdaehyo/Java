package Day4;

public class ConditionalExample {

	public static void main(String[] args) {
		
		//-4~-5까지의 정수 난수값을 발생
		
		int r=5 - (int)(Math.random()*10);//Math.random은 double, 10은 int 결과는 double(큰 쪽으로 맞춤)
		System.out.println("랜덤값:" + r);
				
		//3항 조건연산자 (조건식? 연산식1: 연산식2) 조건식이 참이면 연산식 1,거짓이면 연산식 2
		int abs=(r>=0) ? r:-r; 
		//r이 0보다 크냐? 그러면 r 아니면 -r, r=3이면 -r은 무시하고, abs에 3을 대입하라.
		//ex) r= -2 라면 -r*(-2) 실행:=2 abs =2, 다만 r 자체는 -2.
		
		System.out.println(r+"의 절대값은:"+abs);
		// 따라서 r은 -2 abs는 -r*(-2)에 의해서 +2
	}
		// int r=(int)[Math.random(1*10)]+1
		//[]순위, .(math 함수) 2순위, * 3순위, 4 (int), +1 5순위, = 6순위
}
