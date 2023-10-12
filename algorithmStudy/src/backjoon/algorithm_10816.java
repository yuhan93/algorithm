package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class algorithm_10816 {
	public static void main(String[] args) {
		/*
		* 문제
		* 숫자 카드는 정수 하나가 적혀져 있는 카드이다.
		* 상근이는 숫자 카드 N개를 가지고 있다.
		* 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
		*
		* 입력
		* 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
		* 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
		* 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
		* 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
		* 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.
		* 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
		*
		* 출력
		* 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
		*
		* 예제 입력 1
		* 10
		* 6 3 2 10 10 10 -10 -10 7 3
		* 8
		* 10 9 -5 2 3 4 5 -10
		*
		* 예제 출력 1
		* 3 0 0 1 2 0 0 2
		* */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0 ; i < arr.length; i ++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++){
			int key = sc.nextInt();
			sb.append(upperBound(key,arr) - lowerBound(key,arr)).append(' '); // 이분 탐색 메소드
		}
		System.out.println(sb);
	}
	private static int lowerBound(int key, int[] arr){
		// key : 구하고자 하는 값
		int left = 0; // left : 왼쪽 끝 인덱스  / 0
		int right = arr.length; // right : 오른쪽 끝 인덱스  / arr.length-1
		// arr : 배열
		int mid; // 중간값
		while(left < right){
			mid = (left + right) / 2; // 중간값 구하기
			if(arr[mid] < key){ // 배열의 중간값보다 구하고자 하는 값이 클 경우
				left = mid + 1; // 왼쪽 끝 인덱스에 중간값 + 1
			} else {
				right = mid; // 작은경우 오른쪽 끝 인덱스에 중간값
			}
		}
		return right;
	};

	private static int upperBound(int key, int[] arr){
		// key : 구하고자 하는 값
		int left = 0; // left : 왼쪽 끝 인덱스  / 0
		int right = arr.length; // right : 오른쪽 끝 인덱스  / arr.length-1
		// arr : 배열
		int mid; // 중간값
		while(left < right){
			mid = (left + right) / 2; // 중간값 구하기
			if(arr[mid] <= key){ // 배열의 중간값보다 구하고자 하는 값이 크거나 같은경우
				left = mid + 1; // 왼쪽 끝 인덱스에 중간값 + 1
			} else {
				right = mid; // 작은경우 오른쪽 끝 인덱스에 중간값
			}
		}
		return right;
	}
}
