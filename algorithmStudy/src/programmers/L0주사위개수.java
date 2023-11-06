package programmers;

public class L0주사위개수 {
	public static void main(String[] args) {

		// [10, 8, 6]	3	12
		int[] box = {10, 8, 6};
		int n = 3;
		int answer = 0 ;
		int a = box[0] / 3;
		int b = box[1] / 3;
		int c = box[2] / 3;
		answer = a*b*c;
		System.out.println("@@@"+answer);
		// box 길이는 3
		// 넓이부터 구하지 마시고 가로 세로 높이를 모서리 만큼 나눈다음 가로*세로*높이 해주시면 됩니다



	}
}
