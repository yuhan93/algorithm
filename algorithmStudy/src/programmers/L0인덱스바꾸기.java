package programmers;

public class L0인덱스바꾸기 {
	public static void main(String[] args) {
		String a = "I love you";
		int b = 3;
		int c = 6;
		String d = "";
		String[] arr = a.split("");
		String aa = arr[b];
		arr[b] = arr[c];
		arr[c] = aa;
		for(int i = 0 ; i < arr.length; i ++){
			d += arr[i];
		}
		System.out.println("@@@" + d);
	}
}
