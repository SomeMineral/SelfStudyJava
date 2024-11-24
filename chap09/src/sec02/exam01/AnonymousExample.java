package sec02.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		System.out.println("===================");
		anony.method1();
		System.out.println("===================");
		
		anony.method2(new Person() {
			void study() {
				System.out.println("공부함");
			}
			@Override
			void wake() {
				System.out.println("8시 일어남");
				study();
			}
		} );
	}
}
