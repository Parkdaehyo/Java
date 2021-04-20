package this_.car;

public class Car {
	
	String model;
	int speed;
	
	/*
	 * Car(String a_model) {
	 * model = a_model;  
	 * 
	 */
	
	Car(String model) {			
		this.model = model;
	}
	
	void accel(int speed) {
		if(this.speed >= 150) { // this.=이 자동차
			System.out.println("속도를 더 이상 올릴 수 없습니다.");
		}else {
			this.speed = speed;
		}
	}
	
	void run(int maxSpeed) {
		for(int i=0; i<=maxSpeed; i+=30) {
			this.accel(i); //this: class Car의 accel이다. myCar.accel, youCar.accel.
			System.out.printf("%s가 달립니다.(시속: %dkm/h)\n"
					, this.model, this.speed);
		}
	}
}















