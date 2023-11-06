package programmers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class L0배열뒤집기 {
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int[] reverse = new int[num_list.length];
		for(int i = 0 ; i < num_list.length; i++){
			reverse[i] = num_list[num_list.length -1 - i];
		}
		for(int data : reverse){
			System.out.println("@ " + data);
		}

	}
}
