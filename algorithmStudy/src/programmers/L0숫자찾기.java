package programmers;

public class L0숫자찾기 {
	public static void main(String[] args) {
		int num = 29183;
		int k = 1;

		String[] arr = String.valueOf(num).split("");
		int answer = 0;
		for(int i = 0 ; i < arr.length; i++){
			if(String.valueOf(k).equals(arr[i])){
				answer = i+1;
				break;
			} else {
				answer = - 1;
			}
		}
		System.out.println("@@@" + answer);

	}
}
