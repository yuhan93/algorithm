package programmers;

import java.util.Arrays;

public class L0문자열정렬하기1 {
	public static void main(String[] args) {

		String a = "hi12392";
		int ab = 0;
		for(int i = 0 ; i <a.length(); i++){
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57){
				ab++;
			}
		}
		int[] arr = new int[ab];
		int c = 0;
		for(int i = 0 ; i <a.length(); i++){
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57){
				arr[c] = a.charAt(i) - '0';
				c++;
			}
		}
		Arrays.sort(arr);

	}
}
