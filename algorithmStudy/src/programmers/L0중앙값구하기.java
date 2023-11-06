package programmers;

import java.util.Arrays;

public class L0중앙값구하기 {
	public static void main(String[] args) {
		int[] arr = {1,2,7,9,10};
		// left = 0;
		// right arr.length;
		// mid = (left + right) / 2; // 중간값 구하기
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length;
		int num = (left - right) / 2;

		int answer = arr[num];
		System.out.println(answer);

	}
}
