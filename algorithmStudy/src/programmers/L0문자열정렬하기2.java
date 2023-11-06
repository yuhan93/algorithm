package programmers;

import java.util.Arrays;

public class L0문자열정렬하기2 {
	public static void main(String[] args) {
		String my_string = "Bcad";
		String answer = "";
		String a = "";
		char[] arr = my_string.toCharArray();
		for(int i = 0;i < arr.length; i++){
			if(Character.isUpperCase(arr[i])){
				a += String.valueOf(arr[i]).toLowerCase();
			} else {
				a += arr[i];
			}
		}
		String[] arr2 = a.split("");
		Arrays.sort(arr2);
		for(int i = 0; i < arr2.length;i++){
			answer += arr2[i];
		}
		System.out.println("@@@" + answer);


	}
}
