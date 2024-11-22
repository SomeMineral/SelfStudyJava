package sec01.exam02;

public class Student extends People {
	
	public int studentNo;
	
	// constructor 안 만들어두면
//	public Student() {
//		super();	
//	}
	// 이런 식으로 생성하는데... People에는 People()은 없어. People(String ~,  String~)만 있지
	// 그래서 컴파일 에러 'ㅠ'
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
