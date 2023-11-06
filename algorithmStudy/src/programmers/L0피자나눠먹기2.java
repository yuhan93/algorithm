package programmers;

public class L0피자나눠먹기2 {
	public static void main(String[] args) {

		// 피자 6조각으로 짤라줌
		int n = 10;
		int answer = 0;
		if(n % 6==0){
			answer = n / 6;
		} else {
//			answer = n / 6 +1;
			 for(int i = 1; i <= 6 * n; i++){
			 	if(6 * i % n == 0){
			 		answer = i;
			 		break;
				}
			 }
		}
		System.out.println("@@@" + answer);

	}
}
