package programmers;

public class L0저주의숫자3 {
	public static void main(String[] args) {

		int n = 15;
		int answer = 0;
		for(int i = 1; i <= n; i++){
			answer++;
			String s = Integer.toString(answer);
			while(s.contains("3") || answer % 3 == 0){
				answer++;
				s = Integer.toString(answer);
			}
		}
		System.out.println("@@@" + answer);
	}
}
