package sec01.exam03;

public class A {
	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 11;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 10;// A 객체 있어야 사용 가능..
//			method1();// A 객체 있어야 사용 가능..
			
			field2 = 11;
			method2();
		}
	}
	
	
}
