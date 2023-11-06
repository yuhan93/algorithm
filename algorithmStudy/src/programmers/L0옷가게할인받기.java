package programmers;

public class L0옷가게할인받기 {
	public static void main(String[] args) {
		// 10만원 이상 5%
		// 30만원 이상 10%
		// 50만원 이상 20%
		int price = 580000;
		int result = 0;

		if(price >= 500000){
			result = (int) (price - (price * 0.2));
		} else if(price >= 300000){
			result = (int) (price - (price * 0.1));
		} else if(price >= 100000){
			result = (int) (price - (price * 0.05));
		} else {
			result = price;
		}

			System.out.println("@ " + result);

	}

}
