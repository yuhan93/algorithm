package programmers;

import java.util.Arrays;

public class L0한번만등장한문자 {
	public static void main(String[] args) {
		String s = "abcabcadc";
		String[] arr = s.split("");
		Arrays.sort(arr);
		String answer = "";
		int a = 0;
		for(int i = 0 ; i < arr.length; i++){
			a = 0 ;
			for(int j = 0 ; j < arr.length; j++){
				if(arr[i].equals(arr[j])){
					a++;
				}
			}
			if( a == 1){
				answer += arr[i];
			}
		}
		System.out.println("@@"+  answer);
	}
}
