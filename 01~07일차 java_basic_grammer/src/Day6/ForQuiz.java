package Day6;
import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수: ");
		int dan = sc.nextInt();
//		int dan = (int) (Math.random() * 8) + 2;	

		System.out.println("구구단 " + dan + "단");
		System.out.println("---------------");
		for(int hang=1; hang<=9; hang++) {
			System.out.println(dan + " x " 
					+ hang + " = " + dan*hang);
		}
		sc.close();
	}

}


