package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader ("C:/files/test/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		// 5칸 짜리 작업실에 idx2 자리부터 세 칸 채워넣어주세요..?
		
		if (readCharNum != -1) {
			for (int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}	
		
		reader.close();

	}	

}
