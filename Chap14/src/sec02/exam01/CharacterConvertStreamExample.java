package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	
	// [file] - [FileInputStream : byte 기반]                                 [FileOutputStream: byte 기반] - [file]
	//                           | (장착)                                               | (장착)
	//          [InputStreamReader: 편하게 String 쓸래!] - [program] - [OutputStreamWriter: 편하게 String 쓸래]
	// 대충 이런 과정.
	//
	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용해보자");
		String data = read();
		System.out.println(data);
		System.out.println("main 종료!");
		
	}
	
	// program -> '보조'OutputStreamWriter(String에 좋음) -> FileOutputStream(byte 기반) -> file
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/files/test/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		// 주목! 여기선 fos를 이용하는 게 아니라 보조스트림으로 삽입된 writer를 이용함!
		// chap14.sec01.exam01~03 에선 OutputStream에서 바로 사용했는데! 조금 불편하니까 편하게 보조스트림 삽입!
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	// file -> FileInputStream(byte 기반) -> '보조'InputStreamReader(String에 좋음) -> program
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/files/test/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		// 주목! 여기선 fis를 이용하는 게 아니라 보조스트림으로 삽입된 reader를 이용함!
		// chap14.sec01.exam04~06 에선 InputStream에서 바로 사용했는데! 조금 불편하니까 편하게 보조스트림 삽입!
		
		int readCharNum = reader.read(buffer);
		reader.close();
		
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
	

}
