package sec01.exam03;

public class Member {
	public String id;
	
	public Member (String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode(); // String은 문자열이 같으면 동일한 hashcode가 나오도록 재정의되어 있음.
	}
	
}
