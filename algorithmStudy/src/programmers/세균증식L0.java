package programmers;

public class 세균증식L0 {
	public static void main(String[] args) {
		int n = 2; // 마리 수
		int t = 10; // 시간
		int answer = 0;
		for(int i = 1; i <= t; i++){
			answer = n *= 2;
		}
		System.out.println("@@" + answer);

	}
}
