package algorithm.algorithmStudy.src.backjoon;

import java.util.*;

public class algorithm_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

		// toCharArray()는 문자열을 한 글자씩 쪼개서
		// char타입의 배열에 집어넣어주는 메소드이다.
		char[] str = N.toCharArray();
		// 그 다음 정렬
		Arrays.sort(str);

		//내림차순
		for(int i = str.length-1; i >=0; i--) {
			System.out.print(str[i]);
		}
	}
}
