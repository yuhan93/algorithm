package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class algorithm_17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) == '<'){
				flag = true;
				while(!stack.empty()){
					sb.append(stack.pop());
				}
				sb.append(str.charAt(i));
			} else if (str.charAt(i) == '>'){
				flag = false;
				sb.append(str.charAt(i));
			} else if(flag){
				sb.append(str.charAt(i));
			} else if(!flag){
				if(str.charAt(i) == ' '){
					while(!stack.empty()){
						sb.append(stack.pop());
					}
					sb.append(str.charAt(i));
				} else {
					stack.push(str.charAt(i));
				}
			}
		}
		while (!stack.empty()){
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}
