package Day3;

public class BinaryOperator {

	public static void main(String[] args) {
		// 산술연산(+,=,*,/,%)
		int i=7/3;
		int j=7%3; // 나머지값을 구해줌.
		System.out.println("7에서 3을 나눈몫은: "+i);
		System.out.println("7에서 3을 나눈 나머지는: "+j);
//
		//비교연산(<,<=,>,>=,==,!=)
		System.out.println(i==j);
		System.out.println(20>=20);
		System.out.println(130<50);
		
		System.out.println("----------------");
		
		int a=10/2;
		System.out.println(a);
		int b=20/3;
		System.out.println(b);
		
		System.out.println(a==b);
		System.out.println(100>=100);
		System.out.println(130<=100);
		
		System.out.println("-----------------------------");
		int c = 1%2;
		System.out.println(c);
		
		int dan;
		int hang;
		
		for(dan=2; dan<10; dan++) {
			if(dan%2==1) {
				continue; 	
			}
			for(hang=1; hang<10; hang++) {
				//참이면 출력문을 실행하지 않고 다음회차의 for문을 실행함?
			System.out.println(dan + "x" + hang + "=" + dan*hang);
			
			}
				
			System.out.println("---------------------");
		}
			
			
	} 

}
