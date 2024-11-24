package sec01.exam06;

public class CallListener implements Button.OnClickListener {
	// 내가 원하는 건 Button이 아니라! Button 내부의 Interface인 OnClickListner이므로
	// implements를 통해 데려옴.
	
	@Override
	public void onClick() {
		System.out.println("전화를 걺");
	}

}
