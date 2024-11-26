package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader ("C:/files/test/test7.txt");
		while(true) {
			int data = reader.read();
			if (data == -1) {
				break;
			}
			System.out.println((char)data); // reader로 읽어오는 값은 int?
		}
		
		reader.close();

	}	

}
