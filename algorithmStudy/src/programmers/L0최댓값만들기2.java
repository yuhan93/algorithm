package programmers;

import java.util.Arrays;

public class L0최댓값만들기2 {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
		// [1, 2, -3, 4, -5]
		Arrays.sort(numbers);
		int answer = -100000000;
		for(int i = 0 ; i < numbers.length; i ++){
			for(int j = i+1 ; j < numbers.length; j++){
				if(numbers[i] * numbers[j] > answer){
					answer = numbers[i] * numbers[j];
				}
			}
		}

		System.out.println("@@@" + answer);
	}
}
