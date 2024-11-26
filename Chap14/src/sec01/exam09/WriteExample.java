package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/files/test/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 1, 3); /// offset, length
		
		writer.flush(); // write하면 반드시 flush해야함.
		writer.close(); // stream 사용 후엔 반드시 close하자.
		
	}

}
