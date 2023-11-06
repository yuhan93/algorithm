package programmers;

public class L0외계행성의나이 {
	public static void main(String[] args) {
		int a = 23;
		String b = "abcdefghij";
		String[] arr = String.valueOf(a).split("");
		String answer = "";
		for(int i = 0 ; i < arr.length; i++){
			answer += b.charAt(Integer.valueOf(arr[i]));
		}

		System.out.println("@@@" + answer);

	}
}
