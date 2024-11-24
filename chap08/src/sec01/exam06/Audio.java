package sec01.exam06;

public class Audio implements RemoteControl {

	private int volume;
	
	// Class 이름 갖다 대면 전부 추가하는 버튼도 나와...
	@Override
	public void turnOn() {
		System.out.println("Audio 켤게.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끌게.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

}
