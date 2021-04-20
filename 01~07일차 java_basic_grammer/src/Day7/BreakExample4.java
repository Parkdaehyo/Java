package Day7;


public class BreakExample4 {

	public static void main(String[] args) {
		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한번에 탈출시키려면 외부 반복문에 label을 붙입니다.
		 */
		
		u_case: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower == 'f') break u_case;
			}
			
		}

	}

}
