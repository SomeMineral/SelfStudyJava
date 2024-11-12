package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		long var3 = 20000000000l; // l 혹은 L 안 붙이면 int로 인식해버려서 컴파일 오류로 큰 수를 못 넣게 됨. 
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		
	}

}
