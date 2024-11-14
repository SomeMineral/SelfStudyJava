package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		 //System.out.println( (int) (6*Math.random()) + 1);
		
		int num = (int) (6*Math.random()) + 1;
		
		if (num==1) {
			System.out.println("1나옴.");
		} else if (num==2) {
			System.out.println("2나옴.");
		} else if (num==3) {
			System.out.println("3나옴.");
		} else if (num==4) {
			System.out.println("4나옴.");
		} else if (num==5) {
			System.out.println("5나옴.");
		} else {
			System.out.println("6나옴.");
		}
	
	}

}
