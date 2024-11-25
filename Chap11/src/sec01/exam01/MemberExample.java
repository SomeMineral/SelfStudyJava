package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 obj2 동등");
		} else {
			System.out.println("obj1 obj2 동등하지 않음");
		}
				
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println("==============");
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 obj3 동등");
		} else {
			System.out.println("obj1 obj3 동등하지 않음");
		}
				
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1 == obj3);
		
		
	}

}
