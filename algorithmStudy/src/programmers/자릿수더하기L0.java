package programmers;

public class 자릿수더하기L0 {
	public static void main(String[] args) {

		int n = 1234;
		String a = Integer.toString(n);
		int answer = 0;
		for(int i = 0 ; i < a.length(); i++){
			answer += Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		System.out.println("@@" + answer);


	}
}
