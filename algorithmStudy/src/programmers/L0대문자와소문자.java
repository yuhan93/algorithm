package programmers;

public class L0대문자와소문자 {
	public static void main(String[] args) {
		String a = "cccCCC";
		String b = "";
		for(char x : a.toCharArray()){
			if(Character.isUpperCase(x)){
				b += Character.toLowerCase(x);
			} else {
				b += Character.toUpperCase(x);
			}
		}
		System.out.println("@@@" + b);

	}
}
