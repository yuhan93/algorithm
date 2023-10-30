package programmers;

public class 길이에따른연산 {
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5,6,7,8,9};
		int answer = 0;
		int mul = 1;
		for(int i = 0 ; i < num_list.length; i++){
			if(num_list.length > 10){
				answer += num_list[i];
			} else {
				mul *= num_list[i];
				answer = mul;
			}
		}

	}
}
