package programmers;

public class L0유한소수판별하기 {
	public static void main(String[] args) {






		// 이건 나도 어렵다










		int a = 12;
		int b = 21;

		int newB = b / gcd(a, b);

		while (newB != 1) {
			if (newB % 2 == 0) {
				newB /= 2;
			} else if (newB % 5 == 0) {
				newB /= 5;
			} else {
				return 2;
			}
		}

		return 1;
	}

	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
