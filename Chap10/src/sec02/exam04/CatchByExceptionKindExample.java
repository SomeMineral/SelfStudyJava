package sec02.exam04;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		// Source - Format : 깔끔하게 정렬해줌
		
		String data1 = null;
		String data2 = null;

//		try {
//			data1 = args[0];
//			data2 = args[1];
//	
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			int result = value1 + value2;
//			System.out.println(data1 + "+" + data2 + "=" + result);	
//		} catch(Exception e) {
//			System.out.println("실행 매개값 모자람");
//		} catch(NumberFormatException e) { 
//		// unreachable. 앞에서 다 잡혀버리니까 여긴 의미가 없다는 의미
//			System.out.println("숫자로 변환 불가능");
//		} finally {
//			System.out.println("다시 실행하렴");
//		}
		
		try {
			data1 = args[0];
			data2 = args[1];
	
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} catch(Exception e) { 
			System.out.println("기타 예외");
		} finally {
			System.out.println("다시 실행하렴");
		}
		
		
		
	}
}