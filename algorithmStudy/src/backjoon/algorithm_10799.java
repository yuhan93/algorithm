package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class algorithm_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ( 괄호라면 stack에 push
		// ) 괄호라면 앞에있는 값과 비교해서 ( 라면 레이저니까 스택 길이 만큼 더한다
		// ) 앞에있는 값과 비교해서 ) 막대기니까 +1
		String str = br.readLine(); // () 입력한 값
		Stack<String> stack = new Stack<>();
		int cnt = 0 ;
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) == '('){
				stack.push("(");
			} else if (str.charAt(i) == ')'){
				stack.pop(); // **** 그럼 ) 일때 그냥 pop 하면 될 듯
				if(str.charAt(i -1) == '('){
					// stack.pop(); **** 근데 결국 ) 오면 무조건 pop 한다
					cnt += stack.size();
				} else {
					// stack.pop(); **** 근데 결국 ) 오면 무조건 pop 한다
					cnt += +1;
				}
			}
		}
		System.out.println(cnt);
	}
}
