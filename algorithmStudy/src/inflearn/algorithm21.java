package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm21 {
    public static void main(String arg[]){
        /*
        설명 : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
        입력 : 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
              두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
              세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
              네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
              각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
        출력 : 오름차순으로 정렬된 배열을 출력합니다.
        예시 입력 1 :  3
                     1 3 5
                     5
                     2 3 6 7 9
        예시 출력 1 : 1 2 3 3 5 6 7 9
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0 ; i < M; i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < N && p2 < M){
            if(arr[p1] < arr2[p2]){
                arrayList.add(arr[p1++]);
            } else {
                arrayList.add(arr2[p2++]);
            }
        }
        while (p1 < N){
            arrayList.add(arr[p1++]);
        }
        while (p2 < M){
            arrayList.add(arr2[p2++]);
        }

        for(int x : arrayList){
            System.out.print(x + " ");
        }
    }

}
