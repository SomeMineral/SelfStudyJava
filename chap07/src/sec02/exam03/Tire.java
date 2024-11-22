package sec02.exam03;

public class Tire {
	//Field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//Constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//Method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 터짐***");
			return false;
		}
	}
	
}
