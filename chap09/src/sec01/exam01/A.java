package sec01.exam01;

public class A {
	A() {
		System.out.println("A객체 생성");
	}
	
	class B {
		B() {
			System.out.println("B객체 생성");
		}
		int field1;
		static int field2; // JAVA17부터 허용 ( 2021.09.14) 강좌는 19년 촬영이라 다른거구만!
		void method1() {}
		static void method2() {} // JAVA17부터 허용
	}
	
	static class C {
		C() {
			System.out.println("C객체 생성");
		}
		
		int field1;
		static int field2;
		
		void method1() {}
		static void method2() {}
		
	}
	
	void method() {
		class D {
			D() {
				System.out.println("D객체 생성");
			}
			
			int field1;
			static int field2; // JAVA 17부터 허용
			
			void method1() {}
			static void method2() {} // JAVA 17부터 허용
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		d.field2 = 5;
		d.method2();
	}
}
