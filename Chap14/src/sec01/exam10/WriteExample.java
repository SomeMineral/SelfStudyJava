package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/files/test/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush(); // write하면 반드시 flush해야함.
		writer.close(); // stream 사용 후엔 반드시 close하자.
		
	}

}
