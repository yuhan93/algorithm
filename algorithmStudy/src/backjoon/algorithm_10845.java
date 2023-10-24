package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class algorithm_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int back = -1;
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")){
				int num = Integer.parseInt(st.nextToken());
				back = num;
				que.add(num);
			} else if (str.equals("front")){
				if(que.size() != 0){
					sb.append(que.peek()).append("\n");
				} else {
					System.out.println(-1);
				}
			} else if (str.equals("back")){
				System.out.println(back);
			} else if (str.equals("size")){
				System.out.println(que.size());
			} else if (str.equals("empty")){
				if(que.size() == 0){
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (str.equals("pop")){
				if(que.size() != 0){
					que.poll();
					System.out.println(que.poll());
				} else {
					back = -1;
					System.out.println(-1);
				}
			}
		}
	}
}
