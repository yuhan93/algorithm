package inflearn;

import java.util.Scanner;

public class algorithm10 {
    public static void main(String arg[]){
        /*
        설명 : A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
              가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
              예를 들어 N=5이면
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
              ㅣ 회수   ㅣ 1  ㅣ 2  ㅣ 3  ㅣ 4  ㅣ 5  ㅣ
              ㅣ A의정보 ㅣ 2  ㅣ 3  ㅣ 3  ㅣ 1  ㅣ 3  ㅣ
              ㅣ B의정보 ㅣ 1  ㅣ 1  ㅣ 2  ㅣ 2  ㅣ 3  ㅣ
              ㅣ 승자   ㅣ A  ㅣ B  ㅣ A  ㅣ  B ㅣ  D ㅣ
              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
              두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
        입력 : 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
              두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
              세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
        출력 : 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
        예시 입력 1 :  5
                     2 3 3 1 3
                     1 1 2 2 3
        예시 출력 1 : A
                    B
                    A
                    B
                    D
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        for(int i = 0 ; i < N; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N; i++){
            arrB[i] = sc.nextInt();
        }
        String result = "";
        for(int i = 0 ; i < N; i++){
            if(arrA[i] == arrB[i]){
                result += "D";
            } else if (arrA[i] == 1 && arrB[i] == 3){
                result += "A";
            } else if (arrA[i] == 2 && arrB[i] == 1){
                result += "A";
            } else if (arrA[i] == 3 && arrB[i] == 2){
                result += "A";
            } else {
                result += "B";
            }
        }
        for(char x : result.toCharArray()){
            System.out.println(x);
        }
    }
}
