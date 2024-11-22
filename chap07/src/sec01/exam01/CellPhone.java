package sec01.exam01;

public class CellPhone {
	//Field
	String model;
	String color;
	//Constructor
	public CellPhone() {
		System.out.println("CellPhone() 호출됨");
	}
	//Method
	void powerOn() { System.out.println("전원 켰어"); }
	void powerOff() { System.out.println("전원 껐어"); }
	void bell() { System.out.println("벨이 울려"); }
	void sendVoice(String message) { System.out.println("자신: " + message);}
	void receiveVoice(String message) { System.out.println("상대: " + message); }
	void hangUp() { System.out.println("전화 끊어"); }
}
