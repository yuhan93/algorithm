package programmers;

public class 배열원소의길이L0 {
	public static void main(String[] args) {

		String[] strlist = {"We", "are", "the", "world!"};

		int[] answer = new int[strlist.length];

		for(int i = 0 ; i < strlist.length; i++){
			answer[i] = strlist[i].length();
		}
		for(int i = 0 ; i < answer.length; i++){
			System.out.println("@@@" + answer[i]);
		}
	}
}
