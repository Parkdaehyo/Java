package collection.list.student;

import java.util.*;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;

	private Scanner sc=new Scanner(System.in);
	
	//직접 입력할 수 있도록 메서드 구성
	//학생의 정보를 입력받는 메소드
	public void inputStuInfo() {
		System.out.print("#성적정보 입력을 시작합니다.: ");
		System.out.print("-학번: ");
		this.stuId=sc.next();
		System.out.print("-이름: ");
		this.name=sc.next();
		
		while(true) {
			try {
				System.out.print("-국어: ");
				this.kor=sc.nextInt();
				System.out.print("-영어: ");
				this.eng=sc.nextInt();
				System.out.print("-수학: ");
				this.math=sc.nextInt();
				break; // 3개를 전부 숫자로 입력하면 break를 통해서 빠져나오게 만듬
			} catch(Exception e) {
				System.out.println("점수는 숫자로만 입력하세요");
				//nextInt()는 자동으로 엔터를 
				//입력하기 때문에 입력창을 고정하기 위함.
				sc.nextLine();
			}
		}
	}
	
	//총점,평균,학점을 계산할 메서드.
	public void calcTotAvgGrade() {
		this.tot=this.kor+this.eng+this.math;
		this.avg=this.tot/3.0; //avg는 실수이기때문에 3.0으로 나눈다.
		
		if (avg>=90) {
			this.grade='A'; //char이기때문에 홑따옴표
		}else if (avg>=80) {
			this.grade='B'; 
			
		}else if (avg>=70) {
			this.grade='C'; 
			
		}else if (avg>=60) {
			this.grade='D'; 
			
		}else {
			this.grade='F'; 
			
		}
	}
	
	//학생의 성적정보를 출력하는 메서드.
	public void outputStuInfo() {
		System.out.printf("%4s   %3s    %3d    %3d    %3d    %3d   %3.2f %3c\n",
		          this.stuId, this.name, this.kor, this.eng, this.math,
		          this.tot, this.avg, this.grade);
							//%4s: 4칸을 확보해서 문자열로 입력하라. ,%3d: 정수 3칸확보 %3.2f:3자리 확보하고 소수점 둘째자리 까지 표현
	}						//3c:char
	
	//Generate Setter getter

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
