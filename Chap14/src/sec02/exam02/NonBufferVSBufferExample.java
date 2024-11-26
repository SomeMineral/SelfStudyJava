package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVSBufferExample {

	public static void main(String[] args) throws Exception {
		
		// jpg 파일 복사를 두가지 방법으로 테스트해서 시간 측정하는 게 목표.	
		
		// 기본 스트림 (버퍼 보조 미적용) - path와 stream 설정만! 동작은 안 하는 중!
		String originalFilePath1 = NonBufferVSBufferExample.class
				.getResource("originalFile1.jpg").getPath(); // java 어차피 들여쓰기 등은 관계없이 읽지 참.
		String targetFilePath1 = "C:/files/test/targetFile1.jpg";

		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);		
		
		// 버퍼 보조 적용 - path와 stream 설정만! 동작은 안 하는 중!
		String originalFilePath2 = NonBufferVSBufferExample.class
				.getResource("originalFile2.jpg").getPath(); // java 어차피 들여쓰기 등은 관계없이 읽지 참.
		String targetFilePath2 = "C:/files/test/targetFile2.jpg";

		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 기본 스트림 코드로 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 안 썼을 때: \t" + nonBufferTime + "ns");
		
		// 버퍼 보조 스트림 코드를 이용해서 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 썼을 때: \t" + bufferTime + "ns");
		
		// 1. write는 copy 메소드 내부에서 진행되고 거기서 flush 해줬음. 걱정 no 
		// 2. stream close할 때 flush 자동적으로 해 줌(?)
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	} // main 끝

	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		// 동작은 복사, 반환은 작동 시간
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush(); // write 사용하면 반드시!
		long end = System.nanoTime();
		return (end - start);
	}
	
	// 왜 내 컴에선 버퍼를 썼을 때가 더 느리게 나올까...
}
