package algorithm.algorithmStudy.src.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class algorithm_2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int x = 0;
		int count = 0;
		int y = 0;
		for(int i = 0 ; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0 ; i < a.length; i++){
			x += a[i];
			count++;
			if(a.length % 2 == 0){
				y = (a[1]+a[2])/2;
			} else {
				y = a[a.length/2];
			}
		}
		System.out.println(x/count); // 평균
		System.out.println(y); // 중앙값
	}

}
