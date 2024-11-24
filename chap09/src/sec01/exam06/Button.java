package sec01.exam06;

public class Button {
	
	OnClickListener listener;
	
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void click() {
		// 클릭해보기 전까진.. 모르잖아? 뭘 클릭할 지 몰라!
		// 그래서 구체적으로 적으면 곤란해
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
