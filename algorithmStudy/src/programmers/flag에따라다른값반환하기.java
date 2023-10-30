package programmers;

public class flag에따라다른값반환하기 {

	public int solution(int a, int b, boolean flag) {
		int answer = 0;

		if(flag){
			answer = a + b;
		} else {
			answer = a - b;
		}

		return answer;
	}

}
