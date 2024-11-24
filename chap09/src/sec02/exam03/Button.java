package sec02.exam03;

public class Button {
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
