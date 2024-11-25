package sec01.exam07;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
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
