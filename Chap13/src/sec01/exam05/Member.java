package sec01.exam05;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
			// String은 ==로 비교해봐야 의미 없으니 equals로. int는 == 충분
		} else {
			return false;
		}
	}
	
	// 동등 객체 판단 과정의 제 1 관문이 hashCode, 제 2 관문이 equals
	// String은 이미 저 두 과정은 잘 재정의된 녀석이라...
	
	public int hashCode() { // 사용자만의 해시코드로 정의한 건가..?
		return name.hashCode() + age;
	}
}
