package programmers;

public class L0이진수더하기 {
	public static void main(String[] args) {
		String a = "1001";
		String b = "1111";
		int n = Integer.parseInt(a,2);
		int m = Integer.parseInt(b,2);
		System.out.println("@@" +Integer.toBinaryString(n+m));
	}
}
