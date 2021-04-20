package api.lang.wrapper; 

import java.util.Arrays;

//Wrapper 클래스
public class Boxing {

	public static void main(String[] args) {
		
		int a=100;
		double b=3.51;
		char c='H';
		boolean d=false;
		
		//Boxing: 기본타입의 데이터를 객체타입으로 변환
		Integer val1=new Integer(a);
		Double val2=new Double(b);
		Character val3=new Character(c);
		Boolean val4=new Boolean(d);
		Byte val5=new Byte((byte)(75)); //75는 int이므로 byte로 형변환
		String val6=new String("hello");
		
		//각각의 값들을 객체로 포장했기 때문에 그 상위클래스들의 모두의 부모 Object 클래스의 배열로써 활용시킬 수 있다.
		//정수,실수 등을 한꺼번에 포장이 가능.
		Object[] arr= {val1,val2,val3,val4,val5,val6};
		System.out.println(Arrays.toString(arr));
		
		//unboxing: 포장된 데이터를 다시 기본타입으로 변환.
		//포장클래스가 제공하는 기본타입이름+Value()메서드 이용.
		//원론적이고 불편한 방법. -->그러나 이 방법은 좀 불편해서 사용안한다고함.
		int i=val1.intValue(); //다시 기본타입으로 변환.(해체)
		double j=val2.doubleValue();
		char k=val3.charValue();
		boolean x=val4.booleanValue();
		byte y=val5.byteValue();
	}

}
