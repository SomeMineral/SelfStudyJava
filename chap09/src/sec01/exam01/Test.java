package sec01.exam01;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		System.out.println(b.field2);
		b.method1();
		
		A.C c = new A.C(); // C가 static class이므로 가능.
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 4; // C의 field2는 static이라 바로 불러오기 가능.
		A.C.method2();
		
		a.method();
		
	}

}
