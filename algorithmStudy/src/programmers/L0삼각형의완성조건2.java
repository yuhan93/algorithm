package programmers;

import java.util.Arrays;

public class L0삼각형의완성조건2 {
	public static void main(String[] args) {
		// 가장 긴변의 길이는 다른 두변의 길이의 합보다 작아야 한다.
		// 삼각형의 두 변의 길이가 담긴 배열 sides
		int[] sides = {11 ,7};
		int answer = 0;
		Arrays.sort(sides);
		int max = sides[1];
		int min = sides[0];

		int low = max - min;
		int high = max + min;

		answer = high - low -1;
		System.out.println("@@" + answer);

	}
}
