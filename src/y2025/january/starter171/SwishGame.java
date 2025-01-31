package y2025.january.starter171;

import java.util.Scanner;

public class SwishGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int M = sc.nextInt();
            int K = sc.nextInt();
            int temp = 0;
            String S = sc.next();
            for (int i = 0; i < M; i++) {
                if (S.charAt(i) == 'S') {
                    temp++;
                }
            }
            if (temp < K) {
                System.out.println(K - temp + M - 1);
            } else {
                System.out.println(M);
            }
            T--;
        }
    }
}
