package sec04.exam02;

public class Computer {
	//Field
	//Constructor
	//Method
	int sum0(int[] values) {
		int sum = 0;
		for (int value: values) {
			sum += value;
		}
		return sum;
	}
	
	int sum1(int[] values) {
		int sum = 0;
		
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
