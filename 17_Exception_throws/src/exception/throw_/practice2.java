package exception.throw_;

public class practice2 {
	
	public static void main(String[] args) {
		
		int splash = 0;
		
		while(splash<=10) { //splash은 10이하 실행
			System.out.println("튀어오르기! 그러나 아무 일도 일어나지 않았다.");
			splash++; //증가
			
			if(splash == 5) {
				
				break; //5가 될때 
			}
		}
		
		for(int i=10; i<=100; i++) {
			
			if (i%10 != 0) { //i를 10으로 나눴을때, 나머지 연산이 0이 아니면, //if(i%10 ==0)인 경우, //100 이하를 10으로 나눴을때 나머지가 0이면, 
				continue;                                       //그 값은 출력하지 않고 다음회차를 실행한다.
			}
			System.out.println(i);
			
		}
		
		
		int hang =0;
		
		for(int dan=2; hang<=9; hang++) {
			System.out.printf("%d x %d = %d\n",
					dan,hang,dan*hang);
		}
		
		
	}

}
