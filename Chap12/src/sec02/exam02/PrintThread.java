package sec02.exam02;

public class PrintThread extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		try {
			while(!stop) {
				System.out.println("실행중");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
		
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
