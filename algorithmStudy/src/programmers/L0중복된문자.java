package programmers;

public class L0중복된문자 {
	public static void main(String[] args) {
		String a = "people";
		String answer = "";
		for(int i = 0 ; i < a.length(); i++){
			if(a.indexOf(a.charAt(i)) == i){
				answer += a.charAt(i);
			}
		}
		System.out.println("@@@" + answer);

	}
}
