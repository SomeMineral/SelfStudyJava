package sec04.exam04;

public class Calculator {
	//Field
	//Constructor
	//Method
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg (int x, int y) {
//		double sum = x + y; 이것도 가능하긴 한데
		double sum = plus(x , y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
