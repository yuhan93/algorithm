package programmers;

public class L0등수매기기 {
	public static void main(String[] args) {
		// 영어점수 / 수학점수 평균 점수로 등수 매김
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[] answer = new int[score.length];

		// 일단 평균 구해
		// 평균 구한 배열에서 반복문 돌려서 순위 만들어
		double[] avg = new double[score.length];
		for(int i = 0 ; i < score.length; i++){
			avg[i] = (score[i][0] + score[i][1]) / 2.0;
		}

		for(int i = 0 ; i < score.length; i++){
			int count = 0;
			for(int j = 0 ; j < score.length; j++){
				if(avg[i] < avg[j]){
					count++;
				}
			}
			answer[i] = count+1;
		}
		for(int data : answer){
			System.out.println("@@" + data);
		}




	}
}
