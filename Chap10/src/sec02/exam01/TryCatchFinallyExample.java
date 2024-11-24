package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		String str = null;
//		System.out.println(str.length());// NullPointerException
		
		
//		Class clazz0 = Class.forName("java.lang.String");
		// 일반예외 - 컴파일러가 예외처리를 요구함.
		// 저 구간이 오류 생길 가능성이 크니까(그런 것들을 묶어서 일반 예외라고 정해둠?)
		// 미리 처리하세요.
		// 이거 밑에서 보면 제대로 돌아가는 코드인데 컴파일러에서 빨간줄로 경고함. 정상임.
		
		
		
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("정상 실행");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 존재하지 않음");
		}
		
		System.out.println("==========================");
		
		try {
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("정상 실행");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 존재하지 않음");
		}
		
	}

}
