package sec01.exam05;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>(); 

		set.add(new Member("길동", 30));
		set.add(new Member("길동", 30));
		// 두 객체는 분명 다른 객체지만 '동등한' 객체임. 그렇게 Member의 equals와 hashCode를 재정의했음.
		
		
		System.out.println("총 객체수: " + set.size());
		
	}

}
