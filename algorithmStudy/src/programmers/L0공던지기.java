package programmers;

public class L0공던지기 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int k = 3;
		int n = 0;
		int answer = 0;
		for(int i = 1; i < k; i++){
			n = n + 2;
		}
		n %= arr.length;
		answer = arr[n];
		System.out.println("@@@" + answer);



	}
}
