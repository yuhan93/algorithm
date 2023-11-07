package programmers;

public class L02차원으로만들기 {
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;


		int[][] arr = new int[num_list.length / n][n]; // arr[4][2] > arr[가로][세로]
		// [] []
		// [] []
		// [] []
		// [] []
		int a = 0;
		for(int i = 0 ; i < num_list.length / n; i++){
			for(int j = 0; j < n ; j++){
				arr[i][j] = num_list[a];
				a++;
			}
		}


	}
}
