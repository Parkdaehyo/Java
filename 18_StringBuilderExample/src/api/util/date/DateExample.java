package api.util.date;

import java.util.Date;
//날짜의 표현 형식을 바꿔주는 라이브러리 입니다.
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {

		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 d일 HH시 mm분 ss초");
		System.out.println(sdf.format(date)); //소스코드 11번 실행
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf 
		= new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf.format(date));
		
	}

}
