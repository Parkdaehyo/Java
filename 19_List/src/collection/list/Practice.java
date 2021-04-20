package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		
		
		List<String>list = new ArrayList<>();
		
		String menu1 ="짜장면";
		String menu2 ="짬뽕";
		String menu3 ="탕수육";
		
		list.add(menu1);
		list.add(menu2);
		list.add(menu3);
		list.add("깐풍기");
		list.add("깐풍기");
		int size=list.size();
		System.out.println(list);
		System.out.println(size);
		System.out.println("---------------------------------");
		
		list.add(0,"우동"); //0번자리에 우동 추가.
		System.out.println(list);
		
		list.set(0, "제육덮밥");
		System.out.println(list);
		
		String s = list.get(0);
		System.out.println(s);
		
		int idx=list.indexOf("짬뽕");
		int size2=list.size();
		System.out.println("짬뽕이 저장된 곳:" + idx);
		
		idx=list.indexOf("울면");
		System.out.println(idx);
		
		list.remove("짬뽕");
		System.out.println(list);
		
		System.out.println(list.contains(menu1));
		System.out.println(list.contains("menu5"));
		
		System.out.println("-------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(String menu : list) {
			System.out.println(menu);
		}
		
		
		
		
		/*
		ArrayList list2 = new ArrayList();
		list2.add("susi");
		list2.add(1);
		System.out.println(list2);
		*/
		
		
		
	}
}
