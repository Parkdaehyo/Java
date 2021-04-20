package static_field;

public class MainClass {

	public static void main(String[] args) {
	
		Count c1=new Count();
		
		c1.a++;
		c1.b++;
		
		System.out.println("일반 멤버변수a: " + c1.a);
		System.out.println("정적 멤버변수b: " + c1.b);
		
		Count c2=new Count();
		
		c2.a++;
		c2.b++;
		System.out.println("일반 멤버변수a: " + c2.a);
		System.out.println("정적 멤버변수b: " + c2.b);
	 	
		/*
		 * static 멤버는 객체와 무관하기 떄문에 클래스 이름만으로
		 * 참조하여 사용합니다.
		 */
		
		Count.b++; //클래스 이름으로 참조가능한 변수
		Count.b++;
		Count.b++;
		System.out.println(c1.b); //c1,c2,Count의 b는  하나의 데이터에서 보관하여 같이 쓰는 변수다.
		System.out.println(c2.b);
		System.out.println(Count.b);
		
	 	
	}
		
}
