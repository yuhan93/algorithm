package programmers;

public class L0팩토리얼 {
	public static void main(String[] args) {
		int n = 7;
		int answer = 0;
		for(int i = 1; i <= 10; i++){
			if(factorial(i) <= n){
				answer = i;
			} else {
				break;
			}
			System.out.println("@@@" + answer);
		}
	}
	private static int factorial(int number){
		if(number == 1){
			return 1;
		}
		return number * factorial(number-1);
	}
}
