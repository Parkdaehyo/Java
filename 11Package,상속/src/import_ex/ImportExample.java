package import_ex;

/*
 * 다른 패키지에 있는 클래스 사용시 package 선언부 아래,
 * class 선언부 위에 import 선언을 통하여 해당 클래스의
 * 전체 경로(패키지명 까지 포함된 경로)를 적어줘야함. (같은 패키지 내에서는 import로 안 불러도된다.)
 * 소스코드 13~14참조.
 * 
 */
import java.util.Scanner;


//import fruit.Apple; import로 부르는 경로.
//import fruit.Banana;

import fruit.*; //fruit 패키지 전체 클래스를 import 하는법.
import hello.bye.Bye;
import hello.good.Good;
import hello.hi.Hi; // hello.hi 패키지에 Hi를 부름.


public class ImportExample {

	public static void main(String[] args) {

// com·pile  
//1.(여러 출처에서 자료를 따와) 엮다, 편집하다   2.명령어를 번역하다

		Apple a=new Apple();
		Banana b=new Banana();
		Test t= new Test();
	    
		Hi h=new Hi();
		Bye y= new Bye();
		Good g=new Good();
		
		Scanner scan=new Scanner(System.in);
		
	}
}
