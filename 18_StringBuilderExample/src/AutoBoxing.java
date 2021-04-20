import java.util.Arrays;

public class AutoBoxing {

	public static void main(String[] args) {
	
		//AutoBoxing: 기본타입 데이터를 자동으로 객체로 변환
		//자바 10버전부터는 오토박싱 기능만을 사용하도록 권고 하고 있습니다.
		int a=100;
		
		Integer val1=a; //Integer val1 = new Integer(a)를 하지않고, String에다 대입하듯이 바로 대입.
		Double val2=3.1415;
		
		Object [] arr= {56,3.154,"안녕",99,200.12}; //이렇게써도 자동 프로모션이 된다.?
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));// to String: they are converted to strings by the Object.toString() method inherited from Object,
		
		//AutoUnboxing
		int x=val1; // Integer로 객체화된 val1 변수를 다시 int 형으로 해체.
		double y=val2+5.3; // Double+double //객체화된 Double을 자동으로 해체한 후 계산진행.
		System.out.println(y);
		
		//Parsing: 문자열 데이터를 기본타입으로 변환
		String s1="10";
		String s2="5.43";
		
		int i=Integer.parseInt(s1); 
		double j=Double.parseDouble(s2); 
		boolean k=Boolean.parseBoolean("true");
		System.out.println(k);
		System.out.println(i*j);
		
}		
}