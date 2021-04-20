package Day5;

public class SwitchExample2 {

	public static void main(String[] args) {
	
		String[] foods= {"비빔밥","사시미","북경오리","카레","똠얌꿍"};
		
		
		// index범위의 난수 발생시키기
		int idx=(int)(Math.random()*5); // random값은 0이상 1미만, *5를 하면 0이상 5미만이 된다.
		System.out.println("선택된 음식:"+foods[idx]);
		
		switch(foods[idx]) {
		
		case "비빔밥":
			System.out.println("한식입니다.");
			break;
		case "사시미":
			System.out.println("일식입니다.");
			break;
		case "북경오리":
			System.out.println("중식입니다.");
			break;
		default:
			System.out.println("기타 해외요리입니다.");

		}
	}

}
