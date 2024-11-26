package sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/files/test/printstream.txt");
		PrintStream ps = new PrintStream(fos); // print기능 관련 보조 스트림
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush(); // write 기능이니까 이것도 flush 하세요.
		ps.close();
		
	}

}
