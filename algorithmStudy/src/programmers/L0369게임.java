package programmers;

public class L0369게임 {
	public static void main(String[] args) {


		int order = 29423;
		int answer = 0;
		String[] arr = String.valueOf(order).split("");
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
				answer++;
			}
		}
		System.out.println("@@@" + answer);

	}
}
