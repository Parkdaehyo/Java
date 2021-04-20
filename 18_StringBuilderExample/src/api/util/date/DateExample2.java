package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {
		
		/*
		 * Date date = new Date(); System.out.println(date);
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 d일 HH시 mm분 ss초");
		 * System.out.println(sdf.format(date));
		 * 
		 * sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		 * System.out.println(sdf.format(date));
		 * 
		 * sdf = new SimpleDateFormat("오늘은 E요일 입니다. 오늘은 1년중 D번째 날입니다.");
		 * System.out.println(sdf.format(date));
		 */
		
		int[] win = new int[6];
		int i = 0;
		win[i] = 45;
		i++;
		System.out.println(i);
		System.out.println(Arrays.toString(win));
	}
}
