package sec01.exam06;

public interface RemoteControl {
	//Constant
	int MAX_VOLUME = 10; // public static final 붙은 것과 동일
	int MIN_VOLUME = 0;
	
	//Method
	void turnOn(); // public abstract 붙은 것과 동일
	void turnOff();
	void setVolume(int volume);
}
