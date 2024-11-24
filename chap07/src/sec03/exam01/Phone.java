package sec03.exam01;

public abstract class Phone {
	//Field
	public String owner;
	
	//Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//Method
	public void turnOn() {
		System.out.println("폰 전원 켬");
	}
	public void turnOff() {
		System.out.println("폰 전원 끔");
	}
}
