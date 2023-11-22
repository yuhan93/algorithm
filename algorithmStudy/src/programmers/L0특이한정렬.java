package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L0특이한정렬 {
	public static void main(String[] args) {
		/*
		* 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
		* 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
		* 정수가 담긴 배열 numlist와 정수 n이 주어질 때
		* numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
		* 입출력 예
		* numlist	n	result
		* [1, 2, 3, 4, 5, 6]	4	[4, 5, 3, 6, 2, 1]
		* */
		int[] array = {1, 2, 3, 4, 5, 6};
		int n = 4;
		Arrays.sort(array);
		for(int i = 0 ; i < array.length; i++){
			for(int j = 0 ; j < array.length; j++){
				if(Math.abs(n - array[i]) <= Math.abs(n - array[j])){
					int tmep = array[i];
					array[i] = array[j];
					array[j] = tmep;
				}
			}
		}
//		int[] result = new int[numlist.length-1];

//		int targetValue = 4;

	}

}
