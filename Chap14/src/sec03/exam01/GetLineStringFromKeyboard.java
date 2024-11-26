package sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in; // System.in이 InputStream이라는 걸 강조! ;ㅅ;
		Reader reader = new InputStreamReader(is); // 보조 스트림 ( String 특화? )
		BufferedReader br = new BufferedReader(reader); // 보조 스트림 ( 성능 향상 )
		
		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine(); //enter 치기 전까지 대기
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.println("입력된 내용: " + lineStr);
			System.out.println();
		}
		br.close();
		System.out.println("종료한당!");

	}

}
