package programmers;

public class L0n의배수고르기 {
	public static void main(String[] args) {
		int[] a = {4,5,6,7,8,9,10,11,12};
		int n = 3;
		int cnt = 0;
		for(int i = 0 ; i < a.length; i++){
			if(a[i] % n == 0){
				cnt++;
			}
		}
		int[] answer = new int[cnt];
		int aa = 0;
		for(int i = 0 ; i < a.length; i ++){
			if(a[i] % n == 0){
				answer[aa] = a[i];
				aa++;
			}
		}
	}
}
