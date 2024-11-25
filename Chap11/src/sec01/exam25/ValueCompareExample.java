package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("== 결과: " + (obj1 == obj2));
		System.out.println("equals 결과: " + obj1.equals(obj2));
		
		// 값 범위에 따라 포장... 다른 거 참. 일단 int : -128 ~ 127
		
		Integer obj3 = 30;
		Integer obj4 = 30;
		
		System.out.println("== 결과: " + (obj3 == obj4));
		System.out.println("equals 결과: " + obj3.equals(obj4));
		
		// 그러니까 Wrapper 사용할 땐 == 기호는 쓰지 않는 게 안전해.
	}

}
