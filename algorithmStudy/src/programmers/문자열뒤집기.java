package programmers;

public class 문자열뒤집기 {
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";

		StringBuilder sb = new StringBuilder(my_string);
		answer = sb.reverse().toString();
		System.out.println("@@@" + answer);



	}
}
