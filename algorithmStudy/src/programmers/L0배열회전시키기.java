package programmers;

public class L0배열회전시키기 {
	public static void main(String[] args) {

		int[] arr = {4, 455, 6, 4, -1, 45, 6};
		String a = "left";
		int b = 0;
		int[] answer = new int[arr.length];
		if(a.equals("right")){
			b = arr[arr.length -1];
			for(int i = arr.length-2; i >= 0; i--){
				answer[i+1] = arr[i];
			}
			answer[0] = b;
		} else if(a.equals("left")){
			b = arr[0];
			for(int i = 1; i < arr.length; i++){
				answer[i-1] = arr[i];
			}
			answer[arr.length-1] = b;
		}


	}
}
