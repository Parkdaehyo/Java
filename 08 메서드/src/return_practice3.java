import java.util.Scanner;

public class return_practice3 {

	public static int add(int n1, int n2) {
		
		return n1+n2; //로직을 실행한후에 다시 부른 메서드에게 되돌아간다.
	}
	
	public static int[] totalOperate(int n1, int n2) {
		
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		
		return total; //total이 위 로직을 실행시킨 다음 return에 의해서 totalOperate(10,20) 메서드로 되돌아간다.
	}
	//반환값이 없는 void 메서드
	public static void callMyName(String name) { //김철수 받고
		if(name.length()<2) {
			System.out.println("이름을 2글자 이상으로 입력하시오..");
			return; // 위 메서드를 실행한 후 다음 메서드는 실행 안되게함.
		}
		
		System.out.println("내이름은 " + name + "입니다."); //내 이름은 김철수 입니다 끝. 반환값이 없다.
	
	}
	
	public static void main(String[] args) {
		
	int r =	add(3,5);
	System.out.println(r);
	
	//메서드 안에 메서드를 넣는 개념.
	int r2 = add(add(4,6),add(8,7));
	System.out.println(r2);
	

	int [] tot=totalOperate(10,20); 
	System.out.println("10+20= " +tot[0]);
	System.out.println("10-20= " +tot[1]);
	System.out.println("10*20= " +tot[2]);
	System.out.println("10/20= " +tot[3]);
	
	callMyName("김철수"); //자 김철수줄게?
	
	System.out.println("------------------------------");
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하시오..: ");
	String name = sc.nextLine();
	callMyName(name);
	
	sc.close();
	}
}
