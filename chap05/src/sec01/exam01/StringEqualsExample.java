package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = "ABC";
		String strVar2 = "ABC";
		
		if (strVar1 == strVar2) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		if (strVar1.equals(strVar2)) {
			System.out.println("문자열 같음");
		} else {
			System.out.println("문자열 다름");
		}
		
		String strVar3 = new String("ABC");
		
		if (strVar1 == strVar3) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		if (strVar1.equals(strVar3)) {
			System.out.println("문자열 같음");
		} else {
			System.out.println("문자열 다름");
		}
		
	}

}
