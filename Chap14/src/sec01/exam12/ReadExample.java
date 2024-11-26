package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader ("C:/files/test/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if (readCharNum == -1) {
				break;
			}
			for (int i=0; i<readCharNum; i++) { // readCharNum을 넣어줘야해... 고정값 넣어버리면 끝자리에서 문제 생겨.
				System.out.println(buffer[i]);
			}
		}
		
		
		
		reader.close();

	}	

}
