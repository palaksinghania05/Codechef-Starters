package y2025.march.starter178;

import java.util.Scanner;

public class PermutationConstruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if (N == 1 || N < 2 * K) {
                System.out.println(-1);
                continue;
            }
            if (K == 1) {
                int temp = 2;
                for (int i = 0; i < N - 1; i++) {
                    System.out.print(temp + " ");
                    temp++;
                }
                System.out.println(1);
                continue;
            }
            for (int i = K + 1; i <= N; i++) {
                System.out.print(i + " ");
            }
            int temp2 = N % K;
            for (int i = temp2 + 1; i <= K; i++) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= temp2; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
