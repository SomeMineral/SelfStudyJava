package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		
		System.out.println(myPhone); // 기본적으로 println에서 toString을 호출해서 결과 출력해줌.
	}

}
