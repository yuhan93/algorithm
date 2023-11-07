package programmers;

public class L0숨어있는숫자의덧셈2 {
	public static void main(String[] args) {
		int answer = 0;
		String my_string = "aAb1B2cC34oOp";
		String[] arr = my_string.split("[a-zA-z]");
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i].matches("[0-9]+")){
				answer += Integer.parseInt(arr[i]);
			}
		}
		System.out.println("@@" + answer);

//		my_string = my_string.replaceAll("[^\\d]", " ");
//		// \\d : [0-9]와 동일한 의미를 가진다.
//		//  ^  : 정규표현식에서 "부정"을 나타내는 메타문자.
//		// 즉 [^\\d]는 숫자가 아닌 모든 문자를 뜻한다.
//
//		String[] str = my_string.split(" ");
//		for (int i = 0; i < str.length; i++) {
//			answer += (!str[i].isEmpty()) ? Integer.parseInt(str[i]) : 0;
//		}


	}
}
