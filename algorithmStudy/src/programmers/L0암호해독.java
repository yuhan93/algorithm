package programmers;

public class L0암호해독 {
	public static void main(String[] args) {
		String a = "dfjardstddetckdaccccdegk";
		int b = 4;
		String aa = "";
		System.out.println("@@@" + a.length());
		for(int i = b-1; i < a.length(); i = i+b){
			aa += a.charAt(i);
		}
		System.out.println("@@@" + aa);
	}
}
