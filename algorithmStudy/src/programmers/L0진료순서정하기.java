package programmers;

public class L0진료순서정하기 {
	public static void main(String[] args) {
		int[] arr = {30, 10, 23, 6, 100};
		int[] answer = new int[arr.length];
		for(int i = 0 ; i < arr.length; i++){
			int cnt =1;
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					cnt++;
				}
			}
			answer[i] = cnt;
		}

	}
}
