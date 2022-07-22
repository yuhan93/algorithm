package inflearn;

import java.util.Scanner;

public class algorithm02 {

    public static void main(String arg[]){
        /*
        설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
              문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
              단 회문을 검사할 때 대소문자를 구분하지 않습니다.
        입력 : 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
        출력 : 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
        예시 입력 1 : gooG
        예시 출력 1 : YES
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
//        String str2 = "";
//        String result = "";
//        for(int i = str.length()-1; i >= 0; i--){
//            str2 += str.charAt(i);
//        }
//        if(str2.equals(str)){
//            result = "YES";
//        } else {
//            result = "NO";
//        }
//        System.out.println(result);
        String str2 = new StringBuffer(str).reverse().toString().toUpperCase();
        String result = "";
        if (str.equals(str2)){
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);
    }
}
