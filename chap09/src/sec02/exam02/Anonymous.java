package sec02.exam02;

public class Anonymous {
	
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("tv 켬");
		}

		@Override
		public void turnOff() {
			System.out.println("tv 끔");
		}
		
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("audio 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("audio 끔");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
