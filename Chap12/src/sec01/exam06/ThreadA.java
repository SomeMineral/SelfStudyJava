package sec01.exam06;

public class ThreadA extends Thread {
	
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		Thread subThread = Thread.currentThread();
		System.out.println("여긴 무슨 스레드인가? " + subThread.getName());
		
		for (int i=0; i<2; i++) {
			System.out.println(getName() + "이(가) 출력한 내용");
		}
	}
}
