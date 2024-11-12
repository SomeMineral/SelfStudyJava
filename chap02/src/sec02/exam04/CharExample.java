package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = 0x41;
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		
		char c5 = '가';
		char c6 = 44032;
		char c7 = '\uac00';
				
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		System.out.println("c7: " + c7);
	}	

}
