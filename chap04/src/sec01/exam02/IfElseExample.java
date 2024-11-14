package sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
			System.out.println("점수 90보다 큼.");
			System.out.println("등급 A임.");
		} else {
			System.out.println("점수 90보다 작음.");
			System.out.println("등급 B임.");	
		}
		
		System.out.println("끝!");
	}

}
