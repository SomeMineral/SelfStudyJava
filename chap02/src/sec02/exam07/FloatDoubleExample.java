package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		float var1 = 3.14f;
		double var2 = 3.14; 
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 0.1234567890123456789f;
		System.out.println(var3); // 유효숫자 범위 걸리네
		double var4 = 0.1234567890123456789;
		System.out.println(var4); // float 보단 나중에 걸리네
		
		double var5 = 3e6;
		System.out.println(var5);
		float var6 = 3e6f;
		System.out.println(var6);
		
		double var7 = 2e-3;
		System.out.println(var7);
		
		
		
	}

}
