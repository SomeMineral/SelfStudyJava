package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {

		
		byte x = 10;
		byte y = 20;
		int result = x + y; // byte로 연산을 못 해.. ;ㅅ; JVM에서 연산됨

		byte result1 = 10 + 20; // 10, 20은 변수에 담기지 않은 리터럴이라 컴파일 과정에서 연산 된대..!
		
		byte x2 = 30;
		long y2 = 40;
		long result2 = x2 + y2; // long 들어 있어서 결과 long.. JVM에서 연산됨
		
	}

}
