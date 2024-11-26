package sec02.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		// Object(Input/Output)Stream : 객체 -> byte , byte -> 객체에 특화된 보조 스트림
		// 단,  java.io.Serializable 인터페이스의 구현 객체만 가능
		
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board: list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" +
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())			
			);
		}
		
	}

	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "title1", "content1", "writer1", new Date()));
		list.add(new Board(2, "title2", "content2", "writer2", new Date()));
		list.add(new Board(3, "title3", "content3", "writer3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/files/test/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/files/test/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// .readObject() 를 실행하면 타입이 object라서...?
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
