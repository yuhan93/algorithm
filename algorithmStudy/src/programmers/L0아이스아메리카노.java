package programmers;

public class L0아이스아메리카노 {
	public static void main(String[] args) {
		int[] answer = new int[2];
		int money = 5000;
		answer[0] = money / 5500;
		answer[1] = money % 5500;

		for(int data : answer){
			System.out.println("@ " + data);
		}
	}
}
