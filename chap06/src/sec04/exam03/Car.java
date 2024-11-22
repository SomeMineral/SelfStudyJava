package sec04.exam03;

public class Car {
	//Field
	int gas;
	
	//Constructor
	
	//Method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		
		if (this.gas > 0) {
			System.out.println("gas 있음");
			return true;
		}
		
		System.out.println("gas 없음");
		return false;
	}
	
	void run() {
		while(true) {
			if (this.gas > 0) {
				System.out.println("달림 (gas 잔량: " + this.gas + ")");
				this.gas -= 1;
			} else {
				System.out.println("멈춤 (gas 잔량: " + this.gas + ")");
				return;
			}
		}
	}
}
