package programmers;

public class L0점의위치구하기 {
	public static void main(String[] args) {
		int answer = 0;
		int[] dot = {2,4};

		// 0보다 크다면
		if(dot[0] > 0 && dot[1] > 0){
			answer = 1;
		} else if (dot[0] < 0 && dot[1] > 0){
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0){
			answer = 3;
		} else if (dot[0] > 0 && dot[1] < 0){
			answer = 4;
		}
		System.out.println("@@@" + answer);

	}
}
