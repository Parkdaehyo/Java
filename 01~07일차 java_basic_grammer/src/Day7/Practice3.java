package Day7;

public class Practice3 {

	public static void main(String[] args) {



		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한번에 탈출시키려면 외부 반복문에 label을 붙입니다.
		 */

		abc:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);

				if(lower == 'f') break abc;
				}
			}
		}
	}





