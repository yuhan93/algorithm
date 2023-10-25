package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class algorithm_1158 {
	public static void main(String[] args) throws IOException {
		/*
		* 요세푸스 문제는 다음과 같다.
		* 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고,
		* 양의 정수 K(≤ N)가 주어진다.
		* 이제 순서대로 K번째 사람을 제거한다.
		* 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
		* 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
		* 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
		* N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
		* */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // N 번째 사람
		int K = Integer.parseInt(st.nextToken()); // 순서대로 K번째 사람을 제거
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> que = new LinkedList<>();
		// 사람 인원 수 N
		for(int i = 1; i <= N; i++){
			que.add(i);
		}
		// 순서 K
		while (que.size() != 1){
			// K-1 까지 처음에 있던 값을 맨 뒤로
			for(int i = 0; i < K -1; i++){
				que.add(que.poll());
			}
			// 첫번째 값 빼기
			sb.append(que.poll()).append(", ");
		}
		sb.append(que.poll()).append(">");
		System.out.println(sb);
	}
}
