package sec01.exam04;

public class Outter {

	public void method1(int arg) {
		int localVariable = 1;
		
//		arg = 100; // final 특성 가지고 있어서 컴파일 오류
//		localVariable = 101; // final 특성 가지고 있음
		
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
		
		// 내부 클래스에서 사용할 때만 final 특성 부여되는 거!
		// 내가 Inner 클래스 통으로 지워버리면 arg 값 바꿔도, localVariable 값 바꿔도 다 됨
		
		
	}
}
