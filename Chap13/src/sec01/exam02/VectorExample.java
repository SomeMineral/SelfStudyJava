package sec01.exam02;

import java.util.List;
import java.util.Vector; // ctrl + shift + o 만세

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("title1", "content1", "writer1"));
		list.add(new Board("title2", "content2", "writer2"));
		list.add(new Board("title3", "content3", "writer3"));
		list.add(new Board("title4", "content4", "writer4"));
		list.add(new Board("title5", "content5", "writer5"));
		
		list.remove(2); // idx 0(title1) 1(title2) [제 거]2(title3)[제 거] 3(title4) 4(title5)
		// remove후에 뒷부분은 idx 바뀌니까..
		list.remove(3); // idx 0(title1) 1(title2) 2(title4) [제 거]3(title5)[제 거]
		
		for (int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
	}

}
