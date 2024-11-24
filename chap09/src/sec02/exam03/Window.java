package sec02.exam03;

public class Window {
	
	//Field
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화 걸게");
		}
	};
	
	//Constructor
	Window(){
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지 보낼게");
			}
		});
		
		System.out.println("button1,2 설정 완료");
	}
}
