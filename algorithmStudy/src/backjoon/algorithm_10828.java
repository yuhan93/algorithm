package backjoon;

import java.io.*;
import java.util.*;

public class algorithm_10828 {
	public static void main(String[] args) throws IOException {
		/*
		* 문제
		* 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		* 명령은 총 다섯 가지이다.
		* push X: 정수 X를 스택에 넣는 연산이다.
		* pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		* size: 스택에 들어있는 정수의 개수를 출력한다.
		* empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		* top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		*
		* 입력
		* 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
		* 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
		* 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		*
		* 출력
		* 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
		*
		* 예제 입력 1					예제 입력 2
		* 14							7
		* push 1						pop
		* push 2						top
		* top							push 123
		* size							top
		* empty							pop
		* pop							top
		* pop							pop
		* pop
		* size
		* empty
		* pop
		* push 3
		* empty
		* top
		*
		* 예제 출력 1					예제 출력 2
		* 2								-1
		* 2								-1
		* 0								123
		* 2								123
		* 1								-1
		* -1							-1
		* 0
		* 1
		* -1
		* 0
		* 3
		* */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")){
				stack.push(Integer.parseInt(st.nextToken()));
			} else if(str.equals("top")){
				if(stack.isEmpty()){
					sb.append(-1+"\n");
				} else {
					sb.append(stack.peek()+"\n");
				}
			} else if(str.equals("size")){
				sb.append(stack.size()+"\n");
			} else if(str.equals("empty")){
				if(stack.isEmpty()){
					sb.append(1+"\n");
				} else {
					sb.append(0+"\n");
				}
			} else if(str.equals("pop")){
				if(stack.isEmpty()){
					sb.append(-1+"\n");
				} else {
					sb.append(stack.pop()+"\n");
				}
			}
		}
		System.out.println(sb);
	}
}
