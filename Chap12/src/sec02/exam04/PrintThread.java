package sec02.exam04;

public class PrintThread extends Thread {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println("실행중: " + i);
			i++;
			if (Thread.interrupted()) {
				System.out.println("Thread.interrupted() 값이 true로 바뀐 듯하다");
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
}
