package programmers;

public class 특정문자제거하기L0 {
	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		String answer = "";
		String[] split = my_string.split("");
		for(int i = 0 ; i < split.length; i++){
			if(!letter.equals(split[i])){
				answer += my_string.charAt(i);
			}
		}
		System.out.println("@ " + answer);

	}
}
