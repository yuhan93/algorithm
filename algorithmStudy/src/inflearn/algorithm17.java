package inflearn;

import java.util.Scanner;

public class algorithm17 {
    public static void main(String arg[]){
        /*
        설명 : 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
              ㅣ 10 ㅣ 13 ㅣ 10 ㅣ 12 ㅣ 15 ㅣ
              ㅣ 12 ㅣ 39 ㅣ 30 ㅣ 23 ㅣ 11 ㅣ
              ㅣ 11 ㅣ 25 ㅣ 50 ㅣ 53 ㅣ 15 ㅣ
              ㅣ 19 ㅣ 27 ㅣ 29 ㅣ 37 ㅣ 27 ㅣ
              ㅣ 19 ㅣ 13 ㅣ 30 ㅣ 13 ㅣ 19 ㅣ
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
              N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
        입력 : 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
              두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
        출력 : 최대합을 출력합니다.
        예시 입력 1 :  5
                     10 13 10 12 15
                     12 39 30 23 11
                     11 25 50 53 15
                     19 27 29 37 27
                     19 13 30 13 19
        예시 출력 1 : 155
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = Integer.MIN_VALUE;
        int sum1 , sum2;
        for(int i = 0 ; i < N; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < N; j++){
                sum1+= arr[i][j];
                sum2+= arr[j][i];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }
        sum1 = sum2 = 0;
        for(int i = 0; i < N; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][N - i - 1];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        System.out.println(result);

    }
}
