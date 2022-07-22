package inflearn;

import java.util.Scanner;

public class algorithm9 {
    public static void main(String arg[]){
        /*
        설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
              선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
        입력 : 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
        출력 : 선생님이 볼 수 있는 최대학생수를 출력한다.
        예시 입력 1 :  8
                     130 135 148 140 145 150 150 153
        예시 출력 1 : 5
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt(); // 배열 원소 넣기
        }
        int max = arr[0]; // 비교할 값 선언
        int result = 1; // 학생 수
        for(int i = 1 ; i < N; i++){
            if(arr[i] > max){ // 배열의 첫번째 원소와 0번째 원소 비교
                result++; // 학생 수 ++
                max = arr[i]; // max 변수 값 변경
            }
        }
        System.out.println(result);
    }
}
