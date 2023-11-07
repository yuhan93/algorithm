package programmers;

public class L0가까운수 {
	public static void main(String[] args) {
		int[] arr = {3,10,28};
		int n = 20;
		int answer = 100000;
		for(int i = 0 ; i < arr.length; i++){
			int a = arr[i] - n;
			if(Math.abs(a) < Math.abs(answer)){
				answer = a;
			} else if (Math.abs(a) == Math.abs(answer) && a < answer){
				answer = a;
			}
		}
		answer = n + answer;
		System.out.println("@@" + answer);


	}
}
