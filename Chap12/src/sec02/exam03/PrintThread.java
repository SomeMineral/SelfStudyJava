package sec02.exam03;

public class PrintThread extends Thread {
	public void run() {
		try {
			int i = 1;
			while (true) {
				
				System.out.println("실행중: " + i);
				Thread.sleep(111); // 이거 중요해. 일단 일시정지가 되어야 inturrupt가 작동할 수 있거든.
				i++;
			}
		} catch (InterruptedException e) {
			System.out.println("printThread - exception");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
}
