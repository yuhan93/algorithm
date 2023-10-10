package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class algorithm_1920 {
	public static void main(String[] args) {
		/*
		* 문제
		* N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
		*
		* 입력
		* 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다.
		* 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
		* 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
		* 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
		*
		* 출력
		* M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
		*
		* 예제 입력 1
		* 5
		* 4 1 5 2 3
		* 5
		* 1 3 7 9 5
		* 예제 출력 1
		* 1
		* 1
		* 0
		* 0
		* 1
		*/
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()]; // 처음 입력 된 배열 크기 선언
		for(int i = 0 ; i < arr.length; i++){ // 배열 안에 원소 넣기
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 오름 차순 정렬

		int M = sc.nextInt(); // 두번째 배열 크기 선언
		int[] arr2 = new int[M];
		for(int i = 0 ; i < arr2.length; i++){ // 두번째 배열 안에 원소 넣기
			arr2[i] = sc.nextInt();
		}
		// 두번재 배열 반복문을 통해서 입력된 원소 0~N 번 까지 비교 한다.
		for(int i = 0; i < arr2.length; i++){
			System.out.println(binarySearch(arr2[i], arr)); // 이진 탐색 메소드
		}

	}
	public static int binarySearch(int key , int[] arr){
		int low = 0 ; // 탐색 범위의 왼쪽 끝 인덱스
		int high = arr.length-1; // 탐색 범위의 오른쪽 끝 인덱스
		int mid = 0; // 중간위치 값

		while(low <= high){ // low가 high보다 커지기 전까지 반복문을 돌린다.
			mid = (low + high) / 2; // 중간의 위치를 구한다.
			if(key == arr[mid]){ // key 값이 중간 위치인 경우
				return 1;
			} else if (key < arr[mid]){ // key 값이 중간 위치보다 작을 경우
				high = mid -1;
			} else { // key 값이 중간 위치보다 클 경우
				low = mid +1;
			}
		}
		// 찾고자 하는 값이 없는 경우
		return 0;
	}

}
