package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수 90보다 큼.");
			System.out.println("등급 A임.");
		
		} else if (score >= 80) {
			System.out.println("점수 80~89");
			System.out.println("등급 B임.");
		
		} else if (score >= 70) {
			System.out.println("점수 70~79");
			System.out.println("등급 C임.");
			
		} else {
			System.out.println("점수 70 미만");
			System.out.println("등급 D임.");
		}
	}

}
