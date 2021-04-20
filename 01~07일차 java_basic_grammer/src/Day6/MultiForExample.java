package Day6;


public class MultiForExample {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 *  int sum=0;
  
 			for (int n=1; n<=10; n++1;){
  			sum+=n;
  	
  
 			for 제어변수선언(begin);논리형 조건식(end);증감식(Step){
 				1.				2.	5.	8.		4. 7.
 			반복실행할 코드 3. 6.
		 * 
		 *
		 */
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("구구단 " + dan + "단");
			System.out.println("-------------------");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n",
						dan, hang, dan * hang);
			}//end inner for
			System.out.println("===================");
		}//end outter for

	}//end main method

}
