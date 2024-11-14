package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급 A요.");
		}
		
		if (score < 90)
			System.out.println("점수 90점보다 작아요.");
			System.out.println("등급 B요."); // 이 문장은 if문에 들어있는 게 아니야.
		
	}

}
