package programmers;

public class L0가장큰수찾기 {
	public static void main(String[] args) {
		// 가장 큰수와 인덱스
		int[] answer = new int[2];

		int[] a = {1, 8, 3};
		int b = a[0];
		int c = 0;
		for(int i = 1; i < a.length; i++){
			if(b < a[i]){
				b = a[i];
				c = i;
			}
		}
		answer[0] = b;
		answer[1] = c;
	}
}
