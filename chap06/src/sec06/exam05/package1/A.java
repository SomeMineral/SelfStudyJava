package sec06.exam05.package1;

public class A {
	//Field
	public int field1;
	private int field2;

	
	//Method
	public void method1() {
		field2 = 10; // 이건 가능. B,C에서 field2를 손대는 게 아니라, method1이 field2를 손대는거라!
	}
	private void method2() {
		field2 = 10;
	}

}
