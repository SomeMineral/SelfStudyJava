package sec01.exam02;

import java.util.HashMap; // ctrl+shift+o

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3"); 
		
		System.out.println(hashMap.size());
	
	}

}
