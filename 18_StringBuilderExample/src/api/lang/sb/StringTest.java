package api.lang.sb;

public class StringTest {

	public static void main(String[] args) {
		
		long start, end;
		
		start = System.currentTimeMillis();
		
		String str = "A";
		
		for(int i=0; i<100000; i++) {
			str = str + "A";
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("String: " + (end-start)*0.001 + "초"); //String타입의 시간 측정
		
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		
		for(int i=0; i<100000; i++) {
			sb.append("A");
		}
		
		end = System.currentTimeMillis();

		System.out.println("StringBuilder: " + (end-start)*0.001 + "초"); //StringBuilder타입의 시간 측정
	}

}







