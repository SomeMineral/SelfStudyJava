package sec02.exam04;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0; // final 특성으로 가지므로 안 붙여줘도 됨.
		int var2 = 0;
		
		
//		arg1 = 10;
//		arg2 = 11;
//		var1 = 12;
//		var2 = 13;
		
		field = 10; // field는 괜찮아. 
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
