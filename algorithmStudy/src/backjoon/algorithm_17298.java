package backjoon;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class algorithm_17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 4
		int[] arr = new int[N];
		// 4     3527
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 크기가 N
		// Ai = 오른쪽에 있으면서 Ai 보다 큰 수 중에서 가장 왼쪽에 있는 수
		// Ai = [Ai+1] > Ai 가장 왼쪽
		for(int i = 0 ; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<>();

		// if(3,5,2,7) : A0 (3) 오큰수 : A0 보다 큰수 5,7 / 그중에 제일 왼쪽 수 5
		// A0 의 오큰수는 5
		// A1 (5) 오큰수 : A1 보다 큰수 7 / 그중에 제일 왼쪽 수 7
		// A2 (2) 오큰수 : A2 보다 큰수 7 / 그중에 제일 왼쪽 수 7
		// A3 (7) 오큰수 : A3 보다 큰수 없으면 -1


		// 결과는 5,7,7,2

	}
}
