package programmers;

public class L0약수구하기 {
	public static void main(String[] args) {

		int[] answer = {};
		int cnt = 0;
		int n = 24;
		for(int i = 1; i <= n; i++){
			if(n%i == 0){
				cnt++;
			}
		}
		answer = new int[cnt];
		int t = 0;
		for(int i = 1; i <= n; i++){
			if(n%i == 0){
				answer[t] = i;
				t++;
			}
		}
	}
}
