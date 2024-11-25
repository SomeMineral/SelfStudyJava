package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "길동"), 95);
		map.put(new Student(1, "길동"), 100);
		// 동등 객체로 제대로 인식하는지 확인하기 위한 예제인가..!
		// key는 같은데 value 값이 다르면 value 업데이트만 함.
		
		System.out.println("총 Entry 수: " + map.size());
		
	}

}
