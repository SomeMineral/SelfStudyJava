package sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {

		Thread thread = new PrintThread();
		thread.start(); // start 메소드는 PrintThread에도 있을테니 상관없나 'ㅅ';
		
		try {
			Thread.sleep(1111);
		} catch (InterruptedException e) {
			
		}
		thread.interrupt();
		
	}

}
