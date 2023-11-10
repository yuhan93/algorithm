package programmers;

import java.util.Arrays;

public class L0영어가싫어요 {
	public static void main(String[] args) {
		/*
		* 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		* 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔
		* return 하도록 solution 함수를 완성해 주세요.
		* */
		long answer = 0;
		String str = "onetwothreefourfivesixseveneightnine";
		str = str.replace("zero","0");
		str = str.replace("one","1");
		str = str.replace("two","2");
		str = str.replace("three","3");
		str = str.replace("four","4");
		str = str.replace("five","5");
		str = str.replace("six","6");
		str = str.replace("seven","7");
		str = str.replace("eight","8");
		str = str.replace("nine","9");

		answer = Long.parseLong(str);
		System.out.println("@@" + answer);
	}
}
