package Day7;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] weekDay = {"일", "월", "화",
	            "수", "목", "금", "토"};

//for(int i = 0; i < weekDay.length; i++) {
//System.out.println(weekDay[i] + "요일");
//}

for(String day : weekDay) {
System.out.println(day + "요일");
}

System.out.println("---------------------");

int[] scores = {98, 71, 85, 67, 100, 95};

//향상된 for문을 사용하여 총점과 평균을 출력하세요.

		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총점: " + sum + "점");
		
		double avg = (double)sum / scores.length; // 소수점으로 나타내고 싶어서, double로 형 변환을 하였음.
		System.out.println("점수 평균: " + avg + "점");
	}

}
