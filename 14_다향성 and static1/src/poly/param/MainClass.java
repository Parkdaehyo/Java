package poly.param;

public class MainClass {

	public static void main(String[] args) {
		
		Driver kim=new Driver();
		Ferrari f=new Ferrari();
		Sonata s=new Sonata();
		
		kim.drive(f); 
		kim.drive(s);  
		//kim.drive(new Sonata());
		

	}

}
