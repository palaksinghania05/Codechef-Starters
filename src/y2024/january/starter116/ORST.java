package y2024.january.starter116;

import java.util.Arrays;
import java.util.Scanner;

public class ORST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int max = -1;
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
                max = Math.max(B[i], max);
            }
            Arrays.sort(A, N - max, N);
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
