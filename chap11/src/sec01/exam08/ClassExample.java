package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz1 = Car.class;
		Class clazz2 = Class.forName("sec01.exam08.Car");
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);

		System.out.println(clazz1.getName()); // 전체 이름
		System.out.println(clazz1.getSimpleName()); // 클래스이름만
		System.out.println(clazz1.getPackage().getName()); // 패키지 이름만
		
	}

}
