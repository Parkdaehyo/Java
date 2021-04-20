package Day3;

public class UnaryExample {

	public static void main(String[] args) {
		
		//증감연산자 ++,--
		int i=1;
		int j=i++; // 후위 연산자. 1. j에 i 대입, 2. ++는 후에 i에 영향을 끼침. 결과적으로 i가 +1 증가함. 따라서 j는 1 i는 2
		// i는 곧바로 j로 대입되어 j는 1이됬지만 i는 대입하고 난 후 ++에 의해서 2가됨.
				
		System.out.println("i의값:" + i);
		System.out.println("j의값:" + j);
		System.out.println("----------------------");
		
		int x=1;
		int y=++x; //전위 연산자 x가 y에 대입되는 과정에서 ++를 만나서 x가 2가되고 y도 2가됨.
		System.out.println("x의값:" + x);
		System.out.println("y의값:" + y);

		System.out.println("---------------------");
		
		int result;
		int result2;
		int val1 =10;
		int val2 =20;
		result = val1 % val2; // 10을 20으로 나누면 몫이 0, 나머지가 10이기 때문입니다
		result2 = val1/val2;
		System.out.println(val1+ "%" + val2 + "=" + result);
		System.out.println(val1+ "/" + val2 + "=" + result2);
		
		
	}

}
