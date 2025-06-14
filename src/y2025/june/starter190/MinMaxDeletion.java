package y2025.june.starter190;

import java.util.Scanner;

public class MinMaxDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }
            long result = 0;
            for (int i = 1; i < N; i++) {
                result += Math.min(A[i], A[i + 1]);
            }
            while (Q-- > 0) {
                int i = sc.nextInt();
                int X = sc.nextInt();
                if (i > 1) result -= Math.min(A[i - 1], A[i]);
                if (i < N) result -= Math.min(A[i], A[i + 1]);
                A[i] = X;
                if (i > 1) result += Math.min(A[i - 1], A[i]);
                if (i < N) result += Math.min(A[i], A[i + 1]);
                System.out.println(result);
            }
        }
    }
}
