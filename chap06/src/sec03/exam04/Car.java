package sec03.exam04;

public class Car {
	//Field
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	//Constructor
	Car(){
		
	}
	Car(String model){
		this(model, null, 0);
	}
	
	Car(String model, String color){
		this(model, color, 0);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
