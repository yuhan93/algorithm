package backjoon;

import java.util.Scanner;

public class stringAlgorithm1 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < R; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();

        };
    }
}
