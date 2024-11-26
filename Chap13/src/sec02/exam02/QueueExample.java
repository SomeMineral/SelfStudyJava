package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendLetter", "율곡"));
		messageQueue.offer(new Message("sendMail", "길동"));
		messageQueue.offer(new Message("sendSMS", "은동"));
		messageQueue.offer(new Message("sendKakao", "동동"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command){
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "에게 문자를 보냅니다.");
				break;
			case "sendKakao":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			default:
				System.out.println("알 수 없는 명령");
			}
		}
	}

}
