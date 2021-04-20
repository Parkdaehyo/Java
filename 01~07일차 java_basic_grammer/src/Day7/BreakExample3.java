package Day7;

public class BreakExample3 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(i==j) break;
				System.out.println(i + " " + j);
			}//end inner for
		}//end outter for

	}

}
