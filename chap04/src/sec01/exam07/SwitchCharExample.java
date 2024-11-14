package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원임");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원임");
			break;
		default:
			System.out.println("손님임");
		}
	}

}
