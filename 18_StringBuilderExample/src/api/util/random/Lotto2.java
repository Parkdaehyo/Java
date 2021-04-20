package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {
	
	public static void main(String[] args) {
		
		/*
		 * <로또 번호 출력하기>
		 * 
		 * 1. 로또 번호 6개를 담을 배열을 생성하세요.
		 * 2. 정수 1~45 범위의 난수를 6개 발생시켜 배열에 담으세요.
		 * 3. Array.sort 메서드를 사용하여 
		 * 배열을 오름차순으로 정돈하세요. 
		 * 
		 */
		
		int[] win = new int[6];
		Random r = new Random();
		
		int i=0; //0번 인덱스부터 5번인덱스의 범위
		boolean check = false;
		
		while(true) { //무한루프 while(true)
			int rn = r.nextInt(45)+1; //1이상 45미만 정수의 난수를 발생시킨다.
		
		for(int j=0; j<=i; j++) { //j는 0부터 시작하고 i번 이하까지 반복하므로 0이라는 숫자가 들어간다.
			if(rn == win[j]) { // ex) rn이 45라면, if 45 == win[0] == 0인데, 그러면 45 == 0이므로,if문은 false 이므로 
				check = false; //중복값이 생기면  [36번]
				break; //두번재 반복시 j는 0,1이 들어갈 수 있다. ex) 12 = win[1]이라면,
			}
			check = true; //최초발생시 if문은 false이므로, check = true;가 된다. [36번] 이 check = true문을 무시하고,
		}
		if (check) { //check == true이므로, [36번] 여기서 check == false가 되었으므로 무시하고,
			win[i] = rn; //win[0] = 45;가 대입된다, win[1] = 12;
			i++; //int i = 0이였던 i가 1이 된다.
		}
		if (i == 6) break; //i [1 != 6]이 되므로,아래 System.out.prinln의 출력문으로 가지않고, [36번] 조건에 만족하지 않으므로 다시 무시되고 다시 while(true)문으로 이동한다.
		
		} // while(true)로 돌아간다.
		Arrays.sort(win);
		System.out.println(Arrays.toString(win));
		
	
		
		
		
		
	}

}
