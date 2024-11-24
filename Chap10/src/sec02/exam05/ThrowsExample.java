package sec02.exam05;

public class ThrowsExample {

	public static void main(String[] args) {
		// 호출하는 쪽에서 예외 처리를 해야함.
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않음");
			
//			e.printStackTrace();
			// main에 throws할 때랑 마찬가지로 출력되넹
			// 개발할 때나 쓰는거야! 개발한 뒤엔 쓰지마!
		} 
	}
	
	
//	// 아래와 같이 main에 throws를 작성하면, JVM 쪽으로 Exception을 떠넘긴다는 의미.
//	// 콘솔창에 예외 내역 주르륵 출력됨.
//	// 썩 좋지 않은 방법. 주로 테스트할 때 간단하게 작성하고 싶을 때나 쓰는 방법?
//	public static void main(String[] args) throws ClassNotFoundException {
//			findClass();
//	}
	
	
	
	// throws 뒤에 기입한 오류가 발생할 때! 이 method를 호출한 곳으로 Exception을 던질 것이다.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
