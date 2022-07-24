package inflearn;

import sun.nio.ch.sctp.SctpNet;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm13 {
    public static void main(String arg[]){
        /*
        설명 : N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
              예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
              첫 자리부터의 연속된 0은 무시한다.
        입력 : 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
              각 자연수의 크기는 100,000를 넘지 않는다.
        출력 : 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
        예시 입력 1 :  9
                     32 55 62 20 250 370 200 30 100
        예시 출력 1 : 23 2 73 2 3
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i = 0 ; i < N; i ++){
            int tmp = arr[i];
            // 32
            int res = 0;
            // 32
            while(tmp > 0){
                System.out.print(arr[i] + " ");
                int t = tmp % 10; // 2
                res = res * 10 + t; // 2
                tmp = tmp / 10; // 3
            }
            if(isPrime(res)){
                arraylist.add(res);
            }
        }
        for(int x : arraylist){
            System.out.print(x + " ");
        }
    }
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2 ; i < num; i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
