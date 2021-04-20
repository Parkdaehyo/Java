package api.lang.sb;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ");
		
		//문자열을 맨 끝에 추가하는 메서드 append()
		sb.append("Program Study"); //추가 --> 문자열 객체 1개.
		System.out.println(sb);
		
		
//      이와 같은 방식은 메모리의 과부하를 일으킬 가능성이 높다.		
//		String str="Java ";
//		str=str+"Program Study"; --> 문자열이객체 2개
//		System.out.println(str);
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		sb.insert(12, "ming"); //12번자리에 ming을 삽입하라.
		System.out.println(sb);
		
		//특정 인덱스 범위의 문자열을 교체하는 메서드
		sb.replace(5, 16, "Book"); // 5번이상 16번미만의 인덱스를 Book으로 대체하라.
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드 delete(begin,end)
		//Java Study
		sb.delete(4, 9);
		System.out.println(sb);
		System.out.println(sb.length());
		
	}

}
