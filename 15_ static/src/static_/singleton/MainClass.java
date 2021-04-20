package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1=new Singleton();
//		s1.getInstance();
		
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1); //주소같음
		System.out.println(s2);
				
				
		

	}

}
