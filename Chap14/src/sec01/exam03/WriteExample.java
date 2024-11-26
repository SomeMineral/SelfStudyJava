package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/files/test/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		os.write(array, 1, 3);
		
		os.flush(); // write 후엔 반드시 flush
		os.close(); // close 꼭
	}

}
