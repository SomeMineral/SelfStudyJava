package sec02.exam05;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용 저장했으");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("AutoSaveThread에서 InterruptedException 발생!");
				break;
			}
			save();
		}
		
		System.out.println("여기까진 오나?"); // 여기까진 못 오네. while 돌던 도중에 main 스레드 종료되면서 함께 종료되는구나.
	}

}
