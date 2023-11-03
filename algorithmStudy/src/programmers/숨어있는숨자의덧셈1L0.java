package programmers;

public class 숨어있는숨자의덧셈1L0 {
	public static void main(String[] args) {
		/*
		* 문자열 my_string이 매개변수로 주어집니다.
		* my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
		*
		* "aAb1B2cC34oOp"	10
		* "1a2b3c4d123"	16
		* */
		String a ="aAb1B2cC34oOp";
		int b = 0 ;
		for(int i = 0 ; i <a.length(); i++){
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57){
				b += Integer.parseInt(String.valueOf(a.charAt(i)));
			}
		}
		System.out.println("@@@" + b);
	}
}
