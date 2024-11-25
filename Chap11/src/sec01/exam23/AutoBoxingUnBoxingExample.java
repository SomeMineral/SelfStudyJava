package sec01.exam23;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		Integer obj = 100; // Auto Boxing
		System.out.println("value: " + obj.intValue());
		System.out.println("value: " + obj);
		
		int value = obj; // Auto Unboxing
		System.out.println("value: " + value);
		
		int result = obj + 100; // Auto Unboxing
		System.out.println("result: " + result);
		
	}
}
