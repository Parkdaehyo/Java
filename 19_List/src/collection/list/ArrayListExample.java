package collection.list;

//util을 전부 쓰겠다.
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList객체 생성.
		//제네틱(generic): 타입의 안정화를 위해 객체 내부에
		//저장되는 타입을 일치시키는 방법.
		List<String>list = new ArrayList<>(); //1.8버전 이하: ArrayList<String>넣어야함.
		//int는 integer
		String str1="Java";
		String str2="JSP";
		String str3="SSibal";
		
		System.out.println(list);
		
		//list에 객체를 저장하는 메서드 add(): 데이터를 맨 끝에 추가
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP"); // 순서대로 저장한다, 중복 데이터를 허용한다.
		
		System.out.println(list);
		
		//다양하게 쓰고싶으면 이렇게해라? 
//		ArrayList list=new ArrayList();
		
		//list에 저장된 총 객체 수 얻기 size()
		int size=list.size();
		System.out.println("list에 저장된 총 객체 수: " + size);
		
		//list에 객체 삽입 add(index 번호,객체) : 데이터를 해당 인덱스에 삽입
		list.add(2,"Oracle"); //2번자리에 "Oracle" 저장.
		System.out.println(list);
		
//		list[3]="MySQL"; 배열일때는 이렇게함.
		
		//list 데이터 수정 set(index,객체)
		list.set(3, "MySQL");
		System.out.println(list);
		
		//list 내부 객체 가져오기 get(index)
		String s=list.get(2);
		System.out.println("2번 인덱스 객체:" + s);
	
		// list에 저장된 객체의 인덱스번호 확인하기 indexOf(객체)
		int idx=list.indexOf("MySQL");
		int size2=list.size();
		System.out.println("MySQL이 저장된 인덱스: " + idx);
		
		//indexOF는 객체를 검색하지 못했을 경우 -1을 리턴합니다.
		idx=list.indexOf("안녕~~");
		System.out.println(idx);
		
		//list에서 객체 데이터 삭제 remove(index),remove(obj)-->객체변수
		list.remove(5);
		System.out.println(list);
		
		list.remove(str1);
		System.out.println(list);
		
		//list 내부에 저장된 객체의 유무확인 contains()
		System.out.println(list.contains("JSP"));
		System.out.println(list.contains(str2));
		System.out.println(list.contains("바보야!"));
		
		//list의 반복문 처리
		System.out.println("---------------");
		for(int i=0; i<list.size(); i++) { //for in
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------");
		for (String str : list) { //for each라고 부름
			System.out.println(str);
		}
		
		//list 내부 객체 전체 삭제 clear();
		list.clear();
		System.out.println(list);
		
		//list 내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty()
		if(list.isEmpty()) { //clear 했으니 비어있음.
			System.out.println("list가 비어있음.");
		}else {
			System.out.println("list가 비어있지 않음.");
		}
		
		
	}
	
}
