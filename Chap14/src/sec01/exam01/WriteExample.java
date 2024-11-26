package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/files/test/test1.db"); // 아. 디렉토리 생성은 못 하는구나..?
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // 버퍼가 충분히 쌓여야 흘려보내는데... flush가 이걸 강제로 흘려보냄. 굳.
		os.close();
	}

}
