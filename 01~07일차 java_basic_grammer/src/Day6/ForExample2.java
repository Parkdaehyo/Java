package Day6;


public class ForExample2 {

	public static void main(String[] args) {

		//7~100까지의 정수 중 7의 배수를 모두 가로로 출력
		// int=i;
		// for(i=7; i<=100; i+=7) 이라고 하면, i는 for문 밖에서 선언되었으므로, 다른 for문에서 int i를 쓸 수 없다.
		for(int i=7; i<=100; i+=7) {
		//  System.out.print(i + " "); 
			System.out.printf("%d ", i); //printf로 문자열로 해서 가로로 출력되게한다
		} // for문의 int i는 여기까지만 효력을 가진다.

		System.out.println("\n------------------------");

		//1~100까지의 정수 중 6의 배수를 모두 가로로 출력
		for(int i=1; i<=100; i++) {
			if(i % 6 == 0) { // 반복은 100번은 돌지만 출력은 if가 true경우에만 출력 된다.
				System.out.print(i + " ");
			}
		}
		System.out.println("\n------------------------");
		
		//1~100까지의 정수 중 8의 배수이면서 동시에 
		//16의 배수가 아닌 수를 모두 가로로 출력.
		for (int i = 1; i <= 100; i++) {
			if(i % 8 == 0 && i % 16 != 0) { // 두 조건을 모두 만족했을때 실행하는 &&
				System.out.print(i + " ");
			}
		}
		System.out.println("\n---------------------------");
		//1~850까지의 정수 중 9의 배수의 개수를 출력하세요.
		int count = 0;
		for(int i=1; i<=850; i++) {
			if(i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수: " + count + "개");
	}

}
