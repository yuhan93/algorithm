package programmers;

public class L0제곱수판별하기 {
	public static void main(String[] args) {
		int n = 976;
		int answer = 0 ;
		Double nn = Math.sqrt(n);
		if(nn % 1 == 0){
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);

	}
}
