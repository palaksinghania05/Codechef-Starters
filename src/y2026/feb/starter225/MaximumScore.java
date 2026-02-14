package y2026.feb.starter225;

import java.util.Scanner;

public class MaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int sum = 0;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                minDiff = Math.min(minDiff, A[i] - B[i]);
            }
            System.out.println(sum - minDiff);
        }
        sc.close();
    }
}
