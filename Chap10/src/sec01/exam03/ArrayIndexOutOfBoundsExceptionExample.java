package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];	
			// Run - Run Configurations 에서 해당 java 파일 찾아서
			// Argument탭에서 Program Argument 입력
			System.out.println(args[0]); // Argument 입력 안 하면 에러.
			System.out.println(args[1]);
		} else {
			System.out.println("변수 두 개 제대로 넣어줘.");
		}
		
		// 예외처리 코드란 예외발생한 뒤에 수습하는 코드.
		// 위의 코드는 예외가 발생하기 전에 손을 쓴 코드.
		
	}

}
