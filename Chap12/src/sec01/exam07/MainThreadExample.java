package sec01.exam07;

public class MainThreadExample {

	public static void main(String[] args) {
		
		
		// 동일한 Calculator 객체를 User1, User2에서 모두 사용하는 상황
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		System.out.println("==================");
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}

}
