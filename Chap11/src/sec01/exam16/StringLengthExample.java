package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {

		String ssn = "1234561234567";
		
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("자리수 맞음");
		} else {
			System.out.println("자리수 안 맞음");
		}	
		
	}

}
