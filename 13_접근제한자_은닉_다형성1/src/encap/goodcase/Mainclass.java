package encap.goodcase;

public class Mainclass {

	public static void main(String[] args) {
		
		Mybirth b= new Mybirth();
				
		/* 블록지정 후 ctrl shift / =>여러줄 주석
		 * b.year=-2018; // 값 저장: setter
		 * b.month=10;
		 * b.day=-31;
		 * 
		 * System.out.println(b.year); // 저장된 메서드를 호출:getter
		 */
		
		b.setDay(28);
		System.out.println(b.getDay());
		
}

}
