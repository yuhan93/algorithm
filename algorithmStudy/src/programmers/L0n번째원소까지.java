package programmers;

public class L0n번째원소까지 {

	public int[] solution(int[] num_list, int n) {

		int[] answer = new int[n];

		for(int i = 0 ; i < answer.length; i++){
			answer[i] = num_list[i];
		}

		return answer;
	}

}
