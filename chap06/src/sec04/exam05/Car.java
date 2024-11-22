package sec04.exam05;

public class Car {
	//Field
	int speed;
	
	//Constructor
	//Method
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌림");
	}
	
	void run() {
		for (int i=0; i<=50; i+=10) {
			speed = i;
			System.out.println("달림 (시속: " + speed + "km/h)");
		}
	}
}
