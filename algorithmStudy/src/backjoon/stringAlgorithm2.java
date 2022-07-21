package backjoon;

import java.util.Scanner;

public class stringAlgorithm2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

//        int ar = ( a / 100) ;
//        int ar2 = (( a % 100 ) / 10 ) * 10;
//        int ar3 = ( a % 10 ) * 100;
        int ar1 = (a / 100) + (( a % 100 ) / 10 ) * 10 + (a%10) * 100;
        int ar2 = (b / 100) + (( b % 100 ) / 10 ) * 10 + (b%10) * 100;

        System.out.println( Math.max(ar1,ar2));
//        System.out.println( ar1 );
//        System.out.println( ar2 );


    }
}
