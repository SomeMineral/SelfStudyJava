package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // 0번 인덱스 자리, 즉 맨 앞에 넣는다는 의미..? 돌려봐야 알지.
		}
		endTime = System.nanoTime();
		System.out.println("맨 앞 " + list1.get(0));
		System.out.println("맨 뒤 " + list1.get(9999));
		System.out.println("ArrayList 걸린 시간: " + (endTime-startTime));
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i)); //
		}
		endTime = System.nanoTime();
		System.out.println("맨 앞 " + list2.get(0));
		System.out.println("맨 뒤 " + list2.get(9999));
		System.out.println("LinkedList 걸린 시간: " + (endTime-startTime));
		
	}

}
