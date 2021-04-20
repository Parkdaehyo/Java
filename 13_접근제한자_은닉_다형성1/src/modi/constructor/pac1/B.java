package modi.constructor.pac1;

public class B {

	A a1=new A(false); //public 제한자 생성자 호출(0) --> public은 아무대서나 써도됨.
	A a2=new A(55); // p.f제한자 생성자 호출(0) --> 같은 패키지 안에 있으니 된다.
//	A a3=new A("bye"); // private 제한자 생성자 호출(x) 
}
