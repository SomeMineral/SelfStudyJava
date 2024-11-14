package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {
			case 8:
				System.out.println("출근해요");
			case 9:
				System.out.println("회의해요");
			case 10:
				System.out.println("업무해요");
			default:
				System.out.println("외근나가요");
		}
		
	}

}
