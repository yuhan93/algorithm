package programmers;

import java.util.Arrays;

public class L0A로B만들기 {
	public static void main(String[] args) {
		// "allpe"	"apple"
		String a = "allpe";
		String b = "apple";
		int answer = 0;
		String[] arr = a.split("");
		String[] arr2 = b.split("");
		Arrays.sort(arr);
		Arrays.sort(arr2);
		if(Arrays.equals(arr,arr2)){
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println("@@" + answer);
	}
}
