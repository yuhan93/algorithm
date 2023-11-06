package programmers;

public class L0개미군단 {
	public static void main(String[] args) {
		// hp = 23
		// 장군 = 5
		// 병정 = 3
		// 일개미 = 1
		int hp = 23;
		int a = 5;
		int b = 3;
		int c = 1;
		int answer = 0;
		answer += (hp/5);
		hp = hp%5;

		answer += (hp/3);
		hp = hp%3;

		answer += (hp/1);
		System.out.println("@" + answer);

	}
}
