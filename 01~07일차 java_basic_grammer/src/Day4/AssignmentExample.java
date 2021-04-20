package Day4;

public class AssignmentExample {

	public static void main(String[] args) {
		
		int a=5, b=5;
		
		a+=3; //a=a+3 a에 5를 대입하고 +3해서 다시 a로 대입하라. ==개념이 아니다.
		//간단하게 말하면,a에 3을 누적하세요. 의 의미다.
		b=+3; //b=+3; b에 양수 3을 저장하라. b는 원래 5였는데 양수 3을 저장하라고 했으니, 데이터 값이 5->3으로 변경 된 것이다.
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		
		System.out.println("---------");
		a-=4; // a의 현재값에 4를 빼서 저장하라.
		System.out.println(a);
		a*=6; // a의 현재값에 6을 곱해서 저장하라.
		System.out.println(a);
		
		a/=5; // a에서 5를 나눈 몫을 저장하라.
		System.out.println(a);
		
		a%=3; //a에서 3을 나눈 나머지를 저장하라.
		System.out.println(a);
		
		
		
	}

}
