package collection.map;

import java.util.*;

public class MapExample {
	
	public static void main(String[] args) {
		
		//key,value
		Map<String,Integer> map = new HashMap<>();
		
		//map에 객체를 저장 put(key(좌),value(우))
		map.put("불대문자" , 5600);
		map.put("파괴광선" , 7900);
		map.put("그림자 분신" , 2000);
		map.put("눈보라" , 7000);
		
		System.out.println(map);
		
		//key value쌍을 Entry라 부릅니다.
		System.out.println("map에 저장된 총 객체 수: " + map.size());
		
		//map에 저장된 value(우) 값 얻기
		//key(좌)값만 줬는데도 value(우) 값이 나온다.
		int price = map.get("눈보라"); //integer 가능.
		System.out.printf("눈보라의 가격: %d코인\n" , price);
		
		System.out.println("-----------------------");
		//map에서 key(좌)를 전부 추출하는 메서드 keySet()
		//map.keySet()은 리턴 타입이 Set
		Set<String> kSet = map.keySet();
		System.out.println("map을 set에 담아서 전부 추출 " + kSet);
		
		//반복문을 처리하기 위한 iterator 객체 생성.
		//Kset은 map에 있는 모든 키를 set에다 저장시킨것이고.
		//리턴값이 Iterator 타입, key는 String 타입이다.
		Iterator<String> KIter = kSet.iterator();
		System.out.println("----------------------------");
		
		while(KIter.hasNext()) {  //hasNext(): 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴
			String TMname = KIter.next(); // 객체를 하나씩 가져옴.
			int TMprice = map.get(TMname); //key값을 int 타입에 저장. , map에 저장된 value값 얻기
			System.out.printf("%s의 가격은 %d코인 입니다. \n" , 
					TMname , TMprice);
		}
		
		System.out.println("------------------------------");
		//map 내부에 있는 key의 유무를 확인하는 메서드 containsKey()
		String TM = "박치기";		
		if(map.containsKey(TM)) { //map에서 TM이 있는지 확인하고 true, false를 반환함. 리턴 타입이 boolean 이다.
			System.out.println(TM + "의 가격은 "
							+ map.get(TM) +" 코인 입니다."); //map.get()은 value값을 가져옴
		} else {
			System.out.println(TM + "은(는) 없는 기술머신 입니다.");
		}
	
		System.out.println("-------------------------------");
		
		//map 내부 데이터 삭제 remove(key)
		//해당 key에 대응하는 Entry 객체를 삭제.
		map.remove("불대문자");
		System.out.println(map);
		
		//map.clear(); 전체삭제
		
		if(map.isEmpty()) {
			System.out.println("map이 비어있음");
		}else {
			System.out.println("map이 비어있지 않음.");
		}
	}
	

}
