package programmers;

import java.util.Arrays;

public class L0문자열밀기 {
	public static void main(String[] args) {

		/*
		* 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고
		* 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
		* 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
		* A를 밀어서 B가 될 수 있다면 밀어야 하는
		* 최소 횟수를 return하고 밀어서
		* B가 될 수 없으면 -1을 return
		* 하도록 solution 함수를 완성해보세요.
		*
		* A			B	 	 result
		* "hello"	"ohell"	  1
		* "apple"	"elppa"	 -1
		*
		* */
		String A = "hello";
		String B = "ohell";
//		String[] arr = A.split("");
		int answer = 0;
//		if(A.equals(B)){
//			answer = 0;
//		} else {
//			String c = arr[A.length()-1]; // 제일 마지막 문자열
//			for(int i = arr.length-2; i >= 0; i--){
//				String str = arr[i];
//				arr[i+1] = str;
//				if(i == 0){
//					arr[i] = c;
//				}
//			}
//			String sb = "";
//			for(int i = 0 ; i < arr.length; i++){
//				sb += arr[i];
//			}
//			if(B.equals(sb)){
//				answer = 1;
//			} else {
//				answer = -1;
//			}
//		}
		int result = -1;
		char[] c = A.toCharArray();
		char temp;
		if(A.equals(B)){
			result = 0;
		} else {
			for(int i = 0 ; i < A.length()-1; i++){
				temp = c[A.length()-1];
				for(int j = c.length-2; j >= 0; j--){
					c[j+1] = c[j];
				}
				c[0] = temp;
				String s = "";
				for(int j = 0 ; j < c.length; j++){
					s += c[j];
				}
				if(s.equals(B)){
					result = i +1;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
