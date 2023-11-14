package programmers;

public class L0직사각형넓구하기 {
	public static void main(String[] args) {
		/*
		* 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
		* 직사각형 네 꼭짓점의 좌표
		* [
		* [x1, y1],
		* [x2, y2],
		* [x3, y3],
		* [x4, y4]
		* ]가 담겨있는 배열 dots가 매개변수로 주어질 때,
		* 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
		*
		* 직사각형 넓이 가로 x 세로
		* */
		int[][] dots = {{1, 1}, {2 ,1}, {2, 2},{1, 2}};
		// 1 , 2 , 4 , 2
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		int answer = 0;
		x = dots[0][0]; // x 기준값
		y = dots[0][1]; // y 기준값
		for(int i = 1 ; i < 4; i++){
			if(x != dots[i][0]){
				width = Math.abs(x - dots[i][0]);
			}
			if(y != dots[i][1]){
				height = Math.abs(y - dots[i][1]);
			}
		}
		answer = width*height;
		System.out.println("@@@" + answer);

	}
}
