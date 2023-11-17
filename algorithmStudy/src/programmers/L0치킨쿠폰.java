package programmers;

public class L0치킨쿠폰 {
	public static void main(String[] args) {
		// 치킨 시켜먹음
		// 한마리당 쿠폰 하나 줌
		// 쿠폰 10개 모으면 치킨 1마리 주는데
		// 거기에도 쿠폰 들어가있음
		int chicken = 1081;
		int coupon = 0;
		int answer = 0;

		while (chicken + coupon >= 10){
			int a = (chicken + coupon) / 10;
			int b = (chicken + coupon) % 10;

			chicken = a;
			coupon = b;
			answer += chicken;

		}
		System.out.println("@@" + answer);

	}
}
