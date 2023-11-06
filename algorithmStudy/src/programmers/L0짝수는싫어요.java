package programmers;

public class L0짝수는싫어요 {
	public static void main(String[] args) {
		int n = 10;
		int[] answer;
		// 배열 크기
		if(n % 2 == 0){
			answer = new int[n/2];
		} else {
			answer = new int[(n+1)/2];
		}

		for(int i = 0 ; i<answer.length; i ++){
			answer[i] = (i*2) + 1;
		}

		System.out.println("@ " + answer);
	}
}
