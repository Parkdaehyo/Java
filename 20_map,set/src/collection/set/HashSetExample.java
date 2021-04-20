package collection.set;

import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		
		//Hashset<>();은 클래스 이름.
		Set<String> set = new HashSet<>(); //HashSet은 클래스 생성자
		
		//set에 객체 추가 add()
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥");
		
		//set에 저장된 객체의 수를 알아보는 메서드 size()
		//중복 데이터 허용 x , 저장순서는 보장하지 않음.
		System.out.println("set에 저장된 객체 수:" +set.size()); //김밥의 중복허용 불허
		System.out.println(set);
		
		
		/*
		 -Set의 객체 데이터를 사용하려면 반복자(Iterator)를
		 통해 모든 객체를 대상으로 한번씩 반복해서 꺼내야 합니다.
		 */
		//set.Iterator()는 String으로 리턴하는 타입이므로 이렇게 써야 한다.
		 //next(): 컬렉션에서 하나의 객체를 가져옴.
		 Iterator<String> iter = set.iterator();
		/*
		 String s = iter.next();
		 System.out.println(s);
		 s = iter.next();
		 System.out.println(s);
		 s = iter.next();
		 System.out.println(s);
		 s = iter.next();
		 System.out.println(s);
		 */
		 
		 /*
		  -반복자 객체가 next()메서드를 통해 set 내부의 데이터를
		  반복 소진 할때 더이상 조회할 데이터가 없으면 예외를 발생시키기
		  때문에, hasNext()를 통해 더 이상 소모할 데이터가 있는지의 유무를
		  체크 합니다.
		  */
		
		 while(iter.hasNext()) {  //hasNext(): 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴
			 String s = iter.next();
			 if(s.equals("닭강정")) {
				 System.out.println(s + " 맛있어~~!");
				 break;
				 
			 }
		 }
		 
		 //set의 데이터 삭제 기능 remove(), clear()
		 set.remove("단무지"); //인덱스 번호가 없기때문에 무조건 객체값을 직접 지정해야함.
		 System.out.println(set);
		 
		 set.clear(); //완전 삭제
		 
		 if(set.isEmpty()) {
			 System.out.println("set이 비어있음.");
			 
		 }else {
			 System.out.println("set이 비어있지 않음.");
		 }
	}
	
}

/*
 * 해설: HashSet 클래스는 Set 인터페이스를 구현한 컬렉션이므로,
 * 저장된 객체의 순서를 보장하지 않고 중복을 허용하지 않습니다.
 * 
 * HashSet을 사용하면 많은 양의 데이터를 관리할 때 추가/삭제/검색 등에 
 * 있어서 순차적으로 데이터를 관리하는 것에 비하여 속도가 향상됩니다.
 */
	
	