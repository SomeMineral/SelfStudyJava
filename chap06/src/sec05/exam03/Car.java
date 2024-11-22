package sec05.exam03;

public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed + "(으)로 달림.");
	}
	
	public static void main(String[] args) {
//		speed = 60;
//		run(); 
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
	}

}
