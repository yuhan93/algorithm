package programmers;

import java.util.Arrays;

public class L0배열자르기 {
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		int[] answer = {};
		int num1 = 1;
		int num2 = 3;

		answer = Arrays.copyOfRange(numbers,num1,num2+1);
		for(int i = 0 ; i < answer.length; i ++){
			System.out.println("@@" + answer[i]);
		}
	}
}
