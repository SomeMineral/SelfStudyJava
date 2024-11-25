package sec01.exam09;

import java.net.URL;

public class ResourcePathExample {

	public static void main(String[] args) {

		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

		System.out.println(photo1Path);
		System.out.println(photo2Path);
	
		
		URL temp = clazz.getResource("photo1.jpg");
		System.out.println(temp);
	}

}
