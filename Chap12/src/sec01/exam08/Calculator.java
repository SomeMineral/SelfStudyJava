package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	
	// synchronized - 하나의 스레드만 접근 가능. 심지어 이 개체의 다른 synchronized 선언된 메소드도 모두 잠김
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			System.out.println(Thread.currentThread().getName() + "의 잠자기 전 메모리: " + this.memory);
			Thread.sleep(2000); // 2000ms 즉, 2초
		} catch (InterruptedException e) {
			// 'ㅅ';
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
