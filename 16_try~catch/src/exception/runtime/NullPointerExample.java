package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		
		String str=null; 
//		str="HELLO"; //Hello라는 문자열 객체가 있다면 9번코드가 제대로 실행이 됬을것이다.
		System.out.println(str.toLowerCase()); //소문자로 바꾸는 문법
//		pen p=null; //객체가 없는 상태에서 .(참조)를 사용할 경우 발생하는 에러
		//실행시키면 nullpointerException이 뜨는데, 객체를 참조할 주소값이 없기 때문에 나는것이다.
		//str이 null값이므로 toLowerCase()로 소문자로 바꿀수가 없다.
		

	}

}
