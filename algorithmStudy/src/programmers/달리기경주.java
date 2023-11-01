package programmers;

import java.util.Arrays;

public class 달리기경주 {
	public static void main(String[] args) {

		String a = "hello";
		int b = 3;
		String c = "";
		String sb = "";
		for(int i = 0; i < a.length(); i ++){
			for(int j = 0; j < b; j++){
				sb += (a.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
