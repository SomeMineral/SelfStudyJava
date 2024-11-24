package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
//		int[] arr2 = new int[3]; // 개수 넣어야...
		
//		int result = arr[0] + arr[3]; //ArrayIndexOutOfBoundsException
		
		String data1 = args[0]; // main의 args // 입력 없으면 같은 Exception 발생.
		String data2 = args[1];
		
		
		// Run - Run Configurations 에서 해당 java 파일 찾아서
		// Argument탭에서 Program Argument 입력
		System.out.println(args[0]); // Argument 입력 안 하면 에러.
		System.out.println(args[1]);
	}

}
