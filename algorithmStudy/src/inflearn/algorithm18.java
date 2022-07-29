package inflearn;

import java.util.Scanner;

public class algorithm18 {
    public static void main(String arg[]){
        /*
        설명 : 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
              각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
              격자의 가장자리는 0으로 초기화 되었다고 가정한다.
              만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
              ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 5 ㅣ 3 ㅣ 7 ㅣ 2 ㅣ 3 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 3 ㅣ 7 ㅣ 1 ㅣ 6 ㅣ 1 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 7 ㅣ 2 ㅣ 5 ㅣ 3 ㅣ 4 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 4 ㅣ 3 ㅣ 6 ㅣ 4 ㅣ 1 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 8 ㅣ 7 ㅣ 3 ㅣ 5 ㅣ 2 ㅣ 0 ㅣ
              ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ 0 ㅣ
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        입력 : 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
              두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
        출력 : 봉우리의 개수를 출력하세요.
        예시 입력 1 :  5
                     5 3 7 2 3
                     3 7 1 6 1
                     7 2 5 3 4
                     4 3 6 4 1
                     8 7 3 5 2
        예시 출력 1 : 10
         */
        int[] dx = { -1 , 0 , 1 , 0};
        int[] dy = { 0 , 1 , 0 , -1};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = 0 ;
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < N; j++){
                boolean flag = true;
                for(int k = 0 ; k < 4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx >= 0 && nx < N && ny >= 0 && ny < N && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
