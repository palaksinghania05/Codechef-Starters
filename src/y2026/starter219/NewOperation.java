package y2026.starter219;

import java.util.Scanner;

public class NewOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = A[i];
            }
            for (int i = 1; i < N; i++) {
                A[0] += (A[i] * 2);
            }
            for (int i = N - 1; i >= 1; i--) {
                B[i - 1] += (B[i] * 2);
            }
            System.out.println(A[0] + " " + B[0]);
        }
    }
}
