package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class algorithm_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int last_value = 0;
		StringBuilder sb = new StringBuilder();

		// 8
		for(int i = 0 ; i < N; i++){
			int T = Integer.parseInt(br.readLine()); // 4
			// 4 > 0
			if(T > last_value){
				// 1 <= 4
				for(int j = last_value + 1 ; j <= T; j++){
					stack.push(j);
					sb.append("+").append("\n");
				}
				last_value = T;
			} else if(stack.peek() != T){
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);

	}
}
