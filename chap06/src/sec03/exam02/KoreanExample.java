package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바","011111-3234567");
		Korean k2 = new Korean("감자바","011112-4234567");
		
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
