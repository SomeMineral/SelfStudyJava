package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1나옴");
				break;
			case 2:
				System.out.println("2나옴");
				break;
			case 3:
				System.out.println("3나옴");
				break;
			case 4:
				System.out.println("4나옴");
				break;
			case 5:
				System.out.println("5나옴");
				break;
			default:
				System.out.println("6나옴");
				break;
		}
	}

}
