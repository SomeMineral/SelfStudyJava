package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉼");
	}
	
//	public void sound() {
//		System.out.println("똑같은 소리");
//	}
	public abstract void sound();
	
}
