package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/files/test/test2.db");
		byte[] array = {10, 20, 30};
		
		os.write(array);
		
		os.flush(); // 중요. write 호출 후엔 반드시 flush
		os.close(); // stream 끝내면 반드시 close
		
	}

}
