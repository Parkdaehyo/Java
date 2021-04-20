package collection.map;

import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		
		//key:String value:Integer
		Map<String, Integer> map=new HashMap<>();
		 
		//map에 객체를 저장 put(Key,Value)
		map.put("치킨",20000); // 20000(value)의 key는 치킨이다.
		map.put("라면", 2000);
		map.put("족발", 30000);
		//중복 키를 통해 put을 사용하면 value가 수정됨.
		map.put("라면", 3000); 
		
		System.out.println(map);
		
		//key value쌍을 Entry라 부릅니다.
		//map에 저장된 총 Entry(key & value값) 객체 수 얻기 size()
		System.out.println("map에 저장된 총 객체 수: " + map.size());
		
		//map에 저장된 value 값 얻기 get(key)
		//족발의 value값이 30000이기 때문에 int를 쓴다. 
		int price=map.get("족발"); //integer로 써도된다.
		System.out.printf("족발의 가격: %d원\n", price);
	
		System.out.println("----------------------");
		//map에서 key를 전부 추출하는 메서드 keySet()
		//map.keySet()은 리턴타입이 Set
		Set<String> kSet=map.keySet();
		System.out.println("Set에 담아서 map을 전부 추출: " +kSet);
		
		//반복문을 처리하기위한 iterator 객체 생성.
		Iterator<String> KIter=kSet.iterator();
		System.out.println("------------------------");
		
		while(KIter.hasNext()) { // KIter를 반복하겠다.
			String foodName=KIter.next(); //KIter.next()를 통해 하나씩 꺼내서 foodName에 저장하겠다.
			int foodPrice=map.get(foodName); //map.get() 메소드(키 값 추출)를 통해 저장된 foodName을 foodPrice에 저장.
			System.out.printf("%s의 가격은 %d원 입니다. \n",
					foodName,foodPrice);
		}
		
		//map 내부에 있는 key의 유무를 확인하는 메서드 containskey()
		String food = "족발";
		if(map.containsKey(food)) { //boolean
			System.out.println(food + "의 가격은 " 
						+ map.get(food)); //map.get(food)를 통해 food 변수에 있는 value 값을 얻어올 수 있다.
		
		} else {
			System.out.println(food + "는 없는 메뉴입니다.");
		} 
		
		//map 내부 데이터 삭제 remove(key)
		//해당 key에 대응하는 Entry 객체를 전체 삭제.
		map.remove("치킨");
		System.out.println(map);
		
		System.out.println("----------------------");
		map.clear();
		if(map.isEmpty()) {
			System.out.println("map이 비어있음");
		}else {
			System.out.println("map이 비어있지 않음.");
		}
	}
		
	/*
	 * Map 계열 컬렉션
	 * Map 컬렉션은 키(key)와 값(value)으로 구성된 Entry객체를 저장하는 구조를 가지고 있습니다.
	 * 키는 중복저장 될 수 없지만 값은 중복 저장 될 수 있습니다.
	 * 
	 * 값을 찾을때 키를 통해서 찾는다.
	 * 
	 */

}
