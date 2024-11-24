package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향 언어래. 자바는 풍부한 API 지원한대";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
