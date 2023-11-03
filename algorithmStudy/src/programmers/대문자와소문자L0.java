package programmers;

public class 대문자와소문자L0 {
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
