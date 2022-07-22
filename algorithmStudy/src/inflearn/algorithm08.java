package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm08 {
    public static void main(String arg[]){
        /*
        설명 : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
        (첫 번째 수는 무조건 출력한다)
        입력 : 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
        출력 : 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
        예시 입력 1 :  6
                     7 3 9 5 6 12
        예시 출력 1 : 7 9 6 12
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N; i++){
          arr[i] = sc.nextInt();
        };
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(arr[0]);
        for(int j = 1 ; j < N; j++){
            if(arr[j] > arr[j-1]){
                arrList.add(arr[j]);
            }
        }
        for(int x : arrList){
            System.out.print(x + " ");
        }
    }
}
