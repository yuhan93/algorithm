package programmers;

import java.util.ArrayList;

public class L0잘라서배열로저장하기 {
	public static void main(String[] args) {
		/*
		* 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
		*
		* 제한사항
		* 1 ≤ my_str의 길이 ≤ 100
		* 1 ≤ n ≤ my_str의 길이
		* my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
		* 입출력 예
		* my_str	n	result
		* "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
		* "abcdef123"	3	["abc", "def", "123"]
		* */

		String my_str = "abc1Addfggg4556b";
		int n = 6;
		int length = 0;
		if(my_str.length() % n == 0){
			length = my_str.length() / n;
		} else {
			length = my_str.length() / n + 1;
		}
		String[] answer = new String[length];

		for(int i = 0 ; i < length; i++){
			if(my_str.length() >= n){
				answer[i] = my_str.substring(0,n);
				my_str = my_str.substring(n , my_str.length());
			} else {
				answer[i] = my_str.substring(0,my_str.length());
			}
		}
		for(int i = 0 ; i < answer.length; i++){
			System.out.println("@@" + answer[i]);
		}

	}
}
