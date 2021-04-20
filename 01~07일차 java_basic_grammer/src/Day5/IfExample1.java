package Day5;

public class IfExample1 { //시작부분에 커서 

	public static void main(String[] args) {
		
		//0~100까지의 정수형 난수를 발생
		int point = (int)(Math.random() * 101);
		System.out.println("점수: " + point);
		
		if(point >= 60) {
			System.out.println("60점 이상입니다.");
			System.out.println("시험에 합격했습니다.");
		}//end if	
		  else { 
			System.out.println("60점 미만입니다.");
			System.out.println("시험에 불합격했습니다.");			
		}
		System.out.println("수고하셨습니다!");
		// home: 맨앞으로, end: 맨뒤로, shift+home or end:블록지정
		// shift+home으로 블록지정 후 shift를 누른상태로 키보드 방향키 하면 여러개가 블록 지정.
	}// end main

}//end class
