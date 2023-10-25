package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class algorithm_10866 {
	public static void main(String[] args) throws IOException {
		/*
		* push_front X: 정수 X를 덱의 앞에 넣는다.
		* push_back X: 정수 X를 덱의 뒤에 넣는다.
		* pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		* pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		* size: 덱에 들어있는 정수의 개수를 출력한다.
		* empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
		* front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		* back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		* */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = 0;
			switch (str){
				case "push_front" :
					// push_front X: 정수 X를 덱의 앞에 넣는다.
					num = Integer.parseInt(st.nextToken());
					deque.addFirst(num);
//					sb.append(num).append("\n");
					break;
				case "push_back" :
					// push_back X: 정수 X를 덱의 뒤에 넣는다.
					num = Integer.parseInt(st.nextToken());
					deque.addLast(num);
//					sb.append(num).append("\n");
					break;
				case "pop_front" :
					// pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(deque.isEmpty()){
						sb.append("-1\n");
					} else {
						sb.append(deque.pollFirst()).append("\n");
					}
					break;
				case "pop_back" :
					// pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(deque.isEmpty()){
						sb.append("-1\n");
					} else {
						sb.append(deque.pollLast()).append("\n");
					}
					break;
				case "size" :
					// size: 덱에 들어있는 정수의 개수를 출력한다.
					sb.append(deque.size()).append("\n");
					break;
				case "empty" :
					// empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
					if(deque.isEmpty()){
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
					break;
				case "front" :
				// front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(deque.isEmpty()){
						sb.append("-1\n");
					} else {
						sb.append(deque.peekFirst()).append("\n");
					}
					break;
				case "back" :
				//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(deque.isEmpty()){
						sb.append("-1\n");
					} else {
						sb.append(deque.peekLast()).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
	}
}
