package collection.list.student;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		//stu.setName("홍길동"); ==캡슐화
		//stu.name="홍길동; 이 안되는 이유?
		
		List<Student> students = new ArrayList<>();
		
		Student stu = null;
		for(int i=0; i<2; i++) {
			stu = new Student();
			stu.inputStuInfo();
			stu.calcTotAvgGrade();
			students.add(stu);
		} 

		Point.showPointUI(); //static(정적 메서드)이기 때문에 클래스 이름명.메소드명으로 불러야한다.
		for(Student s : students) {
			s.outputStuInfo();
		}

	}

}


