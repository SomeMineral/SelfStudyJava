package sec01.exam26;

public class MathExample {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println("================");
		
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v4);
		
		System.out.println("================");
			
		double v5 = Math.floor(5.3);
		System.out.println(v5);
		double v6 = Math.floor(-5.3);
		System.out.println(v6);
		
		System.out.println("================");
		
		int v7 = Math.max(5, 9);
		System.out.println(v7);
		double v8 = Math.max(5.3, 2.6);
		System.out.println(v8);
		
		System.out.println("================");

		int v9 = Math.min(5, 9);
		System.out.println(v9);
		double v10 = Math.min(5.3, 2.6);
		System.out.println(v10);
		
		System.out.println("================");
		
		double v11 = Math.random();// [0,1)
		System.out.println(v11);
		
		System.out.println("================");
		
		// 가까운 정수
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(-5.7);
		System.out.println(v12);
		System.out.println(v13);
		
		System.out.println("================");
		
		double v14 = Math.round(5.3);
		double v15 = Math.round(-5.7);
		System.out.println(v14);
		System.out.println(v15);
		
		System.out.println("================");
		
		double value = 12.3456;
		double temp1 = value * 100;
		double temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println(v16);
	}

}
