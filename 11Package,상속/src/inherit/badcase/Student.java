package inherit.badcase;

// badcase에 있는 class들은, 같은 것들이 중복되고 있음.
public class Student {

	String name;
	int age;
	String stuID;
	
	String info() {
		return "이름: " + name + ", 나이: " +age;
	}
}
