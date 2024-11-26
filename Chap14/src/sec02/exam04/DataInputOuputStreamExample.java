package sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOuputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/files/test/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("길동");
		dos.writeDouble(10.3);
		dos.writeInt(7);
		
		dos.writeUTF("자바");
		dos.writeDouble(12.3);
		dos.writeInt(2);
		
		dos.flush(); // write했으니 꼭 해줘.
		dos.close();
		
		FileInputStream fis = new FileInputStream("C:/files/test/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
	}

}
