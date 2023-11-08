package programmers;

public class L07의개수 {
	public static void main(String[] args) {
		/*
		* 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
		* 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
		* */
		int[] arr = {7, 77, 17};
		int answer = 0;
		for(int i = 0 ; i < arr.length; i++){
			String[] arr2 = String.valueOf(arr[i]).split("");
			for(int j = 0 ; j < arr2.length; j++){
				if(Integer.parseInt(arr2[j]) == 7){
					answer++;
				}
			}
		}
		System.out.println("@@" + answer);


	}
}
