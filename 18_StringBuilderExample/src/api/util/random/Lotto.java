package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static int[] createLotto() {
		int[] lotto = new int[6];
		
		Random r = new Random(); //랜덤 객체
		
		int i = 0;
		boolean check = false;
		while(true) {
			int rn = r.nextInt(45) + 1;
			for(int j=0; j<=i; j++) {
				if(rn == lotto[j]) {
					check = false;
					break;
				}
				check = true;
			}
			if (check) {
				lotto[i] = rn;				
				i++;
			}
			if (i == 6) break;
		}
		Arrays.sort(lotto);
		
		return lotto;
	}

	public static void main(String[] args) {
		/* <로또 번호 출력하기>
		 * 1. 로또 번호 6개를 담을 배열을 생성하세요.	 
		 * 2. 정수 1~45 범위의 난수를 6개 발생시켜 배열에 담으세요.
		 * 3. Arrays.sort(배열이름) 메서드를 사용하여 
		 *    배열을 오름차순으로 정돈하세요.
		 */
		int[] win = createLotto();
		int[] my_lotto = createLotto();
		
		
		System.out.println(Arrays.toString(win));
		System.out.println(Arrays.toString(my_lotto));
		
		int cnt = 0;
		
		for (int i : my_lotto) {
			for (int j : win) {
				if(i == j) {
					cnt += 1;
				}
			}
		}
		
		if(cnt == 6) {
			System.out.println("1등!!");
		}else if(cnt == 5) {
			System.out.println("3등!!");
		}else if(cnt == 4) {
			System.out.println("4등!!");
		}else if(cnt == 3) {
			System.out.println("5등!!");
		}else if(cnt == 2) {
			System.out.println("숫자가 2개 일치함!");
		}else {
			System.out.println("꽝!!!");
		}
		
				

	}

}



