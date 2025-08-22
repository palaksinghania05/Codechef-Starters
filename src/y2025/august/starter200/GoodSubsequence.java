package y2025.august.starter200;

import java.util.Scanner;

public class GoodSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (i != (N - 1) && A[i] % 2 != A[i + 1] % 2) {
                    count++;
                }
            }
            System.out.println(count + 1);
        }
    }
}
